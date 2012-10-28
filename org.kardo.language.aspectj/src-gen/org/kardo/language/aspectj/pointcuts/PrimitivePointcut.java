/**
 */
package org.kardo.language.aspectj.pointcuts;

import org.kardo.language.aspectj.patterns.Pattern;

import org.kardo.language.aspectj.pcexp.PointcutAndExpressionChild;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Pointcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.pointcuts.PrimitivePointcut#getPattern <em>Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.pointcuts.PointcutsPackage#getPrimitivePointcut()
 * @model abstract="true"
 * @generated
 */
public interface PrimitivePointcut extends PointcutAndExpressionChild
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' containment reference.
   * @see #setPattern(Pattern)
   * @see org.kardo.language.aspectj.pointcuts.PointcutsPackage#getPrimitivePointcut_Pattern()
   * @model containment="true" required="true"
   * @generated
   */
  Pattern getPattern();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.pointcuts.PrimitivePointcut#getPattern <em>Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' containment reference.
   * @see #getPattern()
   * @generated
   */
  void setPattern(Pattern value);

} // PrimitivePointcut
