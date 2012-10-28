/**
 */
package org.kardo.language.aspectj.advice.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.kardo.language.aspectj.advice.AdvicePackage;
import org.kardo.language.aspectj.advice.AfterReturning;

import org.kardo.language.aspectj.pointcuts.ReturningPointcut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>After Returning</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.advice.impl.AfterReturningImpl#getReturning <em>Returning</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AfterReturningImpl extends AfterAdviceImpl implements AfterReturning
{
  /**
   * The cached value of the '{@link #getReturning() <em>Returning</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReturning()
   * @generated
   * @ordered
   */
  protected ReturningPointcut returning;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AfterReturningImpl()
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
    return AdvicePackage.Literals.AFTER_RETURNING;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReturningPointcut getReturning()
  {
    return returning;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetReturning(ReturningPointcut newReturning, NotificationChain msgs)
  {
    ReturningPointcut oldReturning = returning;
    returning = newReturning;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdvicePackage.AFTER_RETURNING__RETURNING, oldReturning, newReturning);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReturning(ReturningPointcut newReturning)
  {
    if (newReturning != returning)
    {
      NotificationChain msgs = null;
      if (returning != null)
        msgs = ((InternalEObject)returning).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdvicePackage.AFTER_RETURNING__RETURNING, null, msgs);
      if (newReturning != null)
        msgs = ((InternalEObject)newReturning).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdvicePackage.AFTER_RETURNING__RETURNING, null, msgs);
      msgs = basicSetReturning(newReturning, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdvicePackage.AFTER_RETURNING__RETURNING, newReturning, newReturning));
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
      case AdvicePackage.AFTER_RETURNING__RETURNING:
        return basicSetReturning(null, msgs);
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
      case AdvicePackage.AFTER_RETURNING__RETURNING:
        return getReturning();
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
      case AdvicePackage.AFTER_RETURNING__RETURNING:
        setReturning((ReturningPointcut)newValue);
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
      case AdvicePackage.AFTER_RETURNING__RETURNING:
        setReturning((ReturningPointcut)null);
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
      case AdvicePackage.AFTER_RETURNING__RETURNING:
        return returning != null;
    }
    return super.eIsSet(featureID);
  }

} //AfterReturningImpl
