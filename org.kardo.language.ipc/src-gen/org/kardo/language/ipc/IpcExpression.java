/**
 */
package org.kardo.language.ipc;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.ipc.IpcExpression#getAddExpression <em>Add Expression</em>}</li>
 *   <li>{@link org.kardo.language.ipc.IpcExpression#getRemoveExpression <em>Remove Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.ipc.IpcPackage#getIpcExpression()
 * @model
 * @generated
 */
public interface IpcExpression extends EObject
{
  /**
   * Returns the value of the '<em><b>Add Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Add Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Add Expression</em>' containment reference.
   * @see #setAddExpression(IpcSubExpression)
   * @see org.kardo.language.ipc.IpcPackage#getIpcExpression_AddExpression()
   * @model containment="true" required="true"
   * @generated
   */
  IpcSubExpression getAddExpression();

  /**
   * Sets the value of the '{@link org.kardo.language.ipc.IpcExpression#getAddExpression <em>Add Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Add Expression</em>' containment reference.
   * @see #getAddExpression()
   * @generated
   */
  void setAddExpression(IpcSubExpression value);

  /**
   * Returns the value of the '<em><b>Remove Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Remove Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Remove Expression</em>' containment reference.
   * @see #setRemoveExpression(IpcSubExpression)
   * @see org.kardo.language.ipc.IpcPackage#getIpcExpression_RemoveExpression()
   * @model containment="true"
   * @generated
   */
  IpcSubExpression getRemoveExpression();

  /**
   * Sets the value of the '{@link org.kardo.language.ipc.IpcExpression#getRemoveExpression <em>Remove Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Remove Expression</em>' containment reference.
   * @see #getRemoveExpression()
   * @generated
   */
  void setRemoveExpression(IpcSubExpression value);

} // IpcExpression
