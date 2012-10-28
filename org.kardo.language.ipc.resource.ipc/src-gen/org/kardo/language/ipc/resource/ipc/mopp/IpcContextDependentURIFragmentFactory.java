/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class IpcContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements org.kardo.language.ipc.resource.ipc.IIpcContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public IpcContextDependentURIFragmentFactory(org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
