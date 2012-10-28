/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

/**
 * A factory for ContextDependentURIFragments. Given a feasible reference
 * resolver, this factory returns a matching fragment that used the resolver to
 * resolver proxy objects.
 * 
 * @param <ContainerType> the type of the class containing the reference to be
 * resolved
 * @param <ReferenceType> the type of the reference to be resolved
 */
public class AspectjContextDependentURIFragmentFactory<ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject>  implements org.kardo.language.aspectj.resource.aspectj.IAspectjContextDependentURIFragmentFactory<ContainerType, ReferenceType> {
	
	private final org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolver<ContainerType, ReferenceType> resolver;
	
	public AspectjContextDependentURIFragmentFactory(org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolver<ContainerType, ReferenceType> resolver) {
		this.resolver = resolver;
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjContextDependentURIFragment<?> create(String identifier, ContainerType container, org.eclipse.emf.ecore.EReference reference, int positionInReference, org.eclipse.emf.ecore.EObject proxy) {
		
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjContextDependentURIFragment<ContainerType, ReferenceType>(identifier, container, reference, positionInReference, proxy) {
			public org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolver<ContainerType, ReferenceType> getResolver() {
				return resolver;
			}
		};
	}
}
