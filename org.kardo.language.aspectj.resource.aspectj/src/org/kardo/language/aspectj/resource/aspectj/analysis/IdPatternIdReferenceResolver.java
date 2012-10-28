/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.analysis;

public class IdPatternIdReferenceResolver implements org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolver<org.kardo.language.aspectj.patterns.IdPattern, org.emftext.language.java.references.Reference> {
	
	private org.kardo.language.aspectj.resource.aspectj.analysis.AspectjDefaultResolverDelegate<org.kardo.language.aspectj.patterns.IdPattern, org.emftext.language.java.references.Reference> delegate = new org.kardo.language.aspectj.resource.aspectj.analysis.AspectjDefaultResolverDelegate<org.kardo.language.aspectj.patterns.IdPattern, org.emftext.language.java.references.Reference>();
	
	public void resolve(String identifier, org.kardo.language.aspectj.patterns.IdPattern container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolveResult<org.emftext.language.java.references.Reference> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.emftext.language.java.references.Reference element, org.kardo.language.aspectj.patterns.IdPattern container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
