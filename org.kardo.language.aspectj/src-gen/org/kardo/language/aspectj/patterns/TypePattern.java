/**
 */
package org.kardo.language.aspectj.patterns;

import org.emftext.language.java.operators.Addition;

import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.patterns.TypePattern#getType <em>Type</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.patterns.TypePattern#getSubtypes <em>Subtypes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.patterns.PatternsPackage#getTypePattern()
 * @model
 * @generated
 */
public interface TypePattern extends TypeOrIdPattern, WildcardOrTypePattern
{
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
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getTypePattern_Type()
   * @model containment="true" required="true"
   * @generated
   */
  TypeReference getType();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.patterns.TypePattern#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(TypeReference value);

  /**
   * Returns the value of the '<em><b>Subtypes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Subtypes</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Subtypes</em>' containment reference.
   * @see #setSubtypes(Addition)
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getTypePattern_Subtypes()
   * @model containment="true"
   * @generated
   */
  Addition getSubtypes();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.patterns.TypePattern#getSubtypes <em>Subtypes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Subtypes</em>' containment reference.
   * @see #getSubtypes()
   * @generated
   */
  void setSubtypes(Addition value);

} // TypePattern
