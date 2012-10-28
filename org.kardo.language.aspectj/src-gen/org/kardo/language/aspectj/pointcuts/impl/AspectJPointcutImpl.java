/**
 */
package org.kardo.language.aspectj.pointcuts.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.expressions.ConditionalExpression;

import org.emftext.language.java.modifiers.Abstract;

import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.parameters.ParametersPackage;
import org.emftext.language.java.parameters.Parametrizable;

import org.kardo.language.aspectj.pointcuts.AspectJPointcut;
import org.kardo.language.aspectj.pointcuts.PointcutsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect JPointcut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.pointcuts.impl.AspectJPointcutImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.pointcuts.impl.AspectJPointcutImpl#getExp <em>Exp</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.pointcuts.impl.AspectJPointcutImpl#getAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AspectJPointcutImpl extends PointcutImpl implements AspectJPointcut
{
  /**
   * The cached value of the '{@link #getParameters() <em>Parameters</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getParameters()
   * @generated
   * @ordered
   */
  protected EList<Parameter> parameters;

  /**
   * The cached value of the '{@link #getExp() <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExp()
   * @generated
   * @ordered
   */
  protected ConditionalExpression exp;

  /**
   * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAbstract()
   * @generated
   * @ordered
   */
  protected Abstract abstract_;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AspectJPointcutImpl()
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
    return PointcutsPackage.Literals.ASPECT_JPOINTCUT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Parameter> getParameters()
  {
    if (parameters == null)
    {
      parameters = new EObjectContainmentEList.Resolving<Parameter>(Parameter.class, this, PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ConditionalExpression getExp()
  {
    return exp;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExp(ConditionalExpression newExp, NotificationChain msgs)
  {
    ConditionalExpression oldExp = exp;
    exp = newExp;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PointcutsPackage.ASPECT_JPOINTCUT__EXP, oldExp, newExp);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExp(ConditionalExpression newExp)
  {
    if (newExp != exp)
    {
      NotificationChain msgs = null;
      if (exp != null)
        msgs = ((InternalEObject)exp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PointcutsPackage.ASPECT_JPOINTCUT__EXP, null, msgs);
      if (newExp != null)
        msgs = ((InternalEObject)newExp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PointcutsPackage.ASPECT_JPOINTCUT__EXP, null, msgs);
      msgs = basicSetExp(newExp, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PointcutsPackage.ASPECT_JPOINTCUT__EXP, newExp, newExp));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Abstract getAbstract()
  {
    return abstract_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAbstract(Abstract newAbstract, NotificationChain msgs)
  {
    Abstract oldAbstract = abstract_;
    abstract_ = newAbstract;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PointcutsPackage.ASPECT_JPOINTCUT__ABSTRACT, oldAbstract, newAbstract);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAbstract(Abstract newAbstract)
  {
    if (newAbstract != abstract_)
    {
      NotificationChain msgs = null;
      if (abstract_ != null)
        msgs = ((InternalEObject)abstract_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PointcutsPackage.ASPECT_JPOINTCUT__ABSTRACT, null, msgs);
      if (newAbstract != null)
        msgs = ((InternalEObject)newAbstract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PointcutsPackage.ASPECT_JPOINTCUT__ABSTRACT, null, msgs);
      msgs = basicSetAbstract(newAbstract, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PointcutsPackage.ASPECT_JPOINTCUT__ABSTRACT, newAbstract, newAbstract));
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
      case PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case PointcutsPackage.ASPECT_JPOINTCUT__EXP:
        return basicSetExp(null, msgs);
      case PointcutsPackage.ASPECT_JPOINTCUT__ABSTRACT:
        return basicSetAbstract(null, msgs);
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
      case PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS:
        return getParameters();
      case PointcutsPackage.ASPECT_JPOINTCUT__EXP:
        return getExp();
      case PointcutsPackage.ASPECT_JPOINTCUT__ABSTRACT:
        return getAbstract();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case PointcutsPackage.ASPECT_JPOINTCUT__EXP:
        setExp((ConditionalExpression)newValue);
        return;
      case PointcutsPackage.ASPECT_JPOINTCUT__ABSTRACT:
        setAbstract((Abstract)newValue);
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
      case PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS:
        getParameters().clear();
        return;
      case PointcutsPackage.ASPECT_JPOINTCUT__EXP:
        setExp((ConditionalExpression)null);
        return;
      case PointcutsPackage.ASPECT_JPOINTCUT__ABSTRACT:
        setAbstract((Abstract)null);
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
      case PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case PointcutsPackage.ASPECT_JPOINTCUT__EXP:
        return exp != null;
      case PointcutsPackage.ASPECT_JPOINTCUT__ABSTRACT:
        return abstract_ != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Parametrizable.class)
    {
      switch (derivedFeatureID)
      {
        case PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS: return ParametersPackage.PARAMETRIZABLE__PARAMETERS;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Parametrizable.class)
    {
      switch (baseFeatureID)
      {
        case ParametersPackage.PARAMETRIZABLE__PARAMETERS: return PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //AspectJPointcutImpl
