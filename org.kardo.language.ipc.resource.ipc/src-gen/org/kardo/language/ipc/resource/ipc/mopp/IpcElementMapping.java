/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

/**
 * A basic implementation of the
 * org.kardo.language.ipc.resource.ipc.IIpcElementMapping interface.
 * 
 * @param <ReferenceType> the type of the reference that can be mapped to
 */
public class IpcElementMapping<ReferenceType> implements org.kardo.language.ipc.resource.ipc.IIpcElementMapping<ReferenceType> {
	
	private final ReferenceType target;
	private String identifier;
	private String warning;
	
	public IpcElementMapping(String identifier, ReferenceType target, String warning) {
		super();
		this.target = target;
		this.identifier = identifier;
		this.warning = warning;
	}
	
	public ReferenceType getTargetElement() {
		return target;
	}
	
	public String getIdentifier() {
		return identifier;
	}
	
	public String getWarning() {
		return warning;
	}
	
}
