/**
 */
package org.kardo.language.aspectj.advice;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.kardo.language.aspectj.commons.CommonsPackage;

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
 * @see org.kardo.language.aspectj.advice.AdviceFactory
 * @model kind="package"
 * @generated
 */
public interface AdvicePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "advice";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/language/aspectj/advice";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "advice";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AdvicePackage eINSTANCE = org.kardo.language.aspectj.advice.impl.AdvicePackageImpl.init();

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.advice.impl.AdviceImpl <em>Advice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.advice.impl.AdviceImpl
   * @see org.kardo.language.aspectj.advice.impl.AdvicePackageImpl#getAdvice()
   * @generated
   */
  int ADVICE = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE__LAYOUT_INFORMATIONS = CommonsPackage.ASPECT_MEMBER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE__NAME = CommonsPackage.ASPECT_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE__PARAMETERS = CommonsPackage.ASPECT_MEMBER_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE__STATEMENTS = CommonsPackage.ASPECT_MEMBER_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Pcref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE__PCREF = CommonsPackage.ASPECT_MEMBER_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE__ASSIGN = CommonsPackage.ASPECT_MEMBER_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Advice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_FEATURE_COUNT = CommonsPackage.ASPECT_MEMBER_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.advice.impl.AfterAdviceImpl <em>After Advice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.advice.impl.AfterAdviceImpl
   * @see org.kardo.language.aspectj.advice.impl.AdvicePackageImpl#getAfterAdvice()
   * @generated
   */
  int AFTER_ADVICE = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_ADVICE__LAYOUT_INFORMATIONS = ADVICE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_ADVICE__NAME = ADVICE__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_ADVICE__PARAMETERS = ADVICE__PARAMETERS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_ADVICE__STATEMENTS = ADVICE__STATEMENTS;

  /**
   * The feature id for the '<em><b>Pcref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_ADVICE__PCREF = ADVICE__PCREF;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_ADVICE__ASSIGN = ADVICE__ASSIGN;

  /**
   * The number of structural features of the '<em>After Advice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_ADVICE_FEATURE_COUNT = ADVICE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.advice.impl.BeforeAdviceImpl <em>Before Advice</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.advice.impl.BeforeAdviceImpl
   * @see org.kardo.language.aspectj.advice.impl.AdvicePackageImpl#getBeforeAdvice()
   * @generated
   */
  int BEFORE_ADVICE = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEFORE_ADVICE__LAYOUT_INFORMATIONS = ADVICE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEFORE_ADVICE__NAME = ADVICE__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEFORE_ADVICE__PARAMETERS = ADVICE__PARAMETERS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEFORE_ADVICE__STATEMENTS = ADVICE__STATEMENTS;

  /**
   * The feature id for the '<em><b>Pcref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEFORE_ADVICE__PCREF = ADVICE__PCREF;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEFORE_ADVICE__ASSIGN = ADVICE__ASSIGN;

  /**
   * The number of structural features of the '<em>Before Advice</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEFORE_ADVICE_FEATURE_COUNT = ADVICE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.advice.impl.AfterReturningImpl <em>After Returning</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.advice.impl.AfterReturningImpl
   * @see org.kardo.language.aspectj.advice.impl.AdvicePackageImpl#getAfterReturning()
   * @generated
   */
  int AFTER_RETURNING = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_RETURNING__LAYOUT_INFORMATIONS = AFTER_ADVICE__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_RETURNING__NAME = AFTER_ADVICE__NAME;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_RETURNING__PARAMETERS = AFTER_ADVICE__PARAMETERS;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_RETURNING__STATEMENTS = AFTER_ADVICE__STATEMENTS;

  /**
   * The feature id for the '<em><b>Pcref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_RETURNING__PCREF = AFTER_ADVICE__PCREF;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_RETURNING__ASSIGN = AFTER_ADVICE__ASSIGN;

  /**
   * The feature id for the '<em><b>Returning</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_RETURNING__RETURNING = AFTER_ADVICE_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>After Returning</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_RETURNING_FEATURE_COUNT = AFTER_ADVICE_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.advice.Advice <em>Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Advice</em>'.
   * @see org.kardo.language.aspectj.advice.Advice
   * @generated
   */
  EClass getAdvice();

  /**
   * Returns the meta object for the reference '{@link org.kardo.language.aspectj.advice.Advice#getPcref <em>Pcref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pcref</em>'.
   * @see org.kardo.language.aspectj.advice.Advice#getPcref()
   * @see #getAdvice()
   * @generated
   */
  EReference getAdvice_Pcref();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.advice.Advice#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assign</em>'.
   * @see org.kardo.language.aspectj.advice.Advice#getAssign()
   * @see #getAdvice()
   * @generated
   */
  EReference getAdvice_Assign();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.advice.AfterAdvice <em>After Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Advice</em>'.
   * @see org.kardo.language.aspectj.advice.AfterAdvice
   * @generated
   */
  EClass getAfterAdvice();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.advice.BeforeAdvice <em>Before Advice</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Before Advice</em>'.
   * @see org.kardo.language.aspectj.advice.BeforeAdvice
   * @generated
   */
  EClass getBeforeAdvice();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.advice.AfterReturning <em>After Returning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Returning</em>'.
   * @see org.kardo.language.aspectj.advice.AfterReturning
   * @generated
   */
  EClass getAfterReturning();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.advice.AfterReturning#getReturning <em>Returning</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Returning</em>'.
   * @see org.kardo.language.aspectj.advice.AfterReturning#getReturning()
   * @see #getAfterReturning()
   * @generated
   */
  EReference getAfterReturning_Returning();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AdviceFactory getAdviceFactory();

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
     * The meta object literal for the '{@link org.kardo.language.aspectj.advice.impl.AdviceImpl <em>Advice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.advice.impl.AdviceImpl
     * @see org.kardo.language.aspectj.advice.impl.AdvicePackageImpl#getAdvice()
     * @generated
     */
    EClass ADVICE = eINSTANCE.getAdvice();

    /**
     * The meta object literal for the '<em><b>Pcref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVICE__PCREF = eINSTANCE.getAdvice_Pcref();

    /**
     * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ADVICE__ASSIGN = eINSTANCE.getAdvice_Assign();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.advice.impl.AfterAdviceImpl <em>After Advice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.advice.impl.AfterAdviceImpl
     * @see org.kardo.language.aspectj.advice.impl.AdvicePackageImpl#getAfterAdvice()
     * @generated
     */
    EClass AFTER_ADVICE = eINSTANCE.getAfterAdvice();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.advice.impl.BeforeAdviceImpl <em>Before Advice</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.advice.impl.BeforeAdviceImpl
     * @see org.kardo.language.aspectj.advice.impl.AdvicePackageImpl#getBeforeAdvice()
     * @generated
     */
    EClass BEFORE_ADVICE = eINSTANCE.getBeforeAdvice();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.advice.impl.AfterReturningImpl <em>After Returning</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.advice.impl.AfterReturningImpl
     * @see org.kardo.language.aspectj.advice.impl.AdvicePackageImpl#getAfterReturning()
     * @generated
     */
    EClass AFTER_RETURNING = eINSTANCE.getAfterReturning();

    /**
     * The meta object literal for the '<em><b>Returning</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference AFTER_RETURNING__RETURNING = eINSTANCE.getAfterReturning_Returning();

  }

} //AdvicePackage
