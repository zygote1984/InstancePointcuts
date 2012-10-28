/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

/**
 * A representation for a range in a document where a keyword (i.e., a static
 * string) is expected.
 */
public class AspectjExpectedCsString extends org.kardo.language.aspectj.resource.aspectj.mopp.AspectjAbstractExpectedElement {
	
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword keyword;
	
	public AspectjExpectedCsString(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword keyword) {
		super(keyword.getMetaclass());
		this.keyword = keyword;
	}
	
	public String getValue() {
		return keyword.getValue();
	}
	
	/**
	 * Returns the expected keyword.
	 */
	public org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement getSymtaxElement() {
		return keyword;
	}
	
	public java.util.Set<String> getTokenNames() {
		return java.util.Collections.singleton("'" + getValue() + "'");
	}
	
	public String toString() {
		return "CsString \"" + getValue() + "\"";
	}
	
	public boolean equals(Object o) {
		if (o instanceof AspectjExpectedCsString) {
			return getValue().equals(((AspectjExpectedCsString) o).getValue());
		}
		return false;
	}
	
	@Override	
	public int hashCode() {
		return getValue().hashCode();
	}
	
}
