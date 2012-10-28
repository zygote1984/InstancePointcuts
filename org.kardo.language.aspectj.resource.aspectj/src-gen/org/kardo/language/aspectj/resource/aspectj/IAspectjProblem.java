/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj;

public interface IAspectjProblem {
	public String getMessage();
	public org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity getSeverity();
	public org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType getType();
	public java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix> getQuickFixes();
}
