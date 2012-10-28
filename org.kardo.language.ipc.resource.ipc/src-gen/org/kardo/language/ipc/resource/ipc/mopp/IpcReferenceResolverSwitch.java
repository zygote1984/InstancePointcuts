/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

public class IpcReferenceResolverSwitch implements org.kardo.language.ipc.resource.ipc.IIpcReferenceResolverSwitch {
	
	/**
	 * This map stores a copy of the options the were set for loading the resource.
	 */
	private java.util.Map<Object, Object> options;
	
	protected org.kardo.language.ipc.resource.ipc.analysis.IdPatternIdReferenceResolver idPatternIdReferenceResolver = new org.kardo.language.ipc.resource.ipc.analysis.IdPatternIdReferenceResolver();
	protected org.kardo.language.ipc.resource.ipc.analysis.AdvicePcrefReferenceResolver advicePcrefReferenceResolver = new org.kardo.language.ipc.resource.ipc.analysis.AdvicePcrefReferenceResolver();
	protected org.kardo.language.ipc.resource.ipc.analysis.ClassifierImportClassifierReferenceResolver classifierImportClassifierReferenceResolver = new org.kardo.language.ipc.resource.ipc.analysis.ClassifierImportClassifierReferenceResolver();
	protected org.kardo.language.ipc.resource.ipc.analysis.StaticMemberImportStaticMembersReferenceResolver staticMemberImportStaticMembersReferenceResolver = new org.kardo.language.ipc.resource.ipc.analysis.StaticMemberImportStaticMembersReferenceResolver();
	protected org.kardo.language.ipc.resource.ipc.analysis.AnnotationInstanceAnnotationReferenceResolver annotationInstanceAnnotationReferenceResolver = new org.kardo.language.ipc.resource.ipc.analysis.AnnotationInstanceAnnotationReferenceResolver();
	protected org.kardo.language.ipc.resource.ipc.analysis.AnnotationAttributeSettingAttributeReferenceResolver annotationAttributeSettingAttributeReferenceResolver = new org.kardo.language.ipc.resource.ipc.analysis.AnnotationAttributeSettingAttributeReferenceResolver();
	protected org.kardo.language.ipc.resource.ipc.analysis.ClassifierReferenceTargetReferenceResolver classifierReferenceTargetReferenceResolver = new org.kardo.language.ipc.resource.ipc.analysis.ClassifierReferenceTargetReferenceResolver();
	protected org.kardo.language.ipc.resource.ipc.analysis.ElementReferenceTargetReferenceResolver elementReferenceTargetReferenceResolver = new org.kardo.language.ipc.resource.ipc.analysis.ElementReferenceTargetReferenceResolver();
	protected org.kardo.language.ipc.resource.ipc.analysis.JumpTargetReferenceResolver jumpTargetReferenceResolver = new org.kardo.language.ipc.resource.ipc.analysis.JumpTargetReferenceResolver();
	
	public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<org.kardo.language.aspectj.patterns.IdPattern, org.emftext.language.java.references.Reference> getIdPatternIdReferenceResolver() {
		return getResolverChain(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getIdPattern_Id(), idPatternIdReferenceResolver);
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<org.kardo.language.aspectj.advice.Advice, org.kardo.language.aspectj.pointcuts.AspectJPointcut> getAdvicePcrefReferenceResolver() {
		return getResolverChain(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAdvice_Pcref(), advicePcrefReferenceResolver);
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<org.emftext.language.java.imports.ClassifierImport, org.emftext.language.java.classifiers.ConcreteClassifier> getClassifierImportClassifierReferenceResolver() {
		return getResolverChain(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport_Classifier(), classifierImportClassifierReferenceResolver);
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<org.emftext.language.java.imports.StaticMemberImport, org.emftext.language.java.references.ReferenceableElement> getStaticMemberImportStaticMembersReferenceResolver() {
		return getResolverChain(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport_StaticMembers(), staticMemberImportStaticMembersReferenceResolver);
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<org.emftext.language.java.annotations.AnnotationInstance, org.emftext.language.java.classifiers.Classifier> getAnnotationInstanceAnnotationReferenceResolver() {
		return getResolverChain(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance_Annotation(), annotationInstanceAnnotationReferenceResolver);
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<org.emftext.language.java.annotations.AnnotationAttributeSetting, org.emftext.language.java.members.InterfaceMethod> getAnnotationAttributeSettingAttributeReferenceResolver() {
		return getResolverChain(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting_Attribute(), annotationAttributeSettingAttributeReferenceResolver);
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<org.emftext.language.java.types.ClassifierReference, org.emftext.language.java.classifiers.Classifier> getClassifierReferenceTargetReferenceResolver() {
		return getResolverChain(org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference_Target(), classifierReferenceTargetReferenceResolver);
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<org.emftext.language.java.references.ElementReference, org.emftext.language.java.references.ReferenceableElement> getElementReferenceTargetReferenceResolver() {
		return getResolverChain(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getElementReference_Target(), elementReferenceTargetReferenceResolver);
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<org.emftext.language.java.statements.Jump, org.emftext.language.java.statements.JumpLabel> getJumpTargetReferenceResolver() {
		return getResolverChain(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJump_Target(), jumpTargetReferenceResolver);
	}
	
	public void setOptions(java.util.Map<?, ?> options) {
		if (options != null) {
			this.options = new java.util.LinkedHashMap<Object, Object>();
			this.options.putAll(options);
		}
		idPatternIdReferenceResolver.setOptions(options);
		advicePcrefReferenceResolver.setOptions(options);
		classifierImportClassifierReferenceResolver.setOptions(options);
		staticMemberImportStaticMembersReferenceResolver.setOptions(options);
		annotationInstanceAnnotationReferenceResolver.setOptions(options);
		annotationAttributeSettingAttributeReferenceResolver.setOptions(options);
		classifierReferenceTargetReferenceResolver.setOptions(options);
		elementReferenceTargetReferenceResolver.setOptions(options);
		jumpTargetReferenceResolver.setOptions(options);
	}
	
	public void resolveFuzzy(String identifier, org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EReference reference, int position, org.kardo.language.ipc.resource.ipc.IIpcReferenceResolveResult<org.eclipse.emf.ecore.EObject> result) {
		if (container == null) {
			return;
		}
		if (org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getIdPattern().isInstance(container)) {
			IpcFuzzyResolveResult<org.emftext.language.java.references.Reference> frr = new IpcFuzzyResolveResult<org.emftext.language.java.references.Reference>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("id")) {
				idPatternIdReferenceResolver.resolve(identifier, (org.kardo.language.aspectj.patterns.IdPattern) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAdvice().isInstance(container)) {
			IpcFuzzyResolveResult<org.kardo.language.aspectj.pointcuts.AspectJPointcut> frr = new IpcFuzzyResolveResult<org.kardo.language.aspectj.pointcuts.AspectJPointcut>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("pcref")) {
				advicePcrefReferenceResolver.resolve(identifier, (org.kardo.language.aspectj.advice.Advice) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport().isInstance(container)) {
			IpcFuzzyResolveResult<org.emftext.language.java.classifiers.ConcreteClassifier> frr = new IpcFuzzyResolveResult<org.emftext.language.java.classifiers.ConcreteClassifier>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("classifier")) {
				classifierImportClassifierReferenceResolver.resolve(identifier, (org.emftext.language.java.imports.ClassifierImport) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport().isInstance(container)) {
			IpcFuzzyResolveResult<org.emftext.language.java.references.ReferenceableElement> frr = new IpcFuzzyResolveResult<org.emftext.language.java.references.ReferenceableElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("staticMembers")) {
				staticMemberImportStaticMembersReferenceResolver.resolve(identifier, (org.emftext.language.java.imports.StaticMemberImport) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance().isInstance(container)) {
			IpcFuzzyResolveResult<org.emftext.language.java.classifiers.Classifier> frr = new IpcFuzzyResolveResult<org.emftext.language.java.classifiers.Classifier>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("annotation")) {
				annotationInstanceAnnotationReferenceResolver.resolve(identifier, (org.emftext.language.java.annotations.AnnotationInstance) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting().isInstance(container)) {
			IpcFuzzyResolveResult<org.emftext.language.java.members.InterfaceMethod> frr = new IpcFuzzyResolveResult<org.emftext.language.java.members.InterfaceMethod>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("attribute")) {
				annotationAttributeSettingAttributeReferenceResolver.resolve(identifier, (org.emftext.language.java.annotations.AnnotationAttributeSetting) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference().isInstance(container)) {
			IpcFuzzyResolveResult<org.emftext.language.java.classifiers.Classifier> frr = new IpcFuzzyResolveResult<org.emftext.language.java.classifiers.Classifier>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				classifierReferenceTargetReferenceResolver.resolve(identifier, (org.emftext.language.java.types.ClassifierReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getElementReference().isInstance(container)) {
			IpcFuzzyResolveResult<org.emftext.language.java.references.ReferenceableElement> frr = new IpcFuzzyResolveResult<org.emftext.language.java.references.ReferenceableElement>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				elementReferenceTargetReferenceResolver.resolve(identifier, (org.emftext.language.java.references.ElementReference) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
		if (org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJump().isInstance(container)) {
			IpcFuzzyResolveResult<org.emftext.language.java.statements.JumpLabel> frr = new IpcFuzzyResolveResult<org.emftext.language.java.statements.JumpLabel>(result);
			String referenceName = reference.getName();
			org.eclipse.emf.ecore.EStructuralFeature feature = container.eClass().getEStructuralFeature(referenceName);
			if (feature != null && feature instanceof org.eclipse.emf.ecore.EReference && referenceName != null && referenceName.equals("target")) {
				jumpTargetReferenceResolver.resolve(identifier, (org.emftext.language.java.statements.Jump) container, (org.eclipse.emf.ecore.EReference) feature, position, true, frr);
			}
		}
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<? extends org.eclipse.emf.ecore.EObject, ? extends org.eclipse.emf.ecore.EObject> getResolver(org.eclipse.emf.ecore.EStructuralFeature reference) {
		if (reference == org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getIdPattern_Id()) {
			return getResolverChain(reference, idPatternIdReferenceResolver);
		}
		if (reference == org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAdvice_Pcref()) {
			return getResolverChain(reference, advicePcrefReferenceResolver);
		}
		if (reference == org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport_Classifier()) {
			return getResolverChain(reference, classifierImportClassifierReferenceResolver);
		}
		if (reference == org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport_StaticMembers()) {
			return getResolverChain(reference, staticMemberImportStaticMembersReferenceResolver);
		}
		if (reference == org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance_Annotation()) {
			return getResolverChain(reference, annotationInstanceAnnotationReferenceResolver);
		}
		if (reference == org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting_Attribute()) {
			return getResolverChain(reference, annotationAttributeSettingAttributeReferenceResolver);
		}
		if (reference == org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference_Target()) {
			return getResolverChain(reference, classifierReferenceTargetReferenceResolver);
		}
		if (reference == org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getElementReference_Target()) {
			return getResolverChain(reference, elementReferenceTargetReferenceResolver);
		}
		if (reference == org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJump_Target()) {
			return getResolverChain(reference, jumpTargetReferenceResolver);
		}
		return null;
	}
	
	@SuppressWarnings({"rawtypes", "unchecked"})	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<ContainerType, ReferenceType> getResolverChain(org.eclipse.emf.ecore.EStructuralFeature reference, org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver<ContainerType, ReferenceType> originalResolver) {
		if (options == null) {
			return originalResolver;
		}
		Object value = options.get(org.kardo.language.ipc.resource.ipc.IIpcOptions.ADDITIONAL_REFERENCE_RESOLVERS);
		if (value == null) {
			return originalResolver;
		}
		if (!(value instanceof java.util.Map)) {
			// send this to the error log
			new org.kardo.language.ipc.resource.ipc.util.IpcRuntimeUtil().logWarning("Found value with invalid type for option " + org.kardo.language.ipc.resource.ipc.IIpcOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + java.util.Map.class.getName() + ", but was " + value.getClass().getName() + ")", null);
			return originalResolver;
		}
		java.util.Map<?,?> resolverMap = (java.util.Map<?,?>) value;
		Object resolverValue = resolverMap.get(reference);
		if (resolverValue == null) {
			return originalResolver;
		}
		if (resolverValue instanceof org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver) {
			org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver replacingResolver = (org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver) resolverValue;
			if (replacingResolver instanceof org.kardo.language.ipc.resource.ipc.IIpcDelegatingReferenceResolver) {
				// pass original resolver to the replacing one
				((org.kardo.language.ipc.resource.ipc.IIpcDelegatingReferenceResolver) replacingResolver).setDelegate(originalResolver);
			}
			return replacingResolver;
		} else if (resolverValue instanceof java.util.Collection) {
			java.util.Collection replacingResolvers = (java.util.Collection) resolverValue;
			org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver replacingResolver = originalResolver;
			for (Object next : replacingResolvers) {
				if (next instanceof org.kardo.language.ipc.resource.ipc.IIpcReferenceCache) {
					org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver nextResolver = (org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver) next;
					if (nextResolver instanceof org.kardo.language.ipc.resource.ipc.IIpcDelegatingReferenceResolver) {
						// pass original resolver to the replacing one
						((org.kardo.language.ipc.resource.ipc.IIpcDelegatingReferenceResolver) nextResolver).setDelegate(replacingResolver);
					}
					replacingResolver = nextResolver;
				} else {
					// The collection contains a non-resolver. Send a warning to the error log.
					new org.kardo.language.ipc.resource.ipc.util.IpcRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.kardo.language.ipc.resource.ipc.IIpcOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.kardo.language.ipc.resource.ipc.IIpcDelegatingReferenceResolver.class.getName() + ", but was " + next.getClass().getName() + ")", null);
				}
			}
			return replacingResolver;
		} else {
			// The value for the option ADDITIONAL_REFERENCE_RESOLVERS has an unknown type.
			new org.kardo.language.ipc.resource.ipc.util.IpcRuntimeUtil().logWarning("Found value with invalid type in value map for option " + org.kardo.language.ipc.resource.ipc.IIpcOptions.ADDITIONAL_REFERENCE_RESOLVERS + " (expected " + org.kardo.language.ipc.resource.ipc.IIpcDelegatingReferenceResolver.class.getName() + ", but was " + resolverValue.getClass().getName() + ")", null);
			return originalResolver;
		}
	}
	
}
