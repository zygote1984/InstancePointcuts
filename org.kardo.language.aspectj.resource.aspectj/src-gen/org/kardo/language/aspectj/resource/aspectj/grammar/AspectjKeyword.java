/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.grammar;

/**
 * A class to represent a keyword in the grammar.
 */
public class AspectjKeyword extends org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement {
	
	private final String value;
	
	public AspectjKeyword(String value, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality cardinality) {
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
