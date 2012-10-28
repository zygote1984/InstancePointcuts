package org.kardo.language.ipc.generator

import org.kardo.language.ipc.InstancePointcut
import org.kardo.language.aspectj.commons.AspectJCompilationUnit

class ALIA4JGenerator {
	
	InstancePointcut ip
	String adviceTarget = ""
	
	String liam = "org.alia4j.liam."
	String parserfqn = "org.alia4j.aspectj.parser.ast."
	String zygotelib = "zygote.instancepc.lib.alia4j."
	String parserclass = zygotelib + "ALIA4JParser"
	String specclass = zygotelib  + "ALIA4JSpecializationModule"
	String attachclass = zygotelib + "ALIA4JAttachmentModule"
	
	new()
	{

	}
	

	def ipToALIA(String pcexp, String element)
	{
		System::out.println("[ALIA4JGenerator]: ipToAlia")
		generateAdviceTarget
		'''
		
		public void createAttachmentFor«ip.name.toFirstUpper»«element.toFirstUpper»(){
			«generateParserMethod(pcexp, element)»
			«generateSpecialization(element)»
		}
		'''
	}
	
	
	def setIP(InstancePointcut ip)
	{
		this.ip = ip;
	}


	
	def generateDeploy() {
		throw new UnsupportedOperationException("Auto-generated function stub")
	}
	
	def generateParserMethod(String pcexp, String element) {
		var parser = "parser_" + ip.name + "_" +  element
		var method = "parse"+ip.name.toFirstUpper+element.toFirstUpper
		'''
		«parserfqn»AJPointcutParser «parser» = «parserclass».parseExpression("«pcexp»");
		'''
	}
	
	def generateSpecialization(String element) {
		var specset = "spec_" + ip.name + "_" +  element
		var method = "initSpecialization"+ip.name.toFirstUpper+element.toFirstUpper
		var instanceType = Utility::resolveReference(ip.type)
		var parser = "parser_" + ip.name + "_" +  element
		'''
«««		HashMap<String, Class<? extends Object>> args = new HashMap<String,Class<? extends Object>>();
«««		args.put("instance", «instanceType».class);
		Set<«liam»Specialization> «specset» = «specclass».createFromStaticMethod(«parser», «instanceType».class);
		
		«generateAttachment(element)»
		'''
	}
	
	def generateAttachment(String element) {
		var specset = "spec_" + ip.name + "_" +  element
		var adviceMethod = ""
		var scheduleinfo = ""
		var instanceType = Utility::resolveReference(ip.type)
		var parser = "parser_" + ip.name + "_" +  element
		var attachment  = "attachment_" + ip.name + "_" +  element
		
		switch element{
			case "ba":
			{
				adviceMethod = ip.name + "_addInstance"
				scheduleinfo =  "ScheduleInfo.BEFORE"
			}
			case "aa":
			{
				adviceMethod = ip.name + "_addInstance"
				scheduleinfo =  "ScheduleInfo.AFTER"
			}
			case "br":
			{
				adviceMethod = ip.name + "_removeInstance"
				scheduleinfo =  "ScheduleInfo.BEFORE"
			}
			case "ar":
			{
				adviceMethod = ip.name + "_removeInstance"
				scheduleinfo =  "ScheduleInfo.AFTER"
			}
			
		}
		scheduleinfo = liam + scheduleinfo
		'''
        «liam»Attachment «attachment» = «attachclass».createStaticAttachment(«specset», «adviceTarget».class, 
        							"«adviceMethod»", new Class[] {«instanceType».class}, «scheduleinfo»);

        org.alia4j.fial.System.deploy(«attachment»);
		
		
		'''
	}
	

	def generateAdviceTarget() {
		adviceTarget = ip.name.toFirstUpper + "AdviceTarget"
		//org::kardo::language::ipc::generator::GeneratorInitializer::getFSA().generateFile(adviceTarget + ".java", generateMaintenance(adviceTarget))
	}
	
	def generateMaintenance(String adviceTarget) {
		var instanceType = Utility::resolveReference(ip.type)
		var setName = ip.name  + "_set"
		
		
		'''
		package «AspectJCompilationUnitGenerator::packageNameAspect»;
		
		import com.google.common.collect.*;
		
		public class «adviceTarget»
		{
			static Multiset<«instanceType»> «setName» = HashMultiset.create();
			
			public static boolean addToSet(«instanceType» o)
			{
				return «setName».add(o);
			}
			
			public static boolean removeFromSet(«instanceType» o)
			{
				return «setName».remove(o);	
			}
			
		}	
		'''
	}
	


	
}