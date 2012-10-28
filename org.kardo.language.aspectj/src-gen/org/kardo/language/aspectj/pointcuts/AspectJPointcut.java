/**
 */
package org.kardo.language.aspectj.pointcuts;

import org.emftext.language.java.expressions.ConditionalExpression;

import org.emftext.language.java.modifiers.Abstract;

import org.emftext.language.java.parameters.Parametrizable;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect JPointcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.pointcuts.AspectJPointcut#getExp <em>Exp</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.pointcuts.AspectJPointcut#getAbstract <em>Abstract</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.pointcuts.PointcutsPackage#getAspectJPointcut()
 * @model
 * @generated
 */
public interface AspectJPointcut extends Pointcut, Parametrizable
{
  /**
   * Returns the value of the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Exp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Exp</em>' containment reference.
   * @see #setExp(ConditionalExpression)
   * @see org.kardo.language.aspectj.pointcuts.PointcutsPackage#getAspectJPointcut_Exp()
   * @model containment="true"
   * @generated
   */
  ConditionalExpression getExp();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.pointcuts.AspectJPointcut#getExp <em>Exp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Exp</em>' containment reference.
   * @see #getExp()
   * @generated
   */
  void setExp(ConditionalExpression value);

  /**
   * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Abstract</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Abstract</em>' containment reference.
   * @see #setAbstract(Abstract)
   * @see org.kardo.language.aspectj.pointcuts.PointcutsPackage#getAspectJPointcut_Abstract()
   * @model containment="true"
   * @generated
   */
  Abstract getAbstract();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.pointcuts.AspectJPointcut#getAbstract <em>Abstract</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Abstract</em>' containment reference.
   * @see #getAbstract()
   * @generated
   */
  void setAbstract(Abstract value);

} // AspectJPointcut
