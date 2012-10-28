/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class IpcKeyword extends org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement {
	
	private final String value;
	
	public IpcKeyword(String value, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality) {
		super(cardinality, null);
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
	
	public String toString() {
		return value;
	}
	
}
