/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.analysis;

public class AdvicePcrefReferenceResolver implements org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolver<org.kardo.language.aspectj.advice.Advice, org.kardo.language.aspectj.pointcuts.AspectJPointcut> {
	
	private org.kardo.language.aspectj.resource.aspectj.analysis.AspectjDefaultResolverDelegate<org.kardo.language.aspectj.advice.Advice, org.kardo.language.aspectj.pointcuts.AspectJPointcut> delegate = new org.kardo.language.aspectj.resource.aspectj.analysis.AspectjDefaultResolverDelegate<org.kardo.language.aspectj.advice.Advice, org.kardo.language.aspectj.pointcuts.AspectJPointcut>();
	
	public void resolve(String identifier, org.kardo.language.aspectj.advice.Advice container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolveResult<org.kardo.language.aspectj.pointcuts.AspectJPointcut> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.kardo.language.aspectj.pointcuts.AspectJPointcut element, org.kardo.language.aspectj.advice.Advice container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
