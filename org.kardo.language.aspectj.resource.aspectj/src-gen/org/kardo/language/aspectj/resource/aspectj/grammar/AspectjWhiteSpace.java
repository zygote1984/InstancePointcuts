/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.grammar;

public class AspectjWhiteSpace extends org.kardo.language.aspectj.resource.aspectj.grammar.AspectjFormattingElement {
	
	private final int amount;
	
	public AspectjWhiteSpace(int amount, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality cardinality) {
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
