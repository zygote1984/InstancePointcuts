/**
 */
package org.kardo.language.ipc;

import org.eclipse.emf.ecore.EObject;

import org.kardo.language.aspectj.pcexp.PointcutExpression;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.ipc.Event#getPcexp <em>Pcexp</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.ipc.IpcPackage#getEvent()
 * @model abstract="true"
 * @generated
 */
public interface Event extends EObject
{
  /**
   * Returns the value of the '<em><b>Pcexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pcexp</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pcexp</em>' containment reference.
   * @see #setPcexp(PointcutExpression)
   * @see org.kardo.language.ipc.IpcPackage#getEvent_Pcexp()
   * @model containment="true" required="true"
   * @generated
   */
  PointcutExpression getPcexp();

  /**
   * Sets the value of the '{@link org.kardo.language.ipc.Event#getPcexp <em>Pcexp</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pcexp</em>' containment reference.
   * @see #getPcexp()
   * @generated
   */
  void setPcexp(PointcutExpression value);

} // Event
