/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.grammar;

/**
 * A class to represent placeholders in a grammar.
 */
public class AspectjPlaceholder extends org.kardo.language.aspectj.resource.aspectj.grammar.AspectjTerminal {
	
	private final String tokenName;
	
	public AspectjPlaceholder(org.eclipse.emf.ecore.EStructuralFeature feature, String tokenName, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality cardinality, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.tokenName = tokenName;
	}
	
	public String getTokenName() {
		return tokenName;
	}
	
}
