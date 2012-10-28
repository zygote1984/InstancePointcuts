/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

/**
 * Abstract super class for all expected elements. Provides methods to add
 * followers.
 */
public abstract class IpcAbstractExpectedElement implements org.kardo.language.ipc.resource.ipc.IIpcExpectedElement {
	
	private org.eclipse.emf.ecore.EClass ruleMetaclass;
	
	private java.util.Set<org.kardo.language.ipc.resource.ipc.util.IpcPair<org.kardo.language.ipc.resource.ipc.IIpcExpectedElement, org.kardo.language.ipc.resource.ipc.mopp.IpcContainedFeature[]>> followers = new java.util.LinkedHashSet<org.kardo.language.ipc.resource.ipc.util.IpcPair<org.kardo.language.ipc.resource.ipc.IIpcExpectedElement, org.kardo.language.ipc.resource.ipc.mopp.IpcContainedFeature[]>>();
	
	public IpcAbstractExpectedElement(org.eclipse.emf.ecore.EClass ruleMetaclass) {
		super();
		this.ruleMetaclass = ruleMetaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getRuleMetaclass() {
		return ruleMetaclass;
	}
	
	public void addFollower(org.kardo.language.ipc.resource.ipc.IIpcExpectedElement follower, org.kardo.language.ipc.resource.ipc.mopp.IpcContainedFeature[] path) {
		followers.add(new org.kardo.language.ipc.resource.ipc.util.IpcPair<org.kardo.language.ipc.resource.ipc.IIpcExpectedElement, org.kardo.language.ipc.resource.ipc.mopp.IpcContainedFeature[]>(follower, path));
	}
	
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.util.IpcPair<org.kardo.language.ipc.resource.ipc.IIpcExpectedElement, org.kardo.language.ipc.resource.ipc.mopp.IpcContainedFeature[]>> getFollowers() {
		return followers;
	}
	
}
