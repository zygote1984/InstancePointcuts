package org.kardo.language.ipc.generator

import java.util.HashMap
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.kardo.language.aspectj.commons.impl.AspectJCompilationUnitImpl
import org.kardo.language.ipc.Ipc

import static extension org.kardo.language.ipc.generator.GeneratorMain.*


class GeneratorMain{

	
	AspectJCompilationUnitGenerator ajgen
	public static HashMap<String, Ipc> ipcRegistry = new HashMap
		
	boolean print
	new(boolean print){
		this.print = true;	
	}
	
	public static Resource resource = null
	
	
	def doGenerate(Resource r, FileCreator fsa)
	{
		resource = r		
		EcoreUtil::resolveAll(resource)
		ajgen = new AspectJCompilationUnitGenerator()
		var aspect = resource.allContents.filter(typeof(AspectJCompilationUnitImpl)).toList
		
		if(print)
		{	
			for(o:resource.allContents.filter(typeof(EObject)).toList)
			{
				System::out.println("[GENERATOR]: Aspect Contents :" + o)
			}
			
		}	
		for(k:aspect)
		{
			ajgen.setAspect(k)
			var packageName = ""
			var outputPath = GeneratorInitializer::getOutputPath.toString + "/"//.appendSegment(packageName).toString
			System::out.println("[GENERATOR MAIN]" + outputPath.toString)
			FileCreator::instance.setOutputPath(outputPath);
			FileCreator::instance.generateFile(k.classifiers.get(0).name+".aj", ajgen.compileUnit)
		}
		
	}
}