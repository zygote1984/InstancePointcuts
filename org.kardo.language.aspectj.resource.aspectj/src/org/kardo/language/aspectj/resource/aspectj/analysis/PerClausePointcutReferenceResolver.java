/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.analysis;

public class PerClausePointcutReferenceResolver implements org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolver<org.kardo.language.aspectj.commons.PerClause, org.kardo.language.aspectj.pointcuts.Pointcut> {
	
	private org.kardo.language.aspectj.resource.aspectj.analysis.AspectjDefaultResolverDelegate<org.kardo.language.aspectj.commons.PerClause, org.kardo.language.aspectj.pointcuts.Pointcut> delegate = new org.kardo.language.aspectj.resource.aspectj.analysis.AspectjDefaultResolverDelegate<org.kardo.language.aspectj.commons.PerClause, org.kardo.language.aspectj.pointcuts.Pointcut>();
	
	public void resolve(String identifier, org.kardo.language.aspectj.commons.PerClause container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolveResult<org.kardo.language.aspectj.pointcuts.Pointcut> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, result);
	}
	
	public String deResolve(org.kardo.language.aspectj.pointcuts.Pointcut element, org.kardo.language.aspectj.commons.PerClause container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
