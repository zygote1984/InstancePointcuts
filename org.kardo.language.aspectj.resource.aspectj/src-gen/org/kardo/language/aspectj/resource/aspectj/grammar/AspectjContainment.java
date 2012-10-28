/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.grammar;

public class AspectjContainment extends org.kardo.language.aspectj.resource.aspectj.grammar.AspectjTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public AspectjContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.kardo.language.aspectj.resource.aspectj.util.AspectjStringUtil.explode(allowedTypes, ", ", new org.kardo.language.aspectj.resource.aspectj.IAspectjFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
