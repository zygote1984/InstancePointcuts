package org.kardo.language.ipc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IFileSystemAccess
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.EObject
import java.util.HashMap
import org.eclipse.xtext.generator.JavaIoFileSystemAccess
import org.kardo.language.aspectj.commons.impl.AspectImpl
import org.kardo.language.aspectj.commons.AspectJCompilationUnit
import org.kardo.language.aspectj.commons.impl.AspectJCompilationUnitImpl


class GeneratorMain{

	
	AspectJCompilationUnitGenerator ajgen
	
		
	boolean print
	new(boolean print){
		this.print = print;	
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