/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.grammar;

/**
 * A class to represent a rules in the grammar.
 */
public class AspectjRule extends org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement {
	
	private final org.eclipse.emf.ecore.EClass metaclass;
	
	public AspectjRule(org.eclipse.emf.ecore.EClass metaclass, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice choice, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality cardinality) {
		super(cardinality, new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement[] {choice});
		this.metaclass = metaclass;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return metaclass;
	}
	
	public org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getDefinition() {
		return (org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice) getChildren()[0];
	}
	
}

