/**
 */
package org.kardo.language.aspectj.patterns;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kardo.language.aspectj.patterns.PatternsPackage
 * @generated
 */
public interface PatternsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PatternsFactory eINSTANCE = org.kardo.language.aspectj.patterns.impl.PatternsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Field Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Field Pattern</em>'.
   * @generated
   */
  FieldPattern createFieldPattern();

  /**
   * Returns a new object of class '<em>Constructor Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Constructor Pattern</em>'.
   * @generated
   */
  ConstructorPattern createConstructorPattern();

  /**
   * Returns a new object of class '<em>Method Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Method Pattern</em>'.
   * @generated
   */
  MethodPattern createMethodPattern();

  /**
   * Returns a new object of class '<em>Type Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Type Pattern</em>'.
   * @generated
   */
  TypePattern createTypePattern();

  /**
   * Returns a new object of class '<em>Id Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Id Pattern</em>'.
   * @generated
   */
  IdPattern createIdPattern();

  /**
   * Returns a new object of class '<em>Parameter Wildcard</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Parameter Wildcard</em>'.
   * @generated
   */
  ParameterWildcard createParameterWildcard();

  /**
   * Returns a new object of class '<em>Conditional Expr Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Conditional Expr Pattern</em>'.
   * @generated
   */
  ConditionalExprPattern createConditionalExprPattern();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PatternsPackage getPatternsPackage();

} //PatternsFactory
