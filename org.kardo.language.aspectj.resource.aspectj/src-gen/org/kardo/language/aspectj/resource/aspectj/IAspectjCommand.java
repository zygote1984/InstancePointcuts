/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj;

/**
 * A simple interface for commands that can be executed and that return
 * information about the success of their execution.
 */
public interface IAspectjCommand<ContextType> {
	
	public boolean execute(ContextType context);
}
