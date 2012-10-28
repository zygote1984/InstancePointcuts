/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.grammar;

public class IpcWhiteSpace extends org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement {
	
	private final int amount;
	
	public IpcWhiteSpace(int amount, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality) {
		super(cardinality);
		this.amount = amount;
	}
	
	public int getAmount() {
		return amount;
	}
	
	public String toString() {
		return "#" + getAmount();
	}
	
}
