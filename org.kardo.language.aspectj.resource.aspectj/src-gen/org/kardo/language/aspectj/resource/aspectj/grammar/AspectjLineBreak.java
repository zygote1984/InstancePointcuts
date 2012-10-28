/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.grammar;

public class AspectjLineBreak extends org.kardo.language.aspectj.resource.aspectj.grammar.AspectjFormattingElement {
	
	private final int tabs;
	
	public AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality cardinality, int tabs) {
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
