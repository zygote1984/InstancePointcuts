
import java.util.WeakHashMap;
 import org.alia4j.*;



aspect Kardo 
{
	public pointcut p1_instanceAdded(Integer instance): 	call(public static void P1AdviceTarget.p1_instanceAdded(..)) && args(instance);
	public pointcut p1_instanceremoved(Integer instance): 	call(public static void P1AdviceTarget.p1_instanceRemoved(..)) && args(instance);	
	
	public void createAttachmentForP1Aa(){
		org.alia4j.aspectj.parser.ast.AJPointcutParser parser_p1_aa = zygote.instancepc.lib.alia4j.ALIA4JParser.parseExpression("call( public void MyType .( ) ) && args( instance ) ");
		Set<org.alia4j.liam.Specialization> spec_p1_aa = zygote.instancepc.lib.alia4j.ALIA4JSpecializationModule.createFromStaticMethod(parser_p1_aa, Integer.class);
		
		org.alia4j.liam.Attachment attachment_p1_aa = zygote.instancepc.lib.alia4j.ALIA4JAttachmentModule.createStaticAttachment(spec_p1_aa, P1AdviceTarget.class, 
									"p1_addInstance", new Class[] {Integer.class}, org.alia4j.liam.ScheduleInfo.AFTER);
		
		org.alia4j.fial.System.deploy(attachment_p1_aa);
				
				
	}
}

import java.util.WeakHashMap;
 import org.alia4j.*;



aspect  
{
}
