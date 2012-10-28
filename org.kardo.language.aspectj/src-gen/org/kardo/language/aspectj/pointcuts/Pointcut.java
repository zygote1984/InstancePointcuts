/**
 */
package org.kardo.language.aspectj.pointcuts;

import org.emftext.language.java.operators.AssignmentOperator;

import org.emftext.language.java.references.ReferenceableElement;

import org.kardo.language.aspectj.commons.AspectMember;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pointcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.pointcuts.Pointcut#getAssign <em>Assign</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.pointcuts.PointcutsPackage#getPointcut()
 * @model abstract="true"
 * @generated
 */
public interface Pointcut extends AspectMember, ReferenceableElement
{
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
   * @see org.kardo.language.aspectj.pointcuts.PointcutsPackage#getPointcut_Assign()
   * @model containment="true"
   * @generated
   */
  AssignmentOperator getAssign();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.pointcuts.Pointcut#getAssign <em>Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign</em>' containment reference.
   * @see #getAssign()
   * @generated
   */
  void setAssign(AssignmentOperator value);

} // Pointcut
