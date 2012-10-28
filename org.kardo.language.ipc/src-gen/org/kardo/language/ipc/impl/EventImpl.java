/**
 */
package org.kardo.language.ipc.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kardo.language.aspectj.pcexp.PointcutExpression;

import org.kardo.language.ipc.Event;
import org.kardo.language.ipc.IpcPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kardo.language.ipc.impl.EventImpl#getPcexp <em>Pcexp</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class EventImpl extends EObjectImpl implements Event
{
  /**
   * The cached value of the '{@link #getPcexp() <em>Pcexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPcexp()
   * @generated
   * @ordered
   */
  protected PointcutExpression pcexp;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected EventImpl()
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
    return IpcPackage.Literals.EVENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointcutExpression getPcexp()
  {
    return pcexp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPcexp(PointcutExpression newPcexp, NotificationChain msgs)
  {
    PointcutExpression oldPcexp = pcexp;
    pcexp = newPcexp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, IpcPackage.EVENT__PCEXP, oldPcexp, newPcexp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPcexp(PointcutExpression newPcexp)
  {
    if (newPcexp != pcexp)
    {
      NotificationChain msgs = null;
      if (pcexp != null)
        msgs = ((InternalEObject)pcexp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - IpcPackage.EVENT__PCEXP, null, msgs);
      if (newPcexp != null)
        msgs = ((InternalEObject)newPcexp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - IpcPackage.EVENT__PCEXP, null, msgs);
      msgs = basicSetPcexp(newPcexp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, IpcPackage.EVENT__PCEXP, newPcexp, newPcexp));
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
      case IpcPackage.EVENT__PCEXP:
        return basicSetPcexp(null, msgs);
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
      case IpcPackage.EVENT__PCEXP:
        return getPcexp();
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
      case IpcPackage.EVENT__PCEXP:
        setPcexp((PointcutExpression)newValue);
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
      case IpcPackage.EVENT__PCEXP:
        setPcexp((PointcutExpression)null);
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
      case IpcPackage.EVENT__PCEXP:
        return pcexp != null;
    }
    return super.eIsSet(featureID);
  }

} //EventImpl
