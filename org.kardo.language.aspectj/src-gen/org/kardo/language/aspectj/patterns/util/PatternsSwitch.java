/**
 */
package org.kardo.language.aspectj.patterns.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.emftext.language.java.commons.Commentable;

import org.kardo.language.aspectj.patterns.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.kardo.language.aspectj.patterns.PatternsPackage
 * @generated
 */
public class PatternsSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static PatternsPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PatternsSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = PatternsPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case PatternsPackage.PATTERN:
      {
        Pattern pattern = (Pattern)theEObject;
        T result = casePattern(pattern);
        if (result == null) result = caseCommentable(pattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternsPackage.ABSTRACT_METHOD_PATTERN:
      {
        AbstractMethodPattern abstractMethodPattern = (AbstractMethodPattern)theEObject;
        T result = caseAbstractMethodPattern(abstractMethodPattern);
        if (result == null) result = casePattern(abstractMethodPattern);
        if (result == null) result = caseCommentable(abstractMethodPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternsPackage.FIELD_PATTERN:
      {
        FieldPattern fieldPattern = (FieldPattern)theEObject;
        T result = caseFieldPattern(fieldPattern);
        if (result == null) result = casePattern(fieldPattern);
        if (result == null) result = caseCommentable(fieldPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternsPackage.CONSTRUCTOR_PATTERN:
      {
        ConstructorPattern constructorPattern = (ConstructorPattern)theEObject;
        T result = caseConstructorPattern(constructorPattern);
        if (result == null) result = caseAbstractMethodPattern(constructorPattern);
        if (result == null) result = casePattern(constructorPattern);
        if (result == null) result = caseCommentable(constructorPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternsPackage.METHOD_PATTERN:
      {
        MethodPattern methodPattern = (MethodPattern)theEObject;
        T result = caseMethodPattern(methodPattern);
        if (result == null) result = caseAbstractMethodPattern(methodPattern);
        if (result == null) result = casePattern(methodPattern);
        if (result == null) result = caseCommentable(methodPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternsPackage.TYPE_PATTERN:
      {
        TypePattern typePattern = (TypePattern)theEObject;
        T result = caseTypePattern(typePattern);
        if (result == null) result = caseTypeOrIdPattern(typePattern);
        if (result == null) result = caseWildcardOrTypePattern(typePattern);
        if (result == null) result = casePattern(typePattern);
        if (result == null) result = caseCommentable(typePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternsPackage.ID_PATTERN:
      {
        IdPattern idPattern = (IdPattern)theEObject;
        T result = caseIdPattern(idPattern);
        if (result == null) result = caseTypeOrIdPattern(idPattern);
        if (result == null) result = casePattern(idPattern);
        if (result == null) result = caseCommentable(idPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternsPackage.TYPE_OR_ID_PATTERN:
      {
        TypeOrIdPattern typeOrIdPattern = (TypeOrIdPattern)theEObject;
        T result = caseTypeOrIdPattern(typeOrIdPattern);
        if (result == null) result = casePattern(typeOrIdPattern);
        if (result == null) result = caseCommentable(typeOrIdPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternsPackage.PARAMETER_WILDCARD:
      {
        ParameterWildcard parameterWildcard = (ParameterWildcard)theEObject;
        T result = caseParameterWildcard(parameterWildcard);
        if (result == null) result = caseWildcardPattern(parameterWildcard);
        if (result == null) result = caseWildcardOrTypePattern(parameterWildcard);
        if (result == null) result = casePattern(parameterWildcard);
        if (result == null) result = caseCommentable(parameterWildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternsPackage.WILDCARD_PATTERN:
      {
        WildcardPattern wildcardPattern = (WildcardPattern)theEObject;
        T result = caseWildcardPattern(wildcardPattern);
        if (result == null) result = caseWildcardOrTypePattern(wildcardPattern);
        if (result == null) result = casePattern(wildcardPattern);
        if (result == null) result = caseCommentable(wildcardPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternsPackage.WILDCARD_OR_TYPE_PATTERN:
      {
        WildcardOrTypePattern wildcardOrTypePattern = (WildcardOrTypePattern)theEObject;
        T result = caseWildcardOrTypePattern(wildcardOrTypePattern);
        if (result == null) result = casePattern(wildcardOrTypePattern);
        if (result == null) result = caseCommentable(wildcardOrTypePattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case PatternsPackage.CONDITIONAL_EXPR_PATTERN:
      {
        ConditionalExprPattern conditionalExprPattern = (ConditionalExprPattern)theEObject;
        T result = caseConditionalExprPattern(conditionalExprPattern);
        if (result == null) result = casePattern(conditionalExprPattern);
        if (result == null) result = caseCommentable(conditionalExprPattern);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePattern(Pattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Method Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Method Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractMethodPattern(AbstractMethodPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Field Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Field Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFieldPattern(FieldPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Constructor Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Constructor Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConstructorPattern(ConstructorPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodPattern(MethodPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypePattern(TypePattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Id Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Id Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseIdPattern(IdPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Type Or Id Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Type Or Id Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTypeOrIdPattern(TypeOrIdPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Parameter Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Parameter Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseParameterWildcard(ParameterWildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardPattern(WildcardPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard Or Type Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard Or Type Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcardOrTypePattern(WildcardOrTypePattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Conditional Expr Pattern</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Conditional Expr Pattern</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConditionalExprPattern(ConditionalExprPattern object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Commentable</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Commentable</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCommentable(Commentable object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //PatternsSwitch
