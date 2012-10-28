/**
 */
package org.kardo.language.ipc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kardo.language.ipc.IpcExpression;
import org.kardo.language.ipc.IpcPackage;
import org.kardo.language.ipc.IpcSubExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kardo.language.ipc.impl.IpcExpressionImpl#getAddExpression <em>Add Expression</em>}</li>
 *   <li>{@link org.kardo.language.ipc.impl.IpcExpressionImpl#getRemoveExpression <em>Remove Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IpcExpressionImpl extends EObjectImpl implements IpcExpression
{
  /**
   * The cached value of the '{@link #getAddExpression() <em>Add Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAddExpression()
   * @generated
   * @ordered
   */
  protected IpcSubExpression addExpression;

  /**
   * The cached value of the '{@link #getRemoveExpression() <em>Remove Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRemoveExpression()
   * @generated
   * @ordered
   */
  protected IpcSubExpression removeExpression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected IpcExpressionImpl()
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
    return IpcPackage.Literals.IPC_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IpcSubExpression getAddExpression()
  {
    return addExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAddExpression(IpcSubExpression newAddExpression, NotificationChain msgs)
  {
    IpcSubExpression oldAddExpression = addExpression;
    addExpression = newAddExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IpcPackage.IPC_EXPRESSION__ADD_EXPRESSION, oldAddExpression, newAddExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAddExpression(IpcSubExpression newAddExpression)
  {
    if (newAddExpression != addExpression)
    {
      NotificationChain msgs = null;
      if (addExpression != null)
        msgs = ((InternalEObject)addExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IpcPackage.IPC_EXPRESSION__ADD_EXPRESSION, null, msgs);
      if (newAddExpression != null)
        msgs = ((InternalEObject)newAddExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IpcPackage.IPC_EXPRESSION__ADD_EXPRESSION, null, msgs);
      msgs = basicSetAddExpression(newAddExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IpcPackage.IPC_EXPRESSION__ADD_EXPRESSION, newAddExpression, newAddExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IpcSubExpression getRemoveExpression()
  {
    return removeExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRemoveExpression(IpcSubExpression newRemoveExpression, NotificationChain msgs)
  {
    IpcSubExpression oldRemoveExpression = removeExpression;
    removeExpression = newRemoveExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IpcPackage.IPC_EXPRESSION__REMOVE_EXPRESSION, oldRemoveExpression, newRemoveExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRemoveExpression(IpcSubExpression newRemoveExpression)
  {
    if (newRemoveExpression != removeExpression)
    {
      NotificationChain msgs = null;
      if (removeExpression != null)
        msgs = ((InternalEObject)removeExpression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IpcPackage.IPC_EXPRESSION__REMOVE_EXPRESSION, null, msgs);
      if (newRemoveExpression != null)
        msgs = ((InternalEObject)newRemoveExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IpcPackage.IPC_EXPRESSION__REMOVE_EXPRESSION, null, msgs);
      msgs = basicSetRemoveExpression(newRemoveExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IpcPackage.IPC_EXPRESSION__REMOVE_EXPRESSION, newRemoveExpression, newRemoveExpression));
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
      case IpcPackage.IPC_EXPRESSION__ADD_EXPRESSION:
        return basicSetAddExpression(null, msgs);
      case IpcPackage.IPC_EXPRESSION__REMOVE_EXPRESSION:
        return basicSetRemoveExpression(null, msgs);
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
      case IpcPackage.IPC_EXPRESSION__ADD_EXPRESSION:
        return getAddExpression();
      case IpcPackage.IPC_EXPRESSION__REMOVE_EXPRESSION:
        return getRemoveExpression();
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
      case IpcPackage.IPC_EXPRESSION__ADD_EXPRESSION:
        setAddExpression((IpcSubExpression)newValue);
        return;
      case IpcPackage.IPC_EXPRESSION__REMOVE_EXPRESSION:
        setRemoveExpression((IpcSubExpression)newValue);
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
      case IpcPackage.IPC_EXPRESSION__ADD_EXPRESSION:
        setAddExpression((IpcSubExpression)null);
        return;
      case IpcPackage.IPC_EXPRESSION__REMOVE_EXPRESSION:
        setRemoveExpression((IpcSubExpression)null);
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
      case IpcPackage.IPC_EXPRESSION__ADD_EXPRESSION:
        return addExpression != null;
      case IpcPackage.IPC_EXPRESSION__REMOVE_EXPRESSION:
        return removeExpression != null;
    }
    return super.eIsSet(featureID);
  }

} //IpcExpressionImpl
