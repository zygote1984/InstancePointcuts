/**
 */
package org.kardo.language.aspectj.advice;

import org.emftext.language.java.operators.AssignmentOperator;

import org.emftext.language.java.parameters.Parametrizable;

import org.emftext.language.java.statements.StatementListContainer;

import org.kardo.language.aspectj.commons.AspectMember;

import org.kardo.language.aspectj.pointcuts.AspectJPointcut;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Advice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.advice.Advice#getPcref <em>Pcref</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.advice.Advice#getAssign <em>Assign</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.advice.AdvicePackage#getAdvice()
 * @model abstract="true"
 * @generated
 */
public interface Advice extends AspectMember, Parametrizable, StatementListContainer
{
  /**
   * Returns the value of the '<em><b>Pcref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pcref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pcref</em>' reference.
   * @see #setPcref(AspectJPointcut)
   * @see org.kardo.language.aspectj.advice.AdvicePackage#getAdvice_Pcref()
   * @model required="true"
   * @generated
   */
  AspectJPointcut getPcref();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.advice.Advice#getPcref <em>Pcref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pcref</em>' reference.
   * @see #getPcref()
   * @generated
   */
  void setPcref(AspectJPointcut value);

  /**
   * Returns the value of the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assign</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assign</em>' containment reference.
   * @see #setAssign(AssignmentOperator)
   * @see org.kardo.language.aspectj.advice.AdvicePackage#getAdvice_Assign()
   * @model containment="true" required="true"
   * @generated
   */
  AssignmentOperator getAssign();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.advice.Advice#getAssign <em>Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign</em>' containment reference.
   * @see #getAssign()
   * @generated
   */
  void setAssign(AssignmentOperator value);

} // Advice
