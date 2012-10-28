/**
 */
package org.kardo.language.aspectj.pointcuts.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.kardo.language.aspectj.pointcuts.PointcutsPackage
 * @generated
 */
public class PointcutsAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PointcutsPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointcutsAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = PointcutsPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PointcutsSwitch<Adapter> modelSwitch =
    new PointcutsSwitch<Adapter>()
    {
      @Override
      public Adapter casePrimitivePointcut(PrimitivePointcut object)
      {
        return createPrimitivePointcutAdapter();
      }
      @Override
      public Adapter caseCallPointcut(CallPointcut object)
      {
        return createCallPointcutAdapter();
      }
      @Override
      public Adapter caseExecutionPointcut(ExecutionPointcut object)
      {
        return createExecutionPointcutAdapter();
      }
      @Override
      public Adapter caseGetPointcut(GetPointcut object)
      {
        return createGetPointcutAdapter();
      }
      @Override
      public Adapter caseSetPointcut(SetPointcut object)
      {
        return createSetPointcutAdapter();
      }
      @Override
      public Adapter caseHandlerPointcut(HandlerPointcut object)
      {
        return createHandlerPointcutAdapter();
      }
      @Override
      public Adapter caseAdviceExecutionPointcut(AdviceExecutionPointcut object)
      {
        return createAdviceExecutionPointcutAdapter();
      }
      @Override
      public Adapter caseStaticInitPointcut(StaticInitPointcut object)
      {
        return createStaticInitPointcutAdapter();
      }
      @Override
      public Adapter caseInitPointcut(InitPointcut object)
      {
        return createInitPointcutAdapter();
      }
      @Override
      public Adapter casePreInitPointcut(PreInitPointcut object)
      {
        return createPreInitPointcutAdapter();
      }
      @Override
      public Adapter caseWithinPointcut(WithinPointcut object)
      {
        return createWithinPointcutAdapter();
      }
      @Override
      public Adapter caseWithinCodePointcut(WithinCodePointcut object)
      {
        return createWithinCodePointcutAdapter();
      }
      @Override
      public Adapter caseThisPointcut(ThisPointcut object)
      {
        return createThisPointcutAdapter();
      }
      @Override
      public Adapter caseTargetPointcut(TargetPointcut object)
      {
        return createTargetPointcutAdapter();
      }
      @Override
      public Adapter caseArgsPointcut(ArgsPointcut object)
      {
        return createArgsPointcutAdapter();
      }
      @Override
      public Adapter caseCFlowPointcut(CFlowPointcut object)
      {
        return createCFlowPointcutAdapter();
      }
      @Override
      public Adapter caseCFlowBelowPointcut(CFlowBelowPointcut object)
      {
        return createCFlowBelowPointcutAdapter();
      }
      @Override
      public Adapter caseIfPointcut(IfPointcut object)
      {
        return createIfPointcutAdapter();
      }
      @Override
      public Adapter casePointcut(Pointcut object)
      {
        return createPointcutAdapter();
      }
      @Override
      public Adapter caseAspectJPointcut(AspectJPointcut object)
      {
        return createAspectJPointcutAdapter();
      }
      @Override
      public Adapter caseContextExposurePc(ContextExposurePc object)
      {
        return createContextExposurePcAdapter();
      }
      @Override
      public Adapter caseReturningPointcut(ReturningPointcut object)
      {
        return createReturningPointcutAdapter();
      }
      @Override
      public Adapter caseCommentable(Commentable object)
      {
        return createCommentableAdapter();
      }
      @Override
      public Adapter caseArrayInitializationValue(ArrayInitializationValue object)
      {
        return createArrayInitializationValueAdapter();
      }
      @Override
      public Adapter caseAnnotationValue(AnnotationValue object)
      {
        return createAnnotationValueAdapter();
      }
      @Override
      public Adapter caseExpression(Expression object)
      {
        return createExpressionAdapter();
      }
      @Override
      public Adapter caseAssignmentExpressionChild(AssignmentExpressionChild object)
      {
        return createAssignmentExpressionChildAdapter();
      }
      @Override
      public Adapter caseConditionalExpressionChild(ConditionalExpressionChild object)
      {
        return createConditionalExpressionChildAdapter();
      }
      @Override
      public Adapter caseConditionalOrExpressionChild(ConditionalOrExpressionChild object)
      {
        return createConditionalOrExpressionChildAdapter();
      }
      @Override
      public Adapter casePointcutOrExpressionChild(PointcutOrExpressionChild object)
      {
        return createPointcutOrExpressionChildAdapter();
      }
      @Override
      public Adapter casePointcutAndExpressionChild(PointcutAndExpressionChild object)
      {
        return createPointcutAndExpressionChildAdapter();
      }
      @Override
      public Adapter caseNamedElement(NamedElement object)
      {
        return createNamedElementAdapter();
      }
      @Override
      public Adapter caseMember(Member object)
      {
        return createMemberAdapter();
      }
      @Override
      public Adapter caseAspectMember(AspectMember object)
      {
        return createAspectMemberAdapter();
      }
      @Override
      public Adapter caseReferenceableElement(ReferenceableElement object)
      {
        return createReferenceableElementAdapter();
      }
      @Override
      public Adapter caseParametrizable(Parametrizable object)
      {
        return createParametrizableAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.PrimitivePointcut <em>Primitive Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.PrimitivePointcut
   * @generated
   */
  public Adapter createPrimitivePointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.CallPointcut <em>Call Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.CallPointcut
   * @generated
   */
  public Adapter createCallPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.ExecutionPointcut <em>Execution Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.ExecutionPointcut
   * @generated
   */
  public Adapter createExecutionPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.GetPointcut <em>Get Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.GetPointcut
   * @generated
   */
  public Adapter createGetPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.SetPointcut <em>Set Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.SetPointcut
   * @generated
   */
  public Adapter createSetPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.HandlerPointcut <em>Handler Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.HandlerPointcut
   * @generated
   */
  public Adapter createHandlerPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.AdviceExecutionPointcut <em>Advice Execution Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.AdviceExecutionPointcut
   * @generated
   */
  public Adapter createAdviceExecutionPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.StaticInitPointcut <em>Static Init Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.StaticInitPointcut
   * @generated
   */
  public Adapter createStaticInitPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.InitPointcut <em>Init Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.InitPointcut
   * @generated
   */
  public Adapter createInitPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.PreInitPointcut <em>Pre Init Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.PreInitPointcut
   * @generated
   */
  public Adapter createPreInitPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.WithinPointcut <em>Within Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.WithinPointcut
   * @generated
   */
  public Adapter createWithinPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.WithinCodePointcut <em>Within Code Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.WithinCodePointcut
   * @generated
   */
  public Adapter createWithinCodePointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.ThisPointcut <em>This Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.ThisPointcut
   * @generated
   */
  public Adapter createThisPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.TargetPointcut <em>Target Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.TargetPointcut
   * @generated
   */
  public Adapter createTargetPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.ArgsPointcut <em>Args Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.ArgsPointcut
   * @generated
   */
  public Adapter createArgsPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.CFlowPointcut <em>CFlow Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.CFlowPointcut
   * @generated
   */
  public Adapter createCFlowPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.CFlowBelowPointcut <em>CFlow Below Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.CFlowBelowPointcut
   * @generated
   */
  public Adapter createCFlowBelowPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.IfPointcut <em>If Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.IfPointcut
   * @generated
   */
  public Adapter createIfPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.Pointcut <em>Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.Pointcut
   * @generated
   */
  public Adapter createPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.AspectJPointcut <em>Aspect JPointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.AspectJPointcut
   * @generated
   */
  public Adapter createAspectJPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.ContextExposurePc <em>Context Exposure Pc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.ContextExposurePc
   * @generated
   */
  public Adapter createContextExposurePcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pointcuts.ReturningPointcut <em>Returning Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pointcuts.ReturningPointcut
   * @generated
   */
  public Adapter createReturningPointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.commons.Commentable <em>Commentable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.commons.Commentable
   * @generated
   */
  public Adapter createCommentableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.arrays.ArrayInitializationValue <em>Array Initialization Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.arrays.ArrayInitializationValue
   * @generated
   */
  public Adapter createArrayInitializationValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.annotations.AnnotationValue <em>Annotation Value</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.annotations.AnnotationValue
   * @generated
   */
  public Adapter createAnnotationValueAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.Expression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.Expression
   * @generated
   */
  public Adapter createExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.AssignmentExpressionChild <em>Assignment Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.AssignmentExpressionChild
   * @generated
   */
  public Adapter createAssignmentExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ConditionalExpressionChild <em>Conditional Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.ConditionalExpressionChild
   * @generated
   */
  public Adapter createConditionalExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.expressions.ConditionalOrExpressionChild <em>Conditional Or Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.expressions.ConditionalOrExpressionChild
   * @generated
   */
  public Adapter createConditionalOrExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pcexp.PointcutOrExpressionChild <em>Pointcut Or Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pcexp.PointcutOrExpressionChild
   * @generated
   */
  public Adapter createPointcutOrExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.pcexp.PointcutAndExpressionChild <em>Pointcut And Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.pcexp.PointcutAndExpressionChild
   * @generated
   */
  public Adapter createPointcutAndExpressionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.commons.NamedElement <em>Named Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.commons.NamedElement
   * @generated
   */
  public Adapter createNamedElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.members.Member <em>Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.members.Member
   * @generated
   */
  public Adapter createMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.aspectj.commons.AspectMember <em>Aspect Member</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.aspectj.commons.AspectMember
   * @generated
   */
  public Adapter createAspectMemberAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.references.ReferenceableElement <em>Referenceable Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.references.ReferenceableElement
   * @generated
   */
  public Adapter createReferenceableElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.emftext.language.java.parameters.Parametrizable <em>Parametrizable</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.emftext.language.java.parameters.Parametrizable
   * @generated
   */
  public Adapter createParametrizableAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //PointcutsAdapterFactory
