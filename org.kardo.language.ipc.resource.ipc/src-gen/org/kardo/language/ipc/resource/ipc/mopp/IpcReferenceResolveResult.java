/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

/**
 * A basic implementation of the
 * org.kardo.language.ipc.resource.ipc.IIpcReferenceResolveResult interface that
 * collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class IpcReferenceResolveResult<ReferenceType> implements org.kardo.language.ipc.resource.ipc.IIpcReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<org.kardo.language.ipc.resource.ipc.IIpcQuickFix> quickFixes;
	
	public IpcReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.kardo.language.ipc.resource.ipc.IIpcQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.kardo.language.ipc.resource.ipc.IIpcQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.kardo.language.ipc.resource.ipc.IIpcQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcReferenceMapping<ReferenceType>> getMappings() {
		return mappings;
	}
	
	public boolean wasResolved() {
		return mappings != null;
	}
	
	public boolean wasResolvedMultiple() {
		return mappings != null && mappings.size() > 1;
	}
	
	public boolean wasResolvedUniquely() {
		return mappings != null && mappings.size() == 1;
	}
	
	public void setErrorMessage(String message) {
		errorMessage = message;
	}
	
	public void addMapping(String identifier, ReferenceType target) {
		if (!resolveFuzzy && target == null) {
			throw new IllegalArgumentException("Mapping references to null is only allowed for fuzzy resolution.");
		}
		addMapping(identifier, target, null);
	}
	
	public void addMapping(String identifier, ReferenceType target, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.kardo.language.ipc.resource.ipc.IIpcReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.kardo.language.ipc.resource.ipc.mopp.IpcElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.kardo.language.ipc.resource.ipc.IIpcReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.kardo.language.ipc.resource.ipc.mopp.IpcURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
