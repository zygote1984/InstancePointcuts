/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.grammar;

/**
 * The abstract super class for all elements of a grammar. This class provides
 * methods to traverse the grammar rules.
 */
public abstract class IpcSyntaxElement {
	
	private IpcSyntaxElement[] children;
	private IpcSyntaxElement parent;
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality;
	
	public IpcSyntaxElement(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality, IpcSyntaxElement[] children) {
		this.cardinality = cardinality;
		this.children = children;
		if (this.children != null) {
			for (IpcSyntaxElement child : this.children) {
				child.setParent(this);
			}
		}
	}
	
	/**
	 * Sets the parent of this syntax element. This method must be invoked at most
	 * once.
	 */
	public void setParent(IpcSyntaxElement parent) {
		assert this.parent == null;
		this.parent = parent;
	}
	
	/**
	 * Returns the parent of this syntax element. This parent is determined by the
	 * containment hierarchy in the CS model.
	 */
	public IpcSyntaxElement getParent() {
		return parent;
	}
	
	public IpcSyntaxElement[] getChildren() {
		if (children == null) {
			return new IpcSyntaxElement[0];
		}
		return children;
	}
	
	public org.eclipse.emf.ecore.EClass getMetaclass() {
		return parent.getMetaclass();
	}
	
	public org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality getCardinality() {
		return cardinality;
	}
	
}
