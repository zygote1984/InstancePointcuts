/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.util;

/**
 * This class provides basic infrastructure to interpret models. To implement
 * concrete interpreters, subclass this abstract interpreter and override the
 * interprete_* methods. The interpretation can be customized by binding the two
 * type parameters (ResultType, ContextType). The former is returned by all
 * interprete_* methods, while the latter is passed from method to method while
 * traversing the model. The concrete traversal strategy can also be exchanged.
 * One can use a static traversal strategy by pushing all objects to interpret on
 * the interpretation stack (using addObjectToInterprete()) before calling
 * interprete(). Alternatively, the traversal strategy can be dynamic by pushing
 * objects on the interpretation stack during interpretation.
 */
public class AbstractIpcInterpreter<ResultType, ContextType> {
	
	private java.util.Stack<org.eclipse.emf.ecore.EObject> interpretationStack = new java.util.Stack<org.eclipse.emf.ecore.EObject>();
	private java.util.List<org.kardo.language.ipc.resource.ipc.IIpcInterpreterListener> listeners = new java.util.ArrayList<org.kardo.language.ipc.resource.ipc.IIpcInterpreterListener>();
	private org.eclipse.emf.ecore.EObject nextObjectToInterprete;
	private Object currentContext;
	
	public ResultType interprete(ContextType context) {
		ResultType result = null;
		org.eclipse.emf.ecore.EObject next = null;
		currentContext = context;
		while (!interpretationStack.empty()) {
			try {
				next = interpretationStack.pop();
			} catch (java.util.EmptyStackException ese) {
				// this can happen when the interpreter was terminated between the call to empty()
				// and pop()
				break;
			}
			nextObjectToInterprete = next;
			notifyListeners(next);
			result = interprete(next, context);
			if (!continueInterpretation(context, result)) {
				break;
			}
		}
		currentContext = null;
		return result;
	}
	
	/**
	 * Override this method to stop the overall interpretation depending on the result
	 * of the interpretation of a single model elements.
	 */
	public boolean continueInterpretation(ContextType context, ResultType result) {
		return true;
	}
	
	public ResultType interprete(org.eclipse.emf.ecore.EObject object, ContextType context) {
		ResultType result = null;
		if (object instanceof org.kardo.language.ipc.InstancePointcut) {
			result = interprete_org_kardo_language_ipc_InstancePointcut((org.kardo.language.ipc.InstancePointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.Ipc) {
			result = interprete_org_kardo_language_ipc_Ipc((org.kardo.language.ipc.Ipc) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.IpcExpression) {
			result = interprete_org_kardo_language_ipc_IpcExpression((org.kardo.language.ipc.IpcExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.IpcSubExpression) {
			result = interprete_org_kardo_language_ipc_IpcSubExpression((org.kardo.language.ipc.IpcSubExpression) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.BeforeEvent) {
			result = interprete_org_kardo_language_ipc_BeforeEvent((org.kardo.language.ipc.BeforeEvent) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.AfterEvent) {
			result = interprete_org_kardo_language_ipc_AfterEvent((org.kardo.language.ipc.AfterEvent) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.Event) {
			result = interprete_org_kardo_language_ipc_Event((org.kardo.language.ipc.Event) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.CompositeInstancePointcut) {
			result = interprete_org_kardo_language_ipc_CompositeInstancePointcut((org.kardo.language.ipc.CompositeInstancePointcut) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.IpcComposition) {
			result = interprete_org_kardo_language_ipc_IpcComposition((org.kardo.language.ipc.IpcComposition) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.IpcUnion) {
			result = interprete_org_kardo_language_ipc_IpcUnion((org.kardo.language.ipc.IpcUnion) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.IpcCompositionChild) {
			result = interprete_org_kardo_language_ipc_IpcCompositionChild((org.kardo.language.ipc.IpcCompositionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.IpcIntersection) {
			result = interprete_org_kardo_language_ipc_IpcIntersection((org.kardo.language.ipc.IpcIntersection) object, context);
		}
		if (result != null) {
			return result;
		}
		if (object instanceof org.kardo.language.ipc.IpcUnionChild) {
			result = interprete_org_kardo_language_ipc_IpcUnionChild((org.kardo.language.ipc.IpcUnionChild) object, context);
		}
		if (result != null) {
			return result;
		}
		return result;
	}
	
	public ResultType interprete_org_kardo_language_ipc_Ipc(org.kardo.language.ipc.Ipc ipc, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_InstancePointcut(org.kardo.language.ipc.InstancePointcut instancePointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_IpcExpression(org.kardo.language.ipc.IpcExpression ipcExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_IpcSubExpression(org.kardo.language.ipc.IpcSubExpression ipcSubExpression, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_Event(org.kardo.language.ipc.Event event, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_BeforeEvent(org.kardo.language.ipc.BeforeEvent beforeEvent, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_AfterEvent(org.kardo.language.ipc.AfterEvent afterEvent, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_CompositeInstancePointcut(org.kardo.language.ipc.CompositeInstancePointcut compositeInstancePointcut, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_IpcComposition(org.kardo.language.ipc.IpcComposition ipcComposition, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_IpcCompositionChild(org.kardo.language.ipc.IpcCompositionChild ipcCompositionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_IpcUnion(org.kardo.language.ipc.IpcUnion ipcUnion, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_IpcUnionChild(org.kardo.language.ipc.IpcUnionChild ipcUnionChild, ContextType context) {
		return null;
	}
	
	public ResultType interprete_org_kardo_language_ipc_IpcIntersection(org.kardo.language.ipc.IpcIntersection ipcIntersection, ContextType context) {
		return null;
	}
	
	private void notifyListeners(org.eclipse.emf.ecore.EObject element) {
		for (org.kardo.language.ipc.resource.ipc.IIpcInterpreterListener listener : listeners) {
			listener.handleInterpreteObject(element);
		}
	}
	
	/**
	 * Adds the given object to the interpretation stack. Attention: Objects that are
	 * added first, are interpret last.
	 */
	public void addObjectToInterprete(org.eclipse.emf.ecore.EObject object) {
		interpretationStack.push(object);
	}
	
	/**
	 * Adds the given collection of objects to the interpretation stack. Attention:
	 * Collections that are added first, are interpret last.
	 */
	public void addObjectsToInterprete(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		for (org.eclipse.emf.ecore.EObject object : objects) {
			addObjectToInterprete(object);
		}
	}
	
	/**
	 * Adds the given collection of objects in reverse order to the interpretation
	 * stack.
	 */
	public void addObjectsToInterpreteInReverseOrder(java.util.Collection<? extends org.eclipse.emf.ecore.EObject> objects) {
		java.util.List<org.eclipse.emf.ecore.EObject> reverse = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>(objects.size());
		reverse.addAll(objects);
		java.util.Collections.reverse(reverse);
		addObjectsToInterprete(reverse);
	}
	
	/**
	 * Adds the given object and all its children to the interpretation stack such
	 * that they are interpret in top down order.
	 */
	public void addObjectTreeToInterpreteTopDown(org.eclipse.emf.ecore.EObject root) {
		java.util.List<org.eclipse.emf.ecore.EObject> objects = new java.util.ArrayList<org.eclipse.emf.ecore.EObject>();
		objects.add(root);
		java.util.Iterator<org.eclipse.emf.ecore.EObject> it = root.eAllContents();
		while (it.hasNext()) {
			org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) it.next();
			objects.add(eObject);
		}
		addObjectsToInterpreteInReverseOrder(objects);
	}
	
	public void addListener(org.kardo.language.ipc.resource.ipc.IIpcInterpreterListener newListener) {
		listeners.add(newListener);
	}
	
	public boolean removeListener(org.kardo.language.ipc.resource.ipc.IIpcInterpreterListener listener) {
		return listeners.remove(listener);
	}
	
	public org.eclipse.emf.ecore.EObject getNextObjectToInterprete() {
		return nextObjectToInterprete;
	}
	
	public java.util.Stack<org.eclipse.emf.ecore.EObject> getInterpretationStack() {
		return interpretationStack;
	}
	
	public void terminate() {
		interpretationStack.clear();
	}
	
	public Object getCurrentContext() {
		return currentContext;
	}
	
}
