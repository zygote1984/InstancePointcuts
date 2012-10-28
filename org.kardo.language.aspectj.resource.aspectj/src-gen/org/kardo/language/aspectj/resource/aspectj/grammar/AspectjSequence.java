/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.grammar;

public class AspectjSequence extends org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement {
	
	public AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality cardinality, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement... elements) {
		super(cardinality, elements);
	}
	
	public String toString() {
		return org.kardo.language.aspectj.resource.aspectj.util.AspectjStringUtil.explode(getChildren(), " ");
	}
	
}
