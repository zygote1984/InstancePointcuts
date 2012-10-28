/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class IpcPlaceholder extends org.kardo.language.ipc.resource.ipc.grammar.IpcTerminal {
	
	private final String tokenName;
	
	public IpcPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
