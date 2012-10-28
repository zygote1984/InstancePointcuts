/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

public class AspectjAntlrScanner implements org.kardo.language.aspectj.resource.aspectj.IAspectjTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public AspectjAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.kardo.language.aspectj.resource.aspectj.IAspectjTextToken result = new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
