/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class IpcRule extends org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public IpcRule(org.eclipse.emf.ecore.EClass metaclass, org.kardo.language.ipc.resource.ipc.grammar.IpcChoice choice, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality) {
		super(cardinality, new org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getDefinition() {
		return (org.kardo.language.ipc.resource.ipc.grammar.IpcChoice) getChildren()[0];
	}
	
}

