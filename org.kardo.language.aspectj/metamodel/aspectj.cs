SYNTAXDEF aspectj
FOR <http://www.emftext.org/language/aspectj> <aspectj.genmodel>
START Commons.AspectJCompilationUnit


IMPORTS{
	 java: <http://www.emftext.org/java> WITH SYNTAX java </org.emftext.language.java/metamodel/java.cs>
	 commons:<http://www.emftext.org/language/aspectj/commons>
	 pcexp:<http://www.emftext.org/language/aspectj/pcexp>
	 patterns:<http://www.emftext.org/language/aspectj/patterns>
	 pointcuts:<http://www.emftext.org/language/aspectj/pointcuts>
	 advice: <http://www.emftext.org/language/aspectj/advice>
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
	
	"aspect" COLOR #FF0011, BOLD;
	"pointcut" COLOR #FF0011, BOLD;
	"call" COLOR #FF0011, BOLD;
	"this" COLOR #FF0011, BOLD;
	"returning" COLOR #FF0011, BOLD;
	"args" COLOR #FF0011, BOLD;
	"target" COLOR #FF0011, BOLD;
	"within" COLOR #FF0011, BOLD;
	"if" COLOR #FF0011, BOLD;
	"after" COLOR #FF0011, BOLD;
	"before" COLOR #FF0011, BOLD;
	"->" COLOR #000000, BOLD;
}



RULES {
	
	
	
	//ASPECTJ RULES
	 commons.AspectJCompilationUnit ::= ("package" namespaces[] ( "."  namespaces[])*  ";" )?
        !0 !0
        (imports !0 )*
        (";" !0)*
        !0
        (classifiers:commons.Aspect (";")* !0 !0)+;
        
	 commons.Aspect ::=  priviliged["privileged":""]? annotationsAndModifiers? "aspect" name[]  ("extends" extend)?
        ("implements" (implements ("," implements)*))? 
	 				"{" !1 members:commons.AspectMember* "}";
	 // ******************** Pointcuts  **********************
	 pointcuts.CallPointcut ::= "call"#0"(" pattern:patterns.AbstractMethodPattern ")";
	 pointcuts.ExecutionPointcut ::= "execution"#0"(" pattern:patterns.AbstractMethodPattern ")";
	 pointcuts.GetPointcut ::= "get"#0"(" pattern:patterns.FieldPattern ")";
	 pointcuts.SetPointcut ::= "set"#0"(" pattern:patterns.FieldPattern ")";
	 pointcuts.ThisPointcut ::= "this"#0"(" pattern:patterns.TypeOrIdPattern ")"; 
	 pointcuts.ArgsPointcut ::= "args"#0"(" pattern:patterns.TypeOrIdPattern")";
	 pointcuts.WithinPointcut ::= "within"#0"("pattern:patterns.IdPattern")";
	 pointcuts.TargetPointcut ::= "target"#0 "("pattern:patterns.TypeOrIdPattern ")";
	 pointcuts.IfPointcut ::= "if"#0"("pattern:patterns.ConditionalExprPattern")";
	 pointcuts.ReturningPointcut ::= "returning""("pattern:patterns.IdPattern")";
	 pointcuts.AspectJPointcut ::= abstract? "pointcut" name[]#0"(" #0 (parameters ("," parameters)* )? #0 ")" (assign:pcexp.PcAssignmentOperator exp:pcexp.PointcutExpression)? ";";
	 
	 patterns.ConditionalExprPattern::= expr;
	 patterns.FieldPattern ::= modifiers* fieldType declaringType"."fieldname[];
	 patterns.ConstructorPattern ::= modifiers+ declaringType#0"->"#0"new"#0"("parameters? (","parameters)*")";
	 patterns.MethodPattern ::= modifiers+ returnType declaringType #0 "->" #0 methodname #0 "("parameters? (","parameters)* ")";
	 patterns.TypePattern ::=  type#0subtypes?;
	 patterns.IdPattern ::= id[];
	 patterns.ParameterWildcard ::= "..";


	advice.AfterAdvice ::= "after" "(" (parameters? ("," parameters)*)? ")" assign:pcexp.PcAssignmentOperator pcref[] "{" statements* "}";
	advice.AfterReturning ::= "after" "(" (parameters? ("," parameters)*)? ")" returning assign:pcexp.PcAssignmentOperator pcref[] "{" statements* "}";
	advice.BeforeAdvice ::= "before" "(" (parameters? ("," parameters)*)? ")" assign:pcexp.PcAssignmentOperator pcref[] "{" statements* "}";

	 //JAVA SYNTAX
	pcexp.PointcutExpression ::= child:pcexp.PointcutOrExpression?;
	pcexp.PointcutOrExpression ::= children:pcexp.PointcutAndExpression ( "||" children:pcexp.PointcutAndExpression )*;
	pcexp.PointcutAndExpression ::= children:pointcuts.PrimitivePointcut ( "&&" children:pointcuts.PrimitivePointcut )*;
	pcexp.PcAssignmentOperator ::= ":";
	
	
	
}