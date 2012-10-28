/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class IpcExpectedCsString extends org.kardo.language.ipc.resource.ipc.mopp.IpcAbstractExpectedElement {
	
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword keyword;
	
	public IpcExpectedCsString(org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof IpcExpectedCsString) {
			return getValue().equals(((IpcExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
