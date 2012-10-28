/**
 */
package org.kardo.language.aspectj.pointcuts.impl;

import org.eclipse.emf.ecore.EClass;

import org.kardo.language.aspectj.pointcuts.PointcutsPackage;
import org.kardo.language.aspectj.pointcuts.StaticInitPointcut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Static Init Pointcut</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class StaticInitPointcutImpl extends PrimitivePointcutImpl implements StaticInitPointcut
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StaticInitPointcutImpl()
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
    return PointcutsPackage.Literals.STATIC_INIT_POINTCUT;
  }

} //StaticInitPointcutImpl
