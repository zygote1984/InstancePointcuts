/**
 */
package org.kardo.language.ipc;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.kardo.language.aspectj.pointcuts.PointcutsPackage;

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
 * @see org.kardo.language.ipc.IpcFactory
 * @model kind="package"
 *        annotation="import java='platform:/plugin/org.emftext.language.java/metamodel/java.ecore' aspectj='platform:/resource/org.kardo.language.aspectj/metamodel/aspectj.ecore'"
 * @generated
 */
public interface IpcPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "ipc";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/language/ipc";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "ipc";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  IpcPackage eINSTANCE = org.kardo.language.ipc.impl.IpcPackageImpl.init();

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.IpcUnionChildImpl <em>Union Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.IpcUnionChildImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcUnionChild()
   * @generated
   */
  int IPC_UNION_CHILD = 11;

  /**
   * The number of structural features of the '<em>Union Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_UNION_CHILD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.IpcImpl <em>Ipc</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.IpcImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpc()
   * @generated
   */
  int IPC = 0;

  /**
   * The number of structural features of the '<em>Ipc</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_FEATURE_COUNT = IPC_UNION_CHILD_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.InstancePointcutImpl <em>Instance Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.InstancePointcutImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getInstancePointcut()
   * @generated
   */
  int INSTANCE_POINTCUT = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_POINTCUT__LAYOUT_INFORMATIONS = PointcutsPackage.POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_POINTCUT__NAME = PointcutsPackage.POINTCUT__NAME;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_POINTCUT__ASSIGN = PointcutsPackage.POINTCUT__ASSIGN;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_POINTCUT__TYPE = PointcutsPackage.POINTCUT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_POINTCUT__EXPR = PointcutsPackage.POINTCUT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Instance Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTANCE_POINTCUT_FEATURE_COUNT = PointcutsPackage.POINTCUT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.IpcExpressionImpl <em>Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.IpcExpressionImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcExpression()
   * @generated
   */
  int IPC_EXPRESSION = 2;

  /**
   * The feature id for the '<em><b>Add Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_EXPRESSION__ADD_EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Remove Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_EXPRESSION__REMOVE_EXPRESSION = 1;

  /**
   * The number of structural features of the '<em>Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_EXPRESSION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.IpcSubExpressionImpl <em>Sub Expression</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.IpcSubExpressionImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcSubExpression()
   * @generated
   */
  int IPC_SUB_EXPRESSION = 3;

  /**
   * The feature id for the '<em><b>Event</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_SUB_EXPRESSION__EVENT = 0;

  /**
   * The number of structural features of the '<em>Sub Expression</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_SUB_EXPRESSION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.EventImpl <em>Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.EventImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getEvent()
   * @generated
   */
  int EVENT = 4;

  /**
   * The feature id for the '<em><b>Pcexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT__PCEXP = 0;

  /**
   * The number of structural features of the '<em>Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EVENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.BeforeEventImpl <em>Before Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.BeforeEventImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getBeforeEvent()
   * @generated
   */
  int BEFORE_EVENT = 5;

  /**
   * The feature id for the '<em><b>Pcexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEFORE_EVENT__PCEXP = EVENT__PCEXP;

  /**
   * The number of structural features of the '<em>Before Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BEFORE_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.AfterEventImpl <em>After Event</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.AfterEventImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getAfterEvent()
   * @generated
   */
  int AFTER_EVENT = 6;

  /**
   * The feature id for the '<em><b>Pcexp</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_EVENT__PCEXP = EVENT__PCEXP;

  /**
   * The number of structural features of the '<em>After Event</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int AFTER_EVENT_FEATURE_COUNT = EVENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.CompositeInstancePointcutImpl <em>Composite Instance Pointcut</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.CompositeInstancePointcutImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getCompositeInstancePointcut()
   * @generated
   */
  int COMPOSITE_INSTANCE_POINTCUT = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_INSTANCE_POINTCUT__LAYOUT_INFORMATIONS = PointcutsPackage.POINTCUT__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_INSTANCE_POINTCUT__NAME = PointcutsPackage.POINTCUT__NAME;

  /**
   * The feature id for the '<em><b>Assign</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_INSTANCE_POINTCUT__ASSIGN = PointcutsPackage.POINTCUT__ASSIGN;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_INSTANCE_POINTCUT__TYPE = PointcutsPackage.POINTCUT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Compexpr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_INSTANCE_POINTCUT__COMPEXPR = PointcutsPackage.POINTCUT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Composite Instance Pointcut</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COMPOSITE_INSTANCE_POINTCUT_FEATURE_COUNT = PointcutsPackage.POINTCUT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.IpcCompositionImpl <em>Composition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.IpcCompositionImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcComposition()
   * @generated
   */
  int IPC_COMPOSITION = 8;

  /**
   * The feature id for the '<em><b>Child</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_COMPOSITION__CHILD = 0;

  /**
   * The number of structural features of the '<em>Composition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_COMPOSITION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.IpcCompositionChildImpl <em>Composition Child</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.IpcCompositionChildImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcCompositionChild()
   * @generated
   */
  int IPC_COMPOSITION_CHILD = 9;

  /**
   * The number of structural features of the '<em>Composition Child</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_COMPOSITION_CHILD_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.IpcUnionImpl <em>Union</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.IpcUnionImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcUnion()
   * @generated
   */
  int IPC_UNION = 10;

  /**
   * The feature id for the '<em><b>Children</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_UNION__CHILDREN = IPC_COMPOSITION_CHILD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Union</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_UNION_FEATURE_COUNT = IPC_COMPOSITION_CHILD_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kardo.language.ipc.impl.IpcIntersectionImpl <em>Intersection</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.ipc.impl.IpcIntersectionImpl
   * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcIntersection()
   * @generated
   */
  int IPC_INTERSECTION = 12;

  /**
   * The feature id for the '<em><b>Terms</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_INTERSECTION__TERMS = IPC_UNION_CHILD_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Intersection</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IPC_INTERSECTION_FEATURE_COUNT = IPC_UNION_CHILD_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.Ipc <em>Ipc</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ipc</em>'.
   * @see org.kardo.language.ipc.Ipc
   * @generated
   */
  EClass getIpc();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.InstancePointcut <em>Instance Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instance Pointcut</em>'.
   * @see org.kardo.language.ipc.InstancePointcut
   * @generated
   */
  EClass getInstancePointcut();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.ipc.InstancePointcut#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.kardo.language.ipc.InstancePointcut#getType()
   * @see #getInstancePointcut()
   * @generated
   */
  EReference getInstancePointcut_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.ipc.InstancePointcut#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.kardo.language.ipc.InstancePointcut#getExpr()
   * @see #getInstancePointcut()
   * @generated
   */
  EReference getInstancePointcut_Expr();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.IpcExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Expression</em>'.
   * @see org.kardo.language.ipc.IpcExpression
   * @generated
   */
  EClass getIpcExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.ipc.IpcExpression#getAddExpression <em>Add Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Add Expression</em>'.
   * @see org.kardo.language.ipc.IpcExpression#getAddExpression()
   * @see #getIpcExpression()
   * @generated
   */
  EReference getIpcExpression_AddExpression();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.ipc.IpcExpression#getRemoveExpression <em>Remove Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Remove Expression</em>'.
   * @see org.kardo.language.ipc.IpcExpression#getRemoveExpression()
   * @see #getIpcExpression()
   * @generated
   */
  EReference getIpcExpression_RemoveExpression();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.IpcSubExpression <em>Sub Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Sub Expression</em>'.
   * @see org.kardo.language.ipc.IpcSubExpression
   * @generated
   */
  EClass getIpcSubExpression();

  /**
   * Returns the meta object for the containment reference list '{@link org.kardo.language.ipc.IpcSubExpression#getEvent <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Event</em>'.
   * @see org.kardo.language.ipc.IpcSubExpression#getEvent()
   * @see #getIpcSubExpression()
   * @generated
   */
  EReference getIpcSubExpression_Event();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.Event <em>Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Event</em>'.
   * @see org.kardo.language.ipc.Event
   * @generated
   */
  EClass getEvent();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.ipc.Event#getPcexp <em>Pcexp</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Pcexp</em>'.
   * @see org.kardo.language.ipc.Event#getPcexp()
   * @see #getEvent()
   * @generated
   */
  EReference getEvent_Pcexp();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.BeforeEvent <em>Before Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Before Event</em>'.
   * @see org.kardo.language.ipc.BeforeEvent
   * @generated
   */
  EClass getBeforeEvent();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.AfterEvent <em>After Event</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>After Event</em>'.
   * @see org.kardo.language.ipc.AfterEvent
   * @generated
   */
  EClass getAfterEvent();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.CompositeInstancePointcut <em>Composite Instance Pointcut</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composite Instance Pointcut</em>'.
   * @see org.kardo.language.ipc.CompositeInstancePointcut
   * @generated
   */
  EClass getCompositeInstancePointcut();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.ipc.CompositeInstancePointcut#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.kardo.language.ipc.CompositeInstancePointcut#getType()
   * @see #getCompositeInstancePointcut()
   * @generated
   */
  EReference getCompositeInstancePointcut_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.ipc.CompositeInstancePointcut#getCompexpr <em>Compexpr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Compexpr</em>'.
   * @see org.kardo.language.ipc.CompositeInstancePointcut#getCompexpr()
   * @see #getCompositeInstancePointcut()
   * @generated
   */
  EReference getCompositeInstancePointcut_Compexpr();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.IpcComposition <em>Composition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition</em>'.
   * @see org.kardo.language.ipc.IpcComposition
   * @generated
   */
  EClass getIpcComposition();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.ipc.IpcComposition#getChild <em>Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Child</em>'.
   * @see org.kardo.language.ipc.IpcComposition#getChild()
   * @see #getIpcComposition()
   * @generated
   */
  EReference getIpcComposition_Child();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.IpcCompositionChild <em>Composition Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Composition Child</em>'.
   * @see org.kardo.language.ipc.IpcCompositionChild
   * @generated
   */
  EClass getIpcCompositionChild();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.IpcUnion <em>Union</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union</em>'.
   * @see org.kardo.language.ipc.IpcUnion
   * @generated
   */
  EClass getIpcUnion();

  /**
   * Returns the meta object for the containment reference list '{@link org.kardo.language.ipc.IpcUnion#getChildren <em>Children</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Children</em>'.
   * @see org.kardo.language.ipc.IpcUnion#getChildren()
   * @see #getIpcUnion()
   * @generated
   */
  EReference getIpcUnion_Children();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.IpcUnionChild <em>Union Child</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Union Child</em>'.
   * @see org.kardo.language.ipc.IpcUnionChild
   * @generated
   */
  EClass getIpcUnionChild();

  /**
   * Returns the meta object for class '{@link org.kardo.language.ipc.IpcIntersection <em>Intersection</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Intersection</em>'.
   * @see org.kardo.language.ipc.IpcIntersection
   * @generated
   */
  EClass getIpcIntersection();

  /**
   * Returns the meta object for the reference list '{@link org.kardo.language.ipc.IpcIntersection#getTerms <em>Terms</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Terms</em>'.
   * @see org.kardo.language.ipc.IpcIntersection#getTerms()
   * @see #getIpcIntersection()
   * @generated
   */
  EReference getIpcIntersection_Terms();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  IpcFactory getIpcFactory();

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
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.IpcImpl <em>Ipc</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.IpcImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpc()
     * @generated
     */
    EClass IPC = eINSTANCE.getIpc();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.InstancePointcutImpl <em>Instance Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.InstancePointcutImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getInstancePointcut()
     * @generated
     */
    EClass INSTANCE_POINTCUT = eINSTANCE.getInstancePointcut();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_POINTCUT__TYPE = eINSTANCE.getInstancePointcut_Type();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference INSTANCE_POINTCUT__EXPR = eINSTANCE.getInstancePointcut_Expr();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.IpcExpressionImpl <em>Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.IpcExpressionImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcExpression()
     * @generated
     */
    EClass IPC_EXPRESSION = eINSTANCE.getIpcExpression();

    /**
     * The meta object literal for the '<em><b>Add Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IPC_EXPRESSION__ADD_EXPRESSION = eINSTANCE.getIpcExpression_AddExpression();

    /**
     * The meta object literal for the '<em><b>Remove Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IPC_EXPRESSION__REMOVE_EXPRESSION = eINSTANCE.getIpcExpression_RemoveExpression();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.IpcSubExpressionImpl <em>Sub Expression</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.IpcSubExpressionImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcSubExpression()
     * @generated
     */
    EClass IPC_SUB_EXPRESSION = eINSTANCE.getIpcSubExpression();

    /**
     * The meta object literal for the '<em><b>Event</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IPC_SUB_EXPRESSION__EVENT = eINSTANCE.getIpcSubExpression_Event();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.EventImpl <em>Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.EventImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getEvent()
     * @generated
     */
    EClass EVENT = eINSTANCE.getEvent();

    /**
     * The meta object literal for the '<em><b>Pcexp</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EVENT__PCEXP = eINSTANCE.getEvent_Pcexp();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.BeforeEventImpl <em>Before Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.BeforeEventImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getBeforeEvent()
     * @generated
     */
    EClass BEFORE_EVENT = eINSTANCE.getBeforeEvent();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.AfterEventImpl <em>After Event</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.AfterEventImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getAfterEvent()
     * @generated
     */
    EClass AFTER_EVENT = eINSTANCE.getAfterEvent();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.CompositeInstancePointcutImpl <em>Composite Instance Pointcut</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.CompositeInstancePointcutImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getCompositeInstancePointcut()
     * @generated
     */
    EClass COMPOSITE_INSTANCE_POINTCUT = eINSTANCE.getCompositeInstancePointcut();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_INSTANCE_POINTCUT__TYPE = eINSTANCE.getCompositeInstancePointcut_Type();

    /**
     * The meta object literal for the '<em><b>Compexpr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference COMPOSITE_INSTANCE_POINTCUT__COMPEXPR = eINSTANCE.getCompositeInstancePointcut_Compexpr();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.IpcCompositionImpl <em>Composition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.IpcCompositionImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcComposition()
     * @generated
     */
    EClass IPC_COMPOSITION = eINSTANCE.getIpcComposition();

    /**
     * The meta object literal for the '<em><b>Child</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IPC_COMPOSITION__CHILD = eINSTANCE.getIpcComposition_Child();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.IpcCompositionChildImpl <em>Composition Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.IpcCompositionChildImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcCompositionChild()
     * @generated
     */
    EClass IPC_COMPOSITION_CHILD = eINSTANCE.getIpcCompositionChild();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.IpcUnionImpl <em>Union</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.IpcUnionImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcUnion()
     * @generated
     */
    EClass IPC_UNION = eINSTANCE.getIpcUnion();

    /**
     * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IPC_UNION__CHILDREN = eINSTANCE.getIpcUnion_Children();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.IpcUnionChildImpl <em>Union Child</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.IpcUnionChildImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcUnionChild()
     * @generated
     */
    EClass IPC_UNION_CHILD = eINSTANCE.getIpcUnionChild();

    /**
     * The meta object literal for the '{@link org.kardo.language.ipc.impl.IpcIntersectionImpl <em>Intersection</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.ipc.impl.IpcIntersectionImpl
     * @see org.kardo.language.ipc.impl.IpcPackageImpl#getIpcIntersection()
     * @generated
     */
    EClass IPC_INTERSECTION = eINSTANCE.getIpcIntersection();

    /**
     * The meta object literal for the '<em><b>Terms</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference IPC_INTERSECTION__TERMS = eINSTANCE.getIpcIntersection_Terms();

  }

} //IpcPackage
