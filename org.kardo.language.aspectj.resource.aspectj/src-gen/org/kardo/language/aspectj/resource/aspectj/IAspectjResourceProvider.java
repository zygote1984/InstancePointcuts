/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj;

/**
 * Implementors of this interface provide an EMF resource.
 */
public interface IAspectjResourceProvider {
	
	/**
	 * Returns the resource.
	 */
	public org.kardo.language.aspectj.resource.aspectj.IAspectjTextResource getResource();
	
}
