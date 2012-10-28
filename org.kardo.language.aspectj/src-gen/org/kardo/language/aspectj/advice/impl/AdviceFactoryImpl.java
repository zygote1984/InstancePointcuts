/**
 */
package org.kardo.language.aspectj.advice.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kardo.language.aspectj.advice.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AdviceFactoryImpl extends EFactoryImpl implements AdviceFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AdviceFactory init()
  {
    try
    {
      AdviceFactory theAdviceFactory = (AdviceFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftext.org/language/aspectj/advice"); 
      if (theAdviceFactory != null)
      {
        return theAdviceFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AdviceFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdviceFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AdvicePackage.AFTER_ADVICE: return createAfterAdvice();
      case AdvicePackage.BEFORE_ADVICE: return createBeforeAdvice();
      case AdvicePackage.AFTER_RETURNING: return createAfterReturning();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterAdvice createAfterAdvice()
  {
    AfterAdviceImpl afterAdvice = new AfterAdviceImpl();
    return afterAdvice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeforeAdvice createBeforeAdvice()
  {
    BeforeAdviceImpl beforeAdvice = new BeforeAdviceImpl();
    return beforeAdvice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterReturning createAfterReturning()
  {
    AfterReturningImpl afterReturning = new AfterReturningImpl();
    return afterReturning;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AdvicePackage getAdvicePackage()
  {
    return (AdvicePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AdvicePackage getPackage()
  {
    return AdvicePackage.eINSTANCE;
  }

} //AdviceFactoryImpl
