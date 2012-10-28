/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.grammar;

public class IpcContainment extends org.kardo.language.ipc.resource.ipc.grammar.IpcTerminal {
	
	private final org.eclipse.emf.ecore.EClass[] allowedTypes;
	
	public IpcContainment(org.eclipse.emf.ecore.EStructuralFeature feature, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality, org.eclipse.emf.ecore.EClass[] allowedTypes, int mandatoryOccurencesAfter) {
		super(feature, cardinality, mandatoryOccurencesAfter);
		this.allowedTypes = allowedTypes;
	}
	
	public org.eclipse.emf.ecore.EClass[] getAllowedTypes() {
		return allowedTypes;
	}
	
	public String toString() {
		String typeRestrictions = null;
		if (allowedTypes != null && allowedTypes.length > 0) {
			typeRestrictions = org.kardo.language.ipc.resource.ipc.util.IpcStringUtil.explode(allowedTypes, ", ", new org.kardo.language.ipc.resource.ipc.IIpcFunction1<String, org.eclipse.emf.ecore.EClass>() {
				public String execute(org.eclipse.emf.ecore.EClass eClass) {
					return eClass.getName();
				}
			});
		}
		return getFeature().getName() + (typeRestrictions == null ? "" : "[" + typeRestrictions + "]");
	}
	
}
