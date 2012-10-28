/**
 */
package org.kardo.language.aspectj.patterns;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.emftext.language.java.commons.CommonsPackage;

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
 * @see org.kardo.language.aspectj.patterns.PatternsFactory
 * @model kind="package"
 * @generated
 */
public interface PatternsPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "patterns";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.emftext.org/language/aspectj/patterns";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "patterns";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PatternsPackage eINSTANCE = org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl.init();

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.PatternImpl <em>Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.PatternImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getPattern()
   * @generated
   */
  int PATTERN = 0;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN__LAYOUT_INFORMATIONS = CommonsPackage.COMMENTABLE__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PATTERN_FEATURE_COUNT = CommonsPackage.COMMENTABLE_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.AbstractMethodPatternImpl <em>Abstract Method Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.AbstractMethodPatternImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getAbstractMethodPattern()
   * @generated
   */
  int ABSTRACT_METHOD_PATTERN = 1;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD_PATTERN__LAYOUT_INFORMATIONS = PATTERN__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Abstract Method Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_METHOD_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.FieldPatternImpl <em>Field Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.FieldPatternImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getFieldPattern()
   * @generated
   */
  int FIELD_PATTERN = 2;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PATTERN__LAYOUT_INFORMATIONS = PATTERN__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PATTERN__MODIFIERS = PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Declaring Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PATTERN__DECLARING_TYPE = PATTERN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Field Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PATTERN__FIELD_TYPE = PATTERN_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Fieldname</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PATTERN__FIELDNAME = PATTERN_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Field Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int FIELD_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.ConstructorPatternImpl <em>Constructor Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.ConstructorPatternImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getConstructorPattern()
   * @generated
   */
  int CONSTRUCTOR_PATTERN = 3;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_PATTERN__LAYOUT_INFORMATIONS = ABSTRACT_METHOD_PATTERN__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_PATTERN__MODIFIERS = ABSTRACT_METHOD_PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Declaring Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_PATTERN__DECLARING_TYPE = ABSTRACT_METHOD_PATTERN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_PATTERN__PARAMETERS = ABSTRACT_METHOD_PATTERN_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Constructor Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONSTRUCTOR_PATTERN_FEATURE_COUNT = ABSTRACT_METHOD_PATTERN_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.MethodPatternImpl <em>Method Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.MethodPatternImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getMethodPattern()
   * @generated
   */
  int METHOD_PATTERN = 4;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__LAYOUT_INFORMATIONS = ABSTRACT_METHOD_PATTERN__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Modifiers</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__MODIFIERS = ABSTRACT_METHOD_PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Return Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__RETURN_TYPE = ABSTRACT_METHOD_PATTERN_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Declaring Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__DECLARING_TYPE = ABSTRACT_METHOD_PATTERN_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__PARAMETERS = ABSTRACT_METHOD_PATTERN_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Methodname</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN__METHODNAME = ABSTRACT_METHOD_PATTERN_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Method Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int METHOD_PATTERN_FEATURE_COUNT = ABSTRACT_METHOD_PATTERN_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.TypeOrIdPatternImpl <em>Type Or Id Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.TypeOrIdPatternImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getTypeOrIdPattern()
   * @generated
   */
  int TYPE_OR_ID_PATTERN = 7;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OR_ID_PATTERN__LAYOUT_INFORMATIONS = PATTERN__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Type Or Id Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_OR_ID_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.TypePatternImpl <em>Type Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.TypePatternImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getTypePattern()
   * @generated
   */
  int TYPE_PATTERN = 5;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PATTERN__LAYOUT_INFORMATIONS = TYPE_OR_ID_PATTERN__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PATTERN__TYPE = TYPE_OR_ID_PATTERN_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Subtypes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PATTERN__SUBTYPES = TYPE_OR_ID_PATTERN_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Type Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TYPE_PATTERN_FEATURE_COUNT = TYPE_OR_ID_PATTERN_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.IdPatternImpl <em>Id Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.IdPatternImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getIdPattern()
   * @generated
   */
  int ID_PATTERN = 6;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_PATTERN__LAYOUT_INFORMATIONS = TYPE_OR_ID_PATTERN__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_PATTERN__ID = TYPE_OR_ID_PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Id Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ID_PATTERN_FEATURE_COUNT = TYPE_OR_ID_PATTERN_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.WildcardOrTypePatternImpl <em>Wildcard Or Type Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.WildcardOrTypePatternImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getWildcardOrTypePattern()
   * @generated
   */
  int WILDCARD_OR_TYPE_PATTERN = 10;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_OR_TYPE_PATTERN__LAYOUT_INFORMATIONS = PATTERN__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Wildcard Or Type Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_OR_TYPE_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.WildcardPatternImpl <em>Wildcard Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.WildcardPatternImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getWildcardPattern()
   * @generated
   */
  int WILDCARD_PATTERN = 9;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_PATTERN__LAYOUT_INFORMATIONS = WILDCARD_OR_TYPE_PATTERN__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Wildcard Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WILDCARD_PATTERN_FEATURE_COUNT = WILDCARD_OR_TYPE_PATTERN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.ParameterWildcardImpl <em>Parameter Wildcard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.ParameterWildcardImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getParameterWildcard()
   * @generated
   */
  int PARAMETER_WILDCARD = 8;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_WILDCARD__LAYOUT_INFORMATIONS = WILDCARD_PATTERN__LAYOUT_INFORMATIONS;

  /**
   * The number of structural features of the '<em>Parameter Wildcard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PARAMETER_WILDCARD_FEATURE_COUNT = WILDCARD_PATTERN_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.kardo.language.aspectj.patterns.impl.ConditionalExprPatternImpl <em>Conditional Expr Pattern</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.kardo.language.aspectj.patterns.impl.ConditionalExprPatternImpl
   * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getConditionalExprPattern()
   * @generated
   */
  int CONDITIONAL_EXPR_PATTERN = 11;

  /**
   * The feature id for the '<em><b>Layout Informations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPR_PATTERN__LAYOUT_INFORMATIONS = PATTERN__LAYOUT_INFORMATIONS;

  /**
   * The feature id for the '<em><b>Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPR_PATTERN__EXPR = PATTERN_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Conditional Expr Pattern</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONDITIONAL_EXPR_PATTERN_FEATURE_COUNT = PATTERN_FEATURE_COUNT + 1;


  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.Pattern <em>Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Pattern</em>'.
   * @see org.kardo.language.aspectj.patterns.Pattern
   * @generated
   */
  EClass getPattern();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.AbstractMethodPattern <em>Abstract Method Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Method Pattern</em>'.
   * @see org.kardo.language.aspectj.patterns.AbstractMethodPattern
   * @generated
   */
  EClass getAbstractMethodPattern();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.FieldPattern <em>Field Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Field Pattern</em>'.
   * @see org.kardo.language.aspectj.patterns.FieldPattern
   * @generated
   */
  EClass getFieldPattern();

  /**
   * Returns the meta object for the containment reference list '{@link org.kardo.language.aspectj.patterns.FieldPattern#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers</em>'.
   * @see org.kardo.language.aspectj.patterns.FieldPattern#getModifiers()
   * @see #getFieldPattern()
   * @generated
   */
  EReference getFieldPattern_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.patterns.FieldPattern#getDeclaringType <em>Declaring Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaring Type</em>'.
   * @see org.kardo.language.aspectj.patterns.FieldPattern#getDeclaringType()
   * @see #getFieldPattern()
   * @generated
   */
  EReference getFieldPattern_DeclaringType();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.patterns.FieldPattern#getFieldType <em>Field Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Field Type</em>'.
   * @see org.kardo.language.aspectj.patterns.FieldPattern#getFieldType()
   * @see #getFieldPattern()
   * @generated
   */
  EReference getFieldPattern_FieldType();

  /**
   * Returns the meta object for the attribute '{@link org.kardo.language.aspectj.patterns.FieldPattern#getFieldname <em>Fieldname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fieldname</em>'.
   * @see org.kardo.language.aspectj.patterns.FieldPattern#getFieldname()
   * @see #getFieldPattern()
   * @generated
   */
  EAttribute getFieldPattern_Fieldname();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.ConstructorPattern <em>Constructor Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Constructor Pattern</em>'.
   * @see org.kardo.language.aspectj.patterns.ConstructorPattern
   * @generated
   */
  EClass getConstructorPattern();

  /**
   * Returns the meta object for the containment reference list '{@link org.kardo.language.aspectj.patterns.ConstructorPattern#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers</em>'.
   * @see org.kardo.language.aspectj.patterns.ConstructorPattern#getModifiers()
   * @see #getConstructorPattern()
   * @generated
   */
  EReference getConstructorPattern_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.patterns.ConstructorPattern#getDeclaringType <em>Declaring Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaring Type</em>'.
   * @see org.kardo.language.aspectj.patterns.ConstructorPattern#getDeclaringType()
   * @see #getConstructorPattern()
   * @generated
   */
  EReference getConstructorPattern_DeclaringType();

  /**
   * Returns the meta object for the containment reference list '{@link org.kardo.language.aspectj.patterns.ConstructorPattern#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.kardo.language.aspectj.patterns.ConstructorPattern#getParameters()
   * @see #getConstructorPattern()
   * @generated
   */
  EReference getConstructorPattern_Parameters();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.MethodPattern <em>Method Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Method Pattern</em>'.
   * @see org.kardo.language.aspectj.patterns.MethodPattern
   * @generated
   */
  EClass getMethodPattern();

  /**
   * Returns the meta object for the containment reference list '{@link org.kardo.language.aspectj.patterns.MethodPattern#getModifiers <em>Modifiers</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Modifiers</em>'.
   * @see org.kardo.language.aspectj.patterns.MethodPattern#getModifiers()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_Modifiers();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.patterns.MethodPattern#getReturnType <em>Return Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Return Type</em>'.
   * @see org.kardo.language.aspectj.patterns.MethodPattern#getReturnType()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_ReturnType();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.patterns.MethodPattern#getDeclaringType <em>Declaring Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Declaring Type</em>'.
   * @see org.kardo.language.aspectj.patterns.MethodPattern#getDeclaringType()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_DeclaringType();

  /**
   * Returns the meta object for the containment reference list '{@link org.kardo.language.aspectj.patterns.MethodPattern#getParameters <em>Parameters</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Parameters</em>'.
   * @see org.kardo.language.aspectj.patterns.MethodPattern#getParameters()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_Parameters();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.patterns.MethodPattern#getMethodname <em>Methodname</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Methodname</em>'.
   * @see org.kardo.language.aspectj.patterns.MethodPattern#getMethodname()
   * @see #getMethodPattern()
   * @generated
   */
  EReference getMethodPattern_Methodname();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.TypePattern <em>Type Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Pattern</em>'.
   * @see org.kardo.language.aspectj.patterns.TypePattern
   * @generated
   */
  EClass getTypePattern();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.patterns.TypePattern#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Type</em>'.
   * @see org.kardo.language.aspectj.patterns.TypePattern#getType()
   * @see #getTypePattern()
   * @generated
   */
  EReference getTypePattern_Type();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.patterns.TypePattern#getSubtypes <em>Subtypes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Subtypes</em>'.
   * @see org.kardo.language.aspectj.patterns.TypePattern#getSubtypes()
   * @see #getTypePattern()
   * @generated
   */
  EReference getTypePattern_Subtypes();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.IdPattern <em>Id Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Id Pattern</em>'.
   * @see org.kardo.language.aspectj.patterns.IdPattern
   * @generated
   */
  EClass getIdPattern();

  /**
   * Returns the meta object for the reference '{@link org.kardo.language.aspectj.patterns.IdPattern#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Id</em>'.
   * @see org.kardo.language.aspectj.patterns.IdPattern#getId()
   * @see #getIdPattern()
   * @generated
   */
  EReference getIdPattern_Id();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.TypeOrIdPattern <em>Type Or Id Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Type Or Id Pattern</em>'.
   * @see org.kardo.language.aspectj.patterns.TypeOrIdPattern
   * @generated
   */
  EClass getTypeOrIdPattern();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.ParameterWildcard <em>Parameter Wildcard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Parameter Wildcard</em>'.
   * @see org.kardo.language.aspectj.patterns.ParameterWildcard
   * @generated
   */
  EClass getParameterWildcard();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.WildcardPattern <em>Wildcard Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard Pattern</em>'.
   * @see org.kardo.language.aspectj.patterns.WildcardPattern
   * @generated
   */
  EClass getWildcardPattern();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.WildcardOrTypePattern <em>Wildcard Or Type Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Wildcard Or Type Pattern</em>'.
   * @see org.kardo.language.aspectj.patterns.WildcardOrTypePattern
   * @generated
   */
  EClass getWildcardOrTypePattern();

  /**
   * Returns the meta object for class '{@link org.kardo.language.aspectj.patterns.ConditionalExprPattern <em>Conditional Expr Pattern</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Conditional Expr Pattern</em>'.
   * @see org.kardo.language.aspectj.patterns.ConditionalExprPattern
   * @generated
   */
  EClass getConditionalExprPattern();

  /**
   * Returns the meta object for the containment reference '{@link org.kardo.language.aspectj.patterns.ConditionalExprPattern#getExpr <em>Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expr</em>'.
   * @see org.kardo.language.aspectj.patterns.ConditionalExprPattern#getExpr()
   * @see #getConditionalExprPattern()
   * @generated
   */
  EReference getConditionalExprPattern_Expr();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  PatternsFactory getPatternsFactory();

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
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.PatternImpl <em>Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.PatternImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getPattern()
     * @generated
     */
    EClass PATTERN = eINSTANCE.getPattern();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.AbstractMethodPatternImpl <em>Abstract Method Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.AbstractMethodPatternImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getAbstractMethodPattern()
     * @generated
     */
    EClass ABSTRACT_METHOD_PATTERN = eINSTANCE.getAbstractMethodPattern();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.FieldPatternImpl <em>Field Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.FieldPatternImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getFieldPattern()
     * @generated
     */
    EClass FIELD_PATTERN = eINSTANCE.getFieldPattern();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_PATTERN__MODIFIERS = eINSTANCE.getFieldPattern_Modifiers();

    /**
     * The meta object literal for the '<em><b>Declaring Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_PATTERN__DECLARING_TYPE = eINSTANCE.getFieldPattern_DeclaringType();

    /**
     * The meta object literal for the '<em><b>Field Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference FIELD_PATTERN__FIELD_TYPE = eINSTANCE.getFieldPattern_FieldType();

    /**
     * The meta object literal for the '<em><b>Fieldname</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute FIELD_PATTERN__FIELDNAME = eINSTANCE.getFieldPattern_Fieldname();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.ConstructorPatternImpl <em>Constructor Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.ConstructorPatternImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getConstructorPattern()
     * @generated
     */
    EClass CONSTRUCTOR_PATTERN = eINSTANCE.getConstructorPattern();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_PATTERN__MODIFIERS = eINSTANCE.getConstructorPattern_Modifiers();

    /**
     * The meta object literal for the '<em><b>Declaring Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_PATTERN__DECLARING_TYPE = eINSTANCE.getConstructorPattern_DeclaringType();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONSTRUCTOR_PATTERN__PARAMETERS = eINSTANCE.getConstructorPattern_Parameters();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.MethodPatternImpl <em>Method Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.MethodPatternImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getMethodPattern()
     * @generated
     */
    EClass METHOD_PATTERN = eINSTANCE.getMethodPattern();

    /**
     * The meta object literal for the '<em><b>Modifiers</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__MODIFIERS = eINSTANCE.getMethodPattern_Modifiers();

    /**
     * The meta object literal for the '<em><b>Return Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__RETURN_TYPE = eINSTANCE.getMethodPattern_ReturnType();

    /**
     * The meta object literal for the '<em><b>Declaring Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__DECLARING_TYPE = eINSTANCE.getMethodPattern_DeclaringType();

    /**
     * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__PARAMETERS = eINSTANCE.getMethodPattern_Parameters();

    /**
     * The meta object literal for the '<em><b>Methodname</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference METHOD_PATTERN__METHODNAME = eINSTANCE.getMethodPattern_Methodname();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.TypePatternImpl <em>Type Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.TypePatternImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getTypePattern()
     * @generated
     */
    EClass TYPE_PATTERN = eINSTANCE.getTypePattern();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PATTERN__TYPE = eINSTANCE.getTypePattern_Type();

    /**
     * The meta object literal for the '<em><b>Subtypes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TYPE_PATTERN__SUBTYPES = eINSTANCE.getTypePattern_Subtypes();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.IdPatternImpl <em>Id Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.IdPatternImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getIdPattern()
     * @generated
     */
    EClass ID_PATTERN = eINSTANCE.getIdPattern();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ID_PATTERN__ID = eINSTANCE.getIdPattern_Id();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.TypeOrIdPatternImpl <em>Type Or Id Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.TypeOrIdPatternImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getTypeOrIdPattern()
     * @generated
     */
    EClass TYPE_OR_ID_PATTERN = eINSTANCE.getTypeOrIdPattern();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.ParameterWildcardImpl <em>Parameter Wildcard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.ParameterWildcardImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getParameterWildcard()
     * @generated
     */
    EClass PARAMETER_WILDCARD = eINSTANCE.getParameterWildcard();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.WildcardPatternImpl <em>Wildcard Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.WildcardPatternImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getWildcardPattern()
     * @generated
     */
    EClass WILDCARD_PATTERN = eINSTANCE.getWildcardPattern();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.WildcardOrTypePatternImpl <em>Wildcard Or Type Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.WildcardOrTypePatternImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getWildcardOrTypePattern()
     * @generated
     */
    EClass WILDCARD_OR_TYPE_PATTERN = eINSTANCE.getWildcardOrTypePattern();

    /**
     * The meta object literal for the '{@link org.kardo.language.aspectj.patterns.impl.ConditionalExprPatternImpl <em>Conditional Expr Pattern</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.kardo.language.aspectj.patterns.impl.ConditionalExprPatternImpl
     * @see org.kardo.language.aspectj.patterns.impl.PatternsPackageImpl#getConditionalExprPattern()
     * @generated
     */
    EClass CONDITIONAL_EXPR_PATTERN = eINSTANCE.getConditionalExprPattern();

    /**
     * The meta object literal for the '<em><b>Expr</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONDITIONAL_EXPR_PATTERN__EXPR = eINSTANCE.getConditionalExprPattern_Expr();

  }

} //PatternsPackage
