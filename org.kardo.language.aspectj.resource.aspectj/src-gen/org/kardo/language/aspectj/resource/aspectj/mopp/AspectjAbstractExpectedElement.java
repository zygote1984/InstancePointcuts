/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class AspectjAbstractExpectedElement implements org.kardo.language.aspectj.resource.aspectj.IAspectjExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<org.kardo.language.aspectj.resource.aspectj.util.AspectjPair<org.kardo.language.aspectj.resource.aspectj.IAspectjExpectedElement, org.kardo.language.aspectj.resource.aspectj.mopp.AspectjContainedFeature[]>> followers = new java.util.LinkedHashSet<org.kardo.language.aspectj.resource.aspectj.util.AspectjPair<org.kardo.language.aspectj.resource.aspectj.IAspectjExpectedElement, org.kardo.language.aspectj.resource.aspectj.mopp.AspectjContainedFeature[]>>();
	
	public AspectjAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.kardo.language.aspectj.resource.aspectj.IAspectjExpectedElement follower, org.kardo.language.aspectj.resource.aspectj.mopp.AspectjContainedFeature[] path) {
		followers.add(new org.kardo.language.aspectj.resource.aspectj.util.AspectjPair<org.kardo.language.aspectj.resource.aspectj.IAspectjExpectedElement, org.kardo.language.aspectj.resource.aspectj.mopp.AspectjContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.kardo.language.aspectj.resource.aspectj.util.AspectjPair<org.kardo.language.aspectj.resource.aspectj.IAspectjExpectedElement, org.kardo.language.aspectj.resource.aspectj.mopp.AspectjContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
