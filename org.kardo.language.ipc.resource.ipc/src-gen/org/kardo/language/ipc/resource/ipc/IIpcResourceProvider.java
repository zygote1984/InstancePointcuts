/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IIpcResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public org.kardo.language.ipc.resource.ipc.IIpcTextResource getResource();
	
}
