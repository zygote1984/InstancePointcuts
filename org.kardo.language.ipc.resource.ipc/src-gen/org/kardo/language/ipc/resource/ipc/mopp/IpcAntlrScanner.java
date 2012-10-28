/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

public class IpcAntlrScanner implements org.kardo.language.ipc.resource.ipc.IIpcTextScanner {
	
	private org.antlr.runtime3_4_0.Lexer antlrLexer;
	
	public IpcAntlrScanner(org.antlr.runtime3_4_0.Lexer antlrLexer) {
		this.antlrLexer = antlrLexer;
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcTextToken getNextToken() {
		if (antlrLexer.getCharStream() == null) {
			return null;
		}
		final org.antlr.runtime3_4_0.Token current = antlrLexer.nextToken();
		if (current == null || current.getType() < 0) {
			return null;
		}
		org.kardo.language.ipc.resource.ipc.IIpcTextToken result = new org.kardo.language.ipc.resource.ipc.mopp.IpcANTLRTextToken(current);
		return result;
	}
	
	public void setText(String text) {
		antlrLexer.setCharStream(new org.antlr.runtime3_4_0.ANTLRStringStream(text));
	}
	
}
