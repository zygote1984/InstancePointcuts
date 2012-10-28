/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

/**
 * A basic implementation of the
 * org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolveResult
 * interface that collects mappings in a list.
 * 
 * @param <ReferenceType> the type of the references that can be contained in this
 * result
 */
public class AspectjReferenceResolveResult<ReferenceType> implements org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolveResult<ReferenceType> {
	
	private java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceMapping<ReferenceType>> mappings;
	private String errorMessage;
	private boolean resolveFuzzy;
	private java.util.Set<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix> quickFixes;
	
	public AspectjReferenceResolveResult(boolean resolveFuzzy) {
		super();
		this.resolveFuzzy = resolveFuzzy;
	}
	
	public String getErrorMessage() {
		return errorMessage;
	}
	
	public java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix> getQuickFixes() {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix>();
		}
		return java.util.Collections.unmodifiableSet(quickFixes);
	}
	
	public void addQuickFix(org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix quickFix) {
		if (quickFixes == null) {
			quickFixes = new java.util.LinkedHashSet<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix>();
		}
		quickFixes.add(quickFix);
	}
	
	public java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceMapping<ReferenceType>> getMappings() {
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
			mappings = new java.util.ArrayList<org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjElementMapping<ReferenceType>(identifier, target, warning));
		errorMessage = null;
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri) {
		addMapping(identifier, uri, null);
	}
	
	public void addMapping(String identifier, org.eclipse.emf.common.util.URI uri, String warning) {
		if (mappings == null) {
			mappings = new java.util.ArrayList<org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceMapping<ReferenceType>>(1);
		}
		mappings.add(new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjURIMapping<ReferenceType>(identifier, uri, warning));
	}
}
