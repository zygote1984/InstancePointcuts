/**
 */
package org.kardo.language.ipc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kardo.language.ipc.AfterEvent;
import org.kardo.language.ipc.BeforeEvent;
import org.kardo.language.ipc.IpcPackage;
import org.kardo.language.ipc.IpcSubExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sub Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kardo.language.ipc.impl.IpcSubExpressionImpl#getBefore <em>Before</em>}</li>
 *   <li>{@link org.kardo.language.ipc.impl.IpcSubExpressionImpl#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IpcSubExpressionImpl extends EObjectImpl implements IpcSubExpression
{
  /**
   * The cached value of the '{@link #getBefore() <em>Before</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBefore()
   * @generated
   * @ordered
   */
  protected BeforeEvent before;

  /**
   * The cached value of the '{@link #getAfter() <em>After</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAfter()
   * @generated
   * @ordered
   */
  protected AfterEvent after;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IpcSubExpressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return IpcPackage.Literals.IPC_SUB_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeforeEvent getBefore()
  {
    return before;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetBefore(BeforeEvent newBefore, NotificationChain msgs)
  {
    BeforeEvent oldBefore = before;
    before = newBefore;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IpcPackage.IPC_SUB_EXPRESSION__BEFORE, oldBefore, newBefore);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBefore(BeforeEvent newBefore)
  {
    if (newBefore != before)
    {
      NotificationChain msgs = null;
      if (before != null)
        msgs = ((InternalEObject)before).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IpcPackage.IPC_SUB_EXPRESSION__BEFORE, null, msgs);
      if (newBefore != null)
        msgs = ((InternalEObject)newBefore).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IpcPackage.IPC_SUB_EXPRESSION__BEFORE, null, msgs);
      msgs = basicSetBefore(newBefore, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IpcPackage.IPC_SUB_EXPRESSION__BEFORE, newBefore, newBefore));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterEvent getAfter()
  {
    return after;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAfter(AfterEvent newAfter, NotificationChain msgs)
  {
    AfterEvent oldAfter = after;
    after = newAfter;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IpcPackage.IPC_SUB_EXPRESSION__AFTER, oldAfter, newAfter);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAfter(AfterEvent newAfter)
  {
    if (newAfter != after)
    {
      NotificationChain msgs = null;
      if (after != null)
        msgs = ((InternalEObject)after).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IpcPackage.IPC_SUB_EXPRESSION__AFTER, null, msgs);
      if (newAfter != null)
        msgs = ((InternalEObject)newAfter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IpcPackage.IPC_SUB_EXPRESSION__AFTER, null, msgs);
      msgs = basicSetAfter(newAfter, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IpcPackage.IPC_SUB_EXPRESSION__AFTER, newAfter, newAfter));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case IpcPackage.IPC_SUB_EXPRESSION__BEFORE:
        return basicSetBefore(null, msgs);
      case IpcPackage.IPC_SUB_EXPRESSION__AFTER:
        return basicSetAfter(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case IpcPackage.IPC_SUB_EXPRESSION__BEFORE:
        return getBefore();
      case IpcPackage.IPC_SUB_EXPRESSION__AFTER:
        return getAfter();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case IpcPackage.IPC_SUB_EXPRESSION__BEFORE:
        setBefore((BeforeEvent)newValue);
        return;
      case IpcPackage.IPC_SUB_EXPRESSION__AFTER:
        setAfter((AfterEvent)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case IpcPackage.IPC_SUB_EXPRESSION__BEFORE:
        setBefore((BeforeEvent)null);
        return;
      case IpcPackage.IPC_SUB_EXPRESSION__AFTER:
        setAfter((AfterEvent)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case IpcPackage.IPC_SUB_EXPRESSION__BEFORE:
        return before != null;
      case IpcPackage.IPC_SUB_EXPRESSION__AFTER:
        return after != null;
    }
    return super.eIsSet(featureID);
  }

} //IpcSubExpressionImpl
