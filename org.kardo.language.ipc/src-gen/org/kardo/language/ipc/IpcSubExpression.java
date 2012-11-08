/**
 */
package org.kardo.language.ipc;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sub Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.ipc.IpcSubExpression#getEvent <em>Event</em>}</li>
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
   * Returns the value of the '<em><b>Event</b></em>' containment reference list.
   * The list contents are of type {@link org.kardo.language.ipc.Event}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Event</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Event</em>' containment reference list.
   * @see org.kardo.language.ipc.IpcPackage#getIpcSubExpression_Event()
   * @model containment="true" required="true" upper="2"
   * @generated
   */
  EList<Event> getEvent();

} // IpcSubExpression
