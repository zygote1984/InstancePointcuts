/**
 */
package org.kardo.language.aspectj.commons;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.classifiers.ClassifiersPackage;

import org.emftext.language.java.containers.ContainersPackage;

import org.emftext.language.java.members.MembersPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.kardo.language.aspectj.commons.CommonsFactory
 * @model kind="package"
 * @generated
 */
public interface CommonsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "commons";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/language/aspectj/commons";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "commons";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  CommonsPackage eINSTANCE = org.kardo.language.aspectj.commons.impl.CommonsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.commons.impl.AspectMemberImpl <em>Aspect Member</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.commons.impl.AspectMemberImpl
   * @see org.kardo.language.aspectj.commons.impl.CommonsPackageImpl#getAspectMember()
   * @generated
   */
  int ASPECT_MEMBER = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MEMBER__LAYOUT_INFORMATIONS = MembersPackage.MEMBER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MEMBER__NAME = MembersPackage.MEMBER__NAME;

  /**
   * The number of structural features of the '<em>Aspect Member</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_MEMBER_FEATURE_COUNT = MembersPackage.MEMBER_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.commons.impl.AspectImpl <em>Aspect</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.commons.impl.AspectImpl
   * @see org.kardo.language.aspectj.commons.impl.CommonsPackageImpl#getAspect()
   * @generated
   */
  int ASPECT = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__LAYOUT_INFORMATIONS = ClassifiersPackage.IMPLEMENTOR__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Implements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__IMPLEMENTS = ClassifiersPackage.IMPLEMENTOR__IMPLEMENTS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__NAME = ClassifiersPackage.IMPLEMENTOR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Type Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__TYPE_PARAMETERS = ClassifiersPackage.IMPLEMENTOR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__MEMBERS = ClassifiersPackage.IMPLEMENTOR_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Default Members</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__DEFAULT_MEMBERS = ClassifiersPackage.IMPLEMENTOR_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Annotations And Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__ANNOTATIONS_AND_MODIFIERS = ClassifiersPackage.IMPLEMENTOR_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Priviliged</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__PRIVILIGED = ClassifiersPackage.IMPLEMENTOR_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Extend</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__EXTEND = ClassifiersPackage.IMPLEMENTOR_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Default Extends</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT__DEFAULT_EXTENDS = ClassifiersPackage.IMPLEMENTOR_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Aspect</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_FEATURE_COUNT = ClassifiersPackage.IMPLEMENTOR_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.commons.impl.AspectJCompilationUnitImpl <em>Aspect JCompilation Unit</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.commons.impl.AspectJCompilationUnitImpl
   * @see org.kardo.language.aspectj.commons.impl.CommonsPackageImpl#getAspectJCompilationUnit()
   * @generated
   */
  int ASPECT_JCOMPILATION_UNIT = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JCOMPILATION_UNIT__LAYOUT_INFORMATIONS = ContainersPackage.JAVA_ROOT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JCOMPILATION_UNIT__NAME = ContainersPackage.JAVA_ROOT__NAME;

  /**
   * The feature id for the '<em><b>Namespaces</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JCOMPILATION_UNIT__NAMESPACES = ContainersPackage.JAVA_ROOT__NAMESPACES;

  /**
   * The feature id for the '<em><b>Imports</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JCOMPILATION_UNIT__IMPORTS = ContainersPackage.JAVA_ROOT__IMPORTS;

  /**
   * The feature id for the '<em><b>Classifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JCOMPILATION_UNIT__CLASSIFIERS = ContainersPackage.JAVA_ROOT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Aspect JCompilation Unit</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JCOMPILATION_UNIT_FEATURE_COUNT = ContainersPackage.JAVA_ROOT_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.commons.AspectMember <em>Aspect Member</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect Member</em>'.
   * @see org.kardo.language.aspectj.commons.AspectMember
   * @generated
   */
  EClass getAspectMember();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.commons.Aspect <em>Aspect</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect</em>'.
   * @see org.kardo.language.aspectj.commons.Aspect
   * @generated
   */
  EClass getAspect();

  /**
   * Returns the meta object for the attribute '{@link org.kardo.language.aspectj.commons.Aspect#isPriviliged <em>Priviliged</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Priviliged</em>'.
   * @see org.kardo.language.aspectj.commons.Aspect#isPriviliged()
   * @see #getAspect()
   * @generated
   */
  EAttribute getAspect_Priviliged();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.commons.Aspect#getExtend <em>Extend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Extend</em>'.
   * @see org.kardo.language.aspectj.commons.Aspect#getExtend()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_Extend();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.commons.Aspect#getDefaultExtends <em>Default Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Default Extends</em>'.
   * @see org.kardo.language.aspectj.commons.Aspect#getDefaultExtends()
   * @see #getAspect()
   * @generated
   */
  EReference getAspect_DefaultExtends();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.commons.AspectJCompilationUnit <em>Aspect JCompilation Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect JCompilation Unit</em>'.
   * @see org.kardo.language.aspectj.commons.AspectJCompilationUnit
   * @generated
   */
  EClass getAspectJCompilationUnit();

  /**
   * Returns the meta object for the containment reference list '{@link org.kardo.language.aspectj.commons.AspectJCompilationUnit#getClassifiers <em>Classifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Classifiers</em>'.
   * @see org.kardo.language.aspectj.commons.AspectJCompilationUnit#getClassifiers()
   * @see #getAspectJCompilationUnit()
   * @generated
   */
  EReference getAspectJCompilationUnit_Classifiers();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  CommonsFactory getCommonsFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.commons.impl.AspectMemberImpl <em>Aspect Member</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.commons.impl.AspectMemberImpl
     * @see org.kardo.language.aspectj.commons.impl.CommonsPackageImpl#getAspectMember()
     * @generated
     */
    EClass ASPECT_MEMBER = eINSTANCE.getAspectMember();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.commons.impl.AspectImpl <em>Aspect</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.commons.impl.AspectImpl
     * @see org.kardo.language.aspectj.commons.impl.CommonsPackageImpl#getAspect()
     * @generated
     */
    EClass ASPECT = eINSTANCE.getAspect();

    /**
     * The meta object literal for the '<em><b>Priviliged</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASPECT__PRIVILIGED = eINSTANCE.getAspect_Priviliged();

    /**
     * The meta object literal for the '<em><b>Extend</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT__EXTEND = eINSTANCE.getAspect_Extend();

    /**
     * The meta object literal for the '<em><b>Default Extends</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT__DEFAULT_EXTENDS = eINSTANCE.getAspect_DefaultExtends();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.commons.impl.AspectJCompilationUnitImpl <em>Aspect JCompilation Unit</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.commons.impl.AspectJCompilationUnitImpl
     * @see org.kardo.language.aspectj.commons.impl.CommonsPackageImpl#getAspectJCompilationUnit()
     * @generated
     */
    EClass ASPECT_JCOMPILATION_UNIT = eINSTANCE.getAspectJCompilationUnit();

    /**
     * The meta object literal for the '<em><b>Classifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT_JCOMPILATION_UNIT__CLASSIFIERS = eINSTANCE.getAspectJCompilationUnit_Classifiers();

  }

} //CommonsPackage
