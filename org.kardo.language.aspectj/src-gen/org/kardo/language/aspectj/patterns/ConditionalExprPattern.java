/**
 */
package org.kardo.language.aspectj.patterns;

import org.emftext.language.java.expressions.ConditionalExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conditional Expr Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.patterns.ConditionalExprPattern#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.patterns.PatternsPackage#getConditionalExprPattern()
 * @model
 * @generated
 */
public interface ConditionalExprPattern extends Pattern
{
  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(ConditionalExpression)
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getConditionalExprPattern_Expr()
   * @model containment="true" required="true"
   * @generated
   */
  ConditionalExpression getExpr();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.patterns.ConditionalExprPattern#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(ConditionalExpression value);

} // ConditionalExprPattern
