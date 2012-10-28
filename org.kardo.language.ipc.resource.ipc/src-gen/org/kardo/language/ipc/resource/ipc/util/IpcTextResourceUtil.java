/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.util;

/**
 * Class IpcTextResourceUtil can be used to perform common tasks on text
 * resources, such as loading and saving resources, as well as, checking them for
 * errors. This class is deprecated and has been replaced by
 * org.kardo.language.ipc.resource.ipc.util.IpcResourceUtil.
 */
public class IpcTextResourceUtil {
	
	/**
	 * Use org.kardo.language.ipc.resource.ipc.util.IpcResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static org.kardo.language.ipc.resource.ipc.mopp.IpcResource getResource(org.eclipse.core.resources.IFile file) {
		return new org.kardo.language.ipc.resource.ipc.util.IpcEclipseProxy().getResource(file);
	}
	
	/**
	 * Use org.kardo.language.ipc.resource.ipc.util.IpcResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static org.kardo.language.ipc.resource.ipc.mopp.IpcResource getResource(java.io.File file, java.util.Map<?,?> options) {
		return org.kardo.language.ipc.resource.ipc.util.IpcResourceUtil.getResource(file, options);
	}
	
	/**
	 * Use org.kardo.language.ipc.resource.ipc.util.IpcResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static org.kardo.language.ipc.resource.ipc.mopp.IpcResource getResource(org.eclipse.emf.common.util.URI uri) {
		return org.kardo.language.ipc.resource.ipc.util.IpcResourceUtil.getResource(uri);
	}
	
	/**
	 * Use org.kardo.language.ipc.resource.ipc.util.IpcResourceUtil.getResource()
	 * instead.
	 */
	@Deprecated	
	public static org.kardo.language.ipc.resource.ipc.mopp.IpcResource getResource(org.eclipse.emf.common.util.URI uri, java.util.Map<?,?> options) {
		return org.kardo.language.ipc.resource.ipc.util.IpcResourceUtil.getResource(uri, options);
	}
	
}
