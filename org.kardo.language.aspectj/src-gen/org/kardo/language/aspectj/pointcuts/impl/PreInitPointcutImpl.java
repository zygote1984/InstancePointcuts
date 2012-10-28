/**
 */
package org.kardo.language.aspectj.pointcuts.impl;

import org.eclipse.emf.ecore.EClass;

import org.kardo.language.aspectj.pointcuts.PointcutsPackage;
import org.kardo.language.aspectj.pointcuts.PreInitPointcut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pre Init Pointcut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PreInitPointcutImpl extends PrimitivePointcutImpl implements PreInitPointcut
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PreInitPointcutImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PointcutsPackage.Literals.PRE_INIT_POINTCUT;
  }

} //PreInitPointcutImpl
