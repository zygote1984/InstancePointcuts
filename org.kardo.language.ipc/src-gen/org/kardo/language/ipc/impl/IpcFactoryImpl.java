/**
 */
package org.kardo.language.ipc.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kardo.language.ipc.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class IpcFactoryImpl extends EFactoryImpl implements IpcFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static IpcFactory init()
  {
    try
    {
      IpcFactory theIpcFactory = (IpcFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.emftext.org/language/ipc"); 
      if (theIpcFactory != null)
      {
        return theIpcFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new IpcFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IpcFactoryImpl()
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
      case IpcPackage.INSTANCE_POINTCUT: return createInstancePointcut();
      case IpcPackage.IPC_EXPRESSION: return createIpcExpression();
      case IpcPackage.IPC_SUB_EXPRESSION: return createIpcSubExpression();
      case IpcPackage.BEFORE_EVENT: return createBeforeEvent();
      case IpcPackage.AFTER_EVENT: return createAfterEvent();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InstancePointcut createInstancePointcut()
  {
    InstancePointcutImpl instancePointcut = new InstancePointcutImpl();
    return instancePointcut;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IpcExpression createIpcExpression()
  {
    IpcExpressionImpl ipcExpression = new IpcExpressionImpl();
    return ipcExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IpcSubExpression createIpcSubExpression()
  {
    IpcSubExpressionImpl ipcSubExpression = new IpcSubExpressionImpl();
    return ipcSubExpression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BeforeEvent createBeforeEvent()
  {
    BeforeEventImpl beforeEvent = new BeforeEventImpl();
    return beforeEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AfterEvent createAfterEvent()
  {
    AfterEventImpl afterEvent = new AfterEventImpl();
    return afterEvent;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public IpcPackage getIpcPackage()
  {
    return (IpcPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static IpcPackage getPackage()
  {
    return IpcPackage.eINSTANCE;
  }

} //IpcFactoryImpl
