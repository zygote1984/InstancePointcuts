/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.util;

/**
 * Class AspectjTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.kardo.language.aspectj.resource.aspectj.util.AspectjResourceUtil.
 */
public class AspectjTextResourceUtil {
	
	/**
	 * Use
	 * org.kardo.language.aspectj.resource.aspectj.util.AspectjResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated	
	public static org.kardo.language.aspectj.resource.aspectj.mopp.AspectjResource getResource(org.eclipse.core.resources.IFile file) {
		return new org.kardo.language.aspectj.resource.aspectj.util.AspectjEclipseProxy().getResource(file);
	}
	
	/**
	 * Use
	 * org.kardo.language.aspectj.resource.aspectj.util.AspectjResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated	
	public static org.kardo.language.aspectj.resource.aspectj.mopp.AspectjResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.kardo.language.aspectj.resource.aspectj.util.AspectjResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use
	 * org.kardo.language.aspectj.resource.aspectj.util.AspectjResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated	
	public static org.kardo.language.aspectj.resource.aspectj.mopp.AspectjResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.kardo.language.aspectj.resource.aspectj.util.AspectjResourceUtil.getResource(uri);
	}
	
	/**
	 * Use
	 * org.kardo.language.aspectj.resource.aspectj.util.AspectjResourceUtil.getResource
	 * () instead.
	 */
	@Deprecated	
	public static org.kardo.language.aspectj.resource.aspectj.mopp.AspectjResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.kardo.language.aspectj.resource.aspectj.util.AspectjResourceUtil.getResource(uri, options);
	}
	
}
