/**
 */
package org.kardo.language.aspectj.advice;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kardo.language.aspectj.advice.AdvicePackage
 * @generated
 */
public interface AdviceFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdviceFactory eINSTANCE = org.kardo.language.aspectj.advice.impl.AdviceFactoryImpl.init();

  /**
   * Returns a new object of class '<em>After Advice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Advice</em>'.
   * @generated
   */
  AfterAdvice createAfterAdvice();

  /**
   * Returns a new object of class '<em>Before Advice</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Before Advice</em>'.
   * @generated
   */
  BeforeAdvice createBeforeAdvice();

  /**
   * Returns a new object of class '<em>After Returning</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Returning</em>'.
   * @generated
   */
  AfterReturning createAfterReturning();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  AdvicePackage getAdvicePackage();

} //AdviceFactory
