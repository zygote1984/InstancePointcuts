/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.grammar;

public class IpcCompound extends org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement {
	
	public IpcCompound(org.kardo.language.ipc.resource.ipc.grammar.IpcChoice choice, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality) {
		super(cardinality, new org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
