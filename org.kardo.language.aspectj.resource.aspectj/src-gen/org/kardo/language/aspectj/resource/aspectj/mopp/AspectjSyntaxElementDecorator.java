/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

public class AspectjSyntaxElementDecorator {
	
	/**
	 * the syntax element to be decorated
	 */
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement decoratedElement;
	
	/**
	 * an array of child decorators (one decorator per child of the decorated syntax
	 * element
	 */
	private AspectjSyntaxElementDecorator[] childDecorators;
	
	/**
	 * a list of the indices that must be printed
	 */
	private java.util.List<Integer> indicesToPrint = new java.util.ArrayList<Integer>();
	
	public AspectjSyntaxElementDecorator(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement decoratedElement, AspectjSyntaxElementDecorator[] childDecorators) {
		super();
		this.decoratedElement = decoratedElement;
		this.childDecorators = childDecorators;
	}
	
	public void addIndexToPrint(Integer index) {
		indicesToPrint.add(index);
	}
	
	public org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement getDecoratedElement() {
		return decoratedElement;
	}
	
	public AspectjSyntaxElementDecorator[] getChildDecorators() {
		return childDecorators;
	}
	
	public Integer getNextIndexToPrint() {
		if (indicesToPrint.size() == 0) {
			return null;
		}
		return indicesToPrint.remove(0);
	}
	
	public String toString() {
		return "" + getDecoratedElement();
	}
	
}
