/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

public class IpcBracketInformationProvider {
	
	public class BracketPair implements org.kardo.language.ipc.resource.ipc.IIpcBracketPair {
		
		private String opening;
		private String closing;
		private boolean closingEnabledInside;
		
		public BracketPair(String opening, String closing, boolean closingEnabledInside) {
			super();
			this.opening = opening;
			this.closing = closing;
			this.closingEnabledInside = closingEnabledInside;
		}
		
		public String getOpeningBracket() {
			return opening;
		}
		
		public String getClosingBracket() {
			return closing;
		}
		
		public boolean isClosingEnabledInside() {
			return closingEnabledInside;
		}
	}
	
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcBracketPair> getBracketPairs() {
		java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcBracketPair> result = new java.util.ArrayList<org.kardo.language.ipc.resource.ipc.IIpcBracketPair>();
		result.add(new BracketPair("<", ">", true));
		result.add(new BracketPair("(", ")", true));
		result.add(new BracketPair("{", "}", true));
		result.add(new BracketPair("[", "]", true));
		return result;
	}
	
}
