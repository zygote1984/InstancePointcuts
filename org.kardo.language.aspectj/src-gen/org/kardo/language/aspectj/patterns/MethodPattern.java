/**
 */
package org.kardo.language.aspectj.patterns;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.modifiers.Modifier;

import org.emftext.language.java.references.StringReference;
import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.patterns.MethodPattern#getModifiers <em>Modifiers</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.patterns.MethodPattern#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.patterns.MethodPattern#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.patterns.MethodPattern#getParameters <em>Parameters</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.patterns.MethodPattern#getMethodname <em>Methodname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.patterns.PatternsPackage#getMethodPattern()
 * @model
 * @generated
 */
public interface MethodPattern extends AbstractMethodPattern
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
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getMethodPattern_Modifiers()
   * @model containment="true" required="true"
   * @generated
   */
  EList<Modifier> getModifiers();

  /**
   * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Return Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Return Type</em>' containment reference.
   * @see #setReturnType(TypePattern)
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getMethodPattern_ReturnType()
   * @model containment="true" required="true"
   * @generated
   */
  TypePattern getReturnType();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.patterns.MethodPattern#getReturnType <em>Return Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Return Type</em>' containment reference.
   * @see #getReturnType()
   * @generated
   */
  void setReturnType(TypePattern value);

  /**
   * Returns the value of the '<em><b>Declaring Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaring Type</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaring Type</em>' containment reference.
   * @see #setDeclaringType(TypeReference)
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getMethodPattern_DeclaringType()
   * @model containment="true" required="true"
   * @generated
   */
  TypeReference getDeclaringType();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.patterns.MethodPattern#getDeclaringType <em>Declaring Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaring Type</em>' containment reference.
   * @see #getDeclaringType()
   * @generated
   */
  void setDeclaringType(TypeReference value);

  /**
   * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
   * The list contents are of type {@link org.kardo.language.aspectj.patterns.WildcardOrTypePattern}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameters</em>' containment reference list.
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getMethodPattern_Parameters()
   * @model containment="true"
   * @generated
   */
  EList<WildcardOrTypePattern> getParameters();

  /**
   * Returns the value of the '<em><b>Methodname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Methodname</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Methodname</em>' containment reference.
   * @see #setMethodname(StringReference)
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#getMethodPattern_Methodname()
   * @model containment="true" required="true"
   * @generated
   */
  StringReference getMethodname();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.patterns.MethodPattern#getMethodname <em>Methodname</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Methodname</em>' containment reference.
   * @see #getMethodname()
   * @generated
   */
  void setMethodname(StringReference value);

} // MethodPattern
