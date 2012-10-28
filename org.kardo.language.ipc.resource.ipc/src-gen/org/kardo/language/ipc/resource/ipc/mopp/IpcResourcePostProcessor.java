/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

public class IpcResourcePostProcessor implements org.kardo.language.ipc.resource.ipc.IIpcResourcePostProcessor {
	
	public void process(org.kardo.language.ipc.resource.ipc.mopp.IpcResource resource) {
		// Set the overrideResourcePostProcessor option to false to customize resource
		// post processing.
	}
	
	public void terminate() {
		// To signal termination to the process() method, setting a boolean field is
		// recommended. Depending on the value of this field process() can stop its
		// computation. However, this is only required for computation intensive
		// post-processors.
	}
	
}
