/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc;

public interface IIpcProblem {
	public String getMessage();
	public org.kardo.language.ipc.resource.ipc.IpcEProblemSeverity getSeverity();
	public org.kardo.language.ipc.resource.ipc.IpcEProblemType getType();
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcQuickFix> getQuickFixes();
}
