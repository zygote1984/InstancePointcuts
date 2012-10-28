/**
 */
package org.kardo.language.aspectj.commons;

import org.emftext.language.java.classifiers.ConcreteClassifier;
import org.emftext.language.java.classifiers.Implementor;

import org.emftext.language.java.types.TypeReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.commons.Aspect#isPriviliged <em>Priviliged</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.commons.Aspect#getExtend <em>Extend</em>}</li>
 *   <li>{@link org.kardo.language.aspectj.commons.Aspect#getDefaultExtends <em>Default Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.commons.CommonsPackage#getAspect()
 * @model
 * @generated
 */
public interface Aspect extends Implementor, ConcreteClassifier
{
  /**
   * Returns the value of the '<em><b>Priviliged</b></em>' attribute.
   * The default value is <code>"false"</code>.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Priviliged</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Priviliged</em>' attribute.
   * @see #setPriviliged(boolean)
   * @see org.kardo.language.aspectj.commons.CommonsPackage#getAspect_Priviliged()
   * @model default="false"
   * @generated
   */
  boolean isPriviliged();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.commons.Aspect#isPriviliged <em>Priviliged</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Priviliged</em>' attribute.
   * @see #isPriviliged()
   * @generated
   */
  void setPriviliged(boolean value);

  /**
   * Returns the value of the '<em><b>Extend</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extend</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extend</em>' containment reference.
   * @see #setExtend(TypeReference)
   * @see org.kardo.language.aspectj.commons.CommonsPackage#getAspect_Extend()
   * @model containment="true"
   * @generated
   */
  TypeReference getExtend();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.commons.Aspect#getExtend <em>Extend</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extend</em>' containment reference.
   * @see #getExtend()
   * @generated
   */
  void setExtend(TypeReference value);

  /**
   * Returns the value of the '<em><b>Default Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Default Extends</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Default Extends</em>' containment reference.
   * @see #setDefaultExtends(TypeReference)
   * @see org.kardo.language.aspectj.commons.CommonsPackage#getAspect_DefaultExtends()
   * @model containment="true"
   * @generated
   */
  TypeReference getDefaultExtends();

  /**
   * Sets the value of the '{@link org.kardo.language.aspectj.commons.Aspect#getDefaultExtends <em>Default Extends</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Default Extends</em>' containment reference.
   * @see #getDefaultExtends()
   * @generated
   */
  void setDefaultExtends(TypeReference value);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @param this
   *  @return the direct super class
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.emftext.language.java.types.TypeReference superClassReference = this.getExtends();\nif (superClassReference == null) {\n\tsuperClassReference = this.getDefaultExtends();\n}\nif (superClassReference == null) {\n\treturn null;\n}\norg.emftext.language.java.types.Type result = superClassReference.getTarget();\nif (result instanceof org.emftext.language.java.classifiers.Class) {\n\treturn ( org.emftext.language.java.classifiers.Class) result;\n}\nreturn null;'"
   * @generated
   */
  org.emftext.language.java.classifiers.Class getSuperClass();

} // Aspect
