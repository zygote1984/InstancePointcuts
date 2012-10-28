/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

/**
 * A FuzzyResolveResult is an implementation of the IIpcReferenceResolveResult
 * interface that delegates all method calls to a given IIpcReferenceResolveResult
 * with ReferenceType EObject. It is used by reference resolver switches to
 * collect results from different reference resolvers in a type safe manner.
 * 
 * @param <ReferenceType> the type of the reference that is resolved
 */
public class IpcFuzzyResolveResult<ReferenceType extends org.eclipse.emf.ecore.EObject> implements org.kardo.language.ipc.resource.ipc.IIpcReferenceResolveResult<ReferenceType> {
	
	private org.kardo.language.ipc.resource.ipc.IIpcReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate;
	
	public IpcFuzzyResolveResult(org.kardo.language.ipc.resource.ipc.IIpcReferenceResolveResult<org.eclipse.emf.ecore.EObject> delegate) {
		this.delegate = delegate;
	}
	
	public String getErrorMessage() {
		return delegate.getErrorMessage();
	}
	
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcReferenceMapping<ReferenceType>> getMappings() {
		return null;
	}
	
	public boolean wasResolved() {
		return delegate.wasResolved();
	}
	
	public boolean wasResolvedMultiple() {
		return delegate.wasResolvedMultiple();
	}
	
	public boolean wasResolvedUniquely() {
		return delegate.wasResolvedUniquely();
	}
	
	public void setErrorMessage(String message) {
		delegate.setErrorMessage(message);
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		delegate.addMapping(identifier, uri);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		delegate.addMapping(identifier, (org.eclipse.emf.ecore.EObject) target, warning);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		delegate.addMapping(identifier, uri, warning);
	}
	
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcQuickFix> getQuickFixes() {
		return delegate.getQuickFixes();
	}
	
	public void addQuickFix(org.kardo.language.ipc.resource.ipc.IIpcQuickFix quickFix) {
		delegate.addQuickFix(quickFix);
	}
	
}
