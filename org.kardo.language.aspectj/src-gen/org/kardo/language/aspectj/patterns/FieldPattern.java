/**
 */
package org.kardo.language.aspectj.patterns;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.modifiers.Modifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Field Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.patterns.FieldPattern#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.patterns.FieldPattern#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.patterns.FieldPattern#getFieldType <em>Field Type</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.patterns.FieldPattern#getFieldname <em>Fieldname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.patterns.PatternsPackage#getFieldPattern()
 * @model
 * @generated
 */
public interface FieldPattern extends Pattern
{
  /**
   * Returns the value of the '<em><b>Modifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.modifiers.Modifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Modifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Modifiers</em>' containment reference list.
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getFieldPattern_Modifiers()
   * @model containment="true"
   * @generated
   */
  EList<Modifier> getModifiers();

  /**
   * Returns the value of the '<em><b>Declaring Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaring Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaring Type</em>' containment reference.
   * @see #setDeclaringType(TypePattern)
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getFieldPattern_DeclaringType()
   * @model containment="true" required="true"
   * @generated
   */
  TypePattern getDeclaringType();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.patterns.FieldPattern#getDeclaringType <em>Declaring Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaring Type</em>' containment reference.
   * @see #getDeclaringType()
   * @generated
   */
  void setDeclaringType(TypePattern value);

  /**
   * Returns the value of the '<em><b>Field Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Field Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Field Type</em>' containment reference.
   * @see #setFieldType(TypePattern)
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getFieldPattern_FieldType()
   * @model containment="true" required="true"
   * @generated
   */
  TypePattern getFieldType();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.patterns.FieldPattern#getFieldType <em>Field Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Field Type</em>' containment reference.
   * @see #getFieldType()
   * @generated
   */
  void setFieldType(TypePattern value);

  /**
   * Returns the value of the '<em><b>Fieldname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fieldname</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fieldname</em>' attribute.
   * @see #setFieldname(String)
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getFieldPattern_Fieldname()
   * @model required="true"
   * @generated
   */
  String getFieldname();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.patterns.FieldPattern#getFieldname <em>Fieldname</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fieldname</em>' attribute.
   * @see #getFieldname()
   * @generated
   */
  void setFieldname(String value);

} // FieldPattern
