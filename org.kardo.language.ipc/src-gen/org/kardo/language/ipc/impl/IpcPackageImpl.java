/**
 */
package org.kardo.language.ipc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.emftext.language.java.types.TypesPackage;

import org.kardo.language.aspectj.advice.AdvicePackage;

import org.kardo.language.aspectj.commons.CommonsPackage;

import org.kardo.language.aspectj.patterns.PatternsPackage;

import org.kardo.language.aspectj.pcexp.PcexpPackage;

import org.kardo.language.aspectj.pointcuts.PointcutsPackage;

import org.kardo.language.ipc.AfterEvent;
import org.kardo.language.ipc.BeforeEvent;
import org.kardo.language.ipc.Event;
import org.kardo.language.ipc.InstancePointcut;
import org.kardo.language.ipc.IpcExpression;
import org.kardo.language.ipc.IpcFactory;
import org.kardo.language.ipc.IpcPackage;
import org.kardo.language.ipc.IpcSubExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IpcPackageImpl extends EPackageImpl implements IpcPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instancePointcutEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ipcExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass ipcSubExpressionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass eventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass beforeEventEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass afterEventEClass = null;

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
   * @see org.kardo.language.ipc.IpcPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private IpcPackageImpl()
  {
    super(eNS_URI, IpcFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link IpcPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static IpcPackage init()
  {
    if (isInited) return (IpcPackage)EPackage.Registry.INSTANCE.getEPackage(IpcPackage.eNS_URI);

    // Obtain or create and register package
    IpcPackageImpl theIpcPackage = (IpcPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof IpcPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new IpcPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    PointcutsPackage.eINSTANCE.eClass();
    CommonsPackage.eINSTANCE.eClass();
    PcexpPackage.eINSTANCE.eClass();
    PatternsPackage.eINSTANCE.eClass();
    AdvicePackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theIpcPackage.createPackageContents();

    // Initialize created meta-data
    theIpcPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theIpcPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(IpcPackage.eNS_URI, theIpcPackage);
    return theIpcPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstancePointcut()
  {
    return instancePointcutEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstancePointcut_Assign()
  {
    return (EReference)instancePointcutEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstancePointcut_Type()
  {
    return (EReference)instancePointcutEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getInstancePointcut_Expr()
  {
    return (EReference)instancePointcutEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIpcExpression()
  {
    return ipcExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIpcExpression_AddExpression()
  {
    return (EReference)ipcExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIpcExpression_RemoveExpression()
  {
    return (EReference)ipcExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIpcSubExpression()
  {
    return ipcSubExpressionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIpcSubExpression_Before()
  {
    return (EReference)ipcSubExpressionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIpcSubExpression_After()
  {
    return (EReference)ipcSubExpressionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getEvent()
  {
    return eventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getEvent_Pcexp()
  {
    return (EReference)eventEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getBeforeEvent()
  {
    return beforeEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAfterEvent()
  {
    return afterEventEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IpcFactory getIpcFactory()
  {
    return (IpcFactory)getEFactoryInstance();
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
    instancePointcutEClass = createEClass(INSTANCE_POINTCUT);
    createEReference(instancePointcutEClass, INSTANCE_POINTCUT__ASSIGN);
    createEReference(instancePointcutEClass, INSTANCE_POINTCUT__TYPE);
    createEReference(instancePointcutEClass, INSTANCE_POINTCUT__EXPR);

    ipcExpressionEClass = createEClass(IPC_EXPRESSION);
    createEReference(ipcExpressionEClass, IPC_EXPRESSION__ADD_EXPRESSION);
    createEReference(ipcExpressionEClass, IPC_EXPRESSION__REMOVE_EXPRESSION);

    ipcSubExpressionEClass = createEClass(IPC_SUB_EXPRESSION);
    createEReference(ipcSubExpressionEClass, IPC_SUB_EXPRESSION__BEFORE);
    createEReference(ipcSubExpressionEClass, IPC_SUB_EXPRESSION__AFTER);

    eventEClass = createEClass(EVENT);
    createEReference(eventEClass, EVENT__PCEXP);

    beforeEventEClass = createEClass(BEFORE_EVENT);

    afterEventEClass = createEClass(AFTER_EVENT);
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
    CommonsPackage theCommonsPackage = (CommonsPackage)EPackage.Registry.INSTANCE.getEPackage(CommonsPackage.eNS_URI);
    PcexpPackage thePcexpPackage = (PcexpPackage)EPackage.Registry.INSTANCE.getEPackage(PcexpPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    instancePointcutEClass.getESuperTypes().add(theCommonsPackage.getAspectMember());
    beforeEventEClass.getESuperTypes().add(this.getEvent());
    afterEventEClass.getESuperTypes().add(this.getEvent());

    // Initialize classes and features; add operations and parameters
    initEClass(instancePointcutEClass, InstancePointcut.class, "InstancePointcut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getInstancePointcut_Assign(), thePcexpPackage.getPcAssignmentOperator(), null, "assign", null, 1, 1, InstancePointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstancePointcut_Type(), theTypesPackage.getTypeReference(), null, "type", null, 1, 1, InstancePointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getInstancePointcut_Expr(), this.getIpcExpression(), null, "expr", null, 1, 1, InstancePointcut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ipcExpressionEClass, IpcExpression.class, "IpcExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIpcExpression_AddExpression(), this.getIpcSubExpression(), null, "addExpression", null, 1, 1, IpcExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIpcExpression_RemoveExpression(), this.getIpcSubExpression(), null, "removeExpression", null, 0, 1, IpcExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(ipcSubExpressionEClass, IpcSubExpression.class, "IpcSubExpression", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIpcSubExpression_Before(), this.getBeforeEvent(), null, "before", null, 0, 1, IpcSubExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getIpcSubExpression_After(), this.getAfterEvent(), null, "after", null, 0, 1, IpcSubExpression.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(eventEClass, Event.class, "Event", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getEvent_Pcexp(), thePcexpPackage.getPointcutExpression(), null, "pcexp", null, 1, 1, Event.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(beforeEventEClass, BeforeEvent.class, "BeforeEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(afterEventEClass, AfterEvent.class, "AfterEvent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // import
    createImportAnnotations();
  }

  /**
   * Initializes the annotations for <b>import</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createImportAnnotations()
  {
    String source = "import";		
    addAnnotation
      (this, 
       source, 
       new String[] 
       {
       "java", "platform:/plugin/org.emftext.language.java/metamodel/java.ecore",
       "aspectj", "platform:/resource/org.kardo.language.aspectj/metamodel/aspectj.ecore"
       });
  }

} //IpcPackageImpl
