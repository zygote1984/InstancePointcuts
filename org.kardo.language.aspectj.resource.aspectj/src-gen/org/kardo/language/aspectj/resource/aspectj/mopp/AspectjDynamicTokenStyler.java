/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

public class AspectjDynamicTokenStyler {
	
	/**
	 * This method is called to dynamically style tokens.
	 * 
	 * @param resource the TextResource that contains the token
	 * @param token the token to obtain a style for
	 * @param staticStyle the token style as set in the editor preferences (is
	 * <code>null</code> if syntax highlighting for the token is disabled)
	 */
	public org.kardo.language.aspectj.resource.aspectj.IAspectjTokenStyle getDynamicTokenStyle(org.kardo.language.aspectj.resource.aspectj.IAspectjTextResource resource, org.kardo.language.aspectj.resource.aspectj.IAspectjTextToken token, org.kardo.language.aspectj.resource.aspectj.IAspectjTokenStyle staticStyle) {
		// The default implementation returns the static style without any changes. To
		// implement dynamic token styling, set the overrideDynamicTokenStyler option to
		// <code>false</code> and customize this method.
		return staticStyle;
	}
	
}
