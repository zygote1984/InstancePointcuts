/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

/**
 * A representation for a range in a document where a structural feature (e.g., a
 * reference) is expected.
 */
public class AspectjExpectedStructuralFeature extends org.kardo.language.aspectj.resource.aspectj.mopp.AspectjAbstractExpectedElement {
	
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder placeholder;
	
	public AspectjExpectedStructuralFeature(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder placeholder) {
		super(placeholder.getMetaclass());
		this.placeholder = placeholder;
	}
	
	public org.eclipse.emf.ecore.EStructuralFeature getFeature() {
		return placeholder.getFeature();
	}
	
	/**
	 * Returns the expected placeholder.
	 */
	public org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement getSymtaxElement() {
		return placeholder;
	}
	
	public String getTokenName() {
		return placeholder.getTokenName();
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton(getTokenName());
	}
	
	public String toString() {
		return "EFeature " + getFeature().getEContainingClass().getName() + "." + getFeature().getName();
	}
	
	public boolean equals(Object o) {
		if (o instanceof AspectjExpectedStructuralFeature) {
			return getFeature().equals(((AspectjExpectedStructuralFeature) o).getFeature());
		}
		return false;
	}
	@Override	
	public int hashCode() {
		return getFeature().hashCode();
	}
	
}
