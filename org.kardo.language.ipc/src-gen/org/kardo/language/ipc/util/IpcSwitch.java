/**
 */
package org.kardo.language.ipc.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.java.commons.Commentable;
import org.emftext.language.java.commons.NamedElement;

import org.emftext.language.java.members.Member;

import org.emftext.language.java.references.ReferenceableElement;

import org.kardo.language.aspectj.commons.AspectMember;

import org.kardo.language.aspectj.pointcuts.Pointcut;

import org.kardo.language.ipc.*;

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
 * @see org.kardo.language.ipc.IpcPackage
 * @generated
 */
public class IpcSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static IpcPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IpcSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = IpcPackage.eINSTANCE;
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
      case IpcPackage.IPC:
      {
        Ipc ipc = (Ipc)theEObject;
        T result = caseIpc(ipc);
        if (result == null) result = caseIpcUnionChild(ipc);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.INSTANCE_POINTCUT:
      {
        InstancePointcut instancePointcut = (InstancePointcut)theEObject;
        T result = caseInstancePointcut(instancePointcut);
        if (result == null) result = casePointcut(instancePointcut);
        if (result == null) result = caseIpc(instancePointcut);
        if (result == null) result = caseAspectMember(instancePointcut);
        if (result == null) result = caseReferenceableElement(instancePointcut);
        if (result == null) result = caseIpcUnionChild(instancePointcut);
        if (result == null) result = caseMember(instancePointcut);
        if (result == null) result = caseNamedElement(instancePointcut);
        if (result == null) result = caseCommentable(instancePointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.IPC_EXPRESSION:
      {
        IpcExpression ipcExpression = (IpcExpression)theEObject;
        T result = caseIpcExpression(ipcExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.IPC_SUB_EXPRESSION:
      {
        IpcSubExpression ipcSubExpression = (IpcSubExpression)theEObject;
        T result = caseIpcSubExpression(ipcSubExpression);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.BEFORE_EVENT:
      {
        BeforeEvent beforeEvent = (BeforeEvent)theEObject;
        T result = caseBeforeEvent(beforeEvent);
        if (result == null) result = caseEvent(beforeEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.AFTER_EVENT:
      {
        AfterEvent afterEvent = (AfterEvent)theEObject;
        T result = caseAfterEvent(afterEvent);
        if (result == null) result = caseEvent(afterEvent);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.COMPOSITE_INSTANCE_POINTCUT:
      {
        CompositeInstancePointcut compositeInstancePointcut = (CompositeInstancePointcut)theEObject;
        T result = caseCompositeInstancePointcut(compositeInstancePointcut);
        if (result == null) result = casePointcut(compositeInstancePointcut);
        if (result == null) result = caseIpc(compositeInstancePointcut);
        if (result == null) result = caseAspectMember(compositeInstancePointcut);
        if (result == null) result = caseReferenceableElement(compositeInstancePointcut);
        if (result == null) result = caseIpcUnionChild(compositeInstancePointcut);
        if (result == null) result = caseMember(compositeInstancePointcut);
        if (result == null) result = caseNamedElement(compositeInstancePointcut);
        if (result == null) result = caseCommentable(compositeInstancePointcut);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.IPC_COMPOSITION:
      {
        IpcComposition ipcComposition = (IpcComposition)theEObject;
        T result = caseIpcComposition(ipcComposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.IPC_COMPOSITION_CHILD:
      {
        IpcCompositionChild ipcCompositionChild = (IpcCompositionChild)theEObject;
        T result = caseIpcCompositionChild(ipcCompositionChild);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.IPC_UNION:
      {
        IpcUnion ipcUnion = (IpcUnion)theEObject;
        T result = caseIpcUnion(ipcUnion);
        if (result == null) result = caseIpcCompositionChild(ipcUnion);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.IPC_UNION_CHILD:
      {
        IpcUnionChild ipcUnionChild = (IpcUnionChild)theEObject;
        T result = caseIpcUnionChild(ipcUnionChild);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case IpcPackage.IPC_INTERSECTION:
      {
        IpcIntersection ipcIntersection = (IpcIntersection)theEObject;
        T result = caseIpcIntersection(ipcIntersection);
        if (result == null) result = caseIpcUnionChild(ipcIntersection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Ipc</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Ipc</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIpc(Ipc object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instance Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instance Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstancePointcut(InstancePointcut object)
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
  public T caseIpcExpression(IpcExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sub Expression</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sub Expression</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIpcSubExpression(IpcSubExpression object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Before Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Before Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseBeforeEvent(BeforeEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>After Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>After Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAfterEvent(AfterEvent object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composite Instance Pointcut</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composite Instance Pointcut</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCompositeInstancePointcut(CompositeInstancePointcut object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIpcComposition(IpcComposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Composition Child</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Composition Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIpcCompositionChild(IpcCompositionChild object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Union</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Union</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIpcUnion(IpcUnion object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Union Child</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Union Child</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIpcUnionChild(IpcUnionChild object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Intersection</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Intersection</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIpcIntersection(IpcIntersection object)
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

} //IpcSwitch
