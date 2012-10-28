/**
 */
package org.kardo.language.aspectj.pcexp.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.java.expressions.impl.ConditionalExpressionImpl;

import org.kardo.language.aspectj.pcexp.PcexpPackage;
import org.kardo.language.aspectj.pcexp.PointcutExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pointcut Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PointcutExpressionImpl extends ConditionalExpressionImpl implements PointcutExpression
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PointcutExpressionImpl()
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
    return PcexpPackage.Literals.POINTCUT_EXPRESSION;
  }

} //PointcutExpressionImpl
