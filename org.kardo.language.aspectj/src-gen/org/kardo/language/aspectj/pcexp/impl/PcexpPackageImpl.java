/**
 */
package org.kardo.language.aspectj.pcexp.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.java.annotations.AnnotationsPackage;

import org.emftext.language.java.arrays.ArraysPackage;

import org.emftext.language.java.classifiers.ClassifiersPackage;

import org.emftext.language.java.commons.CommonsPackage;

import org.emftext.language.java.containers.ContainersPackage;

import org.emftext.language.java.expressions.ExpressionsPackage;

import org.emftext.language.java.generics.GenericsPackage;

import org.emftext.language.java.imports.ImportsPackage;

import org.emftext.language.java.instantiations.InstantiationsPackage;

import org.emftext.language.java.literals.LiteralsPackage;

import org.emftext.language.java.members.MembersPackage;

import org.emftext.language.java.modifiers.ModifiersPackage;

import org.emftext.language.java.operators.OperatorsPackage;

import org.emftext.language.java.parameters.ParametersPackage;

import org.emftext.language.java.references.ReferencesPackage;

import org.emftext.language.java.statements.StatementsPackage;

import org.emftext.language.java.types.TypesPackage;

import org.emftext.language.java.variables.VariablesPackage;

import org.kardo.language.aspectj.advice.AdvicePackage;

import org.kardo.language.aspectj.advice.impl.AdvicePackageImpl;

import org.kardo.language.aspectj.commons.impl.CommonsPackageImpl;

import org.kardo.language.aspectj.patterns.PatternsPackage;

import org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl;

import org.kardo.language.aspectj.pcexp.PcAssignmentOperator;
import org.kardo.language.aspectj.pcexp.PcexpFactory;
import org.kardo.language.aspectj.pcexp.PcexpPackage;
import org.kardo.language.aspectj.pcexp.PointcutAndExpression;
import org.kardo.language.aspectj.pcexp.PointcutAndExpressionChild;
import org.kardo.language.aspectj.pcexp.PointcutExpression;
import org.kardo.language.aspectj.pcexp.PointcutExpressionChild;
import org.kardo.language.aspectj.pcexp.PointcutOrExpression;
import org.kardo.language.aspectj.pcexp.PointcutOrExpressionChild;

import org.kardo.language.aspectj.pointcuts.PointcutsPackage;

import org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PcexpPackageImpl extends EPackageImpl implements PcexpPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointcutExpressionChildEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointcutExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointcutOrExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointcutOrExpressionChildEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointcutAndExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointcutAndExpressionChildEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pcAssignmentOperatorEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.kardo.language.aspectj.pcexp.PcexpPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PcexpPackageImpl()
  {
    super(eNS_URI, PcexpFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link PcexpPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PcexpPackage init()
  {
    if (isInited) return (PcexpPackage)EPackage.Registry.INSTANCE.getEPackage(PcexpPackage.eNS_URI);

    // Obtain or create and register package
    PcexpPackageImpl thePcexpPackage = (PcexpPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PcexpPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PcexpPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    AnnotationsPackage.eINSTANCE.eClass();
    ArraysPackage.eINSTANCE.eClass();
    ClassifiersPackage.eINSTANCE.eClass();
    CommonsPackage.eINSTANCE.eClass();
    ContainersPackage.eINSTANCE.eClass();
    ExpressionsPackage.eINSTANCE.eClass();
    GenericsPackage.eINSTANCE.eClass();
    ImportsPackage.eINSTANCE.eClass();
    InstantiationsPackage.eINSTANCE.eClass();
    LiteralsPackage.eINSTANCE.eClass();
    MembersPackage.eINSTANCE.eClass();
    ModifiersPackage.eINSTANCE.eClass();
    OperatorsPackage.eINSTANCE.eClass();
    ParametersPackage.eINSTANCE.eClass();
    ReferencesPackage.eINSTANCE.eClass();
    StatementsPackage.eINSTANCE.eClass();
    TypesPackage.eINSTANCE.eClass();
    VariablesPackage.eINSTANCE.eClass();

    // Obtain or create and register interdependencies
    PointcutsPackageImpl thePointcutsPackage = (PointcutsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PointcutsPackage.eNS_URI) instanceof PointcutsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PointcutsPackage.eNS_URI) : PointcutsPackage.eINSTANCE);
    CommonsPackageImpl theCommonsPackage_1 = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.kardo.language.aspectj.commons.CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.kardo.language.aspectj.commons.CommonsPackage.eNS_URI) : org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE);
    PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
    AdvicePackageImpl theAdvicePackage = (AdvicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdvicePackage.eNS_URI) instanceof AdvicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdvicePackage.eNS_URI) : AdvicePackage.eINSTANCE);

    // Create package meta-data objects
    thePcexpPackage.createPackageContents();
    thePointcutsPackage.createPackageContents();
    theCommonsPackage_1.createPackageContents();
    thePatternsPackage.createPackageContents();
    theAdvicePackage.createPackageContents();

    // Initialize created meta-data
    thePcexpPackage.initializePackageContents();
    thePointcutsPackage.initializePackageContents();
    theCommonsPackage_1.initializePackageContents();
    thePatternsPackage.initializePackageContents();
    theAdvicePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePcexpPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PcexpPackage.eNS_URI, thePcexpPackage);
    return thePcexpPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointcutExpressionChild()
  {
    return pointcutExpressionChildEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointcutExpression()
  {
    return pointcutExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointcutOrExpression()
  {
    return pointcutOrExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointcutOrExpression_Children()
  {
    return (EReference)pointcutOrExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointcutOrExpressionChild()
  {
    return pointcutOrExpressionChildEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointcutAndExpression()
  {
    return pointcutAndExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointcutAndExpression_Children()
  {
    return (EReference)pointcutAndExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointcutAndExpressionChild()
  {
    return pointcutAndExpressionChildEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPcAssignmentOperator()
  {
    return pcAssignmentOperatorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PcexpFactory getPcexpFactory()
  {
    return (PcexpFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    pointcutExpressionChildEClass = createEClass(POINTCUT_EXPRESSION_CHILD);

    pointcutExpressionEClass = createEClass(POINTCUT_EXPRESSION);

    pointcutOrExpressionEClass = createEClass(POINTCUT_OR_EXPRESSION);
    createEReference(pointcutOrExpressionEClass, POINTCUT_OR_EXPRESSION__CHILDREN);

    pointcutOrExpressionChildEClass = createEClass(POINTCUT_OR_EXPRESSION_CHILD);

    pointcutAndExpressionEClass = createEClass(POINTCUT_AND_EXPRESSION);
    createEReference(pointcutAndExpressionEClass, POINTCUT_AND_EXPRESSION__CHILDREN);

    pointcutAndExpressionChildEClass = createEClass(POINTCUT_AND_EXPRESSION_CHILD);

    pcAssignmentOperatorEClass = createEClass(PC_ASSIGNMENT_OPERATOR);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
    OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    pointcutExpressionChildEClass.getESuperTypes().add(theExpressionsPackage.getConditionalExpressionChild());
    pointcutExpressionEClass.getESuperTypes().add(theExpressionsPackage.getConditionalExpression());
    pointcutOrExpressionEClass.getESuperTypes().add(this.getPointcutExpressionChild());
    pointcutOrExpressionChildEClass.getESuperTypes().add(theExpressionsPackage.getConditionalOrExpressionChild());
    pointcutAndExpressionEClass.getESuperTypes().add(this.getPointcutOrExpressionChild());
    pointcutAndExpressionChildEClass.getESuperTypes().add(this.getPointcutOrExpressionChild());
    pcAssignmentOperatorEClass.getESuperTypes().add(theOperatorsPackage.getAssignmentOperator());

    // Initialize classes and features; add operations and parameters
    initEClass(pointcutExpressionChildEClass, PointcutExpressionChild.class, "PointcutExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pointcutExpressionEClass, PointcutExpression.class, "PointcutExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pointcutOrExpressionEClass, PointcutOrExpression.class, "PointcutOrExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPointcutOrExpression_Children(), this.getPointcutOrExpressionChild(), null, "children", null, 1, -1, PointcutOrExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointcutOrExpressionChildEClass, PointcutOrExpressionChild.class, "PointcutOrExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pointcutAndExpressionEClass, PointcutAndExpression.class, "PointcutAndExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPointcutAndExpression_Children(), this.getPointcutAndExpressionChild(), null, "children", null, 1, -1, PointcutAndExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pointcutAndExpressionChildEClass, PointcutAndExpressionChild.class, "PointcutAndExpressionChild", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pcAssignmentOperatorEClass, PcAssignmentOperator.class, "PcAssignmentOperator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //PcexpPackageImpl
