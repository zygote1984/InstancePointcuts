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
	
	"instance pointcut" COLOR #FF00AA, BOLD;
	"composite instance pointcut" COLOR #FF00AA, BOLD;
	"UNTIL" COLOR #FF00AA, BOLD;
	"afterevent" COLOR #FF55AA, BOLD;
	"beforeevent" COLOR #FF55AA, BOLD;
	"inter" COLOR #FF55AA, BOLD;
	"union" COLOR #FF55AA, BOLD;

}

RULES {


	ipc.AfterEvent ::= "afterevent"#0"("pcexp")";
	ipc.BeforeEvent ::= "beforeevent"#0"("pcexp")";
	ipc.InstancePointcut::= "instance pointcut" name[]#0"<"type">" assign expr ";";
	ipc.IpcExpression::= addExpression ("UNTIL" removeExpression)?;
	ipc.IpcSubExpression::= event:BeforeEvent ("||" event:AfterEvent)? | 
		event:AfterEvent ("||" event:BeforeEvent)? ;
	
	//Instance pointcut composition
	ipc.CompositeInstancePointcut ::= "composite instance pointcut" name[]#0("<"type">")? assign compexpr ";";
	ipc.IpcComposition ::= child;
	ipc.IpcUnion ::= children ("union" children)*;
	ipc.IpcIntersection ::=  "(" terms[] ("inter" terms[])+ ")" | terms[] ("inter" terms[])*  ;
	
	
	





}