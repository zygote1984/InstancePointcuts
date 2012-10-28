/**
 */
package org.kardo.language.ipc;

import org.emftext.language.java.types.TypeReference;

import org.kardo.language.aspectj.commons.AspectMember;

import org.kardo.language.aspectj.pcexp.PcAssignmentOperator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Instance Pointcut</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.ipc.InstancePointcut#getAssign <em>Assign</em>}</li>
 *   <li>{@link org.kardo.language.ipc.InstancePointcut#getType <em>Type</em>}</li>
 *   <li>{@link org.kardo.language.ipc.InstancePointcut#getExpr <em>Expr</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.ipc.IpcPackage#getInstancePointcut()
 * @model
 * @generated
 */
public interface InstancePointcut extends AspectMember
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
   * @see #setAssign(PcAssignmentOperator)
   * @see org.kardo.language.ipc.IpcPackage#getInstancePointcut_Assign()
   * @model containment="true" required="true"
   * @generated
   */
  PcAssignmentOperator getAssign();

  /**
   * Sets the value of the '{@link org.kardo.language.ipc.InstancePointcut#getAssign <em>Assign</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assign</em>' containment reference.
   * @see #getAssign()
   * @generated
   */
  void setAssign(PcAssignmentOperator value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(TypeReference)
   * @see org.kardo.language.ipc.IpcPackage#getInstancePointcut_Type()
   * @model containment="true" required="true"
   * @generated
   */
  TypeReference getType();

  /**
   * Sets the value of the '{@link org.kardo.language.ipc.InstancePointcut#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeReference value);

  /**
   * Returns the value of the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expr</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expr</em>' containment reference.
   * @see #setExpr(IpcExpression)
   * @see org.kardo.language.ipc.IpcPackage#getInstancePointcut_Expr()
   * @model containment="true" required="true"
   * @generated
   */
  IpcExpression getExpr();

  /**
   * Sets the value of the '{@link org.kardo.language.ipc.InstancePointcut#getExpr <em>Expr</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expr</em>' containment reference.
   * @see #getExpr()
   * @generated
   */
  void setExpr(IpcExpression value);

} // InstancePointcut
