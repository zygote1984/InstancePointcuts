/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class AspectjSyntaxElement {
	
	private AspectjSyntaxElement[] children;
	private AspectjSyntaxElement parent;
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality cardinality;
	
	public AspectjSyntaxElement(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality cardinality, AspectjSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (AspectjSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(AspectjSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public AspectjSyntaxElement getParent() {
		return parent;
	}
	
	public AspectjSyntaxElement[] getChildren() {
		if (children == null) {
			return new AspectjSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality getCardinality() {
		return cardinality;
	}
	
}
