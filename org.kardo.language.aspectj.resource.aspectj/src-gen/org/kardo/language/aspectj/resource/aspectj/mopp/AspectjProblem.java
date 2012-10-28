/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

public class AspectjProblem implements org.kardo.language.aspectj.resource.aspectj.IAspectjProblem {
	
	private String message;
	private org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType type;
	private org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity severity;
	private java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix> quickFixes;
	
	public AspectjProblem(String message, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType type, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity severity) {
		this(message, type, severity, java.util.Collections.<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix>emptySet());
	}
	
	public AspectjProblem(String message, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType type, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity severity, org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix quickFix) {
		this(message, type, severity, java.util.Collections.singleton(quickFix));
	}
	
	public AspectjProblem(String message, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType type, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity severity, java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix> quickFixes) {
		super();
		this.message = message;
		this.type = type;
		this.severity = severity;
		this.quickFixes = new java.util.LinkedHashSet<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix>();
		this.quickFixes.addAll(quickFixes);
	}
	
	public org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType getType() {
		return type;
	}
	
	public org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity getSeverity() {
		return severity;
	}
	
	public String getMessage() {
		return message;
	}
	
	public java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix> getQuickFixes() {
		return quickFixes;
	}
	
}
