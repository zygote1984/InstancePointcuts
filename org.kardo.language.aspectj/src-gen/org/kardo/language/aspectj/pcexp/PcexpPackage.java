/**
 */
package org.kardo.language.aspectj.pcexp;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.expressions.ExpressionsPackage;

import org.emftext.language.java.operators.OperatorsPackage;

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
 * @see org.kardo.language.aspectj.pcexp.PcexpFactory
 * @model kind="package"
 * @generated
 */
public interface PcexpPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pcexp";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/language/aspectj/pcexp";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pcexp";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PcexpPackage eINSTANCE = org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl.init();

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutExpressionChildImpl <em>Pointcut Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pcexp.impl.PointcutExpressionChildImpl
   * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutExpressionChild()
   * @generated
   */
  int POINTCUT_EXPRESSION_CHILD = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = ExpressionsPackage.CONDITIONAL_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Pointcut Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_EXPRESSION_CHILD_FEATURE_COUNT = ExpressionsPackage.CONDITIONAL_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutExpressionImpl <em>Pointcut Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pcexp.impl.PointcutExpressionImpl
   * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutExpression()
   * @generated
   */
  int POINTCUT_EXPRESSION = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_EXPRESSION__LAYOUT_INFORMATIONS = ExpressionsPackage.CONDITIONAL_EXPRESSION__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_EXPRESSION__CHILD = ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD;

  /**
   * The feature id for the '<em><b>Expression If</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_EXPRESSION__EXPRESSION_IF = ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF;

  /**
   * The feature id for the '<em><b>Expression Else</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_EXPRESSION__EXPRESSION_ELSE = ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE;

  /**
   * The number of structural features of the '<em>Pointcut Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_EXPRESSION_FEATURE_COUNT = ExpressionsPackage.CONDITIONAL_EXPRESSION_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutOrExpressionImpl <em>Pointcut Or Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pcexp.impl.PointcutOrExpressionImpl
   * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutOrExpression()
   * @generated
   */
  int POINTCUT_OR_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_OR_EXPRESSION__LAYOUT_INFORMATIONS = POINTCUT_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_OR_EXPRESSION__CHILDREN = POINTCUT_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pointcut Or Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_OR_EXPRESSION_FEATURE_COUNT = POINTCUT_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutOrExpressionChildImpl <em>Pointcut Or Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pcexp.impl.PointcutOrExpressionChildImpl
   * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutOrExpressionChild()
   * @generated
   */
  int POINTCUT_OR_EXPRESSION_CHILD = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = ExpressionsPackage.CONDITIONAL_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Pointcut Or Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_OR_EXPRESSION_CHILD_FEATURE_COUNT = ExpressionsPackage.CONDITIONAL_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutAndExpressionImpl <em>Pointcut And Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pcexp.impl.PointcutAndExpressionImpl
   * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutAndExpression()
   * @generated
   */
  int POINTCUT_AND_EXPRESSION = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_AND_EXPRESSION__LAYOUT_INFORMATIONS = POINTCUT_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_AND_EXPRESSION__CHILDREN = POINTCUT_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pointcut And Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_AND_EXPRESSION_FEATURE_COUNT = POINTCUT_OR_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutAndExpressionChildImpl <em>Pointcut And Expression Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pcexp.impl.PointcutAndExpressionChildImpl
   * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutAndExpressionChild()
   * @generated
   */
  int POINTCUT_AND_EXPRESSION_CHILD = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_AND_EXPRESSION_CHILD__LAYOUT_INFORMATIONS = POINTCUT_OR_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Pointcut And Expression Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_AND_EXPRESSION_CHILD_FEATURE_COUNT = POINTCUT_OR_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pcexp.impl.PcAssignmentOperatorImpl <em>Pc Assignment Operator</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pcexp.impl.PcAssignmentOperatorImpl
   * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPcAssignmentOperator()
   * @generated
   */
  int PC_ASSIGNMENT_OPERATOR = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PC_ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS = OperatorsPackage.ASSIGNMENT_OPERATOR__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Pc Assignment Operator</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PC_ASSIGNMENT_OPERATOR_FEATURE_COUNT = OperatorsPackage.ASSIGNMENT_OPERATOR_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pcexp.PointcutExpressionChild <em>Pointcut Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointcut Expression Child</em>'.
   * @see org.kardo.language.aspectj.pcexp.PointcutExpressionChild
   * @generated
   */
  EClass getPointcutExpressionChild();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pcexp.PointcutExpression <em>Pointcut Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointcut Expression</em>'.
   * @see org.kardo.language.aspectj.pcexp.PointcutExpression
   * @generated
   */
  EClass getPointcutExpression();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pcexp.PointcutOrExpression <em>Pointcut Or Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointcut Or Expression</em>'.
   * @see org.kardo.language.aspectj.pcexp.PointcutOrExpression
   * @generated
   */
  EClass getPointcutOrExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kardo.language.aspectj.pcexp.PointcutOrExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.kardo.language.aspectj.pcexp.PointcutOrExpression#getChildren()
   * @see #getPointcutOrExpression()
   * @generated
   */
  EReference getPointcutOrExpression_Children();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pcexp.PointcutOrExpressionChild <em>Pointcut Or Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointcut Or Expression Child</em>'.
   * @see org.kardo.language.aspectj.pcexp.PointcutOrExpressionChild
   * @generated
   */
  EClass getPointcutOrExpressionChild();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pcexp.PointcutAndExpression <em>Pointcut And Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointcut And Expression</em>'.
   * @see org.kardo.language.aspectj.pcexp.PointcutAndExpression
   * @generated
   */
  EClass getPointcutAndExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kardo.language.aspectj.pcexp.PointcutAndExpression#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.kardo.language.aspectj.pcexp.PointcutAndExpression#getChildren()
   * @see #getPointcutAndExpression()
   * @generated
   */
  EReference getPointcutAndExpression_Children();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pcexp.PointcutAndExpressionChild <em>Pointcut And Expression Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointcut And Expression Child</em>'.
   * @see org.kardo.language.aspectj.pcexp.PointcutAndExpressionChild
   * @generated
   */
  EClass getPointcutAndExpressionChild();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pcexp.PcAssignmentOperator <em>Pc Assignment Operator</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pc Assignment Operator</em>'.
   * @see org.kardo.language.aspectj.pcexp.PcAssignmentOperator
   * @generated
   */
  EClass getPcAssignmentOperator();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PcexpFactory getPcexpFactory();

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
     * The meta object literal for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutExpressionChildImpl <em>Pointcut Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pcexp.impl.PointcutExpressionChildImpl
     * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutExpressionChild()
     * @generated
     */
    EClass POINTCUT_EXPRESSION_CHILD = eINSTANCE.getPointcutExpressionChild();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutExpressionImpl <em>Pointcut Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pcexp.impl.PointcutExpressionImpl
     * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutExpression()
     * @generated
     */
    EClass POINTCUT_EXPRESSION = eINSTANCE.getPointcutExpression();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutOrExpressionImpl <em>Pointcut Or Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pcexp.impl.PointcutOrExpressionImpl
     * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutOrExpression()
     * @generated
     */
    EClass POINTCUT_OR_EXPRESSION = eINSTANCE.getPointcutOrExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTCUT_OR_EXPRESSION__CHILDREN = eINSTANCE.getPointcutOrExpression_Children();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutOrExpressionChildImpl <em>Pointcut Or Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pcexp.impl.PointcutOrExpressionChildImpl
     * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutOrExpressionChild()
     * @generated
     */
    EClass POINTCUT_OR_EXPRESSION_CHILD = eINSTANCE.getPointcutOrExpressionChild();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutAndExpressionImpl <em>Pointcut And Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pcexp.impl.PointcutAndExpressionImpl
     * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutAndExpression()
     * @generated
     */
    EClass POINTCUT_AND_EXPRESSION = eINSTANCE.getPointcutAndExpression();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTCUT_AND_EXPRESSION__CHILDREN = eINSTANCE.getPointcutAndExpression_Children();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pcexp.impl.PointcutAndExpressionChildImpl <em>Pointcut And Expression Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pcexp.impl.PointcutAndExpressionChildImpl
     * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPointcutAndExpressionChild()
     * @generated
     */
    EClass POINTCUT_AND_EXPRESSION_CHILD = eINSTANCE.getPointcutAndExpressionChild();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pcexp.impl.PcAssignmentOperatorImpl <em>Pc Assignment Operator</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pcexp.impl.PcAssignmentOperatorImpl
     * @see org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl#getPcAssignmentOperator()
     * @generated
     */
    EClass PC_ASSIGNMENT_OPERATOR = eINSTANCE.getPcAssignmentOperator();

  }

} //PcexpPackage
