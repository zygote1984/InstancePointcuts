/**
 */
package org.kardo.language.aspectj.pcexp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointcut Or Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.pcexp.PointcutOrExpression#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.pcexp.PcexpPackage#getPointcutOrExpression()
 * @model
 * @generated
 */
public interface PointcutOrExpression extends PointcutExpressionChild
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.kardo.language.aspectj.pcexp.PointcutOrExpressionChild}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.kardo.language.aspectj.pcexp.PcexpPackage#getPointcutOrExpression_Children()
   * @model containment="true" required="true"
   * @generated
   */
  EList<PointcutOrExpressionChild> getChildren();

} // PointcutOrExpression
