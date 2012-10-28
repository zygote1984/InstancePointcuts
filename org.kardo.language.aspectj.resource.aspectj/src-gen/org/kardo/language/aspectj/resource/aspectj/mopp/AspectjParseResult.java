/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

public class AspectjParseResult implements org.kardo.language.aspectj.resource.aspectj.IAspectjParseResult {
	
	private org.eclipse.emf.ecore.EObject root;
	private java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjCommand<org.kardo.language.aspectj.resource.aspectj.IAspectjTextResource>> commands = new java.util.ArrayList<org.kardo.language.aspectj.resource.aspectj.IAspectjCommand<org.kardo.language.aspectj.resource.aspectj.IAspectjTextResource>>();
	
	public AspectjParseResult() {
		super();
	}
	
	public void setRoot(org.eclipse.emf.ecore.EObject root) {
		this.root = root;
	}
	
	public org.eclipse.emf.ecore.EObject getRoot() {
		return root;
	}
	
	public java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjCommand<org.kardo.language.aspectj.resource.aspectj.IAspectjTextResource>> getPostParseCommands() {
		return commands;
	}
	
}
