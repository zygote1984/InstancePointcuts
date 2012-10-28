/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.analysis;

public class IdPatternIdReferenceResolver implements org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<org.kardo.language.aspectj.patterns.IdPattern, org.emftext.language.java.references.Reference> {
	
	private org.kardo.language.aspectj.resource.aspectj.analysis.IdPatternIdReferenceResolver delegate = new org.kardo.language.aspectj.resource.aspectj.analysis.IdPatternIdReferenceResolver();
	
	public void resolve(String identifier, org.kardo.language.aspectj.patterns.IdPattern container, org.eclipse.emf.ecore.EReference reference, int position, boolean resolveFuzzy, final org.kardo.language.ipc.resource.ipc.IIpcReferenceResolveResult<org.emftext.language.java.references.Reference> result) {
		delegate.resolve(identifier, container, reference, position, resolveFuzzy, new org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolveResult<org.emftext.language.java.references.Reference>() {
			
			public boolean wasResolvedUniquely() {
				return result.wasResolvedUniquely();
			}
			
			public boolean wasResolvedMultiple() {
				return result.wasResolvedMultiple();
			}
			
			public boolean wasResolved() {
				return result.wasResolved();
			}
			
			public void setErrorMessage(String message) {
				result.setErrorMessage(message);
			}
			
			public java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceMapping<org.emftext.language.java.references.Reference>> getMappings() {
				throw new UnsupportedOperationException();
			}
			
			public String getErrorMessage() {
				return result.getErrorMessage();
			}
			
			public void addMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier) {
				result.addMapping(identifier, newIdentifier);
			}
			
			public void addMapping(String identifier, org.eclipse.emf.common.util.URI newIdentifier, String warning) {
				result.addMapping(identifier, newIdentifier, warning);
			}
			
			public void addMapping(String identifier, org.emftext.language.java.references.Reference target) {
				result.addMapping(identifier, target);
			}
			
			public void addMapping(String identifier, org.emftext.language.java.references.Reference target, String warning) {
				result.addMapping(identifier, target, warning);
			}
			
			public java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix> getQuickFixes() {
				return java.util.Collections.emptySet();
			}
			
			public void addQuickFix(final org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix quickFix) {
				result.addQuickFix(new org.kardo.language.ipc.resource.ipc.IIpcQuickFix() {
					
					public String getImageKey() {
						return quickFix.getImageKey();
					}
					
					public String getDisplayString() {
						return quickFix.getDisplayString();
					}
					
					public java.util.Collection<org.eclipse.emf.ecore.EObject> getContextObjects() {
						return quickFix.getContextObjects();
					}
					
					public String getContextAsString() {
						return quickFix.getContextAsString();
					}
					
					public String apply(String currentText) {
						return quickFix.apply(currentText);
					}
				});
			}
		});
		
	}
	
	public String deResolve(org.emftext.language.java.references.Reference element, org.kardo.language.aspectj.patterns.IdPattern container, org.eclipse.emf.ecore.EReference reference) {
		return delegate.deResolve(element, container, reference);
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		// save options in a field or leave method empty if this resolver does not depend
		// on any option
	}
	
}
