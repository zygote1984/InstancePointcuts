/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.analysis;

public class JavaHEX_DOUBLE_LITERALTokenResolver implements org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver {
	
	// If this line does not compile, the imported language plug-ins were generated
	// before EMFText 1.4.0. To resolve the compilation error remove the argument from
	// the constructor call.
	private org.emftext.language.java.resource.java.analysis.JavaHEX_DOUBLE_LITERALTokenResolver importedResolver = new org.emftext.language.java.resource.java.analysis.JavaHEX_DOUBLE_LITERALTokenResolver();
	
	public String deResolve(Object value, org.eclipse.emf.ecore.EStructuralFeature feature, org.eclipse.emf.ecore.EObject container) {
		String result = importedResolver.deResolve(value, feature, container);
		return result;
	}
	
	public void resolve(String lexem, org.eclipse.emf.ecore.EStructuralFeature feature, final org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolveResult result) {
		importedResolver.resolve(lexem, feature, new org.emftext.language.java.resource.java.IJavaTokenResolveResult() {
			public String getErrorMessage() {
				return result.getErrorMessage();
			}
			
			public Object getResolvedToken() {
				return result.getResolvedToken();
			}
			
			public void setErrorMessage(String message) {
				result.setErrorMessage(message);
			}
			
			public void setResolvedToken(Object resolvedToken) {
				result.setResolvedToken(resolvedToken);
			}
			
		});
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		importedResolver.setOptions(options);
	}
	
}
