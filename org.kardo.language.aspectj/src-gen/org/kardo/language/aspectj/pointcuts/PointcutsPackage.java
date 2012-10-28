/**
 */
package org.kardo.language.aspectj.pointcuts;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.kardo.language.aspectj.commons.CommonsPackage;

import org.kardo.language.aspectj.pcexp.PcexpPackage;

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
 * @see org.kardo.language.aspectj.pointcuts.PointcutsFactory
 * @model kind="package"
 * @generated
 */
public interface PointcutsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "pointcuts";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/language/aspectj/pointcuts";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "pointcuts";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PointcutsPackage eINSTANCE = org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.PrimitivePointcutImpl <em>Primitive Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.PrimitivePointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getPrimitivePointcut()
   * @generated
   */
  int PRIMITIVE_POINTCUT = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS = PcexpPackage.POINTCUT_AND_EXPRESSION_CHILD__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_POINTCUT__PATTERN = PcexpPackage.POINTCUT_AND_EXPRESSION_CHILD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Primitive Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRIMITIVE_POINTCUT_FEATURE_COUNT = PcexpPackage.POINTCUT_AND_EXPRESSION_CHILD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.CallPointcutImpl <em>Call Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.CallPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getCallPointcut()
   * @generated
   */
  int CALL_POINTCUT = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Call Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALL_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.ExecutionPointcutImpl <em>Execution Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.ExecutionPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getExecutionPointcut()
   * @generated
   */
  int EXECUTION_POINTCUT = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Execution Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXECUTION_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.GetPointcutImpl <em>Get Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.GetPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getGetPointcut()
   * @generated
   */
  int GET_POINTCUT = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Get Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GET_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.SetPointcutImpl <em>Set Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.SetPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getSetPointcut()
   * @generated
   */
  int SET_POINTCUT = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Set Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SET_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.HandlerPointcutImpl <em>Handler Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.HandlerPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getHandlerPointcut()
   * @generated
   */
  int HANDLER_POINTCUT = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Handler Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HANDLER_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.AdviceExecutionPointcutImpl <em>Advice Execution Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.AdviceExecutionPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getAdviceExecutionPointcut()
   * @generated
   */
  int ADVICE_EXECUTION_POINTCUT = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_EXECUTION_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_EXECUTION_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Advice Execution Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ADVICE_EXECUTION_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.StaticInitPointcutImpl <em>Static Init Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.StaticInitPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getStaticInitPointcut()
   * @generated
   */
  int STATIC_INIT_POINTCUT = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INIT_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INIT_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Static Init Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STATIC_INIT_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.InitPointcutImpl <em>Init Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.InitPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getInitPointcut()
   * @generated
   */
  int INIT_POINTCUT = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Init Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INIT_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.PreInitPointcutImpl <em>Pre Init Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.PreInitPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getPreInitPointcut()
   * @generated
   */
  int PRE_INIT_POINTCUT = 9;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INIT_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INIT_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Pre Init Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PRE_INIT_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.WithinPointcutImpl <em>Within Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.WithinPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getWithinPointcut()
   * @generated
   */
  int WITHIN_POINTCUT = 10;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITHIN_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITHIN_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Within Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITHIN_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.WithinCodePointcutImpl <em>Within Code Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.WithinCodePointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getWithinCodePointcut()
   * @generated
   */
  int WITHIN_CODE_POINTCUT = 11;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITHIN_CODE_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITHIN_CODE_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Within Code Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WITHIN_CODE_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.ContextExposurePcImpl <em>Context Exposure Pc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.ContextExposurePcImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getContextExposurePc()
   * @generated
   */
  int CONTEXT_EXPOSURE_PC = 20;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_EXPOSURE_PC__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_EXPOSURE_PC__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>Context Exposure Pc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTEXT_EXPOSURE_PC_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.ThisPointcutImpl <em>This Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.ThisPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getThisPointcut()
   * @generated
   */
  int THIS_POINTCUT = 12;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_POINTCUT__LAYOUT_INFORMATIONS = CONTEXT_EXPOSURE_PC__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_POINTCUT__PATTERN = CONTEXT_EXPOSURE_PC__PATTERN;

  /**
   * The number of structural features of the '<em>This Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int THIS_POINTCUT_FEATURE_COUNT = CONTEXT_EXPOSURE_PC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.TargetPointcutImpl <em>Target Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.TargetPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getTargetPointcut()
   * @generated
   */
  int TARGET_POINTCUT = 13;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_POINTCUT__LAYOUT_INFORMATIONS = CONTEXT_EXPOSURE_PC__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_POINTCUT__PATTERN = CONTEXT_EXPOSURE_PC__PATTERN;

  /**
   * The number of structural features of the '<em>Target Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TARGET_POINTCUT_FEATURE_COUNT = CONTEXT_EXPOSURE_PC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.ArgsPointcutImpl <em>Args Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.ArgsPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getArgsPointcut()
   * @generated
   */
  int ARGS_POINTCUT = 14;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS_POINTCUT__LAYOUT_INFORMATIONS = CONTEXT_EXPOSURE_PC__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS_POINTCUT__PATTERN = CONTEXT_EXPOSURE_PC__PATTERN;

  /**
   * The number of structural features of the '<em>Args Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGS_POINTCUT_FEATURE_COUNT = CONTEXT_EXPOSURE_PC_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.CFlowPointcutImpl <em>CFlow Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.CFlowPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getCFlowPointcut()
   * @generated
   */
  int CFLOW_POINTCUT = 15;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CFLOW_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CFLOW_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The feature id for the '<em><b>Pointcut</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CFLOW_POINTCUT__POINTCUT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CFlow Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CFLOW_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.CFlowBelowPointcutImpl <em>CFlow Below Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.CFlowBelowPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getCFlowBelowPointcut()
   * @generated
   */
  int CFLOW_BELOW_POINTCUT = 16;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CFLOW_BELOW_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CFLOW_BELOW_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The feature id for the '<em><b>Pointcut</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CFLOW_BELOW_POINTCUT__POINTCUT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CFlow Below Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CFLOW_BELOW_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.IfPointcutImpl <em>If Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.IfPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getIfPointcut()
   * @generated
   */
  int IF_POINTCUT = 17;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_POINTCUT__LAYOUT_INFORMATIONS = PRIMITIVE_POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_POINTCUT__PATTERN = PRIMITIVE_POINTCUT__PATTERN;

  /**
   * The number of structural features of the '<em>If Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IF_POINTCUT_FEATURE_COUNT = PRIMITIVE_POINTCUT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.PointcutImpl <em>Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getPointcut()
   * @generated
   */
  int POINTCUT = 18;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT__LAYOUT_INFORMATIONS = CommonsPackage.ASPECT_MEMBER__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT__NAME = CommonsPackage.ASPECT_MEMBER__NAME;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT__ASSIGN = CommonsPackage.ASPECT_MEMBER_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POINTCUT_FEATURE_COUNT = CommonsPackage.ASPECT_MEMBER_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.AspectJPointcutImpl <em>Aspect JPointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.AspectJPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getAspectJPointcut()
   * @generated
   */
  int ASPECT_JPOINTCUT = 19;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JPOINTCUT__LAYOUT_INFORMATIONS = POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JPOINTCUT__NAME = POINTCUT__NAME;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JPOINTCUT__ASSIGN = POINTCUT__ASSIGN;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JPOINTCUT__PARAMETERS = POINTCUT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Exp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JPOINTCUT__EXP = POINTCUT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Abstract</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JPOINTCUT__ABSTRACT = POINTCUT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Aspect JPointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASPECT_JPOINTCUT_FEATURE_COUNT = POINTCUT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.pointcuts.impl.ReturningPointcutImpl <em>Returning Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.pointcuts.impl.ReturningPointcutImpl
   * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getReturningPointcut()
   * @generated
   */
  int RETURNING_POINTCUT = 21;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURNING_POINTCUT__LAYOUT_INFORMATIONS = CONTEXT_EXPOSURE_PC__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Pattern</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURNING_POINTCUT__PATTERN = CONTEXT_EXPOSURE_PC__PATTERN;

  /**
   * The number of structural features of the '<em>Returning Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RETURNING_POINTCUT_FEATURE_COUNT = CONTEXT_EXPOSURE_PC_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.PrimitivePointcut <em>Primitive Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Primitive Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.PrimitivePointcut
   * @generated
   */
  EClass getPrimitivePointcut();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.pointcuts.PrimitivePointcut#getPattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pattern</em>'.
   * @see org.kardo.language.aspectj.pointcuts.PrimitivePointcut#getPattern()
   * @see #getPrimitivePointcut()
   * @generated
   */
  EReference getPrimitivePointcut_Pattern();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.CallPointcut <em>Call Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Call Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.CallPointcut
   * @generated
   */
  EClass getCallPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.ExecutionPointcut <em>Execution Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Execution Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.ExecutionPointcut
   * @generated
   */
  EClass getExecutionPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.GetPointcut <em>Get Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Get Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.GetPointcut
   * @generated
   */
  EClass getGetPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.SetPointcut <em>Set Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Set Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.SetPointcut
   * @generated
   */
  EClass getSetPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.HandlerPointcut <em>Handler Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Handler Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.HandlerPointcut
   * @generated
   */
  EClass getHandlerPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.AdviceExecutionPointcut <em>Advice Execution Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Advice Execution Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.AdviceExecutionPointcut
   * @generated
   */
  EClass getAdviceExecutionPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.StaticInitPointcut <em>Static Init Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Static Init Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.StaticInitPointcut
   * @generated
   */
  EClass getStaticInitPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.InitPointcut <em>Init Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Init Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.InitPointcut
   * @generated
   */
  EClass getInitPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.PreInitPointcut <em>Pre Init Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pre Init Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.PreInitPointcut
   * @generated
   */
  EClass getPreInitPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.WithinPointcut <em>Within Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Within Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.WithinPointcut
   * @generated
   */
  EClass getWithinPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.WithinCodePointcut <em>Within Code Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Within Code Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.WithinCodePointcut
   * @generated
   */
  EClass getWithinCodePointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.ThisPointcut <em>This Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>This Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.ThisPointcut
   * @generated
   */
  EClass getThisPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.TargetPointcut <em>Target Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Target Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.TargetPointcut
   * @generated
   */
  EClass getTargetPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.ArgsPointcut <em>Args Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Args Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.ArgsPointcut
   * @generated
   */
  EClass getArgsPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.CFlowPointcut <em>CFlow Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CFlow Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.CFlowPointcut
   * @generated
   */
  EClass getCFlowPointcut();

  /**
   * Returns the meta object for the reference '{@link org.kardo.language.aspectj.pointcuts.CFlowPointcut#getPointcut <em>Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.CFlowPointcut#getPointcut()
   * @see #getCFlowPointcut()
   * @generated
   */
  EReference getCFlowPointcut_Pointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.CFlowBelowPointcut <em>CFlow Below Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CFlow Below Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.CFlowBelowPointcut
   * @generated
   */
  EClass getCFlowBelowPointcut();

  /**
   * Returns the meta object for the reference '{@link org.kardo.language.aspectj.pointcuts.CFlowBelowPointcut#getPointcut <em>Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.CFlowBelowPointcut#getPointcut()
   * @see #getCFlowBelowPointcut()
   * @generated
   */
  EReference getCFlowBelowPointcut_Pointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.IfPointcut <em>If Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>If Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.IfPointcut
   * @generated
   */
  EClass getIfPointcut();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.Pointcut <em>Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.Pointcut
   * @generated
   */
  EClass getPointcut();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.pointcuts.Pointcut#getAssign <em>Assign</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Assign</em>'.
   * @see org.kardo.language.aspectj.pointcuts.Pointcut#getAssign()
   * @see #getPointcut()
   * @generated
   */
  EReference getPointcut_Assign();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.AspectJPointcut <em>Aspect JPointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aspect JPointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.AspectJPointcut
   * @generated
   */
  EClass getAspectJPointcut();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.pointcuts.AspectJPointcut#getExp <em>Exp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Exp</em>'.
   * @see org.kardo.language.aspectj.pointcuts.AspectJPointcut#getExp()
   * @see #getAspectJPointcut()
   * @generated
   */
  EReference getAspectJPointcut_Exp();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.pointcuts.AspectJPointcut#getAbstract <em>Abstract</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Abstract</em>'.
   * @see org.kardo.language.aspectj.pointcuts.AspectJPointcut#getAbstract()
   * @see #getAspectJPointcut()
   * @generated
   */
  EReference getAspectJPointcut_Abstract();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.ContextExposurePc <em>Context Exposure Pc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Context Exposure Pc</em>'.
   * @see org.kardo.language.aspectj.pointcuts.ContextExposurePc
   * @generated
   */
  EClass getContextExposurePc();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.pointcuts.ReturningPointcut <em>Returning Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Returning Pointcut</em>'.
   * @see org.kardo.language.aspectj.pointcuts.ReturningPointcut
   * @generated
   */
  EClass getReturningPointcut();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PointcutsFactory getPointcutsFactory();

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
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.PrimitivePointcutImpl <em>Primitive Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.PrimitivePointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getPrimitivePointcut()
     * @generated
     */
    EClass PRIMITIVE_POINTCUT = eINSTANCE.getPrimitivePointcut();

    /**
     * The meta object literal for the '<em><b>Pattern</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PRIMITIVE_POINTCUT__PATTERN = eINSTANCE.getPrimitivePointcut_Pattern();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.CallPointcutImpl <em>Call Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.CallPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getCallPointcut()
     * @generated
     */
    EClass CALL_POINTCUT = eINSTANCE.getCallPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.ExecutionPointcutImpl <em>Execution Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.ExecutionPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getExecutionPointcut()
     * @generated
     */
    EClass EXECUTION_POINTCUT = eINSTANCE.getExecutionPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.GetPointcutImpl <em>Get Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.GetPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getGetPointcut()
     * @generated
     */
    EClass GET_POINTCUT = eINSTANCE.getGetPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.SetPointcutImpl <em>Set Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.SetPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getSetPointcut()
     * @generated
     */
    EClass SET_POINTCUT = eINSTANCE.getSetPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.HandlerPointcutImpl <em>Handler Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.HandlerPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getHandlerPointcut()
     * @generated
     */
    EClass HANDLER_POINTCUT = eINSTANCE.getHandlerPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.AdviceExecutionPointcutImpl <em>Advice Execution Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.AdviceExecutionPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getAdviceExecutionPointcut()
     * @generated
     */
    EClass ADVICE_EXECUTION_POINTCUT = eINSTANCE.getAdviceExecutionPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.StaticInitPointcutImpl <em>Static Init Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.StaticInitPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getStaticInitPointcut()
     * @generated
     */
    EClass STATIC_INIT_POINTCUT = eINSTANCE.getStaticInitPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.InitPointcutImpl <em>Init Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.InitPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getInitPointcut()
     * @generated
     */
    EClass INIT_POINTCUT = eINSTANCE.getInitPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.PreInitPointcutImpl <em>Pre Init Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.PreInitPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getPreInitPointcut()
     * @generated
     */
    EClass PRE_INIT_POINTCUT = eINSTANCE.getPreInitPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.WithinPointcutImpl <em>Within Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.WithinPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getWithinPointcut()
     * @generated
     */
    EClass WITHIN_POINTCUT = eINSTANCE.getWithinPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.WithinCodePointcutImpl <em>Within Code Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.WithinCodePointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getWithinCodePointcut()
     * @generated
     */
    EClass WITHIN_CODE_POINTCUT = eINSTANCE.getWithinCodePointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.ThisPointcutImpl <em>This Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.ThisPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getThisPointcut()
     * @generated
     */
    EClass THIS_POINTCUT = eINSTANCE.getThisPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.TargetPointcutImpl <em>Target Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.TargetPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getTargetPointcut()
     * @generated
     */
    EClass TARGET_POINTCUT = eINSTANCE.getTargetPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.ArgsPointcutImpl <em>Args Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.ArgsPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getArgsPointcut()
     * @generated
     */
    EClass ARGS_POINTCUT = eINSTANCE.getArgsPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.CFlowPointcutImpl <em>CFlow Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.CFlowPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getCFlowPointcut()
     * @generated
     */
    EClass CFLOW_POINTCUT = eINSTANCE.getCFlowPointcut();

    /**
     * The meta object literal for the '<em><b>Pointcut</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CFLOW_POINTCUT__POINTCUT = eINSTANCE.getCFlowPointcut_Pointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.CFlowBelowPointcutImpl <em>CFlow Below Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.CFlowBelowPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getCFlowBelowPointcut()
     * @generated
     */
    EClass CFLOW_BELOW_POINTCUT = eINSTANCE.getCFlowBelowPointcut();

    /**
     * The meta object literal for the '<em><b>Pointcut</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CFLOW_BELOW_POINTCUT__POINTCUT = eINSTANCE.getCFlowBelowPointcut_Pointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.IfPointcutImpl <em>If Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.IfPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getIfPointcut()
     * @generated
     */
    EClass IF_POINTCUT = eINSTANCE.getIfPointcut();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.PointcutImpl <em>Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getPointcut()
     * @generated
     */
    EClass POINTCUT = eINSTANCE.getPointcut();

    /**
     * The meta object literal for the '<em><b>Assign</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POINTCUT__ASSIGN = eINSTANCE.getPointcut_Assign();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.AspectJPointcutImpl <em>Aspect JPointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.AspectJPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getAspectJPointcut()
     * @generated
     */
    EClass ASPECT_JPOINTCUT = eINSTANCE.getAspectJPointcut();

    /**
     * The meta object literal for the '<em><b>Exp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT_JPOINTCUT__EXP = eINSTANCE.getAspectJPointcut_Exp();

    /**
     * The meta object literal for the '<em><b>Abstract</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASPECT_JPOINTCUT__ABSTRACT = eINSTANCE.getAspectJPointcut_Abstract();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.ContextExposurePcImpl <em>Context Exposure Pc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.ContextExposurePcImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getContextExposurePc()
     * @generated
     */
    EClass CONTEXT_EXPOSURE_PC = eINSTANCE.getContextExposurePc();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.pointcuts.impl.ReturningPointcutImpl <em>Returning Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.pointcuts.impl.ReturningPointcutImpl
     * @see org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl#getReturningPointcut()
     * @generated
     */
    EClass RETURNING_POINTCUT = eINSTANCE.getReturningPointcut();

  }

} //PointcutsPackage
