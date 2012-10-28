/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.grammar;

public class AspectjCompound extends org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement {
	
	public AspectjCompound(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice choice, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality cardinality) {
		super(cardinality, new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement[] {choice});
	}
	
	public String toString() {
		return "(" + getChildren()[0] + ")";
	}
	
}
