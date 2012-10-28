package org.kardo.language.ipc.generator

import org.eclipse.emf.ecore.resource.Resource
import org.kardo.language.aspectj.resource.aspectj.IAspectjTextResource
import java.io.ByteArrayOutputStream
import org.kardo.language.ipc.InstancePointcut
import org.kardo.language.ipc.IpcExpression
import org.kardo.language.ipc.IpcSubExpression
import org.kardo.language.aspectj.pcexp.PointcutExpression
import org.kardo.language.ipc.resource.ipc.IIpcTextResource

class IpcGenerator {
	
	AspectJPrinterSub printer
	ByteArrayOutputStream output =  new ByteArrayOutputStream()
	Resource resource
	ALIA4JGenerator aliagen = new ALIA4JGenerator
	
	new(Resource resource)
	{
		this.resource = resource
		printer = new AspectJPrinterSub(output,resource as IIpcTextResource)
		
	}
	
	
	def generateIpc(InstancePointcut pc)	
	{

		'''
		«generateMonitoringPointcuts(pc)»
		«generateInstancePc(pc, PcExpType::SELECT)»
		«IF pc.expr.removeExpression != null»
			«generateInstancePc(pc, PcExpType::REMOVE)»
		«ENDIF»				
		'''
	}
	
	
	def generateInstancePc(InstancePointcut pc, PcExpType type)
	{
		var pcname = "" 
		var setOperation = " "
		var IpcSubExpression expTemp;
		aliagen.setIP(pc);
		generateSetMaintenanceClass(pc)
		switch type{
			 case PcExpType::REMOVE:{
			 	System::out.println("[generate instance pointcut] generate remove expression")
				setOperation = 'remove';
				expTemp = pc.expr.removeExpression;
				generateIpExpression(expTemp, "r")
			}
			case PcExpType::SELECT :{
				System::out.println("[generate instance pointcut] generate add expression")
				pcname = pc.name;
				setOperation = 'add';
				expTemp = pc.expr.addExpression;
				generateIpExpression(expTemp, "a")
			}
		}
	}
	
	def generateMonitoringPointcuts(InstancePointcut ip)		
	'''
	«var adviceTarget = ip.name.toFirstUpper + "AdviceTarget"»
	«var name = ip.name»
	«var type = Utility::resolveReference(ip.type)»
	public pointcut «name»_instanceAdded(«type» instance): 	call(public static void «adviceTarget».«name»_instanceAdded(..)) && args(instance);
	public pointcut «name»_instanceremoved(«type» instance): 	call(public static void «adviceTarget».«name»_instanceRemoved(..)) && args(instance);	
	'''
	
	//INSTANCE POINTCUT EXPRESSION GENERATOR
	def generateIpExpression(IpcSubExpression exp, String exptype)
	'''
		«IF(exp.before != null)»
			«aliagen.ipToALIA(AspectJCompilationUnitGenerator::generateExpression(exp.before.pcexp as PointcutExpression), "b"+exptype)»
		«ENDIF»
		«IF(exp.after != null)»
			«aliagen.ipToALIA(AspectJCompilationUnitGenerator::generateExpression(exp.after.pcexp as PointcutExpression), "a"+exptype)»
		«ENDIF»	
	'''
	
	def generateSetMaintenanceClass(InstancePointcut ip){
		var adviceTarget = ip.name.toFirstUpper + "AdviceTarget"
		FileCreator::instance.generateFile(adviceTarget + ".java",generateSetMaintenanctClassBody(ip))
	}
	
	def generateSetMaintenanctClassBody(InstancePointcut ip)
	'''
	import java.util.*;
	«var adviceTarget = ip.name.toFirstUpper + "AdviceTarget"»
	«var name = ip.name»
	«var setname = name + "_data"»
	«var type = Utility::resolveReference(ip.type)»
	public class «adviceTarget»{
		
		private static WeakHashMap<«type», Integer> «setname» = new WeakHashMap<«type», Integer>();
		
		public static Set<«type»> «name»()
		{
			return Collections.unmodifiableSet(«setname».keySet());
		}
		
		public static void «name»_addInstance(«type» instance)
		{
			if(«setname».containsKey(instance))
			{
				Integer value = «setname».get(instance);
				value++;
				«setname».put(instance,value);
			}
			else
				«setname».put(instance, new Integer(1));
		
			«name»_instanceAdded(instance);
		}
		
		public static void «name»_removeInstance(«type» instance)
		{
			if(«setname».containsKey(instance))
			{
				Integer value = «setname».get(instance);
				value--;
				if(value == 0)
					«setname».remove(instance);
				else	
					«setname».put(instance,value);
			}
			
			«name»_instanceRemoved(instance);	
		}	
		
		public static int «name»_cardinality(«type» instance)
		{
			return «setname».get(instance);
		}	
		
		private static void «name»_setCardinality(«type» instance, int c)
		{
			«setname».put(instance, new Integer(c));
		}	
		
		public static void «name»_instanceAdded(«type» instance){}
		public static void «name»_instanceRemoved(«type» instance){}
		
	}	
	'''
	

	
	
}