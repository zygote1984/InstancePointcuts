/**
 */
package org.kardo.language.aspectj.commons.impl;

import org.eclipse.emf.ecore.EClass;

import org.emftext.language.java.members.impl.MemberImpl;

import org.kardo.language.aspectj.commons.AspectMember;
import org.kardo.language.aspectj.commons.CommonsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aspect Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class AspectMemberImpl extends MemberImpl implements AspectMember
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AspectMemberImpl()
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
    return CommonsPackage.Literals.ASPECT_MEMBER;
  }

} //AspectMemberImpl
