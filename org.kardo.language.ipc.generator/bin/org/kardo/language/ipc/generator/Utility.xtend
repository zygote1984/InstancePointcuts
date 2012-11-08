package org.kardo.language.ipc.generator

import java.io.ByteArrayOutputStream
import java.util.List
import org.eclipse.emf.common.util.EList
import org.eclipse.emf.ecore.InternalEObject
import org.eclipse.emf.ecore.resource.Resource
import org.emftext.language.java.imports.Import
import org.emftext.language.java.parameters.OrdinaryParameter
import org.emftext.language.java.parameters.Parameter
import org.emftext.language.java.types.ClassifierReference
import org.emftext.language.java.types.NamespaceClassifierReference
import org.emftext.language.java.types.TypeReference
import org.kardo.language.aspectj.patterns.TypePattern
import org.kardo.language.ipc.resource.ipc.IIpcTextResource
import org.kardo.language.ipc.resource.ipc.analysis.ClassifierReferenceTargetReferenceResolver
import org.kardo.language.ipc.generator.IpcPrinterSub

import static org.kardo.language.ipc.generator.Utility.*


class Utility {
	
	
	static ClassifierReferenceTargetReferenceResolver refResolver = new ClassifierReferenceTargetReferenceResolver()
	static ByteArrayOutputStream output =  new ByteArrayOutputStream()
	static IpcPrinterSub printer = new org.kardo.language.ipc.generator.IpcPrinterSub(output, GeneratorMain::resource as IIpcTextResource)
	
	def static generateImports(List<Import> imports)
	{

		var impstr =  "import java.util.WeakHashMap;\n import org.alia4j.*;\n"
		for(i:imports)
		{	
			printer.print(i)
			impstr = impstr + output.toString
			output.reset	
		}	
		return impstr
	}
	
		def static dispatch parameterExpand(EList<Parameter> params){
		var ps = ""
		if(params.size == 0)
			System::out.println("[GENERATOR] Parameter Expand: No Parameters found")
		else if(params.size == 1)
			ps = ps + parameterExpand(params.get(0))
		else
		{	
			var par = params.last
			params.remove(params.last)
			for(p:params)
				ps = ps + parameterExpand(p) + ", "
		
			ps = ps + parameterExpand(par)
		}
		return ps;
	
	}
	
	def static dispatch parameterExpand(OrdinaryParameter param)
	{
		var p = ""
		
		if(param.typeReference instanceof NamespaceClassifierReference)
		{
			var NamespaceClassifierReference tr = param.typeReference as NamespaceClassifierReference
			//System::out.println("[GENERATOR] Ordinary Parameter Target: " )
			
			p = p + resolveReference(tr.classifierReferences.get(0)) + " " + param.name
		}	
		
		return p
	}
	
	def static dispatch resolveReference(ClassifierReference ref)
	{
		return refResolver.deResolve(ref.target,ref,null)
	}
	
	def static dispatch resolveReference(TypeReference ref)
	{
		var String s
		if(ref.pureClassifierReference == null)
			s = ref.target.toString
		else
			s =  refResolver.deResolve(ref.pureClassifierReference.target,ref.pureClassifierReference,null)
			
		return s
	}
	
	
	def static dispatch resolveReference(TypePattern ref)
	{
		return refResolver.deResolve(ref.type.pureClassifierReference.target,ref.type.pureClassifierReference,null)
	}
	
	def static resolveReference(InternalEObject ref, Resource resource)
	{
		return resource.getEObject(ref.eProxyURI.fragment)
	}
	
	
}