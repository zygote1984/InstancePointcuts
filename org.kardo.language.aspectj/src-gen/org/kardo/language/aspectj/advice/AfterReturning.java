/**
 */
package org.kardo.language.aspectj.advice;

import org.kardo.language.aspectj.pointcuts.ReturningPointcut;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Returning</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.advice.AfterReturning#getReturning <em>Returning</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.advice.AdvicePackage#getAfterReturning()
 * @model
 * @generated
 */
public interface AfterReturning extends AfterAdvice
{
  /**
   * Returns the value of the '<em><b>Returning</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Returning</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Returning</em>' containment reference.
   * @see #setReturning(ReturningPointcut)
   * @see org.kardo.language.aspectj.advice.AdvicePackage#getAfterReturning_Returning()
   * @model containment="true" required="true"
   * @generated
   */
  ReturningPointcut getReturning();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.advice.AfterReturning#getReturning <em>Returning</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Returning</em>' containment reference.
   * @see #getReturning()
   * @generated
   */
  void setReturning(ReturningPointcut value);

} // AfterReturning
