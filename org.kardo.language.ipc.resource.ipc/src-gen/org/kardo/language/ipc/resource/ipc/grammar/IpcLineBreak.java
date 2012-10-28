/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.grammar;

public class IpcLineBreak extends org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement {
	
	private final int tabs;
	
	public IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality, int tabs) {
		super(cardinality);
		this.tabs = tabs;
	}
	
	public int getTabs() {
		return tabs;
	}
	
	public String toString() {
		return "!" + getTabs();
	}
	
}
