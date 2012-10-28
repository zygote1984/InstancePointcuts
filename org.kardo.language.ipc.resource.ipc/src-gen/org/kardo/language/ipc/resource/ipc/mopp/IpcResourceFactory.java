/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

public class IpcResourceFactory implements org.eclipse.emf.ecore.resource.Resource.Factory {
	
	public IpcResourceFactory() {
		super();
	}
	
	public org.eclipse.emf.ecore.resource.Resource createResource(org.eclipse.emf.common.util.URI uri) {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcResource(uri);
	}
	
}
