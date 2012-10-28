/**
 */
package org.kardo.language.aspectj.patterns;

import org.emftext.language.java.references.Reference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Id Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.patterns.IdPattern#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.patterns.PatternsPackage#getIdPattern()
 * @model
 * @generated
 */
public interface IdPattern extends TypeOrIdPattern
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' reference.
   * @see #setId(Reference)
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getIdPattern_Id()
   * @model required="true"
   * @generated
   */
  Reference getId();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.patterns.IdPattern#getId <em>Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' reference.
   * @see #getId()
   * @generated
   */
  void setId(Reference value);

} // IdPattern
