/**
 */
package org.kardo.language.ipc.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.emftext.language.java.commons.Commentable;
import org.emftext.language.java.commons.NamedElement;

import org.emftext.language.java.members.Member;

import org.emftext.language.java.references.ReferenceableElement;

import org.kardo.language.aspectj.commons.AspectMember;

import org.kardo.language.aspectj.pointcuts.Pointcut;

import org.kardo.language.ipc.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.kardo.language.ipc.IpcPackage
 * @generated
 */
public class IpcAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IpcPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IpcAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = IpcPackage.eINSTANCE;
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
  protected IpcSwitch<Adapter> modelSwitch =
    new IpcSwitch<Adapter>()
    {
      @Override
      public Adapter caseIpc(Ipc object)
      {
        return createIpcAdapter();
      }
      @Override
      public Adapter caseInstancePointcut(InstancePointcut object)
      {
        return createInstancePointcutAdapter();
      }
      @Override
      public Adapter caseIpcExpression(IpcExpression object)
      {
        return createIpcExpressionAdapter();
      }
      @Override
      public Adapter caseIpcSubExpression(IpcSubExpression object)
      {
        return createIpcSubExpressionAdapter();
      }
      @Override
      public Adapter caseEvent(Event object)
      {
        return createEventAdapter();
      }
      @Override
      public Adapter caseBeforeEvent(BeforeEvent object)
      {
        return createBeforeEventAdapter();
      }
      @Override
      public Adapter caseAfterEvent(AfterEvent object)
      {
        return createAfterEventAdapter();
      }
      @Override
      public Adapter caseCompositeInstancePointcut(CompositeInstancePointcut object)
      {
        return createCompositeInstancePointcutAdapter();
      }
      @Override
      public Adapter caseIpcComposition(IpcComposition object)
      {
        return createIpcCompositionAdapter();
      }
      @Override
      public Adapter caseIpcCompositionChild(IpcCompositionChild object)
      {
        return createIpcCompositionChildAdapter();
      }
      @Override
      public Adapter caseIpcUnion(IpcUnion object)
      {
        return createIpcUnionAdapter();
      }
      @Override
      public Adapter caseIpcUnionChild(IpcUnionChild object)
      {
        return createIpcUnionChildAdapter();
      }
      @Override
      public Adapter caseIpcIntersection(IpcIntersection object)
      {
        return createIpcIntersectionAdapter();
      }
      @Override
      public Adapter caseCommentable(Commentable object)
      {
        return createCommentableAdapter();
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
      public Adapter casePointcut(Pointcut object)
      {
        return createPointcutAdapter();
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
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.Ipc <em>Ipc</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.Ipc
   * @generated
   */
  public Adapter createIpcAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.InstancePointcut <em>Instance Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.InstancePointcut
   * @generated
   */
  public Adapter createInstancePointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.IpcExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.IpcExpression
   * @generated
   */
  public Adapter createIpcExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.IpcSubExpression <em>Sub Expression</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.IpcSubExpression
   * @generated
   */
  public Adapter createIpcSubExpressionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.Event
   * @generated
   */
  public Adapter createEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.BeforeEvent <em>Before Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.BeforeEvent
   * @generated
   */
  public Adapter createBeforeEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.AfterEvent <em>After Event</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.AfterEvent
   * @generated
   */
  public Adapter createAfterEventAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.CompositeInstancePointcut <em>Composite Instance Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.CompositeInstancePointcut
   * @generated
   */
  public Adapter createCompositeInstancePointcutAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.IpcComposition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.IpcComposition
   * @generated
   */
  public Adapter createIpcCompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.IpcCompositionChild <em>Composition Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.IpcCompositionChild
   * @generated
   */
  public Adapter createIpcCompositionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.IpcUnion <em>Union</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.IpcUnion
   * @generated
   */
  public Adapter createIpcUnionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.IpcUnionChild <em>Union Child</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.IpcUnionChild
   * @generated
   */
  public Adapter createIpcUnionChildAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.kardo.language.ipc.IpcIntersection <em>Intersection</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.kardo.language.ipc.IpcIntersection
   * @generated
   */
  public Adapter createIpcIntersectionAdapter()
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

} //IpcAdapterFactory
