/**
 */
package org.kardo.language.aspectj.patterns.impl;

import org.eclipse.emf.ecore.EAttribute;
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

import org.kardo.language.aspectj.patterns.AbstractMethodPattern;
import org.kardo.language.aspectj.patterns.ConditionalExprPattern;
import org.kardo.language.aspectj.patterns.ConstructorPattern;
import org.kardo.language.aspectj.patterns.FieldPattern;
import org.kardo.language.aspectj.patterns.IdPattern;
import org.kardo.language.aspectj.patterns.MethodPattern;
import org.kardo.language.aspectj.patterns.ParameterWildcard;
import org.kardo.language.aspectj.patterns.Pattern;
import org.kardo.language.aspectj.patterns.PatternsFactory;
import org.kardo.language.aspectj.patterns.PatternsPackage;
import org.kardo.language.aspectj.patterns.TypeOrIdPattern;
import org.kardo.language.aspectj.patterns.TypePattern;
import org.kardo.language.aspectj.patterns.WildcardOrTypePattern;
import org.kardo.language.aspectj.patterns.WildcardPattern;

import org.kardo.language.aspectj.pcexp.PcexpPackage;

import org.kardo.language.aspectj.pcexp.impl.PcexpPackageImpl;

import org.kardo.language.aspectj.pointcuts.PointcutsPackage;

import org.kardo.language.aspectj.pointcuts.impl.PointcutsPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PatternsPackageImpl extends EPackageImpl implements PatternsPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass patternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractMethodPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass fieldPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass constructorPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass methodPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass idPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass typeOrIdPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass parameterWildcardEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardPatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass wildcardOrTypePatternEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass conditionalExprPatternEClass = null;

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
   * @see org.kardo.language.aspectj.patterns.PatternsPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private PatternsPackageImpl()
  {
    super(eNS_URI, PatternsFactory.eINSTANCE);
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
   * <p>This method is used to initialize {@link PatternsPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static PatternsPackage init()
  {
    if (isInited) return (PatternsPackage)EPackage.Registry.INSTANCE.getEPackage(PatternsPackage.eNS_URI);

    // Obtain or create and register package
    PatternsPackageImpl thePatternsPackage = (PatternsPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof PatternsPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new PatternsPackageImpl());

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
    PcexpPackageImpl thePcexpPackage = (PcexpPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(PcexpPackage.eNS_URI) instanceof PcexpPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(PcexpPackage.eNS_URI) : PcexpPackage.eINSTANCE);
    AdvicePackageImpl theAdvicePackage = (AdvicePackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AdvicePackage.eNS_URI) instanceof AdvicePackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AdvicePackage.eNS_URI) : AdvicePackage.eINSTANCE);

    // Create package meta-data objects
    thePatternsPackage.createPackageContents();
    thePointcutsPackage.createPackageContents();
    theCommonsPackage_1.createPackageContents();
    thePcexpPackage.createPackageContents();
    theAdvicePackage.createPackageContents();

    // Initialize created meta-data
    thePatternsPackage.initializePackageContents();
    thePointcutsPackage.initializePackageContents();
    theCommonsPackage_1.initializePackageContents();
    thePcexpPackage.initializePackageContents();
    theAdvicePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    thePatternsPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(PatternsPackage.eNS_URI, thePatternsPackage);
    return thePatternsPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPattern()
  {
    return patternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractMethodPattern()
  {
    return abstractMethodPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getFieldPattern()
  {
    return fieldPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldPattern_Modifiers()
  {
    return (EReference)fieldPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldPattern_DeclaringType()
  {
    return (EReference)fieldPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getFieldPattern_FieldType()
  {
    return (EReference)fieldPatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getFieldPattern_Fieldname()
  {
    return (EAttribute)fieldPatternEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConstructorPattern()
  {
    return constructorPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorPattern_Modifiers()
  {
    return (EReference)constructorPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorPattern_DeclaringType()
  {
    return (EReference)constructorPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConstructorPattern_Parameters()
  {
    return (EReference)constructorPatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMethodPattern()
  {
    return methodPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPattern_Modifiers()
  {
    return (EReference)methodPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPattern_ReturnType()
  {
    return (EReference)methodPatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPattern_DeclaringType()
  {
    return (EReference)methodPatternEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPattern_Parameters()
  {
    return (EReference)methodPatternEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMethodPattern_Methodname()
  {
    return (EReference)methodPatternEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypePattern()
  {
    return typePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePattern_Type()
  {
    return (EReference)typePatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTypePattern_Subtypes()
  {
    return (EReference)typePatternEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getIdPattern()
  {
    return idPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getIdPattern_Id()
  {
    return (EReference)idPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTypeOrIdPattern()
  {
    return typeOrIdPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getParameterWildcard()
  {
    return parameterWildcardEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardPattern()
  {
    return wildcardPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWildcardOrTypePattern()
  {
    return wildcardOrTypePatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getConditionalExprPattern()
  {
    return conditionalExprPatternEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getConditionalExprPattern_Expr()
  {
    return (EReference)conditionalExprPatternEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternsFactory getPatternsFactory()
  {
    return (PatternsFactory)getEFactoryInstance();
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
    patternEClass = createEClass(PATTERN);

    abstractMethodPatternEClass = createEClass(ABSTRACT_METHOD_PATTERN);

    fieldPatternEClass = createEClass(FIELD_PATTERN);
    createEReference(fieldPatternEClass, FIELD_PATTERN__MODIFIERS);
    createEReference(fieldPatternEClass, FIELD_PATTERN__DECLARING_TYPE);
    createEReference(fieldPatternEClass, FIELD_PATTERN__FIELD_TYPE);
    createEAttribute(fieldPatternEClass, FIELD_PATTERN__FIELDNAME);

    constructorPatternEClass = createEClass(CONSTRUCTOR_PATTERN);
    createEReference(constructorPatternEClass, CONSTRUCTOR_PATTERN__MODIFIERS);
    createEReference(constructorPatternEClass, CONSTRUCTOR_PATTERN__DECLARING_TYPE);
    createEReference(constructorPatternEClass, CONSTRUCTOR_PATTERN__PARAMETERS);

    methodPatternEClass = createEClass(METHOD_PATTERN);
    createEReference(methodPatternEClass, METHOD_PATTERN__MODIFIERS);
    createEReference(methodPatternEClass, METHOD_PATTERN__RETURN_TYPE);
    createEReference(methodPatternEClass, METHOD_PATTERN__DECLARING_TYPE);
    createEReference(methodPatternEClass, METHOD_PATTERN__PARAMETERS);
    createEReference(methodPatternEClass, METHOD_PATTERN__METHODNAME);

    typePatternEClass = createEClass(TYPE_PATTERN);
    createEReference(typePatternEClass, TYPE_PATTERN__TYPE);
    createEReference(typePatternEClass, TYPE_PATTERN__SUBTYPES);

    idPatternEClass = createEClass(ID_PATTERN);
    createEReference(idPatternEClass, ID_PATTERN__ID);

    typeOrIdPatternEClass = createEClass(TYPE_OR_ID_PATTERN);

    parameterWildcardEClass = createEClass(PARAMETER_WILDCARD);

    wildcardPatternEClass = createEClass(WILDCARD_PATTERN);

    wildcardOrTypePatternEClass = createEClass(WILDCARD_OR_TYPE_PATTERN);

    conditionalExprPatternEClass = createEClass(CONDITIONAL_EXPR_PATTERN);
    createEReference(conditionalExprPatternEClass, CONDITIONAL_EXPR_PATTERN__EXPR);
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
    ModifiersPackage theModifiersPackage = (ModifiersPackage)EPackage.Registry.INSTANCE.getEPackage(ModifiersPackage.eNS_URI);
    TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);
    ReferencesPackage theReferencesPackage = (ReferencesPackage)EPackage.Registry.INSTANCE.getEPackage(ReferencesPackage.eNS_URI);
    OperatorsPackage theOperatorsPackage = (OperatorsPackage)EPackage.Registry.INSTANCE.getEPackage(OperatorsPackage.eNS_URI);
    ExpressionsPackage theExpressionsPackage = (ExpressionsPackage)EPackage.Registry.INSTANCE.getEPackage(ExpressionsPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    patternEClass.getESuperTypes().add(theCommonsPackage.getCommentable());
    abstractMethodPatternEClass.getESuperTypes().add(this.getPattern());
    fieldPatternEClass.getESuperTypes().add(this.getPattern());
    constructorPatternEClass.getESuperTypes().add(this.getAbstractMethodPattern());
    methodPatternEClass.getESuperTypes().add(this.getAbstractMethodPattern());
    typePatternEClass.getESuperTypes().add(this.getTypeOrIdPattern());
    typePatternEClass.getESuperTypes().add(this.getWildcardOrTypePattern());
    idPatternEClass.getESuperTypes().add(this.getTypeOrIdPattern());
    typeOrIdPatternEClass.getESuperTypes().add(this.getPattern());
    parameterWildcardEClass.getESuperTypes().add(this.getWildcardPattern());
    wildcardPatternEClass.getESuperTypes().add(this.getWildcardOrTypePattern());
    wildcardOrTypePatternEClass.getESuperTypes().add(this.getPattern());
    conditionalExprPatternEClass.getESuperTypes().add(this.getPattern());

    // Initialize classes and features; add operations and parameters
    initEClass(patternEClass, Pattern.class, "Pattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(abstractMethodPatternEClass, AbstractMethodPattern.class, "AbstractMethodPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(fieldPatternEClass, FieldPattern.class, "FieldPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getFieldPattern_Modifiers(), theModifiersPackage.getModifier(), null, "modifiers", null, 0, -1, FieldPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldPattern_DeclaringType(), this.getTypePattern(), null, "declaringType", null, 1, 1, FieldPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getFieldPattern_FieldType(), this.getTypePattern(), null, "fieldType", null, 1, 1, FieldPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getFieldPattern_Fieldname(), ecorePackage.getEString(), "fieldname", null, 1, 1, FieldPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(constructorPatternEClass, ConstructorPattern.class, "ConstructorPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConstructorPattern_Modifiers(), theModifiersPackage.getModifier(), null, "modifiers", null, 1, -1, ConstructorPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructorPattern_DeclaringType(), this.getTypePattern(), null, "declaringType", null, 1, 1, ConstructorPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getConstructorPattern_Parameters(), this.getWildcardOrTypePattern(), null, "parameters", null, 0, -1, ConstructorPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(methodPatternEClass, MethodPattern.class, "MethodPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMethodPattern_Modifiers(), theModifiersPackage.getModifier(), null, "modifiers", null, 1, -1, MethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodPattern_ReturnType(), this.getTypePattern(), null, "returnType", null, 1, 1, MethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodPattern_DeclaringType(), theTypesPackage.getTypeReference(), null, "declaringType", null, 1, 1, MethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodPattern_Parameters(), this.getWildcardOrTypePattern(), null, "parameters", null, 0, -1, MethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getMethodPattern_Methodname(), theReferencesPackage.getStringReference(), null, "methodname", null, 1, 1, MethodPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typePatternEClass, TypePattern.class, "TypePattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTypePattern_Type(), theTypesPackage.getTypeReference(), null, "type", null, 1, 1, TypePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTypePattern_Subtypes(), theOperatorsPackage.getAddition(), null, "subtypes", null, 0, 1, TypePattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(idPatternEClass, IdPattern.class, "IdPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getIdPattern_Id(), theReferencesPackage.getReference(), null, "id", null, 1, 1, IdPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(typeOrIdPatternEClass, TypeOrIdPattern.class, "TypeOrIdPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(parameterWildcardEClass, ParameterWildcard.class, "ParameterWildcard", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardPatternEClass, WildcardPattern.class, "WildcardPattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(wildcardOrTypePatternEClass, WildcardOrTypePattern.class, "WildcardOrTypePattern", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(conditionalExprPatternEClass, ConditionalExprPattern.class, "ConditionalExprPattern", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getConditionalExprPattern_Expr(), theExpressionsPackage.getConditionalExpression(), null, "expr", null, 1, 1, ConditionalExprPattern.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //PatternsPackageImpl
