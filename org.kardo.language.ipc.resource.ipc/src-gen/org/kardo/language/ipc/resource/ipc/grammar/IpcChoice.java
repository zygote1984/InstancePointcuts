/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.grammar;

public class IpcChoice extends org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement {
	
	public IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality, org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.kardo.language.ipc.resource.ipc.util.IpcStringUtil.explode(getChildren(), "|");
	}
	
}
