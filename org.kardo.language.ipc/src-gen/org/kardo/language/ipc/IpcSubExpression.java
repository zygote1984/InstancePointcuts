/**
 */
package org.kardo.language.ipc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.ipc.IpcSubExpression#getBefore <em>Before</em>}</li>
 *   <li>{@link org.kardo.language.ipc.IpcSubExpression#getAfter <em>After</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.ipc.IpcPackage#getIpcSubExpression()
 * @model
 * @generated
 */
public interface IpcSubExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Before</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Before</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Before</em>' containment reference.
   * @see #setBefore(BeforeEvent)
   * @see org.kardo.language.ipc.IpcPackage#getIpcSubExpression_Before()
   * @model containment="true"
   * @generated
   */
  BeforeEvent getBefore();

  /**
   * Sets the value of the '{@link org.kardo.language.ipc.IpcSubExpression#getBefore <em>Before</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Before</em>' containment reference.
   * @see #getBefore()
   * @generated
   */
  void setBefore(BeforeEvent value);

  /**
   * Returns the value of the '<em><b>After</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>After</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>After</em>' containment reference.
   * @see #setAfter(AfterEvent)
   * @see org.kardo.language.ipc.IpcPackage#getIpcSubExpression_After()
   * @model containment="true"
   * @generated
   */
  AfterEvent getAfter();

  /**
   * Sets the value of the '{@link org.kardo.language.ipc.IpcSubExpression#getAfter <em>After</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>After</em>' containment reference.
   * @see #getAfter()
   * @generated
   */
  void setAfter(AfterEvent value);

} // IpcSubExpression
