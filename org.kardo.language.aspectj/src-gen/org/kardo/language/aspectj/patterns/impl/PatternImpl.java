/**
 */
package org.kardo.language.aspectj.patterns.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.java.commons.impl.CommentableImpl;

import org.kardo.language.aspectj.patterns.Pattern;
import org.kardo.language.aspectj.patterns.PatternsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class PatternImpl extends CommentableImpl implements Pattern
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PatternImpl()
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
    return PatternsPackage.Literals.PATTERN;
  }

} //PatternImpl
