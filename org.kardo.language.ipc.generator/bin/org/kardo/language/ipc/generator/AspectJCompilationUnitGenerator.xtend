package org.kardo.language.ipc.generator

import java.io.ByteArrayOutputStream
import org.eclipse.emf.ecore.resource.Resource
import org.emftext.language.java.containers.Package
import org.kardo.language.aspectj.commons.AspectJCompilationUnit
import org.kardo.language.aspectj.commons.AspectMember
import org.kardo.language.aspectj.pcexp.PointcutExpression
import org.kardo.language.aspectj.pointcuts.AspectJPointcut
import org.kardo.language.aspectj.pointcuts.PrimitivePointcut
import org.kardo.language.aspectj.commons.Aspect
import org.kardo.language.ipc.resource.ipc.IIpcTextResource
import org.kardo.language.ipc.InstancePointcut
import org.kardo.language.ipc.generator.IpcPrinterSub

import static extension org.kardo.language.ipc.generator.AspectJCompilationUnitGenerator.*
import org.kardo.language.ipc.CompositeInstancePointcut
import org.kardo.language.ipc.Ipc
import java.util.HashMap

class AspectJCompilationUnitGenerator{
	
	
	boolean print = true
	public static String packageNameAspect 
	public static ByteArrayOutputStream output =  new ByteArrayOutputStream()
	public static IpcPrinterSub printer =  new org.kardo.language.ipc.generator.IpcPrinterSub(output,GeneratorMain::resource as IIpcTextResource)
	AspectJCompilationUnit compilationUnit
	IpcGenerator ipcgen = new IpcGenerator(GeneratorMain::resource)
	Resource resource = GeneratorMain::resource

	
	new()
	{
	}
	
	def setAspect(AspectJCompilationUnit aspect)
	{
		this.compilationUnit = aspect
		packageNameAspect = aspect.namespacesAsString
	}
	
	
	def compileUnit()
	'''
		«var aspects = compilationUnit.classifiers.filter(typeof(Aspect))»
		«FOR a:aspects»
			«System::out.println("[Aspects]")»
			«generateAspect(a)»
		«ENDFOR»
	'''

	
	//ASPECT GENERATION ENTRY
	def generateAspect(Aspect aspect) '''
	«IF compilationUnit.namespacesAsString != null»
	«compilationUnit.namespacesAsString»
	«ENDIF»
	
	«Utility::generateImports(compilationUnit.imports)»


	
	aspect «aspect.name» «IF aspect.superClass != null» extends «Utility::resolveReference(aspect.extend)» «ENDIF»
	{
		«var pcs = aspect.members.filter(typeof(AspectMember))»
		«FOR p:pcs»
		«IF p instanceof AspectJPointcut»
			«generateAJPointcut(p as AspectJPointcut)»
		«ENDIF»
		«IF p instanceof Ipc»
			«ipcgen.generate(p as Ipc)»
		«ENDIF»
		«ENDFOR»
	}
	'''
	
	//ASPECTJ POINTCUT GENERATOR
	def generateAJPointcut(AspectJPointcut pc)
	'''
	«IF pc.getAbstract != null»«printer.print(pc.getAbstract)»«output»«ENDIF»pointcut «pc.name»(«Utility::parameterExpand(pc.parameters)») «IF pc.exp !=null» : «generateExpression(pc.exp as PointcutExpression)» «ENDIF» ;
	'''
	


	
	def packagePrinter(org.emftext.language.java.containers.Package p)
	{
		printer.print(p)
		var value = output.toString
		output.reset	
		printer = new org.kardo.language.ipc.generator.IpcPrinterSub(output,resource as IIpcTextResource)
		return value
	}
	
	
	//PRIMITIVE POINTCUT PRINTER
	def dispatch generatePointcut(PrimitivePointcut exp)
	{
		printer.print(exp)
		var value = output.toString
		output.reset	
		printer = new org.kardo.language.ipc.generator.IpcPrinterSub(output,resource as IIpcTextResource)
		return value
	}
	
	//EXPRESSION PRINTER
	def static generateExpression(PointcutExpression exp)
	{
		printer.print(exp)
		var value = output.toString
		output.reset	
		printer = new org.kardo.language.ipc.generator.IpcPrinterSub(output,GeneratorMain::resource as IIpcTextResource)
		return value
	}
	
	
	
	
	
}