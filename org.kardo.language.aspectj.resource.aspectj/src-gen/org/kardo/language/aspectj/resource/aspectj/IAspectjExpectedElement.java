/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IAspectjExpectedElement {
	
	/**
	 * Returns the names of all tokens that are expected at the given position.
	 */
	public java.util.Set<String> getTokenNames();
	
	/**
	 * Returns the metaclass of the rule that contains the expected element.
	 */
	public org.eclipse.emf.ecore.EClass getRuleMetaclass();
	
	/**
	 * Returns the syntax element that is expected.
	 */
	public org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(org.kardo.language.aspectj.resource.aspectj.IAspectjExpectedElement follower, org.kardo.language.aspectj.resource.aspectj.mopp.AspectjContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<org.kardo.language.aspectj.resource.aspectj.util.AspectjPair<org.kardo.language.aspectj.resource.aspectj.IAspectjExpectedElement, org.kardo.language.aspectj.resource.aspectj.mopp.AspectjContainedFeature[]>> getFollowers();
	
}
