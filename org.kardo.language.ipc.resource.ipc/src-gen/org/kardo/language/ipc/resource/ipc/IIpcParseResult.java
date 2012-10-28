/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc;

/**
 * An interface used to access the result of parsing a document.
 */
public interface IIpcParseResult {
	
	/**
	 * Returns the root object of the document.
	 */
	public org.eclipse.emf.ecore.EObject getRoot();
	
	/**
	 * Returns a list of commands that must be executed after parsing the document.
	 */
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcCommand<org.kardo.language.ipc.resource.ipc.IIpcTextResource>> getPostParseCommands();
	
}
