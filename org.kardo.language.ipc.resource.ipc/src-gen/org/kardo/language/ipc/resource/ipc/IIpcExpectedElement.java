/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc;

/**
 * An element that is expected at a given position in a resource stream.
 */
public interface IIpcExpectedElement {
	
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
	public org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement getSymtaxElement();
	
	/**
	 * Adds an element that is a valid follower for this element.
	 */
	public void addFollower(org.kardo.language.ipc.resource.ipc.IIpcExpectedElement follower, org.kardo.language.ipc.resource.ipc.mopp.IpcContainedFeature[] path);
	
	/**
	 * Returns all valid followers for this element. Each follower is represented by a
	 * pair of an expected elements and the containment trace that leads from the
	 * current element to the follower.
	 */
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.util.IpcPair<org.kardo.language.ipc.resource.ipc.IIpcExpectedElement, org.kardo.language.ipc.resource.ipc.mopp.IpcContainedFeature[]>> getFollowers();
	
}
