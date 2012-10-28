/**
 */
package org.kardo.language.ipc;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.kardo.language.ipc.IpcPackage
 * @generated
 */
public interface IpcFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IpcFactory eINSTANCE = org.kardo.language.ipc.impl.IpcFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Instance Pointcut</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Instance Pointcut</em>'.
   * @generated
   */
  InstancePointcut createInstancePointcut();

  /**
   * Returns a new object of class '<em>Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Expression</em>'.
   * @generated
   */
  IpcExpression createIpcExpression();

  /**
   * Returns a new object of class '<em>Sub Expression</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sub Expression</em>'.
   * @generated
   */
  IpcSubExpression createIpcSubExpression();

  /**
   * Returns a new object of class '<em>Before Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Before Event</em>'.
   * @generated
   */
  BeforeEvent createBeforeEvent();

  /**
   * Returns a new object of class '<em>After Event</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Event</em>'.
   * @generated
   */
  AfterEvent createAfterEvent();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  IpcPackage getIpcPackage();

} //IpcFactory
