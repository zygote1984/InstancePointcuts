/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc;

/**
 * Implementors of this interface can provide a post-processor for text resources.
 */
public interface IIpcResourcePostProcessorProvider {
	
	/**
	 * Returns the processor that shall be called after text resource are successfully
	 * parsed.
	 */
	public org.kardo.language.ipc.resource.ipc.IIpcResourcePostProcessor getResourcePostProcessor();
	
}
