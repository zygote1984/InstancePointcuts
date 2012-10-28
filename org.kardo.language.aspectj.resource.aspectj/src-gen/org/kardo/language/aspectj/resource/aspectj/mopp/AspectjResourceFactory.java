/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

public class AspectjResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public AspectjResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjResource(uri);
	}
	
}
