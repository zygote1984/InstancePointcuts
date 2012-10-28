/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractAspectjInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<org.kardo.language.aspectj.resource.aspectj.IAspectjInterpreterListener> listeners = new java.util.ArrayList<org.kardo.language.aspectj.resource.aspectj.IAspectjInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.kardo.language.aspectj.commons.AspectMember) {
			result = interprete_org_kardo_language_aspectj_commons_AspectMember((org.kardo.language.aspectj.commons.AspectMember) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.commons.Aspect) {
			result = interprete_org_kardo_language_aspectj_commons_Aspect((org.kardo.language.aspectj.commons.Aspect) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.commons.AspectJCompilationUnit) {
			result = interprete_org_kardo_language_aspectj_commons_AspectJCompilationUnit((org.kardo.language.aspectj.commons.AspectJCompilationUnit) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pcexp.PointcutExpressionChild) {
			result = interprete_org_kardo_language_aspectj_pcexp_PointcutExpressionChild((org.kardo.language.aspectj.pcexp.PointcutExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pcexp.PointcutExpression) {
			result = interprete_org_kardo_language_aspectj_pcexp_PointcutExpression((org.kardo.language.aspectj.pcexp.PointcutExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pcexp.PointcutOrExpression) {
			result = interprete_org_kardo_language_aspectj_pcexp_PointcutOrExpression((org.kardo.language.aspectj.pcexp.PointcutOrExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pcexp.PointcutAndExpression) {
			result = interprete_org_kardo_language_aspectj_pcexp_PointcutAndExpression((org.kardo.language.aspectj.pcexp.PointcutAndExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.ExecutionPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_ExecutionPointcut((org.kardo.language.aspectj.pointcuts.ExecutionPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.GetPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_GetPointcut((org.kardo.language.aspectj.pointcuts.GetPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.SetPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_SetPointcut((org.kardo.language.aspectj.pointcuts.SetPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.HandlerPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_HandlerPointcut((org.kardo.language.aspectj.pointcuts.HandlerPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.AdviceExecutionPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_AdviceExecutionPointcut((org.kardo.language.aspectj.pointcuts.AdviceExecutionPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.StaticInitPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_StaticInitPointcut((org.kardo.language.aspectj.pointcuts.StaticInitPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.InitPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_InitPointcut((org.kardo.language.aspectj.pointcuts.InitPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.PreInitPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_PreInitPointcut((org.kardo.language.aspectj.pointcuts.PreInitPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.WithinPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_WithinPointcut((org.kardo.language.aspectj.pointcuts.WithinPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.WithinCodePointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_WithinCodePointcut((org.kardo.language.aspectj.pointcuts.WithinCodePointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.ThisPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_ThisPointcut((org.kardo.language.aspectj.pointcuts.ThisPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.TargetPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_TargetPointcut((org.kardo.language.aspectj.pointcuts.TargetPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.ArgsPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_ArgsPointcut((org.kardo.language.aspectj.pointcuts.ArgsPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.CFlowPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_CFlowPointcut((org.kardo.language.aspectj.pointcuts.CFlowPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.CFlowBelowPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_CFlowBelowPointcut((org.kardo.language.aspectj.pointcuts.CFlowBelowPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.IfPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_IfPointcut((org.kardo.language.aspectj.pointcuts.IfPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pcexp.PointcutAndExpressionChild) {
			result = interprete_org_kardo_language_aspectj_pcexp_PointcutAndExpressionChild((org.kardo.language.aspectj.pcexp.PointcutAndExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pcexp.PointcutOrExpressionChild) {
			result = interprete_org_kardo_language_aspectj_pcexp_PointcutOrExpressionChild((org.kardo.language.aspectj.pcexp.PointcutOrExpressionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pcexp.PcAssignmentOperator) {
			result = interprete_org_kardo_language_aspectj_pcexp_PcAssignmentOperator((org.kardo.language.aspectj.pcexp.PcAssignmentOperator) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.AbstractMethodPattern) {
			result = interprete_org_kardo_language_aspectj_patterns_AbstractMethodPattern((org.kardo.language.aspectj.patterns.AbstractMethodPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.FieldPattern) {
			result = interprete_org_kardo_language_aspectj_patterns_FieldPattern((org.kardo.language.aspectj.patterns.FieldPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.ConstructorPattern) {
			result = interprete_org_kardo_language_aspectj_patterns_ConstructorPattern((org.kardo.language.aspectj.patterns.ConstructorPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.MethodPattern) {
			result = interprete_org_kardo_language_aspectj_patterns_MethodPattern((org.kardo.language.aspectj.patterns.MethodPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.TypePattern) {
			result = interprete_org_kardo_language_aspectj_patterns_TypePattern((org.kardo.language.aspectj.patterns.TypePattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.IdPattern) {
			result = interprete_org_kardo_language_aspectj_patterns_IdPattern((org.kardo.language.aspectj.patterns.IdPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.TypeOrIdPattern) {
			result = interprete_org_kardo_language_aspectj_patterns_TypeOrIdPattern((org.kardo.language.aspectj.patterns.TypeOrIdPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.ParameterWildcard) {
			result = interprete_org_kardo_language_aspectj_patterns_ParameterWildcard((org.kardo.language.aspectj.patterns.ParameterWildcard) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.WildcardPattern) {
			result = interprete_org_kardo_language_aspectj_patterns_WildcardPattern((org.kardo.language.aspectj.patterns.WildcardPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.WildcardOrTypePattern) {
			result = interprete_org_kardo_language_aspectj_patterns_WildcardOrTypePattern((org.kardo.language.aspectj.patterns.WildcardOrTypePattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.ConditionalExprPattern) {
			result = interprete_org_kardo_language_aspectj_patterns_ConditionalExprPattern((org.kardo.language.aspectj.patterns.ConditionalExprPattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.patterns.Pattern) {
			result = interprete_org_kardo_language_aspectj_patterns_Pattern((org.kardo.language.aspectj.patterns.Pattern) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.CallPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_CallPointcut((org.kardo.language.aspectj.pointcuts.CallPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.PrimitivePointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_PrimitivePointcut((org.kardo.language.aspectj.pointcuts.PrimitivePointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.AspectJPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_AspectJPointcut((org.kardo.language.aspectj.pointcuts.AspectJPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.Pointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_Pointcut((org.kardo.language.aspectj.pointcuts.Pointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.ReturningPointcut) {
			result = interprete_org_kardo_language_aspectj_pointcuts_ReturningPointcut((org.kardo.language.aspectj.pointcuts.ReturningPointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.pointcuts.ContextExposurePc) {
			result = interprete_org_kardo_language_aspectj_pointcuts_ContextExposurePc((org.kardo.language.aspectj.pointcuts.ContextExposurePc) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.advice.AfterAdvice) {
			result = interprete_org_kardo_language_aspectj_advice_AfterAdvice((org.kardo.language.aspectj.advice.AfterAdvice) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.advice.BeforeAdvice) {
			result = interprete_org_kardo_language_aspectj_advice_BeforeAdvice((org.kardo.language.aspectj.advice.BeforeAdvice) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.advice.AfterReturning) {
			result = interprete_org_kardo_language_aspectj_advice_AfterReturning((org.kardo.language.aspectj.advice.AfterReturning) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.aspectj.advice.Advice) {
			result = interprete_org_kardo_language_aspectj_advice_Advice((org.kardo.language.aspectj.advice.Advice) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_commons_AspectMember(org.kardo.language.aspectj.commons.AspectMember aspectMember, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_commons_Aspect(org.kardo.language.aspectj.commons.Aspect aspect, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_commons_AspectJCompilationUnit(org.kardo.language.aspectj.commons.AspectJCompilationUnit aspectJCompilationUnit, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pcexp_PointcutExpressionChild(org.kardo.language.aspectj.pcexp.PointcutExpressionChild pointcutExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pcexp_PointcutExpression(org.kardo.language.aspectj.pcexp.PointcutExpression pointcutExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pcexp_PointcutOrExpression(org.kardo.language.aspectj.pcexp.PointcutOrExpression pointcutOrExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pcexp_PointcutOrExpressionChild(org.kardo.language.aspectj.pcexp.PointcutOrExpressionChild pointcutOrExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pcexp_PointcutAndExpression(org.kardo.language.aspectj.pcexp.PointcutAndExpression pointcutAndExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pcexp_PointcutAndExpressionChild(org.kardo.language.aspectj.pcexp.PointcutAndExpressionChild pointcutAndExpressionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pcexp_PcAssignmentOperator(org.kardo.language.aspectj.pcexp.PcAssignmentOperator pcAssignmentOperator, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_Pattern(org.kardo.language.aspectj.patterns.Pattern pattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_AbstractMethodPattern(org.kardo.language.aspectj.patterns.AbstractMethodPattern abstractMethodPattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_FieldPattern(org.kardo.language.aspectj.patterns.FieldPattern fieldPattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_ConstructorPattern(org.kardo.language.aspectj.patterns.ConstructorPattern constructorPattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_MethodPattern(org.kardo.language.aspectj.patterns.MethodPattern methodPattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_TypePattern(org.kardo.language.aspectj.patterns.TypePattern typePattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_IdPattern(org.kardo.language.aspectj.patterns.IdPattern idPattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_TypeOrIdPattern(org.kardo.language.aspectj.patterns.TypeOrIdPattern typeOrIdPattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_ParameterWildcard(org.kardo.language.aspectj.patterns.ParameterWildcard parameterWildcard, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_WildcardPattern(org.kardo.language.aspectj.patterns.WildcardPattern wildcardPattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_WildcardOrTypePattern(org.kardo.language.aspectj.patterns.WildcardOrTypePattern wildcardOrTypePattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_patterns_ConditionalExprPattern(org.kardo.language.aspectj.patterns.ConditionalExprPattern conditionalExprPattern, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_PrimitivePointcut(org.kardo.language.aspectj.pointcuts.PrimitivePointcut primitivePointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_CallPointcut(org.kardo.language.aspectj.pointcuts.CallPointcut callPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_ExecutionPointcut(org.kardo.language.aspectj.pointcuts.ExecutionPointcut executionPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_GetPointcut(org.kardo.language.aspectj.pointcuts.GetPointcut getPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_SetPointcut(org.kardo.language.aspectj.pointcuts.SetPointcut setPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_HandlerPointcut(org.kardo.language.aspectj.pointcuts.HandlerPointcut handlerPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_AdviceExecutionPointcut(org.kardo.language.aspectj.pointcuts.AdviceExecutionPointcut adviceExecutionPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_StaticInitPointcut(org.kardo.language.aspectj.pointcuts.StaticInitPointcut staticInitPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_InitPointcut(org.kardo.language.aspectj.pointcuts.InitPointcut initPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_PreInitPointcut(org.kardo.language.aspectj.pointcuts.PreInitPointcut preInitPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_WithinPointcut(org.kardo.language.aspectj.pointcuts.WithinPointcut withinPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_WithinCodePointcut(org.kardo.language.aspectj.pointcuts.WithinCodePointcut withinCodePointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_ThisPointcut(org.kardo.language.aspectj.pointcuts.ThisPointcut thisPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_TargetPointcut(org.kardo.language.aspectj.pointcuts.TargetPointcut targetPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_ArgsPointcut(org.kardo.language.aspectj.pointcuts.ArgsPointcut argsPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_CFlowPointcut(org.kardo.language.aspectj.pointcuts.CFlowPointcut cFlowPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_CFlowBelowPointcut(org.kardo.language.aspectj.pointcuts.CFlowBelowPointcut cFlowBelowPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_IfPointcut(org.kardo.language.aspectj.pointcuts.IfPointcut ifPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_Pointcut(org.kardo.language.aspectj.pointcuts.Pointcut pointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_AspectJPointcut(org.kardo.language.aspectj.pointcuts.AspectJPointcut aspectJPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_ContextExposurePc(org.kardo.language.aspectj.pointcuts.ContextExposurePc contextExposurePc, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_pointcuts_ReturningPointcut(org.kardo.language.aspectj.pointcuts.ReturningPointcut returningPointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_advice_Advice(org.kardo.language.aspectj.advice.Advice advice, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_advice_AfterAdvice(org.kardo.language.aspectj.advice.AfterAdvice afterAdvice, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_advice_BeforeAdvice(org.kardo.language.aspectj.advice.BeforeAdvice beforeAdvice, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_aspectj_advice_AfterReturning(org.kardo.language.aspectj.advice.AfterReturning afterReturning, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.kardo.language.aspectj.resource.aspectj.IAspectjInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.kardo.language.aspectj.resource.aspectj.IAspectjInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.kardo.language.aspectj.resource.aspectj.IAspectjInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
