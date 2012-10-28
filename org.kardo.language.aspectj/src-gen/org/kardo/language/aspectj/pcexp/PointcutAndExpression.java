/**
 */
package org.kardo.language.aspectj.pcexp;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointcut And Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.pcexp.PointcutAndExpression#getChildren <em>Children</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.pcexp.PcexpPackage#getPointcutAndExpression()
 * @model
 * @generated
 */
public interface PointcutAndExpression extends PointcutOrExpressionChild
{
  /**
   * Returns the value of the '<em><b>Children</b></em>' containment reference list.
   * The list contents are of type {@link org.kardo.language.aspectj.pcexp.PointcutAndExpressionChild}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Children</em>' containment reference list.
   * @see org.kardo.language.aspectj.pcexp.PcexpPackage#getPointcutAndExpression_Children()
   * @model containment="true" required="true"
   * @generated
   */
  EList<PointcutAndExpressionChild> getChildren();

} // PointcutAndExpression
