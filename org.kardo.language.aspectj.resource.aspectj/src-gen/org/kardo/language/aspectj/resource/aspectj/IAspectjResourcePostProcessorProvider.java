/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IAspectjResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.kardo.language.aspectj.resource.aspectj.IAspectjResourcePostProcessor getResourcePostProcessor();
	
}