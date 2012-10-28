/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

public class IpcParseResult implements org.kardo.language.ipc.resource.ipc.IIpcParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcCommand<org.kardo.language.ipc.resource.ipc.IIpcTextResource>> commands = new java.util.ArrayList<org.kardo.language.ipc.resource.ipc.IIpcCommand<org.kardo.language.ipc.resource.ipc.IIpcTextResource>>();
	
	public IpcParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcCommand<org.kardo.language.ipc.resource.ipc.IIpcTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
