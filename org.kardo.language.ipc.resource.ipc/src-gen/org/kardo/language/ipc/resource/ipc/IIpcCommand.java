/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IIpcCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
