/**
 */
package org.kardo.language.aspectj.commons;

import org.eclipse.emf.common.util.EList;

import org.emftext.language.java.classifiers.ConcreteClassifier;

import org.emftext.language.java.containers.JavaRoot;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aspect JCompilation Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kardo.language.aspectj.commons.AspectJCompilationUnit#getClassifiers <em>Classifiers</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kardo.language.aspectj.commons.CommonsPackage#getAspectJCompilationUnit()
 * @model
 * @generated
 */
public interface AspectJCompilationUnit extends JavaRoot
{
  /**
   * Returns the value of the '<em><b>Classifiers</b></em>' containment reference list.
   * The list contents are of type {@link org.emftext.language.java.classifiers.ConcreteClassifier}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Classifiers</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Classifiers</em>' containment reference list.
   * @see org.kardo.language.aspectj.commons.CommonsPackage#getAspectJCompilationUnit_Classifiers()
   * @model containment="true" required="true"
   * @generated
   */
  EList<ConcreteClassifier> getClassifiers();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @param name name of the contained Classifier
   *  @return the Classifier
   * 
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/emf/2002/GenModel body='if (name == null) {\n\treturn null;\n}\nfor( org.emftext.language.java.classifiers.ConcreteClassifier candidate : getClassifiers()) {\n\tif(name.equals(candidate.getName())) {\n\t\treturn candidate;\n\t}\n}\nreturn null;'"
   * @generated
   */
  ConcreteClassifier getContainedClassifier(String name);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * 
   *  @return all classes in the same package imports
   * 
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/emf/2002/GenModel body='org.eclipse.emf.common.util.EList< org.emftext.language.java.classifiers.ConcreteClassifier> defaultImportList = new org.emftext.language.java.util.UniqueEList< org.emftext.language.java.classifiers.ConcreteClassifier>();\n\njava.lang.String packageName = getNamespacesAsString();\n\n//locally defined in this container\ndefaultImportList.addAll(getClassifiers());\n\ndefaultImportList.addAll(getConcreteClassifierProxies(\n\t\tpackageName, \"*\"));\n\nreturn defaultImportList;'"
   * @generated
   */
  EList<ConcreteClassifier> getClassifiersInSamePackage();

} // AspectJCompilationUnit
