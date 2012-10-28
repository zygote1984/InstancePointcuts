/**
 */
package org.kardo.language.aspectj.advice.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.emftext.language.java.operators.AssignmentOperator;

import org.emftext.language.java.parameters.Parameter;
import org.emftext.language.java.parameters.ParametersPackage;
import org.emftext.language.java.parameters.Parametrizable;

import org.emftext.language.java.statements.Statement;
import org.emftext.language.java.statements.StatementListContainer;
import org.emftext.language.java.statements.StatementsPackage;

import org.emftext.language.java.variables.LocalVariable;

import org.kardo.language.aspectj.advice.Advice;
import org.kardo.language.aspectj.advice.AdvicePackage;

import org.kardo.language.aspectj.commons.impl.AspectMemberImpl;

import org.kardo.language.aspectj.pointcuts.AspectJPointcut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.advice.impl.AdviceImpl#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.advice.impl.AdviceImpl#getStatements <em>Statements</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.advice.impl.AdviceImpl#getPcref <em>Pcref</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.advice.impl.AdviceImpl#getAssign <em>Assign</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class AdviceImpl extends AspectMemberImpl implements Advice
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
   * The cached value of the '{@link #getStatements() <em>Statements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatements()
   * @generated
   * @ordered
   */
  protected EList<Statement> statements;

  /**
   * The cached value of the '{@link #getPcref() <em>Pcref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPcref()
   * @generated
   * @ordered
   */
  protected AspectJPointcut pcref;

  /**
   * The cached value of the '{@link #getAssign() <em>Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssign()
   * @generated
   * @ordered
   */
  protected AssignmentOperator assign;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AdviceImpl()
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
    return AdvicePackage.Literals.ADVICE;
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
      parameters = new EObjectContainmentEList.Resolving<Parameter>(Parameter.class, this, AdvicePackage.ADVICE__PARAMETERS);
    }
    return parameters;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Statement> getStatements()
  {
    if (statements == null)
    {
      statements = new EObjectContainmentEList.Resolving<Statement>(Statement.class, this, AdvicePackage.ADVICE__STATEMENTS);
    }
    return statements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AspectJPointcut getPcref()
  {
    if (pcref != null && pcref.eIsProxy())
    {
      InternalEObject oldPcref = (InternalEObject)pcref;
      pcref = (AspectJPointcut)eResolveProxy(oldPcref);
      if (pcref != oldPcref)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AdvicePackage.ADVICE__PCREF, oldPcref, pcref));
      }
    }
    return pcref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AspectJPointcut basicGetPcref()
  {
    return pcref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPcref(AspectJPointcut newPcref)
  {
    AspectJPointcut oldPcref = pcref;
    pcref = newPcref;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdvicePackage.ADVICE__PCREF, oldPcref, pcref));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssignmentOperator getAssign()
  {
    return assign;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssign(AssignmentOperator newAssign, NotificationChain msgs)
  {
    AssignmentOperator oldAssign = assign;
    assign = newAssign;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AdvicePackage.ADVICE__ASSIGN, oldAssign, newAssign);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssign(AssignmentOperator newAssign)
  {
    if (newAssign != assign)
    {
      NotificationChain msgs = null;
      if (assign != null)
        msgs = ((InternalEObject)assign).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AdvicePackage.ADVICE__ASSIGN, null, msgs);
      if (newAssign != null)
        msgs = ((InternalEObject)newAssign).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AdvicePackage.ADVICE__ASSIGN, null, msgs);
      msgs = basicSetAssign(newAssign, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AdvicePackage.ADVICE__ASSIGN, newAssign, newAssign));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public LocalVariable getLocalVariable(String name)
  {
    org.eclipse.emf.common.util.EList< org.emftext.language.java.variables.LocalVariable> localVariables = getChildrenByType( org.emftext.language.java.variables.LocalVariable.class);
    for ( org.emftext.language.java.variables.LocalVariable localVariable : localVariables) {
      if (localVariable.getName().equals(name)) {
        return localVariable;
      }
    }
    return null;
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
      case AdvicePackage.ADVICE__PARAMETERS:
        return ((InternalEList<?>)getParameters()).basicRemove(otherEnd, msgs);
      case AdvicePackage.ADVICE__STATEMENTS:
        return ((InternalEList<?>)getStatements()).basicRemove(otherEnd, msgs);
      case AdvicePackage.ADVICE__ASSIGN:
        return basicSetAssign(null, msgs);
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
      case AdvicePackage.ADVICE__PARAMETERS:
        return getParameters();
      case AdvicePackage.ADVICE__STATEMENTS:
        return getStatements();
      case AdvicePackage.ADVICE__PCREF:
        if (resolve) return getPcref();
        return basicGetPcref();
      case AdvicePackage.ADVICE__ASSIGN:
        return getAssign();
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
      case AdvicePackage.ADVICE__PARAMETERS:
        getParameters().clear();
        getParameters().addAll((Collection<? extends Parameter>)newValue);
        return;
      case AdvicePackage.ADVICE__STATEMENTS:
        getStatements().clear();
        getStatements().addAll((Collection<? extends Statement>)newValue);
        return;
      case AdvicePackage.ADVICE__PCREF:
        setPcref((AspectJPointcut)newValue);
        return;
      case AdvicePackage.ADVICE__ASSIGN:
        setAssign((AssignmentOperator)newValue);
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
      case AdvicePackage.ADVICE__PARAMETERS:
        getParameters().clear();
        return;
      case AdvicePackage.ADVICE__STATEMENTS:
        getStatements().clear();
        return;
      case AdvicePackage.ADVICE__PCREF:
        setPcref((AspectJPointcut)null);
        return;
      case AdvicePackage.ADVICE__ASSIGN:
        setAssign((AssignmentOperator)null);
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
      case AdvicePackage.ADVICE__PARAMETERS:
        return parameters != null && !parameters.isEmpty();
      case AdvicePackage.ADVICE__STATEMENTS:
        return statements != null && !statements.isEmpty();
      case AdvicePackage.ADVICE__PCREF:
        return pcref != null;
      case AdvicePackage.ADVICE__ASSIGN:
        return assign != null;
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
        case AdvicePackage.ADVICE__PARAMETERS: return ParametersPackage.PARAMETRIZABLE__PARAMETERS;
        default: return -1;
      }
    }
    if (baseClass == StatementListContainer.class)
    {
      switch (derivedFeatureID)
      {
        case AdvicePackage.ADVICE__STATEMENTS: return StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS;
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
        case ParametersPackage.PARAMETRIZABLE__PARAMETERS: return AdvicePackage.ADVICE__PARAMETERS;
        default: return -1;
      }
    }
    if (baseClass == StatementListContainer.class)
    {
      switch (baseFeatureID)
      {
        case StatementsPackage.STATEMENT_LIST_CONTAINER__STATEMENTS: return AdvicePackage.ADVICE__STATEMENTS;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
  }

} //AdviceImpl
