/**
 */
package org.kardo.language.aspectj.patterns.impl;

import org.eclipse.emf.ecore.EClass;

import org.kardo.language.aspectj.patterns.PatternsPackage;
import org.kardo.language.aspectj.patterns.WildcardPattern;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Wildcard Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class WildcardPatternImpl extends WildcardOrTypePatternImpl implements WildcardPattern
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected WildcardPatternImpl()
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
    return PatternsPackage.Literals.WILDCARD_PATTERN;
  }

} //WildcardPatternImpl
