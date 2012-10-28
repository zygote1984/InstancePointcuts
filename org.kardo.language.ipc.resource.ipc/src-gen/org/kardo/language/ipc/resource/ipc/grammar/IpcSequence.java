/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.grammar;

public class IpcSequence extends org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement {
	
	public IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality, org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.kardo.language.ipc.resource.ipc.util.IpcStringUtil.explode(getChildren(), " ");
	}
	
}
