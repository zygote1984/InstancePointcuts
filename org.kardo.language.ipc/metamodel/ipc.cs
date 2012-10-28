SYNTAXDEF ipc
FOR <http://www.emftext.org/language/ipc>
START aspectj.Commons.AspectJCompilationUnit



IMPORTS{
	 //java: <http://www.emftext.org/java> WITH SYNTAX java </org.emftext.language.java/metamodel/java.cs>
	 aspectj: <http://www.emftext.org/language/aspectj> WITH SYNTAX aspectj <platform:/resource/org.kardo.language.aspectj/metamodel/aspectj.cs>
	 ipc: <http://www.emftext.org/language/ipc>
}


OPTIONS {
	defaultTokenName = "IDENTIFIER";
	usePredefinedTokens = "false";
	disableDebugSupport = "true";
	disableLaunchSupport = "true";
	overrideTokenResolvers = "false";
	generateCodeFromGeneratorModel = "true";
	overrideFollowSetProvider = "false";
	overrideExpectationConstants = "false"; 
}

TOKENSTYLES {
	
	"instance pointcut" COLOR #FF0011, BOLD;
	"UNTIL" COLOR #FF0011, BOLD;
	"after" COLOR #FF5511, BOLD;
	"before" COLOR #FF5511, BOLD;

}

RULES {


	ipc.InstancePointcut::= "instance pointcut" name[]#0"<"type">" assign expr ";";
	ipc.IpcExpression::= addExpression ("UNTIL" removeExpression)?;
	ipc.IpcSubExpression::= before "||" after | after "||" before | before | after;
	ipc.AfterEvent ::= "after"#0"("pcexp")";
	ipc.BeforeEvent ::= "before"#0"("pcexp")";


}