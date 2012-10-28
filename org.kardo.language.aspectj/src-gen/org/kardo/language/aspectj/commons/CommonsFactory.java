/**
 */
package org.kardo.language.aspectj.commons;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kardo.language.aspectj.commons.CommonsPackage
 * @generated
 */
public interface CommonsFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CommonsFactory eINSTANCE = org.kardo.language.aspectj.commons.impl.CommonsFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Aspect</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aspect</em>'.
   * @generated
   */
  Aspect createAspect();

  /**
   * Returns a new object of class '<em>Aspect JCompilation Unit</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Aspect JCompilation Unit</em>'.
   * @generated
   */
  AspectJCompilationUnit createAspectJCompilationUnit();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  CommonsPackage getCommonsPackage();

} //CommonsFactory
