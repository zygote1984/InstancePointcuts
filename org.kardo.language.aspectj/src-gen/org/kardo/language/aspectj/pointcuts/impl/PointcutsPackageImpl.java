/**
 */
package org.kardo.language.aspectj.pointcuts.impl;

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

import org.kardo.language.aspectj.pcexp.PcexpPackage;

import org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl;

import org.kardo.language.aspectj.pointcuts.AdviceExecutionPointcut;
import org.kardo.language.aspectj.pointcuts.ArgsPointcut;
import org.kardo.language.aspectj.pointcuts.AspectJPointcut;
import org.kardo.language.aspectj.pointcuts.CFlowBelowPointcut;
import org.kardo.language.aspectj.pointcuts.CFlowPointcut;
import org.kardo.language.aspectj.pointcuts.CallPointcut;
import org.kardo.language.aspectj.pointcuts.ContextExposurePc;
import org.kardo.language.aspectj.pointcuts.ExecutionPointcut;
import org.kardo.language.aspectj.pointcuts.GetPointcut;
import org.kardo.language.aspectj.pointcuts.HandlerPointcut;
import org.kardo.language.aspectj.pointcuts.IfPointcut;
import org.kardo.language.aspectj.pointcuts.InitPointcut;
import org.kardo.language.aspectj.pointcuts.Pointcut;
import org.kardo.language.aspectj.pointcuts.PointcutsFactory;
import org.kardo.language.aspectj.pointcuts.PointcutsPackage;
import org.kardo.language.aspectj.pointcuts.PreInitPointcut;
import org.kardo.language.aspectj.pointcuts.PrimitivePointcut;
import org.kardo.language.aspectj.pointcuts.ReturningPointcut;
import org.kardo.language.aspectj.pointcuts.SetPointcut;
import org.kardo.language.aspectj.pointcuts.StaticInitPointcut;
import org.kardo.language.aspectj.pointcuts.TargetPointcut;
import org.kardo.language.aspectj.pointcuts.ThisPointcut;
import org.kardo.language.aspectj.pointcuts.WithinCodePointcut;
import org.kardo.language.aspectj.pointcuts.WithinPointcut;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PointcutsPackageImpl extends EPackageImpl implements PointcutsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass primitivePointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass callPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass executionPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass getPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass setPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass handlerPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass adviceExecutionPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass staticInitPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass initPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass preInitPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withinPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass withinCodePointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass thisPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass targetPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass argsPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cFlowPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cFlowBelowPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ifPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass aspectJPointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contextExposurePcEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass returningPointcutEClass = null;

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
   * @see org.kardo.language.aspectj.pointcuts.PointcutsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PointcutsPackageImpl()
  {
    super(eNS_URI, PointcutsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link PointcutsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PointcutsPackage init()
  {
    if (isInited) return (PointcutsPackage)EPackage.Registry.INSTANCE.getEPackage(PointcutsPackage.eNS_URI);

    // Obtain or create and register package
    PointcutsPackageImpl thePointcutsPackage = (PointcutsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PointcutsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PointcutsPackageImpl());

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
    CommonsPackageImpl theCommonsPackage_1 = (CommonsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(org.kardo.language.aspectj.commons.CommonsPackage.eNS_URI) instanceof CommonsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(org.kardo.language.aspectj.commons.CommonsPackage.eNS_URI) : org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE);
    PcexpPackageImpl thePcexpPackage = (PcexpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PcexpPackage.eNS_URI) instanceof PcexpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PcexpPackage.eNS_URI) : PcexpPackage.eINSTANCE);
    PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI) : PatternsPackage.eINSTANCE);
    AdvicePackageImpl theAdvicePackage = (AdvicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdvicePackage.eNS_URI) instanceof AdvicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdvicePackage.eNS_URI) : AdvicePackage.eINSTANCE);

    // Create package meta-data objects
    thePointcutsPackage.createPackageContents();
    theCommonsPackage_1.createPackageContents();
    thePcexpPackage.createPackageContents();
    thePatternsPackage.createPackageContents();
    theAdvicePackage.createPackageContents();

    // Initialize created meta-data
    thePointcutsPackage.initializePackageContents();
    theCommonsPackage_1.initializePackageContents();
    thePcexpPackage.initializePackageContents();
    thePatternsPackage.initializePackageContents();
    theAdvicePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePointcutsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PointcutsPackage.eNS_URI, thePointcutsPackage);
    return thePointcutsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPrimitivePointcut()
  {
    return primitivePointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPrimitivePointcut_Pattern()
  {
    return (EReference)primitivePointcutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCallPointcut()
  {
    return callPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExecutionPointcut()
  {
    return executionPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGetPointcut()
  {
    return getPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSetPointcut()
  {
    return setPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getHandlerPointcut()
  {
    return handlerPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAdviceExecutionPointcut()
  {
    return adviceExecutionPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStaticInitPointcut()
  {
    return staticInitPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInitPointcut()
  {
    return initPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPreInitPointcut()
  {
    return preInitPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWithinPointcut()
  {
    return withinPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWithinCodePointcut()
  {
    return withinCodePointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getThisPointcut()
  {
    return thisPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTargetPointcut()
  {
    return targetPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getArgsPointcut()
  {
    return argsPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCFlowPointcut()
  {
    return cFlowPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCFlowPointcut_Pointcut()
  {
    return (EReference)cFlowPointcutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCFlowBelowPointcut()
  {
    return cFlowBelowPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCFlowBelowPointcut_Pointcut()
  {
    return (EReference)cFlowBelowPointcutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIfPointcut()
  {
    return ifPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPointcut()
  {
    return pointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPointcut_Assign()
  {
    return (EReference)pointcutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAspectJPointcut()
  {
    return aspectJPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspectJPointcut_Exp()
  {
    return (EReference)aspectJPointcutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAspectJPointcut_Abstract()
  {
    return (EReference)aspectJPointcutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContextExposurePc()
  {
    return contextExposurePcEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReturningPointcut()
  {
    return returningPointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PointcutsFactory getPointcutsFactory()
  {
    return (PointcutsFactory)getEFactoryInstance();
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
    primitivePointcutEClass = createEClass(PRIMITIVE_POINTCUT);
    createEReference(primitivePointcutEClass, PRIMITIVE_POINTCUT__PATTERN);

    callPointcutEClass = createEClass(CALL_POINTCUT);

    executionPointcutEClass = createEClass(EXECUTION_POINTCUT);

    getPointcutEClass = createEClass(GET_POINTCUT);

    setPointcutEClass = createEClass(SET_POINTCUT);

    handlerPointcutEClass = createEClass(HANDLER_POINTCUT);

    adviceExecutionPointcutEClass = createEClass(ADVICE_EXECUTION_POINTCUT);

    staticInitPointcutEClass = createEClass(STATIC_INIT_POINTCUT);

    initPointcutEClass = createEClass(INIT_POINTCUT);

    preInitPointcutEClass = createEClass(PRE_INIT_POINTCUT);

    withinPointcutEClass = createEClass(WITHIN_POINTCUT);

    withinCodePointcutEClass = createEClass(WITHIN_CODE_POINTCUT);

    thisPointcutEClass = createEClass(THIS_POINTCUT);

    targetPointcutEClass = createEClass(TARGET_POINTCUT);

    argsPointcutEClass = createEClass(ARGS_POINTCUT);

    cFlowPointcutEClass = createEClass(CFLOW_POINTCUT);
    createEReference(cFlowPointcutEClass, CFLOW_POINTCUT__POINTCUT);

    cFlowBelowPointcutEClass = createEClass(CFLOW_BELOW_POINTCUT);
    createEReference(cFlowBelowPointcutEClass, CFLOW_BELOW_POINTCUT__POINTCUT);

    ifPointcutEClass = createEClass(IF_POINTCUT);

    pointcutEClass = createEClass(POINTCUT);
    createEReference(pointcutEClass, POINTCUT__ASSIGN);

    aspectJPointcutEClass = createEClass(ASPECT_JPOINTCUT);
    createEReference(aspectJPointcutEClass, ASPECT_JPOINTCUT__EXP);
    createEReference(aspectJPointcutEClass, ASPECT_JPOINTCUT__ABSTRACT);

    contextExposurePcEClass = createEClass(CONTEXT_EXPOSURE_PC);

    returningPointcutEClass = createEClass(RETURNING_POINTCUT);
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
    PcexpPackage thePcexpPackage = (PcexpPackage)EPackage.Registry.INSTANCE.getEPackage(PcexpPackage.eNS_URI);
    PatternsPackage thePatternsPackage = (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);
    org.kardo.language.aspectj.commons.CommonsPackage theCommonsPackage_1 = (org.kardo.language.aspectj.commons.CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(org.kardo.language.aspectj.commons.CommonsPackage.eNS_URI);
    ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
    OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
    ParametersPackage theParametersPackage = (ParametersPackage)EPackage.Registry.INSTANCE.getEPackage(ParametersPackage.eNS_URI);
    ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);
    ModifiersPackage theModifiersPackage = (ModifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    primitivePointcutEClass.getESuperTypes().add(thePcexpPackage.getPointcutAndExpressionChild());
    callPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    executionPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    getPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    setPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    handlerPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    adviceExecutionPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    staticInitPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    initPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    preInitPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    withinPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    withinCodePointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    thisPointcutEClass.getESuperTypes().add(this.getContextExposurePc());
    targetPointcutEClass.getESuperTypes().add(this.getContextExposurePc());
    argsPointcutEClass.getESuperTypes().add(this.getContextExposurePc());
    cFlowPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    cFlowBelowPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    ifPointcutEClass.getESuperTypes().add(this.getPrimitivePointcut());
    pointcutEClass.getESuperTypes().add(theCommonsPackage_1.getAspectMember());
    pointcutEClass.getESuperTypes().add(theReferencesPackage.getReferenceableElement());
    aspectJPointcutEClass.getESuperTypes().add(this.getPointcut());
    aspectJPointcutEClass.getESuperTypes().add(theParametersPackage.getParametrizable());
    contextExposurePcEClass.getESuperTypes().add(this.getPrimitivePointcut());
    returningPointcutEClass.getESuperTypes().add(this.getContextExposurePc());

    // Initialize classes and features; add operations and parameters
    initEClass(primitivePointcutEClass, PrimitivePointcut.class, "PrimitivePointcut", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPrimitivePointcut_Pattern(), thePatternsPackage.getPattern(), null, "pattern", null, 1, 1, PrimitivePointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(callPointcutEClass, CallPointcut.class, "CallPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(executionPointcutEClass, ExecutionPointcut.class, "ExecutionPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(getPointcutEClass, GetPointcut.class, "GetPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(setPointcutEClass, SetPointcut.class, "SetPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(handlerPointcutEClass, HandlerPointcut.class, "HandlerPointcut", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(adviceExecutionPointcutEClass, AdviceExecutionPointcut.class, "AdviceExecutionPointcut", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(staticInitPointcutEClass, StaticInitPointcut.class, "StaticInitPointcut", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(initPointcutEClass, InitPointcut.class, "InitPointcut", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(preInitPointcutEClass, PreInitPointcut.class, "PreInitPointcut", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(withinPointcutEClass, WithinPointcut.class, "WithinPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(withinCodePointcutEClass, WithinCodePointcut.class, "WithinCodePointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(thisPointcutEClass, ThisPointcut.class, "ThisPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(targetPointcutEClass, TargetPointcut.class, "TargetPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(argsPointcutEClass, ArgsPointcut.class, "ArgsPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cFlowPointcutEClass, CFlowPointcut.class, "CFlowPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCFlowPointcut_Pointcut(), this.getPointcut(), null, "pointcut", null, 1, 1, CFlowPointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(cFlowBelowPointcutEClass, CFlowBelowPointcut.class, "CFlowBelowPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCFlowBelowPointcut_Pointcut(), this.getPointcut(), null, "pointcut", null, 1, 1, CFlowBelowPointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ifPointcutEClass, IfPointcut.class, "IfPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(pointcutEClass, Pointcut.class, "Pointcut", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPointcut_Assign(), theOperatorsPackage.getAssignmentOperator(), null, "assign", null, 0, 1, Pointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(aspectJPointcutEClass, AspectJPointcut.class, "AspectJPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAspectJPointcut_Exp(), theExpressionsPackage.getConditionalExpression(), null, "exp", null, 0, 1, AspectJPointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAspectJPointcut_Abstract(), theModifiersPackage.getAbstract(), null, "abstract", null, 0, 1, AspectJPointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contextExposurePcEClass, ContextExposurePc.class, "ContextExposurePc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(returningPointcutEClass, ReturningPointcut.class, "ReturningPointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);
  }

} //PointcutsPackageImpl
