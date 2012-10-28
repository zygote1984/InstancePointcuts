/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

public class IpcProblem implements org.kardo.language.ipc.resource.ipc.IIpcProblem {
	
	private String message;
	private org.kardo.language.ipc.resource.ipc.IpcEProblemType type;
	private org.kardo.language.ipc.resource.ipc.IpcEProblemSeverity severity;
	private java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcQuickFix> quickFixes;
	
	public IpcProblem(String message, org.kardo.language.ipc.resource.ipc.IpcEProblemType type, org.kardo.language.ipc.resource.ipc.IpcEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.kardo.language.ipc.resource.ipc.IIpcQuickFix>emptySet());
	}
	
	public IpcProblem(String message, org.kardo.language.ipc.resource.ipc.IpcEProblemType type, org.kardo.language.ipc.resource.ipc.IpcEProblemSeverity severity, org.kardo.language.ipc.resource.ipc.IIpcQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public IpcProblem(String message, org.kardo.language.ipc.resource.ipc.IpcEProblemType type, org.kardo.language.ipc.resource.ipc.IpcEProblemSeverity severity, java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.kardo.language.ipc.resource.ipc.IIpcQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.kardo.language.ipc.resource.ipc.IpcEProblemType getType() {
		return type;
	}
	
	public org.kardo.language.ipc.resource.ipc.IpcEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
