/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.grammar;

public class AspectjChoice extends org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement {
	
	public AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality cardinality, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement... choices) {
		super(cardinality, choices);
	}
	
	public String toString() {
		return org.kardo.language.aspectj.resource.aspectj.util.AspectjStringUtil.explode(getChildren(), "|");
	}
	
}
