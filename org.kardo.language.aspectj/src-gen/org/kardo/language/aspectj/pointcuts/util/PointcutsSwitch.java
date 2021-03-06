/**
 */
package org.kardo.language.aspectj.pointcuts.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.java.annotations.AnnotationValue;

import org.emftext.language.java.arrays.ArrayInitializationValue;

import org.emftext.language.java.commons.Commentable;
import org.emftext.language.java.commons.NamedElement;

import org.emftext.language.java.expressions.AssignmentExpressionChild;
import org.emftext.language.java.expressions.ConditionalExpressionChild;
import org.emftext.language.java.expressions.ConditionalOrExpressionChild;
import org.emftext.language.java.expressions.Expression;

import org.emftext.language.java.members.Member;

import org.emftext.language.java.parameters.Parametrizable;

import org.emftext.language.java.references.ReferenceableElement;

import org.kardo.language.aspectj.commons.AspectMember;

import org.kardo.language.aspectj.pcexp.PointcutAndExpressionChild;
import org.kardo.language.aspectj.pcexp.PointcutOrExpressionChild;

import org.kardo.language.aspectj.pointcuts.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.kardo.language.aspectj.pointcuts.PointcutsPackage
 * @generated
 */
public class PointcutsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PointcutsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointcutsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PointcutsPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PointcutsPackage.PRIMITIVE_POINTCUT:
      {
        PrimitivePointcut primitivePointcut = (PrimitivePointcut)theEObject;
        T result = casePrimitivePointcut(primitivePointcut);
        if (result == null) result = casePointcutAndExpressionChild(primitivePointcut);
        if (result == null) result = casePointcutOrExpressionChild(primitivePointcut);
        if (result == null) result = caseConditionalOrExpressionChild(primitivePointcut);
        if (result == null) result = caseConditionalExpressionChild(primitivePointcut);
        if (result == null) result = caseAssignmentExpressionChild(primitivePointcut);
        if (result == null) result = caseExpression(primitivePointcut);
        if (result == null) result = caseArrayInitializationValue(primitivePointcut);
        if (result == null) result = caseAnnotationValue(primitivePointcut);
        if (result == null) result = caseCommentable(primitivePointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.CALL_POINTCUT:
      {
        CallPointcut callPointcut = (CallPointcut)theEObject;
        T result = caseCallPointcut(callPointcut);
        if (result == null) result = casePrimitivePointcut(callPointcut);
        if (result == null) result = casePointcutAndExpressionChild(callPointcut);
        if (result == null) result = casePointcutOrExpressionChild(callPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(callPointcut);
        if (result == null) result = caseConditionalExpressionChild(callPointcut);
        if (result == null) result = caseAssignmentExpressionChild(callPointcut);
        if (result == null) result = caseExpression(callPointcut);
        if (result == null) result = caseArrayInitializationValue(callPointcut);
        if (result == null) result = caseAnnotationValue(callPointcut);
        if (result == null) result = caseCommentable(callPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.EXECUTION_POINTCUT:
      {
        ExecutionPointcut executionPointcut = (ExecutionPointcut)theEObject;
        T result = caseExecutionPointcut(executionPointcut);
        if (result == null) result = casePrimitivePointcut(executionPointcut);
        if (result == null) result = casePointcutAndExpressionChild(executionPointcut);
        if (result == null) result = casePointcutOrExpressionChild(executionPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(executionPointcut);
        if (result == null) result = caseConditionalExpressionChild(executionPointcut);
        if (result == null) result = caseAssignmentExpressionChild(executionPointcut);
        if (result == null) result = caseExpression(executionPointcut);
        if (result == null) result = caseArrayInitializationValue(executionPointcut);
        if (result == null) result = caseAnnotationValue(executionPointcut);
        if (result == null) result = caseCommentable(executionPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.GET_POINTCUT:
      {
        GetPointcut getPointcut = (GetPointcut)theEObject;
        T result = caseGetPointcut(getPointcut);
        if (result == null) result = casePrimitivePointcut(getPointcut);
        if (result == null) result = casePointcutAndExpressionChild(getPointcut);
        if (result == null) result = casePointcutOrExpressionChild(getPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(getPointcut);
        if (result == null) result = caseConditionalExpressionChild(getPointcut);
        if (result == null) result = caseAssignmentExpressionChild(getPointcut);
        if (result == null) result = caseExpression(getPointcut);
        if (result == null) result = caseArrayInitializationValue(getPointcut);
        if (result == null) result = caseAnnotationValue(getPointcut);
        if (result == null) result = caseCommentable(getPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.SET_POINTCUT:
      {
        SetPointcut setPointcut = (SetPointcut)theEObject;
        T result = caseSetPointcut(setPointcut);
        if (result == null) result = casePrimitivePointcut(setPointcut);
        if (result == null) result = casePointcutAndExpressionChild(setPointcut);
        if (result == null) result = casePointcutOrExpressionChild(setPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(setPointcut);
        if (result == null) result = caseConditionalExpressionChild(setPointcut);
        if (result == null) result = caseAssignmentExpressionChild(setPointcut);
        if (result == null) result = caseExpression(setPointcut);
        if (result == null) result = caseArrayInitializationValue(setPointcut);
        if (result == null) result = caseAnnotationValue(setPointcut);
        if (result == null) result = caseCommentable(setPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.HANDLER_POINTCUT:
      {
        HandlerPointcut handlerPointcut = (HandlerPointcut)theEObject;
        T result = caseHandlerPointcut(handlerPointcut);
        if (result == null) result = casePrimitivePointcut(handlerPointcut);
        if (result == null) result = casePointcutAndExpressionChild(handlerPointcut);
        if (result == null) result = casePointcutOrExpressionChild(handlerPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(handlerPointcut);
        if (result == null) result = caseConditionalExpressionChild(handlerPointcut);
        if (result == null) result = caseAssignmentExpressionChild(handlerPointcut);
        if (result == null) result = caseExpression(handlerPointcut);
        if (result == null) result = caseArrayInitializationValue(handlerPointcut);
        if (result == null) result = caseAnnotationValue(handlerPointcut);
        if (result == null) result = caseCommentable(handlerPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.ADVICE_EXECUTION_POINTCUT:
      {
        AdviceExecutionPointcut adviceExecutionPointcut = (AdviceExecutionPointcut)theEObject;
        T result = caseAdviceExecutionPointcut(adviceExecutionPointcut);
        if (result == null) result = casePrimitivePointcut(adviceExecutionPointcut);
        if (result == null) result = casePointcutAndExpressionChild(adviceExecutionPointcut);
        if (result == null) result = casePointcutOrExpressionChild(adviceExecutionPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(adviceExecutionPointcut);
        if (result == null) result = caseConditionalExpressionChild(adviceExecutionPointcut);
        if (result == null) result = caseAssignmentExpressionChild(adviceExecutionPointcut);
        if (result == null) result = caseExpression(adviceExecutionPointcut);
        if (result == null) result = caseArrayInitializationValue(adviceExecutionPointcut);
        if (result == null) result = caseAnnotationValue(adviceExecutionPointcut);
        if (result == null) result = caseCommentable(adviceExecutionPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.STATIC_INIT_POINTCUT:
      {
        StaticInitPointcut staticInitPointcut = (StaticInitPointcut)theEObject;
        T result = caseStaticInitPointcut(staticInitPointcut);
        if (result == null) result = casePrimitivePointcut(staticInitPointcut);
        if (result == null) result = casePointcutAndExpressionChild(staticInitPointcut);
        if (result == null) result = casePointcutOrExpressionChild(staticInitPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(staticInitPointcut);
        if (result == null) result = caseConditionalExpressionChild(staticInitPointcut);
        if (result == null) result = caseAssignmentExpressionChild(staticInitPointcut);
        if (result == null) result = caseExpression(staticInitPointcut);
        if (result == null) result = caseArrayInitializationValue(staticInitPointcut);
        if (result == null) result = caseAnnotationValue(staticInitPointcut);
        if (result == null) result = caseCommentable(staticInitPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.INIT_POINTCUT:
      {
        InitPointcut initPointcut = (InitPointcut)theEObject;
        T result = caseInitPointcut(initPointcut);
        if (result == null) result = casePrimitivePointcut(initPointcut);
        if (result == null) result = casePointcutAndExpressionChild(initPointcut);
        if (result == null) result = casePointcutOrExpressionChild(initPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(initPointcut);
        if (result == null) result = caseConditionalExpressionChild(initPointcut);
        if (result == null) result = caseAssignmentExpressionChild(initPointcut);
        if (result == null) result = caseExpression(initPointcut);
        if (result == null) result = caseArrayInitializationValue(initPointcut);
        if (result == null) result = caseAnnotationValue(initPointcut);
        if (result == null) result = caseCommentable(initPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.PRE_INIT_POINTCUT:
      {
        PreInitPointcut preInitPointcut = (PreInitPointcut)theEObject;
        T result = casePreInitPointcut(preInitPointcut);
        if (result == null) result = casePrimitivePointcut(preInitPointcut);
        if (result == null) result = casePointcutAndExpressionChild(preInitPointcut);
        if (result == null) result = casePointcutOrExpressionChild(preInitPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(preInitPointcut);
        if (result == null) result = caseConditionalExpressionChild(preInitPointcut);
        if (result == null) result = caseAssignmentExpressionChild(preInitPointcut);
        if (result == null) result = caseExpression(preInitPointcut);
        if (result == null) result = caseArrayInitializationValue(preInitPointcut);
        if (result == null) result = caseAnnotationValue(preInitPointcut);
        if (result == null) result = caseCommentable(preInitPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.WITHIN_POINTCUT:
      {
        WithinPointcut withinPointcut = (WithinPointcut)theEObject;
        T result = caseWithinPointcut(withinPointcut);
        if (result == null) result = casePrimitivePointcut(withinPointcut);
        if (result == null) result = casePointcutAndExpressionChild(withinPointcut);
        if (result == null) result = casePointcutOrExpressionChild(withinPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(withinPointcut);
        if (result == null) result = caseConditionalExpressionChild(withinPointcut);
        if (result == null) result = caseAssignmentExpressionChild(withinPointcut);
        if (result == null) result = caseExpression(withinPointcut);
        if (result == null) result = caseArrayInitializationValue(withinPointcut);
        if (result == null) result = caseAnnotationValue(withinPointcut);
        if (result == null) result = caseCommentable(withinPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.WITHIN_CODE_POINTCUT:
      {
        WithinCodePointcut withinCodePointcut = (WithinCodePointcut)theEObject;
        T result = caseWithinCodePointcut(withinCodePointcut);
        if (result == null) result = casePrimitivePointcut(withinCodePointcut);
        if (result == null) result = casePointcutAndExpressionChild(withinCodePointcut);
        if (result == null) result = casePointcutOrExpressionChild(withinCodePointcut);
        if (result == null) result = caseConditionalOrExpressionChild(withinCodePointcut);
        if (result == null) result = caseConditionalExpressionChild(withinCodePointcut);
        if (result == null) result = caseAssignmentExpressionChild(withinCodePointcut);
        if (result == null) result = caseExpression(withinCodePointcut);
        if (result == null) result = caseArrayInitializationValue(withinCodePointcut);
        if (result == null) result = caseAnnotationValue(withinCodePointcut);
        if (result == null) result = caseCommentable(withinCodePointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.THIS_POINTCUT:
      {
        ThisPointcut thisPointcut = (ThisPointcut)theEObject;
        T result = caseThisPointcut(thisPointcut);
        if (result == null) result = caseContextExposurePc(thisPointcut);
        if (result == null) result = casePrimitivePointcut(thisPointcut);
        if (result == null) result = casePointcutAndExpressionChild(thisPointcut);
        if (result == null) result = casePointcutOrExpressionChild(thisPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(thisPointcut);
        if (result == null) result = caseConditionalExpressionChild(thisPointcut);
        if (result == null) result = caseAssignmentExpressionChild(thisPointcut);
        if (result == null) result = caseExpression(thisPointcut);
        if (result == null) result = caseArrayInitializationValue(thisPointcut);
        if (result == null) result = caseAnnotationValue(thisPointcut);
        if (result == null) result = caseCommentable(thisPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.TARGET_POINTCUT:
      {
        TargetPointcut targetPointcut = (TargetPointcut)theEObject;
        T result = caseTargetPointcut(targetPointcut);
        if (result == null) result = caseContextExposurePc(targetPointcut);
        if (result == null) result = casePrimitivePointcut(targetPointcut);
        if (result == null) result = casePointcutAndExpressionChild(targetPointcut);
        if (result == null) result = casePointcutOrExpressionChild(targetPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(targetPointcut);
        if (result == null) result = caseConditionalExpressionChild(targetPointcut);
        if (result == null) result = caseAssignmentExpressionChild(targetPointcut);
        if (result == null) result = caseExpression(targetPointcut);
        if (result == null) result = caseArrayInitializationValue(targetPointcut);
        if (result == null) result = caseAnnotationValue(targetPointcut);
        if (result == null) result = caseCommentable(targetPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.ARGS_POINTCUT:
      {
        ArgsPointcut argsPointcut = (ArgsPointcut)theEObject;
        T result = caseArgsPointcut(argsPointcut);
        if (result == null) result = caseContextExposurePc(argsPointcut);
        if (result == null) result = casePrimitivePointcut(argsPointcut);
        if (result == null) result = casePointcutAndExpressionChild(argsPointcut);
        if (result == null) result = casePointcutOrExpressionChild(argsPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(argsPointcut);
        if (result == null) result = caseConditionalExpressionChild(argsPointcut);
        if (result == null) result = caseAssignmentExpressionChild(argsPointcut);
        if (result == null) result = caseExpression(argsPointcut);
        if (result == null) result = caseArrayInitializationValue(argsPointcut);
        if (result == null) result = caseAnnotationValue(argsPointcut);
        if (result == null) result = caseCommentable(argsPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.CFLOW_POINTCUT:
      {
        CFlowPointcut cFlowPointcut = (CFlowPointcut)theEObject;
        T result = caseCFlowPointcut(cFlowPointcut);
        if (result == null) result = casePrimitivePointcut(cFlowPointcut);
        if (result == null) result = casePointcutAndExpressionChild(cFlowPointcut);
        if (result == null) result = casePointcutOrExpressionChild(cFlowPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(cFlowPointcut);
        if (result == null) result = caseConditionalExpressionChild(cFlowPointcut);
        if (result == null) result = caseAssignmentExpressionChild(cFlowPointcut);
        if (result == null) result = caseExpression(cFlowPointcut);
        if (result == null) result = caseArrayInitializationValue(cFlowPointcut);
        if (result == null) result = caseAnnotationValue(cFlowPointcut);
        if (result == null) result = caseCommentable(cFlowPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.CFLOW_BELOW_POINTCUT:
      {
        CFlowBelowPointcut cFlowBelowPointcut = (CFlowBelowPointcut)theEObject;
        T result = caseCFlowBelowPointcut(cFlowBelowPointcut);
        if (result == null) result = casePrimitivePointcut(cFlowBelowPointcut);
        if (result == null) result = casePointcutAndExpressionChild(cFlowBelowPointcut);
        if (result == null) result = casePointcutOrExpressionChild(cFlowBelowPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(cFlowBelowPointcut);
        if (result == null) result = caseConditionalExpressionChild(cFlowBelowPointcut);
        if (result == null) result = caseAssignmentExpressionChild(cFlowBelowPointcut);
        if (result == null) result = caseExpression(cFlowBelowPointcut);
        if (result == null) result = caseArrayInitializationValue(cFlowBelowPointcut);
        if (result == null) result = caseAnnotationValue(cFlowBelowPointcut);
        if (result == null) result = caseCommentable(cFlowBelowPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.IF_POINTCUT:
      {
        IfPointcut ifPointcut = (IfPointcut)theEObject;
        T result = caseIfPointcut(ifPointcut);
        if (result == null) result = casePrimitivePointcut(ifPointcut);
        if (result == null) result = casePointcutAndExpressionChild(ifPointcut);
        if (result == null) result = casePointcutOrExpressionChild(ifPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(ifPointcut);
        if (result == null) result = caseConditionalExpressionChild(ifPointcut);
        if (result == null) result = caseAssignmentExpressionChild(ifPointcut);
        if (result == null) result = caseExpression(ifPointcut);
        if (result == null) result = caseArrayInitializationValue(ifPointcut);
        if (result == null) result = caseAnnotationValue(ifPointcut);
        if (result == null) result = caseCommentable(ifPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.POINTCUT:
      {
        Pointcut pointcut = (Pointcut)theEObject;
        T result = casePointcut(pointcut);
        if (result == null) result = caseAspectMember(pointcut);
        if (result == null) result = caseReferenceableElement(pointcut);
        if (result == null) result = caseMember(pointcut);
        if (result == null) result = caseNamedElement(pointcut);
        if (result == null) result = caseCommentable(pointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.ASPECT_JPOINTCUT:
      {
        AspectJPointcut aspectJPointcut = (AspectJPointcut)theEObject;
        T result = caseAspectJPointcut(aspectJPointcut);
        if (result == null) result = casePointcut(aspectJPointcut);
        if (result == null) result = caseParametrizable(aspectJPointcut);
        if (result == null) result = caseAspectMember(aspectJPointcut);
        if (result == null) result = caseReferenceableElement(aspectJPointcut);
        if (result == null) result = caseMember(aspectJPointcut);
        if (result == null) result = caseNamedElement(aspectJPointcut);
        if (result == null) result = caseCommentable(aspectJPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.CONTEXT_EXPOSURE_PC:
      {
        ContextExposurePc contextExposurePc = (ContextExposurePc)theEObject;
        T result = caseContextExposurePc(contextExposurePc);
        if (result == null) result = casePrimitivePointcut(contextExposurePc);
        if (result == null) result = casePointcutAndExpressionChild(contextExposurePc);
        if (result == null) result = casePointcutOrExpressionChild(contextExposurePc);
        if (result == null) result = caseConditionalOrExpressionChild(contextExposurePc);
        if (result == null) result = caseConditionalExpressionChild(contextExposurePc);
        if (result == null) result = caseAssignmentExpressionChild(contextExposurePc);
        if (result == null) result = caseExpression(contextExposurePc);
        if (result == null) result = caseArrayInitializationValue(contextExposurePc);
        if (result == null) result = caseAnnotationValue(contextExposurePc);
        if (result == null) result = caseCommentable(contextExposurePc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PointcutsPackage.RETURNING_POINTCUT:
      {
        ReturningPointcut returningPointcut = (ReturningPointcut)theEObject;
        T result = caseReturningPointcut(returningPointcut);
        if (result == null) result = caseContextExposurePc(returningPointcut);
        if (result == null) result = casePrimitivePointcut(returningPointcut);
        if (result == null) result = casePointcutAndExpressionChild(returningPointcut);
        if (result == null) result = casePointcutOrExpressionChild(returningPointcut);
        if (result == null) result = caseConditionalOrExpressionChild(returningPointcut);
        if (result == null) result = caseConditionalExpressionChild(returningPointcut);
        if (result == null) result = caseAssignmentExpressionChild(returningPointcut);
        if (result == null) result = caseExpression(returningPointcut);
        if (result == null) result = caseArrayInitializationValue(returningPointcut);
        if (result == null) result = caseAnnotationValue(returningPointcut);
        if (result == null) result = caseCommentable(returningPointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Primitive Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Primitive Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePrimitivePointcut(PrimitivePointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Call Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Call Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCallPointcut(CallPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Execution Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Execution Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExecutionPointcut(ExecutionPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Get Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Get Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGetPointcut(GetPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Set Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Set Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSetPointcut(SetPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Handler Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Handler Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseHandlerPointcut(HandlerPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Advice Execution Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Advice Execution Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAdviceExecutionPointcut(AdviceExecutionPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Static Init Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Static Init Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStaticInitPointcut(StaticInitPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Init Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Init Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInitPointcut(InitPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pre Init Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pre Init Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePreInitPointcut(PreInitPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Within Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Within Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWithinPointcut(WithinPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Within Code Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Within Code Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWithinCodePointcut(WithinCodePointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>This Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>This Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseThisPointcut(ThisPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Target Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Target Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTargetPointcut(TargetPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Args Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Args Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArgsPointcut(ArgsPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CFlow Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CFlow Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCFlowPointcut(CFlowPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CFlow Below Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CFlow Below Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCFlowBelowPointcut(CFlowBelowPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>If Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>If Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIfPointcut(IfPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointcut(Pointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aspect JPointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aspect JPointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAspectJPointcut(AspectJPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Context Exposure Pc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Context Exposure Pc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContextExposurePc(ContextExposurePc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Returning Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Returning Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReturningPointcut(ReturningPointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommentable(Commentable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Array Initialization Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Array Initialization Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseArrayInitializationValue(ArrayInitializationValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Annotation Value</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAnnotationValue(AnnotationValue object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExpression(Expression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Assignment Expression Child</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Assignment Expression Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAssignmentExpressionChild(AssignmentExpressionChild object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Expression Child</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Expression Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalExpressionChild(ConditionalExpressionChild object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Or Expression Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalOrExpressionChild(ConditionalOrExpressionChild object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pointcut Or Expression Child</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pointcut Or Expression Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointcutOrExpressionChild(PointcutOrExpressionChild object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pointcut And Expression Child</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pointcut And Expression Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePointcutAndExpressionChild(PointcutAndExpressionChild object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMember(Member object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aspect Member</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aspect Member</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAspectMember(AspectMember object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Referenceable Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReferenceableElement(ReferenceableElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parametrizable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parametrizable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParametrizable(Parametrizable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PointcutsSwitch
