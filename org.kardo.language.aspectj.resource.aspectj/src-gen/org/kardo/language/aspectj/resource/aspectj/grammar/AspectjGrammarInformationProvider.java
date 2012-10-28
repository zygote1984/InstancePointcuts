/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.grammar;

public class AspectjGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static AspectjGrammarInformationProvider INSTANCE = new AspectjGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_0_0_0_0_0_0_0 = INSTANCE.getASPECTJ_0_0_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_0_0_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("package", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder ASPECTJ_0_0_0_0_0_0_1 = INSTANCE.getASPECTJ_0_0_0_0_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getASPECTJ_0_0_0_0_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectJCompilationUnit().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT_JCOMPILATION_UNIT__NAMESPACES), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_0_0_0_0_0_0_2_0_0_0 = INSTANCE.getASPECTJ_0_0_0_0_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_0_0_0_0_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder ASPECTJ_0_0_0_0_0_0_2_0_0_1 = INSTANCE.getASPECTJ_0_0_0_0_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getASPECTJ_0_0_0_0_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectJCompilationUnit().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT_JCOMPILATION_UNIT__NAMESPACES), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_0_0_0_0_0_0_2_0_0 = INSTANCE.getASPECTJ_0_0_0_0_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_0_0_0_0_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_0_0_0_2_0_0_0, ASPECTJ_0_0_0_0_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_0_0_0_0_0_0_2_0 = INSTANCE.getASPECTJ_0_0_0_0_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_0_0_0_0_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_0_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_0_0_0_0_0_0_2 = INSTANCE.getASPECTJ_0_0_0_0_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_0_0_0_0_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_0_0_0_0_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_0_0_0_0_0_0_3 = INSTANCE.getASPECTJ_0_0_0_0_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_0_0_0_0_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_0_0_0_0_0_0 = INSTANCE.getASPECTJ_0_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_0_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_0_0_0_0, ASPECTJ_0_0_0_0_0_0_1, ASPECTJ_0_0_0_0_0_0_2, ASPECTJ_0_0_0_0_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_0_0_0_0_0 = INSTANCE.getASPECTJ_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_0_0_0_0 = INSTANCE.getASPECTJ_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_0_0_0_0_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak ASPECTJ_0_0_0_1 = INSTANCE.getASPECTJ_0_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getASPECTJ_0_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak ASPECTJ_0_0_0_2 = INSTANCE.getASPECTJ_0_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getASPECTJ_0_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_0_0_0_3_0_0_0 = INSTANCE.getASPECTJ_0_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_0_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectJCompilationUnit().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT_JCOMPILATION_UNIT__IMPORTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getImport(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak ASPECTJ_0_0_0_3_0_0_1 = INSTANCE.getASPECTJ_0_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getASPECTJ_0_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_0_0_0_3_0_0 = INSTANCE.getASPECTJ_0_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_0_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_3_0_0_0, ASPECTJ_0_0_0_3_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_0_0_0_3_0 = INSTANCE.getASPECTJ_0_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_0_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_0_0_0_3 = INSTANCE.getASPECTJ_0_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_0_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_0_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_0_0_0_4_0_0_0 = INSTANCE.getASPECTJ_0_0_0_4_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_0_0_0_4_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak ASPECTJ_0_0_0_4_0_0_1 = INSTANCE.getASPECTJ_0_0_0_4_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getASPECTJ_0_0_0_4_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_0_0_0_4_0_0 = INSTANCE.getASPECTJ_0_0_0_4_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_0_0_0_4_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_4_0_0_0, ASPECTJ_0_0_0_4_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_0_0_0_4_0 = INSTANCE.getASPECTJ_0_0_0_4_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_0_0_0_4_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_4_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_0_0_0_4 = INSTANCE.getASPECTJ_0_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_0_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_0_0_0_4_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak ASPECTJ_0_0_0_5 = INSTANCE.getASPECTJ_0_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getASPECTJ_0_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_0_0_0_6_0_0_0 = INSTANCE.getASPECTJ_0_0_0_6_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_0_0_0_6_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectJCompilationUnit().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT_JCOMPILATION_UNIT__CLASSIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_0_0_0_6_0_0_1_0_0_0 = INSTANCE.getASPECTJ_0_0_0_6_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_0_0_0_6_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_0_0_0_6_0_0_1_0_0 = INSTANCE.getASPECTJ_0_0_0_6_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_0_0_0_6_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_6_0_0_1_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_0_0_0_6_0_0_1_0 = INSTANCE.getASPECTJ_0_0_0_6_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_0_0_0_6_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_6_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_0_0_0_6_0_0_1 = INSTANCE.getASPECTJ_0_0_0_6_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_0_0_0_6_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_0_0_0_6_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak ASPECTJ_0_0_0_6_0_0_2 = INSTANCE.getASPECTJ_0_0_0_6_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getASPECTJ_0_0_0_6_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak ASPECTJ_0_0_0_6_0_0_3 = INSTANCE.getASPECTJ_0_0_0_6_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getASPECTJ_0_0_0_6_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_0_0_0_6_0_0 = INSTANCE.getASPECTJ_0_0_0_6_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_0_0_0_6_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_6_0_0_0, ASPECTJ_0_0_0_6_0_0_1, ASPECTJ_0_0_0_6_0_0_2, ASPECTJ_0_0_0_6_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_0_0_0_6_0 = INSTANCE.getASPECTJ_0_0_0_6_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_0_0_0_6_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_6_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_0_0_0_6 = INSTANCE.getASPECTJ_0_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_0_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_0_0_0_6_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.PLUS);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_0_0_0 = INSTANCE.getASPECTJ_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0_0, ASPECTJ_0_0_0_1, ASPECTJ_0_0_0_2, ASPECTJ_0_0_0_3, ASPECTJ_0_0_0_4, ASPECTJ_0_0_0_5, ASPECTJ_0_0_0_6);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_0_0 = INSTANCE.getASPECTJ_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_0 = INSTANCE.getASPECTJ_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectJCompilationUnit(), ASPECTJ_0_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjBooleanTerminal ASPECTJ_1_0_0_0 = INSTANCE.getASPECTJ_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjBooleanTerminal getASPECTJ_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjBooleanTerminal(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__PRIVILIGED), "privileged", "", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_1_0_0_1 = INSTANCE.getASPECTJ_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_1_0_0_2 = INSTANCE.getASPECTJ_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("aspect", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder ASPECTJ_1_0_0_3 = INSTANCE.getASPECTJ_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getASPECTJ_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_1_0_0_4_0_0_0 = INSTANCE.getASPECTJ_1_0_0_4_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_1_0_0_4_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("extends", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_1_0_0_4_0_0_1 = INSTANCE.getASPECTJ_1_0_0_4_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_1_0_0_4_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__EXTEND), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_1_0_0_4_0_0 = INSTANCE.getASPECTJ_1_0_0_4_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_1_0_0_4_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_1_0_0_4_0_0_0, ASPECTJ_1_0_0_4_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_1_0_0_4_0 = INSTANCE.getASPECTJ_1_0_0_4_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_1_0_0_4_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_1_0_0_4_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_1_0_0_4 = INSTANCE.getASPECTJ_1_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_1_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_1_0_0_4_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_1_0_0_5_0_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_1_0_0_5_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("implements", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_1_0_0_5_0_0_1_0_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_1_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__IMPLEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_1 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__IMPLEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_0, ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_1_0_0_5_0_0_1_0_0_1_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_1_0_0_5_0_0_1_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_1_0_0_5_0_0_1_0_0_1 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_1_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_1_0_0_5_0_0_1_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_1_0_0_5_0_0_1_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_1_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_1_0_0_5_0_0_1_0_0_0, ASPECTJ_1_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_1_0_0_5_0_0_1_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_1_0_0_5_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_1_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_1_0_0_5_0_0_1 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_1_0_0_5_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_1_0_0_5_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_1_0_0_5_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_1_0_0_5_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_1_0_0_5_0_0_0, ASPECTJ_1_0_0_5_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_1_0_0_5_0 = INSTANCE.getASPECTJ_1_0_0_5_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_1_0_0_5_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_1_0_0_5_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_1_0_0_5 = INSTANCE.getASPECTJ_1_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_1_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_1_0_0_5_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_1_0_0_6 = INSTANCE.getASPECTJ_1_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_1_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak ASPECTJ_1_0_0_7 = INSTANCE.getASPECTJ_1_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getASPECTJ_1_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_1_0_0_8 = INSTANCE.getASPECTJ_1_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_1_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__MEMBERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectMember(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_1_0_0_9 = INSTANCE.getASPECTJ_1_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_1_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_1_0_0 = INSTANCE.getASPECTJ_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_1_0_0_0, ASPECTJ_1_0_0_1, ASPECTJ_1_0_0_2, ASPECTJ_1_0_0_3, ASPECTJ_1_0_0_4, ASPECTJ_1_0_0_5, ASPECTJ_1_0_0_6, ASPECTJ_1_0_0_7, ASPECTJ_1_0_0_8, ASPECTJ_1_0_0_9);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_1_0 = INSTANCE.getASPECTJ_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_1 = INSTANCE.getASPECTJ_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect(), ASPECTJ_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_2_0_0_0 = INSTANCE.getASPECTJ_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("call", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_2_0_0_1 = INSTANCE.getASPECTJ_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_2_0_0_2 = INSTANCE.getASPECTJ_2_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_2_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_2_0_0_3 = INSTANCE.getASPECTJ_2_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_2_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getCallPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.CALL_POINTCUT__PATTERN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getAbstractMethodPattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_2_0_0_4 = INSTANCE.getASPECTJ_2_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_2_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_2_0_0 = INSTANCE.getASPECTJ_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_2_0_0_0, ASPECTJ_2_0_0_1, ASPECTJ_2_0_0_2, ASPECTJ_2_0_0_3, ASPECTJ_2_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_2_0 = INSTANCE.getASPECTJ_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_2 = INSTANCE.getASPECTJ_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getCallPointcut(), ASPECTJ_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_3_0_0_0 = INSTANCE.getASPECTJ_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("execution", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_3_0_0_1 = INSTANCE.getASPECTJ_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_3_0_0_2 = INSTANCE.getASPECTJ_3_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_3_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_3_0_0_3 = INSTANCE.getASPECTJ_3_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_3_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getExecutionPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.EXECUTION_POINTCUT__PATTERN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getAbstractMethodPattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_3_0_0_4 = INSTANCE.getASPECTJ_3_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_3_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_3_0_0 = INSTANCE.getASPECTJ_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_3_0_0_0, ASPECTJ_3_0_0_1, ASPECTJ_3_0_0_2, ASPECTJ_3_0_0_3, ASPECTJ_3_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_3_0 = INSTANCE.getASPECTJ_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_3 = INSTANCE.getASPECTJ_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getExecutionPointcut(), ASPECTJ_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_4_0_0_0 = INSTANCE.getASPECTJ_4_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_4_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("get", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_4_0_0_1 = INSTANCE.getASPECTJ_4_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_4_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_4_0_0_2 = INSTANCE.getASPECTJ_4_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_4_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_4_0_0_3 = INSTANCE.getASPECTJ_4_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_4_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getGetPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.GET_POINTCUT__PATTERN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_4_0_0_4 = INSTANCE.getASPECTJ_4_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_4_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_4_0_0 = INSTANCE.getASPECTJ_4_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_4_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_4_0_0_0, ASPECTJ_4_0_0_1, ASPECTJ_4_0_0_2, ASPECTJ_4_0_0_3, ASPECTJ_4_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_4_0 = INSTANCE.getASPECTJ_4_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_4_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_4_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_4 = INSTANCE.getASPECTJ_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getGetPointcut(), ASPECTJ_4_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_5_0_0_0 = INSTANCE.getASPECTJ_5_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_5_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("set", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_5_0_0_1 = INSTANCE.getASPECTJ_5_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_5_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_5_0_0_2 = INSTANCE.getASPECTJ_5_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_5_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_5_0_0_3 = INSTANCE.getASPECTJ_5_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_5_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getSetPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.SET_POINTCUT__PATTERN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_5_0_0_4 = INSTANCE.getASPECTJ_5_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_5_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_5_0_0 = INSTANCE.getASPECTJ_5_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_5_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_5_0_0_0, ASPECTJ_5_0_0_1, ASPECTJ_5_0_0_2, ASPECTJ_5_0_0_3, ASPECTJ_5_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_5_0 = INSTANCE.getASPECTJ_5_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_5_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_5_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_5 = INSTANCE.getASPECTJ_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getSetPointcut(), ASPECTJ_5_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_6_0_0_0 = INSTANCE.getASPECTJ_6_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_6_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("this", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_6_0_0_1 = INSTANCE.getASPECTJ_6_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_6_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_6_0_0_2 = INSTANCE.getASPECTJ_6_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_6_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_6_0_0_3 = INSTANCE.getASPECTJ_6_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_6_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getThisPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.THIS_POINTCUT__PATTERN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypeOrIdPattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_6_0_0_4 = INSTANCE.getASPECTJ_6_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_6_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_6_0_0 = INSTANCE.getASPECTJ_6_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_6_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_6_0_0_0, ASPECTJ_6_0_0_1, ASPECTJ_6_0_0_2, ASPECTJ_6_0_0_3, ASPECTJ_6_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_6_0 = INSTANCE.getASPECTJ_6_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_6_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_6_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_6 = INSTANCE.getASPECTJ_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getThisPointcut(), ASPECTJ_6_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_7_0_0_0 = INSTANCE.getASPECTJ_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("args", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_7_0_0_1 = INSTANCE.getASPECTJ_7_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_7_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_7_0_0_2 = INSTANCE.getASPECTJ_7_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_7_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_7_0_0_3 = INSTANCE.getASPECTJ_7_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_7_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getArgsPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ARGS_POINTCUT__PATTERN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypeOrIdPattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_7_0_0_4 = INSTANCE.getASPECTJ_7_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_7_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_7_0_0 = INSTANCE.getASPECTJ_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_7_0_0_0, ASPECTJ_7_0_0_1, ASPECTJ_7_0_0_2, ASPECTJ_7_0_0_3, ASPECTJ_7_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_7_0 = INSTANCE.getASPECTJ_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_7 = INSTANCE.getASPECTJ_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getArgsPointcut(), ASPECTJ_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_8_0_0_0 = INSTANCE.getASPECTJ_8_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_8_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("within", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_8_0_0_1 = INSTANCE.getASPECTJ_8_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_8_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_8_0_0_2 = INSTANCE.getASPECTJ_8_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_8_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_8_0_0_3 = INSTANCE.getASPECTJ_8_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_8_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getWithinPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.WITHIN_POINTCUT__PATTERN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getIdPattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_8_0_0_4 = INSTANCE.getASPECTJ_8_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_8_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_8_0_0 = INSTANCE.getASPECTJ_8_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_8_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_8_0_0_0, ASPECTJ_8_0_0_1, ASPECTJ_8_0_0_2, ASPECTJ_8_0_0_3, ASPECTJ_8_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_8_0 = INSTANCE.getASPECTJ_8_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_8_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_8_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_8 = INSTANCE.getASPECTJ_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getWithinPointcut(), ASPECTJ_8_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_9_0_0_0 = INSTANCE.getASPECTJ_9_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_9_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("target", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_9_0_0_1 = INSTANCE.getASPECTJ_9_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_9_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_9_0_0_2 = INSTANCE.getASPECTJ_9_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_9_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_9_0_0_3 = INSTANCE.getASPECTJ_9_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_9_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getTargetPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.TARGET_POINTCUT__PATTERN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypeOrIdPattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_9_0_0_4 = INSTANCE.getASPECTJ_9_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_9_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_9_0_0 = INSTANCE.getASPECTJ_9_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_9_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_9_0_0_0, ASPECTJ_9_0_0_1, ASPECTJ_9_0_0_2, ASPECTJ_9_0_0_3, ASPECTJ_9_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_9_0 = INSTANCE.getASPECTJ_9_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_9_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_9_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_9 = INSTANCE.getASPECTJ_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getTargetPointcut(), ASPECTJ_9_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_10_0_0_0 = INSTANCE.getASPECTJ_10_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_10_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("if", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_10_0_0_1 = INSTANCE.getASPECTJ_10_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_10_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_10_0_0_2 = INSTANCE.getASPECTJ_10_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_10_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_10_0_0_3 = INSTANCE.getASPECTJ_10_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_10_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getIfPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.IF_POINTCUT__PATTERN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConditionalExprPattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_10_0_0_4 = INSTANCE.getASPECTJ_10_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_10_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_10_0_0 = INSTANCE.getASPECTJ_10_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_10_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_10_0_0_0, ASPECTJ_10_0_0_1, ASPECTJ_10_0_0_2, ASPECTJ_10_0_0_3, ASPECTJ_10_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_10_0 = INSTANCE.getASPECTJ_10_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_10_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_10_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_10 = INSTANCE.getASPECTJ_10();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_10() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getIfPointcut(), ASPECTJ_10_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_11_0_0_0 = INSTANCE.getASPECTJ_11_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_11_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("returning", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_11_0_0_1 = INSTANCE.getASPECTJ_11_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_11_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_11_0_0_2 = INSTANCE.getASPECTJ_11_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_11_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getReturningPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.RETURNING_POINTCUT__PATTERN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getIdPattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_11_0_0_3 = INSTANCE.getASPECTJ_11_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_11_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_11_0_0 = INSTANCE.getASPECTJ_11_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_11_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_11_0_0_0, ASPECTJ_11_0_0_1, ASPECTJ_11_0_0_2, ASPECTJ_11_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_11_0 = INSTANCE.getASPECTJ_11_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_11_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_11_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_11 = INSTANCE.getASPECTJ_11();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_11() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getReturningPointcut(), ASPECTJ_11_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_12_0_0_0 = INSTANCE.getASPECTJ_12_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_12_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__ABSTRACT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAbstract(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_12_0_0_1 = INSTANCE.getASPECTJ_12_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_12_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("pointcut", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder ASPECTJ_12_0_0_2 = INSTANCE.getASPECTJ_12_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getASPECTJ_12_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_12_0_0_3 = INSTANCE.getASPECTJ_12_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_12_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_12_0_0_4 = INSTANCE.getASPECTJ_12_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_12_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_12_0_0_5 = INSTANCE.getASPECTJ_12_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_12_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_12_0_0_6_0_0_0 = INSTANCE.getASPECTJ_12_0_0_6_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_12_0_0_6_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_12_0_0_6_0_0_1_0_0_0 = INSTANCE.getASPECTJ_12_0_0_6_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_12_0_0_6_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_12_0_0_6_0_0_1_0_0_1 = INSTANCE.getASPECTJ_12_0_0_6_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_12_0_0_6_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_12_0_0_6_0_0_1_0_0 = INSTANCE.getASPECTJ_12_0_0_6_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_12_0_0_6_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_12_0_0_6_0_0_1_0_0_0, ASPECTJ_12_0_0_6_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_12_0_0_6_0_0_1_0 = INSTANCE.getASPECTJ_12_0_0_6_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_12_0_0_6_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_12_0_0_6_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_12_0_0_6_0_0_1 = INSTANCE.getASPECTJ_12_0_0_6_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_12_0_0_6_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_12_0_0_6_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_12_0_0_6_0_0 = INSTANCE.getASPECTJ_12_0_0_6_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_12_0_0_6_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_12_0_0_6_0_0_0, ASPECTJ_12_0_0_6_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_12_0_0_6_0 = INSTANCE.getASPECTJ_12_0_0_6_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_12_0_0_6_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_12_0_0_6_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_12_0_0_6 = INSTANCE.getASPECTJ_12_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_12_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_12_0_0_6_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_12_0_0_7 = INSTANCE.getASPECTJ_12_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_12_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_12_0_0_8 = INSTANCE.getASPECTJ_12_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_12_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_12_0_0_9_0_0_0 = INSTANCE.getASPECTJ_12_0_0_9_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_12_0_0_9_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__ASSIGN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPcAssignmentOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_12_0_0_9_0_0_1 = INSTANCE.getASPECTJ_12_0_0_9_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_12_0_0_9_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__EXP), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_12_0_0_9_0_0 = INSTANCE.getASPECTJ_12_0_0_9_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_12_0_0_9_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_12_0_0_9_0_0_0, ASPECTJ_12_0_0_9_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_12_0_0_9_0 = INSTANCE.getASPECTJ_12_0_0_9_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_12_0_0_9_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_12_0_0_9_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_12_0_0_9 = INSTANCE.getASPECTJ_12_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_12_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_12_0_0_9_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_12_0_0_10 = INSTANCE.getASPECTJ_12_0_0_10();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_12_0_0_10() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_12_0_0 = INSTANCE.getASPECTJ_12_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_12_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_12_0_0_0, ASPECTJ_12_0_0_1, ASPECTJ_12_0_0_2, ASPECTJ_12_0_0_3, ASPECTJ_12_0_0_4, ASPECTJ_12_0_0_5, ASPECTJ_12_0_0_6, ASPECTJ_12_0_0_7, ASPECTJ_12_0_0_8, ASPECTJ_12_0_0_9, ASPECTJ_12_0_0_10);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_12_0 = INSTANCE.getASPECTJ_12_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_12_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_12_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_12 = INSTANCE.getASPECTJ_12();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_12() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut(), ASPECTJ_12_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_13_0_0_0 = INSTANCE.getASPECTJ_13_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_13_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConditionalExprPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONDITIONAL_EXPR_PATTERN__EXPR), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_13_0_0 = INSTANCE.getASPECTJ_13_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_13_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_13_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_13_0 = INSTANCE.getASPECTJ_13_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_13_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_13_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_13 = INSTANCE.getASPECTJ_13();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_13() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConditionalExprPattern(), ASPECTJ_13_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_14_0_0_0 = INSTANCE.getASPECTJ_14_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_14_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.FIELD_PATTERN__MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_14_0_0_1 = INSTANCE.getASPECTJ_14_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_14_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.FIELD_PATTERN__FIELD_TYPE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_14_0_0_2 = INSTANCE.getASPECTJ_14_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_14_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.FIELD_PATTERN__DECLARING_TYPE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_14_0_0_3 = INSTANCE.getASPECTJ_14_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_14_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder ASPECTJ_14_0_0_4 = INSTANCE.getASPECTJ_14_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getASPECTJ_14_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.FIELD_PATTERN__FIELDNAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_14_0_0 = INSTANCE.getASPECTJ_14_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_14_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_14_0_0_0, ASPECTJ_14_0_0_1, ASPECTJ_14_0_0_2, ASPECTJ_14_0_0_3, ASPECTJ_14_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_14_0 = INSTANCE.getASPECTJ_14_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_14_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_14_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_14 = INSTANCE.getASPECTJ_14();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_14() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern(), ASPECTJ_14_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_15_0_0_0 = INSTANCE.getASPECTJ_15_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_15_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConstructorPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_15_0_0_1 = INSTANCE.getASPECTJ_15_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_15_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConstructorPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__DECLARING_TYPE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_15_0_0_2 = INSTANCE.getASPECTJ_15_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_15_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_15_0_0_3 = INSTANCE.getASPECTJ_15_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_15_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("->", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_15_0_0_4 = INSTANCE.getASPECTJ_15_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_15_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_15_0_0_5 = INSTANCE.getASPECTJ_15_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_15_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("new", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_15_0_0_6 = INSTANCE.getASPECTJ_15_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_15_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_15_0_0_7 = INSTANCE.getASPECTJ_15_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_15_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_15_0_0_8 = INSTANCE.getASPECTJ_15_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_15_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConstructorPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getWildcardOrTypePattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_15_0_0_9_0_0_0 = INSTANCE.getASPECTJ_15_0_0_9_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_15_0_0_9_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_15_0_0_9_0_0_1 = INSTANCE.getASPECTJ_15_0_0_9_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_15_0_0_9_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConstructorPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getWildcardOrTypePattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_15_0_0_9_0_0 = INSTANCE.getASPECTJ_15_0_0_9_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_15_0_0_9_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_15_0_0_9_0_0_0, ASPECTJ_15_0_0_9_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_15_0_0_9_0 = INSTANCE.getASPECTJ_15_0_0_9_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_15_0_0_9_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_15_0_0_9_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_15_0_0_9 = INSTANCE.getASPECTJ_15_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_15_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_15_0_0_9_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_15_0_0_10 = INSTANCE.getASPECTJ_15_0_0_10();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_15_0_0_10() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_15_0_0 = INSTANCE.getASPECTJ_15_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_15_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_15_0_0_0, ASPECTJ_15_0_0_1, ASPECTJ_15_0_0_2, ASPECTJ_15_0_0_3, ASPECTJ_15_0_0_4, ASPECTJ_15_0_0_5, ASPECTJ_15_0_0_6, ASPECTJ_15_0_0_7, ASPECTJ_15_0_0_8, ASPECTJ_15_0_0_9, ASPECTJ_15_0_0_10);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_15_0 = INSTANCE.getASPECTJ_15_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_15_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_15_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_15 = INSTANCE.getASPECTJ_15();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_15() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConstructorPattern(), ASPECTJ_15_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_16_0_0_0 = INSTANCE.getASPECTJ_16_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_16_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_16_0_0_1 = INSTANCE.getASPECTJ_16_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_16_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__RETURN_TYPE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_16_0_0_2 = INSTANCE.getASPECTJ_16_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_16_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__DECLARING_TYPE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_16_0_0_3 = INSTANCE.getASPECTJ_16_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_16_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_16_0_0_4 = INSTANCE.getASPECTJ_16_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_16_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("->", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_16_0_0_5 = INSTANCE.getASPECTJ_16_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_16_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_16_0_0_6 = INSTANCE.getASPECTJ_16_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_16_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__METHODNAME), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getStringReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_16_0_0_7 = INSTANCE.getASPECTJ_16_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_16_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_16_0_0_8 = INSTANCE.getASPECTJ_16_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_16_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_16_0_0_9 = INSTANCE.getASPECTJ_16_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_16_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getWildcardOrTypePattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_16_0_0_10_0_0_0 = INSTANCE.getASPECTJ_16_0_0_10_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_16_0_0_10_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_16_0_0_10_0_0_1 = INSTANCE.getASPECTJ_16_0_0_10_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_16_0_0_10_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getWildcardOrTypePattern(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_16_0_0_10_0_0 = INSTANCE.getASPECTJ_16_0_0_10_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_16_0_0_10_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_16_0_0_10_0_0_0, ASPECTJ_16_0_0_10_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_16_0_0_10_0 = INSTANCE.getASPECTJ_16_0_0_10_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_16_0_0_10_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_16_0_0_10_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_16_0_0_10 = INSTANCE.getASPECTJ_16_0_0_10();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_16_0_0_10() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_16_0_0_10_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_16_0_0_11 = INSTANCE.getASPECTJ_16_0_0_11();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_16_0_0_11() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_16_0_0 = INSTANCE.getASPECTJ_16_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_16_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_16_0_0_0, ASPECTJ_16_0_0_1, ASPECTJ_16_0_0_2, ASPECTJ_16_0_0_3, ASPECTJ_16_0_0_4, ASPECTJ_16_0_0_5, ASPECTJ_16_0_0_6, ASPECTJ_16_0_0_7, ASPECTJ_16_0_0_8, ASPECTJ_16_0_0_9, ASPECTJ_16_0_0_10, ASPECTJ_16_0_0_11);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_16_0 = INSTANCE.getASPECTJ_16_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_16_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_16_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_16 = INSTANCE.getASPECTJ_16();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_16() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern(), ASPECTJ_16_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_17_0_0_0 = INSTANCE.getASPECTJ_17_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_17_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.TYPE_PATTERN__TYPE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace ASPECTJ_17_0_0_1 = INSTANCE.getASPECTJ_17_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getASPECTJ_17_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_17_0_0_2 = INSTANCE.getASPECTJ_17_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_17_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.TYPE_PATTERN__SUBTYPES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAddition(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_17_0_0 = INSTANCE.getASPECTJ_17_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_17_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_17_0_0_0, ASPECTJ_17_0_0_1, ASPECTJ_17_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_17_0 = INSTANCE.getASPECTJ_17_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_17_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_17_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_17 = INSTANCE.getASPECTJ_17();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_17() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern(), ASPECTJ_17_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder ASPECTJ_18_0_0_0 = INSTANCE.getASPECTJ_18_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getASPECTJ_18_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getIdPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.ID_PATTERN__ID), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_18_0_0 = INSTANCE.getASPECTJ_18_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_18_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_18_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_18_0 = INSTANCE.getASPECTJ_18_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_18_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_18_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_18 = INSTANCE.getASPECTJ_18();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_18() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getIdPattern(), ASPECTJ_18_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_19_0_0_0 = INSTANCE.getASPECTJ_19_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_19_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("..", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_19_0_0 = INSTANCE.getASPECTJ_19_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_19_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_19_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_19_0 = INSTANCE.getASPECTJ_19_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_19_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_19_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_19 = INSTANCE.getASPECTJ_19();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_19() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getParameterWildcard(), ASPECTJ_19_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_20_0_0_0 = INSTANCE.getASPECTJ_20_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_20_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("after", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_20_0_0_1 = INSTANCE.getASPECTJ_20_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_20_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_20_0_0_2_0_0_0 = INSTANCE.getASPECTJ_20_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_20_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_ADVICE__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_20_0_0_2_0_0_1_0_0_0 = INSTANCE.getASPECTJ_20_0_0_2_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_20_0_0_2_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_20_0_0_2_0_0_1_0_0_1 = INSTANCE.getASPECTJ_20_0_0_2_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_20_0_0_2_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_ADVICE__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_20_0_0_2_0_0_1_0_0 = INSTANCE.getASPECTJ_20_0_0_2_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_20_0_0_2_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_20_0_0_2_0_0_1_0_0_0, ASPECTJ_20_0_0_2_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_20_0_0_2_0_0_1_0 = INSTANCE.getASPECTJ_20_0_0_2_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_20_0_0_2_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_20_0_0_2_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_20_0_0_2_0_0_1 = INSTANCE.getASPECTJ_20_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_20_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_20_0_0_2_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_20_0_0_2_0_0 = INSTANCE.getASPECTJ_20_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_20_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_20_0_0_2_0_0_0, ASPECTJ_20_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_20_0_0_2_0 = INSTANCE.getASPECTJ_20_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_20_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_20_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_20_0_0_2 = INSTANCE.getASPECTJ_20_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_20_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_20_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_20_0_0_3 = INSTANCE.getASPECTJ_20_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_20_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_20_0_0_4 = INSTANCE.getASPECTJ_20_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_20_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_ADVICE__ASSIGN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPcAssignmentOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder ASPECTJ_20_0_0_5 = INSTANCE.getASPECTJ_20_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getASPECTJ_20_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_ADVICE__PCREF), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_20_0_0_6 = INSTANCE.getASPECTJ_20_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_20_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_20_0_0_7 = INSTANCE.getASPECTJ_20_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_20_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_ADVICE__STATEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_20_0_0_8 = INSTANCE.getASPECTJ_20_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_20_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_20_0_0 = INSTANCE.getASPECTJ_20_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_20_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_20_0_0_0, ASPECTJ_20_0_0_1, ASPECTJ_20_0_0_2, ASPECTJ_20_0_0_3, ASPECTJ_20_0_0_4, ASPECTJ_20_0_0_5, ASPECTJ_20_0_0_6, ASPECTJ_20_0_0_7, ASPECTJ_20_0_0_8);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_20_0 = INSTANCE.getASPECTJ_20_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_20_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_20_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_20 = INSTANCE.getASPECTJ_20();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_20() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice(), ASPECTJ_20_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_21_0_0_0 = INSTANCE.getASPECTJ_21_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_21_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("after", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_21_0_0_1 = INSTANCE.getASPECTJ_21_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_21_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_21_0_0_2_0_0_0 = INSTANCE.getASPECTJ_21_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_21_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_21_0_0_2_0_0_1_0_0_0 = INSTANCE.getASPECTJ_21_0_0_2_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_21_0_0_2_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_21_0_0_2_0_0_1_0_0_1 = INSTANCE.getASPECTJ_21_0_0_2_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_21_0_0_2_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_21_0_0_2_0_0_1_0_0 = INSTANCE.getASPECTJ_21_0_0_2_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_21_0_0_2_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_21_0_0_2_0_0_1_0_0_0, ASPECTJ_21_0_0_2_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_21_0_0_2_0_0_1_0 = INSTANCE.getASPECTJ_21_0_0_2_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_21_0_0_2_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_21_0_0_2_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_21_0_0_2_0_0_1 = INSTANCE.getASPECTJ_21_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_21_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_21_0_0_2_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_21_0_0_2_0_0 = INSTANCE.getASPECTJ_21_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_21_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_21_0_0_2_0_0_0, ASPECTJ_21_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_21_0_0_2_0 = INSTANCE.getASPECTJ_21_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_21_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_21_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_21_0_0_2 = INSTANCE.getASPECTJ_21_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_21_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_21_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_21_0_0_3 = INSTANCE.getASPECTJ_21_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_21_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_21_0_0_4 = INSTANCE.getASPECTJ_21_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_21_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__RETURNING), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getReturningPointcut(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_21_0_0_5 = INSTANCE.getASPECTJ_21_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_21_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__ASSIGN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPcAssignmentOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder ASPECTJ_21_0_0_6 = INSTANCE.getASPECTJ_21_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getASPECTJ_21_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__PCREF), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_21_0_0_7 = INSTANCE.getASPECTJ_21_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_21_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_21_0_0_8 = INSTANCE.getASPECTJ_21_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_21_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__STATEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_21_0_0_9 = INSTANCE.getASPECTJ_21_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_21_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_21_0_0 = INSTANCE.getASPECTJ_21_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_21_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_21_0_0_0, ASPECTJ_21_0_0_1, ASPECTJ_21_0_0_2, ASPECTJ_21_0_0_3, ASPECTJ_21_0_0_4, ASPECTJ_21_0_0_5, ASPECTJ_21_0_0_6, ASPECTJ_21_0_0_7, ASPECTJ_21_0_0_8, ASPECTJ_21_0_0_9);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_21_0 = INSTANCE.getASPECTJ_21_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_21_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_21_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_21 = INSTANCE.getASPECTJ_21();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_21() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning(), ASPECTJ_21_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_22_0_0_0 = INSTANCE.getASPECTJ_22_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_22_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("before", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_22_0_0_1 = INSTANCE.getASPECTJ_22_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_22_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_22_0_0_2_0_0_0 = INSTANCE.getASPECTJ_22_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_22_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.BEFORE_ADVICE__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_22_0_0_2_0_0_1_0_0_0 = INSTANCE.getASPECTJ_22_0_0_2_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_22_0_0_2_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_22_0_0_2_0_0_1_0_0_1 = INSTANCE.getASPECTJ_22_0_0_2_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_22_0_0_2_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.BEFORE_ADVICE__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_22_0_0_2_0_0_1_0_0 = INSTANCE.getASPECTJ_22_0_0_2_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_22_0_0_2_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_22_0_0_2_0_0_1_0_0_0, ASPECTJ_22_0_0_2_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_22_0_0_2_0_0_1_0 = INSTANCE.getASPECTJ_22_0_0_2_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_22_0_0_2_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_22_0_0_2_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_22_0_0_2_0_0_1 = INSTANCE.getASPECTJ_22_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_22_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_22_0_0_2_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_22_0_0_2_0_0 = INSTANCE.getASPECTJ_22_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_22_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_22_0_0_2_0_0_0, ASPECTJ_22_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_22_0_0_2_0 = INSTANCE.getASPECTJ_22_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_22_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_22_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_22_0_0_2 = INSTANCE.getASPECTJ_22_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_22_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_22_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_22_0_0_3 = INSTANCE.getASPECTJ_22_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_22_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_22_0_0_4 = INSTANCE.getASPECTJ_22_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_22_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.BEFORE_ADVICE__ASSIGN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPcAssignmentOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder ASPECTJ_22_0_0_5 = INSTANCE.getASPECTJ_22_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getASPECTJ_22_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.BEFORE_ADVICE__PCREF), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_22_0_0_6 = INSTANCE.getASPECTJ_22_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_22_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_22_0_0_7 = INSTANCE.getASPECTJ_22_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_22_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.BEFORE_ADVICE__STATEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_22_0_0_8 = INSTANCE.getASPECTJ_22_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_22_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_22_0_0 = INSTANCE.getASPECTJ_22_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_22_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_22_0_0_0, ASPECTJ_22_0_0_1, ASPECTJ_22_0_0_2, ASPECTJ_22_0_0_3, ASPECTJ_22_0_0_4, ASPECTJ_22_0_0_5, ASPECTJ_22_0_0_6, ASPECTJ_22_0_0_7, ASPECTJ_22_0_0_8);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_22_0 = INSTANCE.getASPECTJ_22_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_22_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_22_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_22 = INSTANCE.getASPECTJ_22();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_22() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice(), ASPECTJ_22_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_23_0_0_0 = INSTANCE.getASPECTJ_23_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_23_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutExpression().getEStructuralFeature(org.kardo.language.aspectj.pcexp.PcexpPackage.POINTCUT_EXPRESSION__CHILD), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutOrExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_23_0_0 = INSTANCE.getASPECTJ_23_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_23_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_23_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_23_0 = INSTANCE.getASPECTJ_23_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_23_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_23_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_23 = INSTANCE.getASPECTJ_23();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_23() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutExpression(), ASPECTJ_23_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_24_0_0_0 = INSTANCE.getASPECTJ_24_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_24_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutOrExpression().getEStructuralFeature(org.kardo.language.aspectj.pcexp.PcexpPackage.POINTCUT_OR_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutAndExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_24_0_0_1_0_0_0 = INSTANCE.getASPECTJ_24_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_24_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("||", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_24_0_0_1_0_0_1 = INSTANCE.getASPECTJ_24_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_24_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutOrExpression().getEStructuralFeature(org.kardo.language.aspectj.pcexp.PcexpPackage.POINTCUT_OR_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutAndExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_24_0_0_1_0_0 = INSTANCE.getASPECTJ_24_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_24_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_24_0_0_1_0_0_0, ASPECTJ_24_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_24_0_0_1_0 = INSTANCE.getASPECTJ_24_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_24_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_24_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_24_0_0_1 = INSTANCE.getASPECTJ_24_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_24_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_24_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_24_0_0 = INSTANCE.getASPECTJ_24_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_24_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_24_0_0_0, ASPECTJ_24_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_24_0 = INSTANCE.getASPECTJ_24_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_24_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_24_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_24 = INSTANCE.getASPECTJ_24();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_24() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutOrExpression(), ASPECTJ_24_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_25_0_0_0 = INSTANCE.getASPECTJ_25_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_25_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutAndExpression().getEStructuralFeature(org.kardo.language.aspectj.pcexp.PcexpPackage.POINTCUT_AND_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getPrimitivePointcut(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_25_0_0_1_0_0_0 = INSTANCE.getASPECTJ_25_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_25_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("&&", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment ASPECTJ_25_0_0_1_0_0_1 = INSTANCE.getASPECTJ_25_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getASPECTJ_25_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutAndExpression().getEStructuralFeature(org.kardo.language.aspectj.pcexp.PcexpPackage.POINTCUT_AND_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getPrimitivePointcut(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_25_0_0_1_0_0 = INSTANCE.getASPECTJ_25_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_25_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_25_0_0_1_0_0_0, ASPECTJ_25_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_25_0_0_1_0 = INSTANCE.getASPECTJ_25_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_25_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_25_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound ASPECTJ_25_0_0_1 = INSTANCE.getASPECTJ_25_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getASPECTJ_25_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(ASPECTJ_25_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_25_0_0 = INSTANCE.getASPECTJ_25_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_25_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_25_0_0_0, ASPECTJ_25_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_25_0 = INSTANCE.getASPECTJ_25_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_25_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_25_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_25 = INSTANCE.getASPECTJ_25();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_25() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutAndExpression(), ASPECTJ_25_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword ASPECTJ_26_0_0_0 = INSTANCE.getASPECTJ_26_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getASPECTJ_26_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(":", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence ASPECTJ_26_0_0 = INSTANCE.getASPECTJ_26_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getASPECTJ_26_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_26_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice ASPECTJ_26_0 = INSTANCE.getASPECTJ_26_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getASPECTJ_26_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, ASPECTJ_26_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule ASPECTJ_26 = INSTANCE.getASPECTJ_26();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getASPECTJ_26() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPcAssignmentOperator(), ASPECTJ_26_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_0_0_0_0_0_0_0 = INSTANCE.getJAVA_0_0_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_0_0_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getEmptyModel().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.EMPTY_MODEL__IMPORTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getImport(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_0_0_0_0_0_0_1 = INSTANCE.getJAVA_0_0_0_0_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_0_0_0_0_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_0_0_0_0_0_0_2 = INSTANCE.getJAVA_0_0_0_0_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_0_0_0_0_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_0_0_0_0_0_0 = INSTANCE.getJAVA_0_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_0_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_0_0_0_0_0_0_0, JAVA_0_0_0_0_0_0_1, JAVA_0_0_0_0_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_0_0_0_0_0 = INSTANCE.getJAVA_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_0_0_0_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_0_0_0_0 = INSTANCE.getJAVA_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_0_0_0_0_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_0_0_0_1_0_0_0 = INSTANCE.getJAVA_0_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_0_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_0_0_0_1_0_0 = INSTANCE.getJAVA_0_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_0_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_0_0_0_1_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_0_0_0_1_0 = INSTANCE.getJAVA_0_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_0_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_0_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_0_0_0_1 = INSTANCE.getJAVA_0_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_0_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_0_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_0_0_0 = INSTANCE.getJAVA_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_0_0_0_0, JAVA_0_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_0_0 = INSTANCE.getJAVA_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_0 = INSTANCE.getJAVA_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getEmptyModel(), JAVA_0_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_1_0_0_0 = INSTANCE.getJAVA_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.PACKAGE__ANNOTATIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_1_0_0_1 = INSTANCE.getJAVA_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("package", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_1_0_0_2_0_0_0 = INSTANCE.getJAVA_1_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_1_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.PACKAGE__NAMESPACES), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_1_0_0_2_0_0_1 = INSTANCE.getJAVA_1_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_1_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_1_0_0_2_0_0 = INSTANCE.getJAVA_1_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_1_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_1_0_0_2_0_0_0, JAVA_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_1_0_0_2_0 = INSTANCE.getJAVA_1_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_1_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_1_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_1_0_0_2 = INSTANCE.getJAVA_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_1_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_1_0_0_3 = INSTANCE.getJAVA_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.PACKAGE__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_1_0_0_4 = INSTANCE.getJAVA_1_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_1_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_1_0_0_5_0_0_0 = INSTANCE.getJAVA_1_0_0_5_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_1_0_0_5_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_1_0_0_5_0_0 = INSTANCE.getJAVA_1_0_0_5_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_1_0_0_5_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_1_0_0_5_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_1_0_0_5_0 = INSTANCE.getJAVA_1_0_0_5_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_1_0_0_5_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_1_0_0_5_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_1_0_0_5 = INSTANCE.getJAVA_1_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_1_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_1_0_0_5_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_1_0_0_6 = INSTANCE.getJAVA_1_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_1_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_1_0_0_7 = INSTANCE.getJAVA_1_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_1_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_1_0_0_8_0_0_0 = INSTANCE.getJAVA_1_0_0_8_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_1_0_0_8_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.PACKAGE__IMPORTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getImport(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_1_0_0_8_0_0_1 = INSTANCE.getJAVA_1_0_0_8_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_1_0_0_8_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_1_0_0_8_0_0 = INSTANCE.getJAVA_1_0_0_8_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_1_0_0_8_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_1_0_0_8_0_0_0, JAVA_1_0_0_8_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_1_0_0_8_0 = INSTANCE.getJAVA_1_0_0_8_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_1_0_0_8_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_1_0_0_8_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_1_0_0_8 = INSTANCE.getJAVA_1_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_1_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_1_0_0_8_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_1_0_0_9_0_0_0 = INSTANCE.getJAVA_1_0_0_9_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_1_0_0_9_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_1_0_0_9_0_0 = INSTANCE.getJAVA_1_0_0_9_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_1_0_0_9_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_1_0_0_9_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_1_0_0_9_0 = INSTANCE.getJAVA_1_0_0_9_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_1_0_0_9_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_1_0_0_9_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_1_0_0_9 = INSTANCE.getJAVA_1_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_1_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_1_0_0_9_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_1_0_0 = INSTANCE.getJAVA_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_1_0_0_0, JAVA_1_0_0_1, JAVA_1_0_0_2, JAVA_1_0_0_3, JAVA_1_0_0_4, JAVA_1_0_0_5, JAVA_1_0_0_6, JAVA_1_0_0_7, JAVA_1_0_0_8, JAVA_1_0_0_9);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_1_0 = INSTANCE.getJAVA_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_1 = INSTANCE.getJAVA_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage(), JAVA_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_2_0_0_0_0_0_0 = INSTANCE.getJAVA_2_0_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_2_0_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("package", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_2_0_0_0_0_0_1 = INSTANCE.getJAVA_2_0_0_0_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_2_0_0_0_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.COMPILATION_UNIT__NAMESPACES), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_2_0_0_0_0_0_2_0_0_0 = INSTANCE.getJAVA_2_0_0_0_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_2_0_0_0_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_2_0_0_0_0_0_2_0_0_1 = INSTANCE.getJAVA_2_0_0_0_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_2_0_0_0_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.COMPILATION_UNIT__NAMESPACES), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_2_0_0_0_0_0_2_0_0 = INSTANCE.getJAVA_2_0_0_0_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_2_0_0_0_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_0_0_0_2_0_0_0, JAVA_2_0_0_0_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_2_0_0_0_0_0_2_0 = INSTANCE.getJAVA_2_0_0_0_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_2_0_0_0_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_0_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_2_0_0_0_0_0_2 = INSTANCE.getJAVA_2_0_0_0_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_2_0_0_0_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_2_0_0_0_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_2_0_0_0_0_0_3 = INSTANCE.getJAVA_2_0_0_0_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_2_0_0_0_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_2_0_0_0_0_0 = INSTANCE.getJAVA_2_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_2_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_0_0_0_0, JAVA_2_0_0_0_0_0_1, JAVA_2_0_0_0_0_0_2, JAVA_2_0_0_0_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_2_0_0_0_0 = INSTANCE.getJAVA_2_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_2_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_2_0_0_0 = INSTANCE.getJAVA_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_2_0_0_0_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_2_0_0_1 = INSTANCE.getJAVA_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_2_0_0_2 = INSTANCE.getJAVA_2_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_2_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_2_0_0_3_0_0_0 = INSTANCE.getJAVA_2_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_2_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.COMPILATION_UNIT__IMPORTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getImport(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_2_0_0_3_0_0_1 = INSTANCE.getJAVA_2_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_2_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_2_0_0_3_0_0 = INSTANCE.getJAVA_2_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_2_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_3_0_0_0, JAVA_2_0_0_3_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_2_0_0_3_0 = INSTANCE.getJAVA_2_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_2_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_2_0_0_3 = INSTANCE.getJAVA_2_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_2_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_2_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_2_0_0_4_0_0_0 = INSTANCE.getJAVA_2_0_0_4_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_2_0_0_4_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_2_0_0_4_0_0_1 = INSTANCE.getJAVA_2_0_0_4_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_2_0_0_4_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_2_0_0_4_0_0 = INSTANCE.getJAVA_2_0_0_4_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_2_0_0_4_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_4_0_0_0, JAVA_2_0_0_4_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_2_0_0_4_0 = INSTANCE.getJAVA_2_0_0_4_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_2_0_0_4_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_4_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_2_0_0_4 = INSTANCE.getJAVA_2_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_2_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_2_0_0_4_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_2_0_0_5 = INSTANCE.getJAVA_2_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_2_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_2_0_0_6_0_0_0 = INSTANCE.getJAVA_2_0_0_6_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_2_0_0_6_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.COMPILATION_UNIT__CLASSIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getConcreteClassifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_2_0_0_6_0_0_1_0_0_0 = INSTANCE.getJAVA_2_0_0_6_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_2_0_0_6_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_2_0_0_6_0_0_1_0_0 = INSTANCE.getJAVA_2_0_0_6_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_2_0_0_6_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_6_0_0_1_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_2_0_0_6_0_0_1_0 = INSTANCE.getJAVA_2_0_0_6_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_2_0_0_6_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_6_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_2_0_0_6_0_0_1 = INSTANCE.getJAVA_2_0_0_6_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_2_0_0_6_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_2_0_0_6_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_2_0_0_6_0_0_2 = INSTANCE.getJAVA_2_0_0_6_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_2_0_0_6_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_2_0_0_6_0_0_3 = INSTANCE.getJAVA_2_0_0_6_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_2_0_0_6_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_2_0_0_6_0_0 = INSTANCE.getJAVA_2_0_0_6_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_2_0_0_6_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_6_0_0_0, JAVA_2_0_0_6_0_0_1, JAVA_2_0_0_6_0_0_2, JAVA_2_0_0_6_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_2_0_0_6_0 = INSTANCE.getJAVA_2_0_0_6_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_2_0_0_6_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_6_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_2_0_0_6 = INSTANCE.getJAVA_2_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_2_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_2_0_0_6_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.PLUS);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_2_0_0_7_0_0_0 = INSTANCE.getJAVA_2_0_0_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_2_0_0_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("\u001a", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_2_0_0_7_0_0 = INSTANCE.getJAVA_2_0_0_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_2_0_0_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_7_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_2_0_0_7_0 = INSTANCE.getJAVA_2_0_0_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_2_0_0_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_2_0_0_7 = INSTANCE.getJAVA_2_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_2_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_2_0_0_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_2_0_0 = INSTANCE.getJAVA_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0_0, JAVA_2_0_0_1, JAVA_2_0_0_2, JAVA_2_0_0_3, JAVA_2_0_0_4, JAVA_2_0_0_5, JAVA_2_0_0_6, JAVA_2_0_0_7);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_2_0 = INSTANCE.getJAVA_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_2 = INSTANCE.getJAVA_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), JAVA_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_3_0_0_0 = INSTANCE.getJAVA_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("import", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_3_0_0_1_0_0_0 = INSTANCE.getJAVA_3_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_3_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.CLASSIFIER_IMPORT__NAMESPACES), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_3_0_0_1_0_0_1 = INSTANCE.getJAVA_3_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_3_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_3_0_0_1_0_0 = INSTANCE.getJAVA_3_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_3_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_3_0_0_1_0_0_0, JAVA_3_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_3_0_0_1_0 = INSTANCE.getJAVA_3_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_3_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_3_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_3_0_0_1 = INSTANCE.getJAVA_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_3_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_3_0_0_2 = INSTANCE.getJAVA_3_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_3_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.CLASSIFIER_IMPORT__CLASSIFIER), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_3_0_0_3 = INSTANCE.getJAVA_3_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_3_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_3_0_0 = INSTANCE.getJAVA_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_3_0_0_0, JAVA_3_0_0_1, JAVA_3_0_0_2, JAVA_3_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_3_0 = INSTANCE.getJAVA_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_3 = INSTANCE.getJAVA_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport(), JAVA_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_4_0_0_0 = INSTANCE.getJAVA_4_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_4_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("import", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_4_0_0_1_0_0_0 = INSTANCE.getJAVA_4_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_4_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getPackageImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.PACKAGE_IMPORT__NAMESPACES), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_4_0_0_1_0_0_1 = INSTANCE.getJAVA_4_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_4_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_4_0_0_1_0_0 = INSTANCE.getJAVA_4_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_4_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_4_0_0_1_0_0_0, JAVA_4_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_4_0_0_1_0 = INSTANCE.getJAVA_4_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_4_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_4_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_4_0_0_1 = INSTANCE.getJAVA_4_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_4_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_4_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.PLUS);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_4_0_0_2 = INSTANCE.getJAVA_4_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_4_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("*", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_4_0_0_3 = INSTANCE.getJAVA_4_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_4_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_4_0_0 = INSTANCE.getJAVA_4_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_4_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_4_0_0_0, JAVA_4_0_0_1, JAVA_4_0_0_2, JAVA_4_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_4_0 = INSTANCE.getJAVA_4_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_4_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_4_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_4 = INSTANCE.getJAVA_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getPackageImport(), JAVA_4_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_5_0_0_0 = INSTANCE.getJAVA_5_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_5_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("import", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_5_0_0_1 = INSTANCE.getJAVA_5_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_5_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.STATIC_MEMBER_IMPORT__STATIC), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getStatic(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_5_0_0_2_0_0_0 = INSTANCE.getJAVA_5_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_5_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.STATIC_MEMBER_IMPORT__NAMESPACES), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_5_0_0_2_0_0_1 = INSTANCE.getJAVA_5_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_5_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_5_0_0_2_0_0 = INSTANCE.getJAVA_5_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_5_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_5_0_0_2_0_0_0, JAVA_5_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_5_0_0_2_0 = INSTANCE.getJAVA_5_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_5_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_5_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_5_0_0_2 = INSTANCE.getJAVA_5_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_5_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_5_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_5_0_0_3 = INSTANCE.getJAVA_5_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_5_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_5_0_0_4 = INSTANCE.getJAVA_5_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_5_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_5_0_0 = INSTANCE.getJAVA_5_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_5_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_5_0_0_0, JAVA_5_0_0_1, JAVA_5_0_0_2, JAVA_5_0_0_3, JAVA_5_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_5_0 = INSTANCE.getJAVA_5_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_5_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_5_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_5 = INSTANCE.getJAVA_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport(), JAVA_5_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_6_0_0_0 = INSTANCE.getJAVA_6_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_6_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("import", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_6_0_0_1 = INSTANCE.getJAVA_6_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_6_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticClassifierImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.STATIC_CLASSIFIER_IMPORT__STATIC), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getStatic(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_6_0_0_2_0_0_0 = INSTANCE.getJAVA_6_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_6_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticClassifierImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.STATIC_CLASSIFIER_IMPORT__NAMESPACES), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_6_0_0_2_0_0_1 = INSTANCE.getJAVA_6_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_6_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_6_0_0_2_0_0 = INSTANCE.getJAVA_6_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_6_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_6_0_0_2_0_0_0, JAVA_6_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_6_0_0_2_0 = INSTANCE.getJAVA_6_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_6_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_6_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_6_0_0_2 = INSTANCE.getJAVA_6_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_6_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_6_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.PLUS);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_6_0_0_3 = INSTANCE.getJAVA_6_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_6_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("*", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_6_0_0_4 = INSTANCE.getJAVA_6_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_6_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_6_0_0 = INSTANCE.getJAVA_6_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_6_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_6_0_0_0, JAVA_6_0_0_1, JAVA_6_0_0_2, JAVA_6_0_0_3, JAVA_6_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_6_0 = INSTANCE.getJAVA_6_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_6_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_6_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_6 = INSTANCE.getJAVA_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticClassifierImport(), JAVA_6_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_7_0_0_0 = INSTANCE.getJAVA_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_7_0_0_1 = INSTANCE.getJAVA_7_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_7_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("class", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_7_0_0_2 = INSTANCE.getJAVA_7_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_7_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_7_0_0_3_0_0_0 = INSTANCE.getJAVA_7_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_7_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_7_0_0_3_0_0_1 = INSTANCE.getJAVA_7_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_7_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_7_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_7_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_7_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_7_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_7_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_7_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_7_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_7_0_0_3_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_7_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_3_0_0_2_0_0_0, JAVA_7_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_7_0_0_3_0_0_2_0 = INSTANCE.getJAVA_7_0_0_3_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_7_0_0_3_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_7_0_0_3_0_0_2 = INSTANCE.getJAVA_7_0_0_3_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_7_0_0_3_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_7_0_0_3_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_7_0_0_3_0_0_3 = INSTANCE.getJAVA_7_0_0_3_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_7_0_0_3_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_7_0_0_3_0_0 = INSTANCE.getJAVA_7_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_7_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_3_0_0_0, JAVA_7_0_0_3_0_0_1, JAVA_7_0_0_3_0_0_2, JAVA_7_0_0_3_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_7_0_0_3_0 = INSTANCE.getJAVA_7_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_7_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_7_0_0_3 = INSTANCE.getJAVA_7_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_7_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_7_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_7_0_0_4_0_0_0 = INSTANCE.getJAVA_7_0_0_4_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_7_0_0_4_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("extends", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_7_0_0_4_0_0_1 = INSTANCE.getJAVA_7_0_0_4_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_7_0_0_4_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__EXTENDS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_7_0_0_4_0_0 = INSTANCE.getJAVA_7_0_0_4_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_7_0_0_4_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_4_0_0_0, JAVA_7_0_0_4_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_7_0_0_4_0 = INSTANCE.getJAVA_7_0_0_4_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_7_0_0_4_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_4_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_7_0_0_4 = INSTANCE.getJAVA_7_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_7_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_7_0_0_4_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_7_0_0_5_0_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_7_0_0_5_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("implements", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_7_0_0_5_0_0_1_0_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_7_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__IMPLEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_7_0_0_5_0_0_1_0_0_1_0_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_7_0_0_5_0_0_1_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_7_0_0_5_0_0_1_0_0_1_0_0_1 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_7_0_0_5_0_0_1_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__IMPLEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_7_0_0_5_0_0_1_0_0_1_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_7_0_0_5_0_0_1_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_5_0_0_1_0_0_1_0_0_0, JAVA_7_0_0_5_0_0_1_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_7_0_0_5_0_0_1_0_0_1_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_7_0_0_5_0_0_1_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_5_0_0_1_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_7_0_0_5_0_0_1_0_0_1 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_7_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_7_0_0_5_0_0_1_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_7_0_0_5_0_0_1_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_7_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_5_0_0_1_0_0_0, JAVA_7_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_7_0_0_5_0_0_1_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_7_0_0_5_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_7_0_0_5_0_0_1 = INSTANCE.getJAVA_7_0_0_5_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_7_0_0_5_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_7_0_0_5_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_7_0_0_5_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_7_0_0_5_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_5_0_0_0, JAVA_7_0_0_5_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_7_0_0_5_0 = INSTANCE.getJAVA_7_0_0_5_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_7_0_0_5_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_5_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_7_0_0_5 = INSTANCE.getJAVA_7_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_7_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_7_0_0_5_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_7_0_0_6 = INSTANCE.getJAVA_7_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_7_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_7_0_0_7 = INSTANCE.getJAVA_7_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_7_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_7_0_0_8_0_0_0 = INSTANCE.getJAVA_7_0_0_8_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_7_0_0_8_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_7_0_0_8_0_0_1 = INSTANCE.getJAVA_7_0_0_8_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_7_0_0_8_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__MEMBERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getMember(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_7_0_0_8_0_0 = INSTANCE.getJAVA_7_0_0_8_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_7_0_0_8_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_8_0_0_0, JAVA_7_0_0_8_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_7_0_0_8_0 = INSTANCE.getJAVA_7_0_0_8_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_7_0_0_8_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_8_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_7_0_0_8 = INSTANCE.getJAVA_7_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_7_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_7_0_0_8_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_7_0_0_9 = INSTANCE.getJAVA_7_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_7_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_7_0_0_10 = INSTANCE.getJAVA_7_0_0_10();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_7_0_0_10() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_7_0_0 = INSTANCE.getJAVA_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0_0, JAVA_7_0_0_1, JAVA_7_0_0_2, JAVA_7_0_0_3, JAVA_7_0_0_4, JAVA_7_0_0_5, JAVA_7_0_0_6, JAVA_7_0_0_7, JAVA_7_0_0_8, JAVA_7_0_0_9, JAVA_7_0_0_10);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_7_0 = INSTANCE.getJAVA_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_7 = INSTANCE.getJAVA_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_(), JAVA_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_8_0_0_0 = INSTANCE.getJAVA_8_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_8_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_8_0_0_1 = INSTANCE.getJAVA_8_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_8_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_8_0_0_2_0_0_0 = INSTANCE.getJAVA_8_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_8_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_8_0_0_2_0_0_1 = INSTANCE.getJAVA_8_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_8_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnonymousClass().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getMember(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_8_0_0_2_0_0 = INSTANCE.getJAVA_8_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_8_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_8_0_0_2_0_0_0, JAVA_8_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_8_0_0_2_0 = INSTANCE.getJAVA_8_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_8_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_8_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_8_0_0_2 = INSTANCE.getJAVA_8_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_8_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_8_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_8_0_0_3 = INSTANCE.getJAVA_8_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_8_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_8_0_0_4 = INSTANCE.getJAVA_8_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_8_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_8_0_0 = INSTANCE.getJAVA_8_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_8_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_8_0_0_0, JAVA_8_0_0_1, JAVA_8_0_0_2, JAVA_8_0_0_3, JAVA_8_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_8_0 = INSTANCE.getJAVA_8_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_8_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_8_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_8 = INSTANCE.getJAVA_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnonymousClass(), JAVA_8_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_9_0_0_0 = INSTANCE.getJAVA_9_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_9_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_9_0_0_1 = INSTANCE.getJAVA_9_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_9_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("interface", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_9_0_0_2 = INSTANCE.getJAVA_9_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_9_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_9_0_0_3_0_0_0 = INSTANCE.getJAVA_9_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_9_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_9_0_0_3_0_0_1 = INSTANCE.getJAVA_9_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_9_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_9_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_9_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_9_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_9_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_9_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_9_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_9_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_9_0_0_3_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_9_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_3_0_0_2_0_0_0, JAVA_9_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_9_0_0_3_0_0_2_0 = INSTANCE.getJAVA_9_0_0_3_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_9_0_0_3_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_9_0_0_3_0_0_2 = INSTANCE.getJAVA_9_0_0_3_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_9_0_0_3_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_9_0_0_3_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_9_0_0_3_0_0_3 = INSTANCE.getJAVA_9_0_0_3_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_9_0_0_3_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_9_0_0_3_0_0 = INSTANCE.getJAVA_9_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_9_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_3_0_0_0, JAVA_9_0_0_3_0_0_1, JAVA_9_0_0_3_0_0_2, JAVA_9_0_0_3_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_9_0_0_3_0 = INSTANCE.getJAVA_9_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_9_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_9_0_0_3 = INSTANCE.getJAVA_9_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_9_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_9_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_9_0_0_4_0_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_9_0_0_4_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("extends", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_9_0_0_4_0_0_1_0_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_9_0_0_4_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__EXTENDS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_9_0_0_4_0_0_1_0_0_1_0_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_9_0_0_4_0_0_1_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_9_0_0_4_0_0_1_0_0_1_0_0_1 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_9_0_0_4_0_0_1_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__EXTENDS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_9_0_0_4_0_0_1_0_0_1_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_9_0_0_4_0_0_1_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_4_0_0_1_0_0_1_0_0_0, JAVA_9_0_0_4_0_0_1_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_9_0_0_4_0_0_1_0_0_1_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_9_0_0_4_0_0_1_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_4_0_0_1_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_9_0_0_4_0_0_1_0_0_1 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_9_0_0_4_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_9_0_0_4_0_0_1_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_9_0_0_4_0_0_1_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_9_0_0_4_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_4_0_0_1_0_0_0, JAVA_9_0_0_4_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_9_0_0_4_0_0_1_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_9_0_0_4_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_4_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_9_0_0_4_0_0_1 = INSTANCE.getJAVA_9_0_0_4_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_9_0_0_4_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_9_0_0_4_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_9_0_0_4_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_9_0_0_4_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_4_0_0_0, JAVA_9_0_0_4_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_9_0_0_4_0 = INSTANCE.getJAVA_9_0_0_4_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_9_0_0_4_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_4_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_9_0_0_4 = INSTANCE.getJAVA_9_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_9_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_9_0_0_4_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_9_0_0_5 = INSTANCE.getJAVA_9_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_9_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_9_0_0_6 = INSTANCE.getJAVA_9_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_9_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_9_0_0_7_0_0_0 = INSTANCE.getJAVA_9_0_0_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_9_0_0_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_9_0_0_7_0_0_1 = INSTANCE.getJAVA_9_0_0_7_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_9_0_0_7_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__MEMBERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getMember(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_9_0_0_7_0_0 = INSTANCE.getJAVA_9_0_0_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_9_0_0_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_7_0_0_0, JAVA_9_0_0_7_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_9_0_0_7_0 = INSTANCE.getJAVA_9_0_0_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_9_0_0_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_9_0_0_7 = INSTANCE.getJAVA_9_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_9_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_9_0_0_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_9_0_0_8 = INSTANCE.getJAVA_9_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_9_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_9_0_0_9 = INSTANCE.getJAVA_9_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_9_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_9_0_0 = INSTANCE.getJAVA_9_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_9_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0_0, JAVA_9_0_0_1, JAVA_9_0_0_2, JAVA_9_0_0_3, JAVA_9_0_0_4, JAVA_9_0_0_5, JAVA_9_0_0_6, JAVA_9_0_0_7, JAVA_9_0_0_8, JAVA_9_0_0_9);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_9_0 = INSTANCE.getJAVA_9_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_9_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_9_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_9 = INSTANCE.getJAVA_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface(), JAVA_9_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_10_0_0_0 = INSTANCE.getJAVA_10_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_10_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_10_0_0_1 = INSTANCE.getJAVA_10_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_10_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("enum", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_10_0_0_2 = INSTANCE.getJAVA_10_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_10_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_10_0_0_3_0_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_10_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("implements", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_10_0_0_3_0_0_1_0_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_10_0_0_3_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__IMPLEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_10_0_0_3_0_0_1_0_0_1_0_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_10_0_0_3_0_0_1_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_10_0_0_3_0_0_1_0_0_1_0_0_1 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_10_0_0_3_0_0_1_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__IMPLEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_10_0_0_3_0_0_1_0_0_1_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_10_0_0_3_0_0_1_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_3_0_0_1_0_0_1_0_0_0, JAVA_10_0_0_3_0_0_1_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_10_0_0_3_0_0_1_0_0_1_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_10_0_0_3_0_0_1_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_3_0_0_1_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_10_0_0_3_0_0_1_0_0_1 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_10_0_0_3_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_10_0_0_3_0_0_1_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_10_0_0_3_0_0_1_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_10_0_0_3_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_3_0_0_1_0_0_0, JAVA_10_0_0_3_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_10_0_0_3_0_0_1_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_10_0_0_3_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_3_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_10_0_0_3_0_0_1 = INSTANCE.getJAVA_10_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_10_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_10_0_0_3_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_10_0_0_3_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_10_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_3_0_0_0, JAVA_10_0_0_3_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_10_0_0_3_0 = INSTANCE.getJAVA_10_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_10_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_10_0_0_3 = INSTANCE.getJAVA_10_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_10_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_10_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_10_0_0_4 = INSTANCE.getJAVA_10_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_10_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_10_0_0_5 = INSTANCE.getJAVA_10_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_10_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_10_0_0_6_0_0_0 = INSTANCE.getJAVA_10_0_0_6_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_10_0_0_6_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_10_0_0_6_0_0_1 = INSTANCE.getJAVA_10_0_0_6_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_10_0_0_6_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__CONSTANTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_10_0_0_6_0_0_2_0_0_0 = INSTANCE.getJAVA_10_0_0_6_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_10_0_0_6_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_10_0_0_6_0_0_2_0_0_1 = INSTANCE.getJAVA_10_0_0_6_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_10_0_0_6_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_10_0_0_6_0_0_2_0_0_2 = INSTANCE.getJAVA_10_0_0_6_0_0_2_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_10_0_0_6_0_0_2_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__CONSTANTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_10_0_0_6_0_0_2_0_0 = INSTANCE.getJAVA_10_0_0_6_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_10_0_0_6_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_6_0_0_2_0_0_0, JAVA_10_0_0_6_0_0_2_0_0_1, JAVA_10_0_0_6_0_0_2_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_10_0_0_6_0_0_2_0 = INSTANCE.getJAVA_10_0_0_6_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_10_0_0_6_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_6_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_10_0_0_6_0_0_2 = INSTANCE.getJAVA_10_0_0_6_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_10_0_0_6_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_10_0_0_6_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_10_0_0_6_0_0 = INSTANCE.getJAVA_10_0_0_6_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_10_0_0_6_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_6_0_0_0, JAVA_10_0_0_6_0_0_1, JAVA_10_0_0_6_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_10_0_0_6_0 = INSTANCE.getJAVA_10_0_0_6_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_10_0_0_6_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_6_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_10_0_0_6 = INSTANCE.getJAVA_10_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_10_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_10_0_0_6_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_10_0_0_7_0_0_0 = INSTANCE.getJAVA_10_0_0_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_10_0_0_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_10_0_0_7_0_0 = INSTANCE.getJAVA_10_0_0_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_10_0_0_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_7_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_10_0_0_7_0 = INSTANCE.getJAVA_10_0_0_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_10_0_0_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_10_0_0_7 = INSTANCE.getJAVA_10_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_10_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_10_0_0_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_10_0_0_8_0_0_0 = INSTANCE.getJAVA_10_0_0_8_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_10_0_0_8_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_10_0_0_8_0_0_1_0_0_0 = INSTANCE.getJAVA_10_0_0_8_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_10_0_0_8_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_10_0_0_8_0_0_1_0_0_1 = INSTANCE.getJAVA_10_0_0_8_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_10_0_0_8_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__MEMBERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getMember(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_10_0_0_8_0_0_1_0_0 = INSTANCE.getJAVA_10_0_0_8_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_10_0_0_8_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_8_0_0_1_0_0_0, JAVA_10_0_0_8_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_10_0_0_8_0_0_1_0 = INSTANCE.getJAVA_10_0_0_8_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_10_0_0_8_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_8_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_10_0_0_8_0_0_1 = INSTANCE.getJAVA_10_0_0_8_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_10_0_0_8_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_10_0_0_8_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_10_0_0_8_0_0_2 = INSTANCE.getJAVA_10_0_0_8_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_10_0_0_8_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_10_0_0_8_0_0 = INSTANCE.getJAVA_10_0_0_8_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_10_0_0_8_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_8_0_0_0, JAVA_10_0_0_8_0_0_1, JAVA_10_0_0_8_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_10_0_0_8_0 = INSTANCE.getJAVA_10_0_0_8_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_10_0_0_8_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_8_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_10_0_0_8 = INSTANCE.getJAVA_10_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_10_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_10_0_0_8_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_10_0_0_9 = INSTANCE.getJAVA_10_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_10_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_10_0_0 = INSTANCE.getJAVA_10_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_10_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0_0, JAVA_10_0_0_1, JAVA_10_0_0_2, JAVA_10_0_0_3, JAVA_10_0_0_4, JAVA_10_0_0_5, JAVA_10_0_0_6, JAVA_10_0_0_7, JAVA_10_0_0_8, JAVA_10_0_0_9);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_10_0 = INSTANCE.getJAVA_10_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_10_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_10_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_10 = INSTANCE.getJAVA_10();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_10() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration(), JAVA_10_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_11_0_0_0 = INSTANCE.getJAVA_11_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_11_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnnotation().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ANNOTATION__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_11_0_0_1 = INSTANCE.getJAVA_11_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_11_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("@", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_11_0_0_2 = INSTANCE.getJAVA_11_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_11_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("interface", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_11_0_0_3 = INSTANCE.getJAVA_11_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_11_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnnotation().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ANNOTATION__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_11_0_0_4 = INSTANCE.getJAVA_11_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_11_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_11_0_0_5 = INSTANCE.getJAVA_11_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_11_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_11_0_0_6_0_0_0 = INSTANCE.getJAVA_11_0_0_6_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_11_0_0_6_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_11_0_0_6_0_0_1 = INSTANCE.getJAVA_11_0_0_6_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_11_0_0_6_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnnotation().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ANNOTATION__MEMBERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getMember(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_11_0_0_6_0_0 = INSTANCE.getJAVA_11_0_0_6_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_11_0_0_6_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_11_0_0_6_0_0_0, JAVA_11_0_0_6_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_11_0_0_6_0 = INSTANCE.getJAVA_11_0_0_6_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_11_0_0_6_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_11_0_0_6_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_11_0_0_6 = INSTANCE.getJAVA_11_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_11_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_11_0_0_6_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_11_0_0_7 = INSTANCE.getJAVA_11_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_11_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_11_0_0_8 = INSTANCE.getJAVA_11_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_11_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_11_0_0 = INSTANCE.getJAVA_11_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_11_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_11_0_0_0, JAVA_11_0_0_1, JAVA_11_0_0_2, JAVA_11_0_0_3, JAVA_11_0_0_4, JAVA_11_0_0_5, JAVA_11_0_0_6, JAVA_11_0_0_7, JAVA_11_0_0_8);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_11_0 = INSTANCE.getJAVA_11_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_11_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_11_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_11 = INSTANCE.getJAVA_11();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_11() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnnotation(), JAVA_11_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_12_0_0_0 = INSTANCE.getJAVA_12_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_12_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("@", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_12_0_0_1_0_0_0 = INSTANCE.getJAVA_12_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_12_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_12_0_0_1_0_0_1 = INSTANCE.getJAVA_12_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_12_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_12_0_0_1_0_0 = INSTANCE.getJAVA_12_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_12_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_12_0_0_1_0_0_0, JAVA_12_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_12_0_0_1_0 = INSTANCE.getJAVA_12_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_12_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_12_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_12_0_0_1 = INSTANCE.getJAVA_12_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_12_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_12_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_12_0_0_2 = INSTANCE.getJAVA_12_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_12_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_12_0_0_3_0_0_0 = INSTANCE.getJAVA_12_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_12_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_12_0_0_3_0_0 = INSTANCE.getJAVA_12_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_12_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_12_0_0_3_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_12_0_0_3_0 = INSTANCE.getJAVA_12_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_12_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_12_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_12_0_0_3 = INSTANCE.getJAVA_12_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_12_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_12_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_12_0_0 = INSTANCE.getJAVA_12_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_12_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_12_0_0_0, JAVA_12_0_0_1, JAVA_12_0_0_2, JAVA_12_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_12_0 = INSTANCE.getJAVA_12_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_12_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_12_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_12 = INSTANCE.getJAVA_12();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_12() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance(), JAVA_12_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_13_0_0_0 = INSTANCE.getJAVA_13_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_13_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_13_0_0_1 = INSTANCE.getJAVA_13_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_13_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getSingleAnnotationParameter().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER__VALUE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_13_0_0_2 = INSTANCE.getJAVA_13_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_13_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_13_0_0 = INSTANCE.getJAVA_13_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_13_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_13_0_0_0, JAVA_13_0_0_1, JAVA_13_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_13_0 = INSTANCE.getJAVA_13_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_13_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_13_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_13 = INSTANCE.getJAVA_13();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_13() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getSingleAnnotationParameter(), JAVA_13_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_14_0_0_0 = INSTANCE.getJAVA_14_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_14_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_14_0_0_1_0_0_0 = INSTANCE.getJAVA_14_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_14_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationParameterList().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_PARAMETER_LIST__SETTINGS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_14_0_0_1_0_0_1_0_0_0 = INSTANCE.getJAVA_14_0_0_1_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_14_0_0_1_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_14_0_0_1_0_0_1_0_0_1 = INSTANCE.getJAVA_14_0_0_1_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_14_0_0_1_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationParameterList().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_PARAMETER_LIST__SETTINGS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_14_0_0_1_0_0_1_0_0 = INSTANCE.getJAVA_14_0_0_1_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_14_0_0_1_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_14_0_0_1_0_0_1_0_0_0, JAVA_14_0_0_1_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_14_0_0_1_0_0_1_0 = INSTANCE.getJAVA_14_0_0_1_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_14_0_0_1_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_14_0_0_1_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_14_0_0_1_0_0_1 = INSTANCE.getJAVA_14_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_14_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_14_0_0_1_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_14_0_0_1_0_0 = INSTANCE.getJAVA_14_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_14_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_14_0_0_1_0_0_0, JAVA_14_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_14_0_0_1_0 = INSTANCE.getJAVA_14_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_14_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_14_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_14_0_0_1 = INSTANCE.getJAVA_14_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_14_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_14_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_14_0_0_2 = INSTANCE.getJAVA_14_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_14_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_14_0_0 = INSTANCE.getJAVA_14_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_14_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_14_0_0_0, JAVA_14_0_0_1, JAVA_14_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_14_0 = INSTANCE.getJAVA_14_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_14_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_14_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_14 = INSTANCE.getJAVA_14();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_14() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationParameterList(), JAVA_14_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_15_0_0_0 = INSTANCE.getJAVA_15_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_15_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_15_0_0_1 = INSTANCE.getJAVA_15_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_15_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_15_0_0_2 = INSTANCE.getJAVA_15_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_15_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_15_0_0_3 = INSTANCE.getJAVA_15_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_15_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_15_0_0_4 = INSTANCE.getJAVA_15_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_15_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__VALUE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_15_0_0 = INSTANCE.getJAVA_15_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_15_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_15_0_0_0, JAVA_15_0_0_1, JAVA_15_0_0_2, JAVA_15_0_0_3, JAVA_15_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_15_0 = INSTANCE.getJAVA_15_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_15_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_15_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_15 = INSTANCE.getJAVA_15();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_15() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting(), JAVA_15_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_16_0_0_0 = INSTANCE.getJAVA_16_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_16_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.TYPE_PARAMETER__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_16_0_0_1_0_0_0 = INSTANCE.getJAVA_16_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_16_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("extends", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_16_0_0_1_0_0_1 = INSTANCE.getJAVA_16_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_16_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_16_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_16_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_16_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("&", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_16_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_16_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_16_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_16_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_16_0_0_1_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_16_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_16_0_0_1_0_0_2_0_0_0, JAVA_16_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_16_0_0_1_0_0_2_0 = INSTANCE.getJAVA_16_0_0_1_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_16_0_0_1_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_16_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_16_0_0_1_0_0_2 = INSTANCE.getJAVA_16_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_16_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_16_0_0_1_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_16_0_0_1_0_0 = INSTANCE.getJAVA_16_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_16_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_16_0_0_1_0_0_0, JAVA_16_0_0_1_0_0_1, JAVA_16_0_0_1_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_16_0_0_1_0 = INSTANCE.getJAVA_16_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_16_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_16_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_16_0_0_1 = INSTANCE.getJAVA_16_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_16_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_16_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_16_0_0 = INSTANCE.getJAVA_16_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_16_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_16_0_0_0, JAVA_16_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_16_0 = INSTANCE.getJAVA_16_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_16_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_16_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_16 = INSTANCE.getJAVA_16();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_16() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), JAVA_16_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_17_0_0_0 = INSTANCE.getJAVA_17_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_17_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ENUM_CONSTANT__ANNOTATIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_17_0_0_1 = INSTANCE.getJAVA_17_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_17_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ENUM_CONSTANT__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_17_0_0_2_0_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_17_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_17_0_0_2_0_0_1 = INSTANCE.getJAVA_17_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_17_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_17_0_0_2_0_0_2_0_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_17_0_0_2_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ENUM_CONSTANT__ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_17_0_0_2_0_0_2_0_0_1_0_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_17_0_0_2_0_0_2_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_17_0_0_2_0_0_2_0_0_1_0_0_1 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_17_0_0_2_0_0_2_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ENUM_CONSTANT__ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_17_0_0_2_0_0_2_0_0_1_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_17_0_0_2_0_0_2_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_17_0_0_2_0_0_2_0_0_1_0_0_0, JAVA_17_0_0_2_0_0_2_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_17_0_0_2_0_0_2_0_0_1_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_17_0_0_2_0_0_2_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_17_0_0_2_0_0_2_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_17_0_0_2_0_0_2_0_0_1 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_17_0_0_2_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_17_0_0_2_0_0_2_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_17_0_0_2_0_0_2_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_17_0_0_2_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_17_0_0_2_0_0_2_0_0_0, JAVA_17_0_0_2_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_17_0_0_2_0_0_2_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_17_0_0_2_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_17_0_0_2_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_17_0_0_2_0_0_2 = INSTANCE.getJAVA_17_0_0_2_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_17_0_0_2_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_17_0_0_2_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_17_0_0_2_0_0_3 = INSTANCE.getJAVA_17_0_0_2_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_17_0_0_2_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_17_0_0_2_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_17_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_17_0_0_2_0_0_0, JAVA_17_0_0_2_0_0_1, JAVA_17_0_0_2_0_0_2, JAVA_17_0_0_2_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_17_0_0_2_0 = INSTANCE.getJAVA_17_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_17_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_17_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_17_0_0_2 = INSTANCE.getJAVA_17_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_17_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_17_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_17_0_0_3_0_0_0 = INSTANCE.getJAVA_17_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_17_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnonymousClass(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_17_0_0_3_0_0 = INSTANCE.getJAVA_17_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_17_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_17_0_0_3_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_17_0_0_3_0 = INSTANCE.getJAVA_17_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_17_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_17_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_17_0_0_3 = INSTANCE.getJAVA_17_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_17_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_17_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_17_0_0 = INSTANCE.getJAVA_17_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_17_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_17_0_0_0, JAVA_17_0_0_1, JAVA_17_0_0_2, JAVA_17_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_17_0 = INSTANCE.getJAVA_17_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_17_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_17_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_17 = INSTANCE.getJAVA_17();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_17() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant(), JAVA_17_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_18_0_0_0 = INSTANCE.getJAVA_18_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_18_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.BLOCK__MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_18_0_0_1 = INSTANCE.getJAVA_18_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_18_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_18_0_0_2 = INSTANCE.getJAVA_18_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_18_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_18_0_0_3_0_0_0 = INSTANCE.getJAVA_18_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_18_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_18_0_0_3_0_0_1 = INSTANCE.getJAVA_18_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_18_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.BLOCK__STATEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_18_0_0_3_0_0 = INSTANCE.getJAVA_18_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_18_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_18_0_0_3_0_0_0, JAVA_18_0_0_3_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_18_0_0_3_0 = INSTANCE.getJAVA_18_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_18_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_18_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_18_0_0_3 = INSTANCE.getJAVA_18_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_18_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_18_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_18_0_0_4 = INSTANCE.getJAVA_18_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_18_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_18_0_0_5 = INSTANCE.getJAVA_18_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_18_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_18_0_0 = INSTANCE.getJAVA_18_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_18_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_18_0_0_0, JAVA_18_0_0_1, JAVA_18_0_0_2, JAVA_18_0_0_3, JAVA_18_0_0_4, JAVA_18_0_0_5);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_18_0 = INSTANCE.getJAVA_18_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_18_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_18_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_18 = INSTANCE.getJAVA_18();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_18() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBlock(), JAVA_18_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_19_0_0_0 = INSTANCE.getJAVA_19_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_19_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_19_0_0_1_0_0_0 = INSTANCE.getJAVA_19_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_19_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_19_0_0_1_0_0_1 = INSTANCE.getJAVA_19_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_19_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_19_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_19_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_19_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_19_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_19_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_19_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_19_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_19_0_0_1_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_19_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_1_0_0_2_0_0_0, JAVA_19_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_19_0_0_1_0_0_2_0 = INSTANCE.getJAVA_19_0_0_1_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_19_0_0_1_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_19_0_0_1_0_0_2 = INSTANCE.getJAVA_19_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_19_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_19_0_0_1_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_19_0_0_1_0_0_3 = INSTANCE.getJAVA_19_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_19_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_19_0_0_1_0_0 = INSTANCE.getJAVA_19_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_19_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_1_0_0_0, JAVA_19_0_0_1_0_0_1, JAVA_19_0_0_1_0_0_2, JAVA_19_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_19_0_0_1_0 = INSTANCE.getJAVA_19_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_19_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_19_0_0_1 = INSTANCE.getJAVA_19_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_19_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_19_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_19_0_0_2 = INSTANCE.getJAVA_19_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_19_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_19_0_0_3 = INSTANCE.getJAVA_19_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_19_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_19_0_0_4_0_0_0 = INSTANCE.getJAVA_19_0_0_4_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_19_0_0_4_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_19_0_0_4_0_0_1_0_0_0 = INSTANCE.getJAVA_19_0_0_4_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_19_0_0_4_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_19_0_0_4_0_0_1_0_0_1 = INSTANCE.getJAVA_19_0_0_4_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_19_0_0_4_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_19_0_0_4_0_0_1_0_0 = INSTANCE.getJAVA_19_0_0_4_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_19_0_0_4_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_4_0_0_1_0_0_0, JAVA_19_0_0_4_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_19_0_0_4_0_0_1_0 = INSTANCE.getJAVA_19_0_0_4_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_19_0_0_4_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_4_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_19_0_0_4_0_0_1 = INSTANCE.getJAVA_19_0_0_4_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_19_0_0_4_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_19_0_0_4_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_19_0_0_4_0_0 = INSTANCE.getJAVA_19_0_0_4_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_19_0_0_4_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_4_0_0_0, JAVA_19_0_0_4_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_19_0_0_4_0 = INSTANCE.getJAVA_19_0_0_4_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_19_0_0_4_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_4_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_19_0_0_4 = INSTANCE.getJAVA_19_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_19_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_19_0_0_4_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_19_0_0_5 = INSTANCE.getJAVA_19_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_19_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_19_0_0_6_0_0_0 = INSTANCE.getJAVA_19_0_0_6_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_19_0_0_6_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("throws", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_19_0_0_6_0_0_1 = INSTANCE.getJAVA_19_0_0_6_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_19_0_0_6_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__EXCEPTIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_19_0_0_6_0_0_2_0_0_0 = INSTANCE.getJAVA_19_0_0_6_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_19_0_0_6_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_19_0_0_6_0_0_2_0_0_1 = INSTANCE.getJAVA_19_0_0_6_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_19_0_0_6_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__EXCEPTIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_19_0_0_6_0_0_2_0_0 = INSTANCE.getJAVA_19_0_0_6_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_19_0_0_6_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_6_0_0_2_0_0_0, JAVA_19_0_0_6_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_19_0_0_6_0_0_2_0 = INSTANCE.getJAVA_19_0_0_6_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_19_0_0_6_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_6_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_19_0_0_6_0_0_2 = INSTANCE.getJAVA_19_0_0_6_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_19_0_0_6_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_19_0_0_6_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_19_0_0_6_0_0 = INSTANCE.getJAVA_19_0_0_6_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_19_0_0_6_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_6_0_0_0, JAVA_19_0_0_6_0_0_1, JAVA_19_0_0_6_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_19_0_0_6_0 = INSTANCE.getJAVA_19_0_0_6_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_19_0_0_6_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_6_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_19_0_0_6 = INSTANCE.getJAVA_19_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_19_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_19_0_0_6_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_19_0_0_7 = INSTANCE.getJAVA_19_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_19_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_19_0_0_8 = INSTANCE.getJAVA_19_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_19_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_19_0_0_9_0_0_0 = INSTANCE.getJAVA_19_0_0_9_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_19_0_0_9_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_19_0_0_9_0_0_1 = INSTANCE.getJAVA_19_0_0_9_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_19_0_0_9_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__STATEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_19_0_0_9_0_0 = INSTANCE.getJAVA_19_0_0_9_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_19_0_0_9_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_9_0_0_0, JAVA_19_0_0_9_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_19_0_0_9_0 = INSTANCE.getJAVA_19_0_0_9_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_19_0_0_9_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_9_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_19_0_0_9 = INSTANCE.getJAVA_19_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_19_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_19_0_0_9_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_19_0_0_10 = INSTANCE.getJAVA_19_0_0_10();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_19_0_0_10() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_19_0_0_11 = INSTANCE.getJAVA_19_0_0_11();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_19_0_0_11() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_19_0_0 = INSTANCE.getJAVA_19_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_19_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0_0, JAVA_19_0_0_1, JAVA_19_0_0_2, JAVA_19_0_0_3, JAVA_19_0_0_4, JAVA_19_0_0_5, JAVA_19_0_0_6, JAVA_19_0_0_7, JAVA_19_0_0_8, JAVA_19_0_0_9, JAVA_19_0_0_10, JAVA_19_0_0_11);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_19_0 = INSTANCE.getJAVA_19_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_19_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_19_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_19 = INSTANCE.getJAVA_19();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_19() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor(), JAVA_19_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_20_0_0_0 = INSTANCE.getJAVA_20_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_20_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_20_0_0_1_0_0_0 = INSTANCE.getJAVA_20_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_20_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_20_0_0_1_0_0_1 = INSTANCE.getJAVA_20_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_20_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_20_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_20_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_20_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_20_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_20_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_20_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_20_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_20_0_0_1_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_20_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_1_0_0_2_0_0_0, JAVA_20_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_20_0_0_1_0_0_2_0 = INSTANCE.getJAVA_20_0_0_1_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_20_0_0_1_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_20_0_0_1_0_0_2 = INSTANCE.getJAVA_20_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_20_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_20_0_0_1_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_20_0_0_1_0_0_3 = INSTANCE.getJAVA_20_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_20_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_20_0_0_1_0_0 = INSTANCE.getJAVA_20_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_20_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_1_0_0_0, JAVA_20_0_0_1_0_0_1, JAVA_20_0_0_1_0_0_2, JAVA_20_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_20_0_0_1_0 = INSTANCE.getJAVA_20_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_20_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_20_0_0_1 = INSTANCE.getJAVA_20_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_20_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_20_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_20_0_0_2_0_0_0 = INSTANCE.getJAVA_20_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_20_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_20_0_0_2_0_0_1 = INSTANCE.getJAVA_20_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_20_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_20_0_0_2_0_0 = INSTANCE.getJAVA_20_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_20_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_2_0_0_0, JAVA_20_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_20_0_0_2_0 = INSTANCE.getJAVA_20_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_20_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_20_0_0_2 = INSTANCE.getJAVA_20_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_20_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_20_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_20_0_0_3 = INSTANCE.getJAVA_20_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_20_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_20_0_0_4 = INSTANCE.getJAVA_20_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_20_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_20_0_0_5_0_0_0 = INSTANCE.getJAVA_20_0_0_5_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_20_0_0_5_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_20_0_0_5_0_0_1_0_0_0 = INSTANCE.getJAVA_20_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_20_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_20_0_0_5_0_0_1_0_0_1 = INSTANCE.getJAVA_20_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_20_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_20_0_0_5_0_0_1_0_0 = INSTANCE.getJAVA_20_0_0_5_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_20_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_5_0_0_1_0_0_0, JAVA_20_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_20_0_0_5_0_0_1_0 = INSTANCE.getJAVA_20_0_0_5_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_20_0_0_5_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_20_0_0_5_0_0_1 = INSTANCE.getJAVA_20_0_0_5_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_20_0_0_5_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_20_0_0_5_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_20_0_0_5_0_0 = INSTANCE.getJAVA_20_0_0_5_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_20_0_0_5_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_5_0_0_0, JAVA_20_0_0_5_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_20_0_0_5_0 = INSTANCE.getJAVA_20_0_0_5_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_20_0_0_5_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_5_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_20_0_0_5 = INSTANCE.getJAVA_20_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_20_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_20_0_0_5_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_20_0_0_6 = INSTANCE.getJAVA_20_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_20_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_20_0_0_7 = INSTANCE.getJAVA_20_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_20_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__ARRAY_DIMENSIONS_AFTER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_20_0_0_8_0_0_0 = INSTANCE.getJAVA_20_0_0_8_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_20_0_0_8_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("throws", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_20_0_0_8_0_0_1 = INSTANCE.getJAVA_20_0_0_8_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_20_0_0_8_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__EXCEPTIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_20_0_0_8_0_0_2_0_0_0 = INSTANCE.getJAVA_20_0_0_8_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_20_0_0_8_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_20_0_0_8_0_0_2_0_0_1 = INSTANCE.getJAVA_20_0_0_8_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_20_0_0_8_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__EXCEPTIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_20_0_0_8_0_0_2_0_0 = INSTANCE.getJAVA_20_0_0_8_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_20_0_0_8_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_8_0_0_2_0_0_0, JAVA_20_0_0_8_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_20_0_0_8_0_0_2_0 = INSTANCE.getJAVA_20_0_0_8_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_20_0_0_8_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_8_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_20_0_0_8_0_0_2 = INSTANCE.getJAVA_20_0_0_8_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_20_0_0_8_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_20_0_0_8_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_20_0_0_8_0_0 = INSTANCE.getJAVA_20_0_0_8_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_20_0_0_8_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_8_0_0_0, JAVA_20_0_0_8_0_0_1, JAVA_20_0_0_8_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_20_0_0_8_0 = INSTANCE.getJAVA_20_0_0_8_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_20_0_0_8_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_8_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_20_0_0_8 = INSTANCE.getJAVA_20_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_20_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_20_0_0_8_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_20_0_0_9 = INSTANCE.getJAVA_20_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_20_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_20_0_0 = INSTANCE.getJAVA_20_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_20_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0_0, JAVA_20_0_0_1, JAVA_20_0_0_2, JAVA_20_0_0_3, JAVA_20_0_0_4, JAVA_20_0_0_5, JAVA_20_0_0_6, JAVA_20_0_0_7, JAVA_20_0_0_8, JAVA_20_0_0_9);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_20_0 = INSTANCE.getJAVA_20_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_20_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_20_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_20 = INSTANCE.getJAVA_20();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_20() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod(), JAVA_20_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_21_0_0_0 = INSTANCE.getJAVA_21_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_21_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_21_0_0_1_0_0_0 = INSTANCE.getJAVA_21_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_21_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_21_0_0_1_0_0_1 = INSTANCE.getJAVA_21_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_21_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_21_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_21_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_21_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_21_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_21_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_21_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_21_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_21_0_0_1_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_21_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_1_0_0_2_0_0_0, JAVA_21_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_21_0_0_1_0_0_2_0 = INSTANCE.getJAVA_21_0_0_1_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_21_0_0_1_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_21_0_0_1_0_0_2 = INSTANCE.getJAVA_21_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_21_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_21_0_0_1_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_21_0_0_1_0_0_3 = INSTANCE.getJAVA_21_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_21_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_21_0_0_1_0_0 = INSTANCE.getJAVA_21_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_21_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_1_0_0_0, JAVA_21_0_0_1_0_0_1, JAVA_21_0_0_1_0_0_2, JAVA_21_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_21_0_0_1_0 = INSTANCE.getJAVA_21_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_21_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_21_0_0_1 = INSTANCE.getJAVA_21_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_21_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_21_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_21_0_0_2_0_0_0 = INSTANCE.getJAVA_21_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_21_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_21_0_0_2_0_0_1 = INSTANCE.getJAVA_21_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_21_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_21_0_0_2_0_0 = INSTANCE.getJAVA_21_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_21_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_2_0_0_0, JAVA_21_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_21_0_0_2_0 = INSTANCE.getJAVA_21_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_21_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_21_0_0_2 = INSTANCE.getJAVA_21_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_21_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_21_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_21_0_0_3 = INSTANCE.getJAVA_21_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_21_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_21_0_0_4 = INSTANCE.getJAVA_21_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_21_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_21_0_0_5_0_0_0 = INSTANCE.getJAVA_21_0_0_5_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_21_0_0_5_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_21_0_0_5_0_0_1_0_0_0 = INSTANCE.getJAVA_21_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_21_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_21_0_0_5_0_0_1_0_0_1 = INSTANCE.getJAVA_21_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_21_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_21_0_0_5_0_0_1_0_0 = INSTANCE.getJAVA_21_0_0_5_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_21_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_5_0_0_1_0_0_0, JAVA_21_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_21_0_0_5_0_0_1_0 = INSTANCE.getJAVA_21_0_0_5_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_21_0_0_5_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_21_0_0_5_0_0_1 = INSTANCE.getJAVA_21_0_0_5_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_21_0_0_5_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_21_0_0_5_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_21_0_0_5_0_0 = INSTANCE.getJAVA_21_0_0_5_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_21_0_0_5_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_5_0_0_0, JAVA_21_0_0_5_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_21_0_0_5_0 = INSTANCE.getJAVA_21_0_0_5_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_21_0_0_5_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_5_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_21_0_0_5 = INSTANCE.getJAVA_21_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_21_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_21_0_0_5_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_21_0_0_6 = INSTANCE.getJAVA_21_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_21_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_21_0_0_7 = INSTANCE.getJAVA_21_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_21_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__ARRAY_DIMENSIONS_AFTER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_21_0_0_8_0_0_0 = INSTANCE.getJAVA_21_0_0_8_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_21_0_0_8_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("throws", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_21_0_0_8_0_0_1 = INSTANCE.getJAVA_21_0_0_8_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_21_0_0_8_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__EXCEPTIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_21_0_0_8_0_0_2_0_0_0 = INSTANCE.getJAVA_21_0_0_8_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_21_0_0_8_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_21_0_0_8_0_0_2_0_0_1 = INSTANCE.getJAVA_21_0_0_8_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_21_0_0_8_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__EXCEPTIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_21_0_0_8_0_0_2_0_0 = INSTANCE.getJAVA_21_0_0_8_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_21_0_0_8_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_8_0_0_2_0_0_0, JAVA_21_0_0_8_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_21_0_0_8_0_0_2_0 = INSTANCE.getJAVA_21_0_0_8_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_21_0_0_8_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_8_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_21_0_0_8_0_0_2 = INSTANCE.getJAVA_21_0_0_8_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_21_0_0_8_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_21_0_0_8_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_21_0_0_8_0_0 = INSTANCE.getJAVA_21_0_0_8_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_21_0_0_8_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_8_0_0_0, JAVA_21_0_0_8_0_0_1, JAVA_21_0_0_8_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_21_0_0_8_0 = INSTANCE.getJAVA_21_0_0_8_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_21_0_0_8_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_8_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_21_0_0_8 = INSTANCE.getJAVA_21_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_21_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_21_0_0_8_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_21_0_0_9 = INSTANCE.getJAVA_21_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_21_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_21_0_0_10 = INSTANCE.getJAVA_21_0_0_10();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_21_0_0_10() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_21_0_0_11_0_0_0 = INSTANCE.getJAVA_21_0_0_11_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_21_0_0_11_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_21_0_0_11_0_0_1 = INSTANCE.getJAVA_21_0_0_11_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_21_0_0_11_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__STATEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_21_0_0_11_0_0 = INSTANCE.getJAVA_21_0_0_11_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_21_0_0_11_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_11_0_0_0, JAVA_21_0_0_11_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_21_0_0_11_0 = INSTANCE.getJAVA_21_0_0_11_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_21_0_0_11_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_11_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_21_0_0_11 = INSTANCE.getJAVA_21_0_0_11();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_21_0_0_11() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_21_0_0_11_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_21_0_0_12 = INSTANCE.getJAVA_21_0_0_12();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_21_0_0_12() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_21_0_0_13 = INSTANCE.getJAVA_21_0_0_13();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_21_0_0_13() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_21_0_0 = INSTANCE.getJAVA_21_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_21_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0_0, JAVA_21_0_0_1, JAVA_21_0_0_2, JAVA_21_0_0_3, JAVA_21_0_0_4, JAVA_21_0_0_5, JAVA_21_0_0_6, JAVA_21_0_0_7, JAVA_21_0_0_8, JAVA_21_0_0_9, JAVA_21_0_0_10, JAVA_21_0_0_11, JAVA_21_0_0_12, JAVA_21_0_0_13);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_21_0 = INSTANCE.getJAVA_21_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_21_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_21_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_21 = INSTANCE.getJAVA_21();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_21() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod(), JAVA_21_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_22_0_0_0 = INSTANCE.getJAVA_22_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_22_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_22_0_0_1_0_0_0 = INSTANCE.getJAVA_22_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_22_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_22_0_0_1_0_0_1 = INSTANCE.getJAVA_22_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_22_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_22_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_22_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_22_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_22_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_22_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_22_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__TYPE_PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_22_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_22_0_0_1_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_22_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_1_0_0_2_0_0_0, JAVA_22_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_22_0_0_1_0_0_2_0 = INSTANCE.getJAVA_22_0_0_1_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_22_0_0_1_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_22_0_0_1_0_0_2 = INSTANCE.getJAVA_22_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_22_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_22_0_0_1_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_22_0_0_1_0_0_3 = INSTANCE.getJAVA_22_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_22_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_22_0_0_1_0_0 = INSTANCE.getJAVA_22_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_22_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_1_0_0_0, JAVA_22_0_0_1_0_0_1, JAVA_22_0_0_1_0_0_2, JAVA_22_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_22_0_0_1_0 = INSTANCE.getJAVA_22_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_22_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_22_0_0_1 = INSTANCE.getJAVA_22_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_22_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_22_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_22_0_0_2_0_0_0 = INSTANCE.getJAVA_22_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_22_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_22_0_0_2_0_0_1 = INSTANCE.getJAVA_22_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_22_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_22_0_0_2_0_0 = INSTANCE.getJAVA_22_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_22_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_2_0_0_0, JAVA_22_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_22_0_0_2_0 = INSTANCE.getJAVA_22_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_22_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_22_0_0_2 = INSTANCE.getJAVA_22_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_22_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_22_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_22_0_0_3 = INSTANCE.getJAVA_22_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_22_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_22_0_0_4 = INSTANCE.getJAVA_22_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_22_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_22_0_0_5_0_0_0 = INSTANCE.getJAVA_22_0_0_5_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_22_0_0_5_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_22_0_0_5_0_0_1_0_0_0 = INSTANCE.getJAVA_22_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_22_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_22_0_0_5_0_0_1_0_0_1 = INSTANCE.getJAVA_22_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_22_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__PARAMETERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_22_0_0_5_0_0_1_0_0 = INSTANCE.getJAVA_22_0_0_5_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_22_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_5_0_0_1_0_0_0, JAVA_22_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_22_0_0_5_0_0_1_0 = INSTANCE.getJAVA_22_0_0_5_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_22_0_0_5_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_22_0_0_5_0_0_1 = INSTANCE.getJAVA_22_0_0_5_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_22_0_0_5_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_22_0_0_5_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_22_0_0_5_0_0 = INSTANCE.getJAVA_22_0_0_5_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_22_0_0_5_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_5_0_0_0, JAVA_22_0_0_5_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_22_0_0_5_0 = INSTANCE.getJAVA_22_0_0_5_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_22_0_0_5_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_5_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_22_0_0_5 = INSTANCE.getJAVA_22_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_22_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_22_0_0_5_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_22_0_0_6 = INSTANCE.getJAVA_22_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_22_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_22_0_0_7 = INSTANCE.getJAVA_22_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_22_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__ARRAY_DIMENSIONS_AFTER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_22_0_0_8_0_0_0 = INSTANCE.getJAVA_22_0_0_8_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_22_0_0_8_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("throws", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_22_0_0_8_0_0_1 = INSTANCE.getJAVA_22_0_0_8_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_22_0_0_8_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__EXCEPTIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_22_0_0_8_0_0_2_0_0_0 = INSTANCE.getJAVA_22_0_0_8_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_22_0_0_8_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_22_0_0_8_0_0_2_0_0_1 = INSTANCE.getJAVA_22_0_0_8_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_22_0_0_8_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__EXCEPTIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_22_0_0_8_0_0_2_0_0 = INSTANCE.getJAVA_22_0_0_8_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_22_0_0_8_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_8_0_0_2_0_0_0, JAVA_22_0_0_8_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_22_0_0_8_0_0_2_0 = INSTANCE.getJAVA_22_0_0_8_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_22_0_0_8_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_8_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_22_0_0_8_0_0_2 = INSTANCE.getJAVA_22_0_0_8_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_22_0_0_8_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_22_0_0_8_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_22_0_0_8_0_0 = INSTANCE.getJAVA_22_0_0_8_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_22_0_0_8_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_8_0_0_0, JAVA_22_0_0_8_0_0_1, JAVA_22_0_0_8_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_22_0_0_8_0 = INSTANCE.getJAVA_22_0_0_8_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_22_0_0_8_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_8_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_22_0_0_8 = INSTANCE.getJAVA_22_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_22_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_22_0_0_8_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_22_0_0_9 = INSTANCE.getJAVA_22_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_22_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("default", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_22_0_0_10 = INSTANCE.getJAVA_22_0_0_10();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_22_0_0_10() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_22_0_0_11 = INSTANCE.getJAVA_22_0_0_11();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_22_0_0_11() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_22_0_0 = INSTANCE.getJAVA_22_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_22_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0_0, JAVA_22_0_0_1, JAVA_22_0_0_2, JAVA_22_0_0_3, JAVA_22_0_0_4, JAVA_22_0_0_5, JAVA_22_0_0_6, JAVA_22_0_0_7, JAVA_22_0_0_8, JAVA_22_0_0_9, JAVA_22_0_0_10, JAVA_22_0_0_11);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_22_0 = INSTANCE.getJAVA_22_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_22_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_22_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_22 = INSTANCE.getJAVA_22();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_22() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute(), JAVA_22_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_23_0_0_0 = INSTANCE.getJAVA_23_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_23_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_23_0_0_1 = INSTANCE.getJAVA_23_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_23_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_23_0_0_2 = INSTANCE.getJAVA_23_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_23_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_23_0_0_3_0_0_0 = INSTANCE.getJAVA_23_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_23_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_23_0_0_3_0_0_1 = INSTANCE.getJAVA_23_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_23_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_23_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_23_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_23_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_23_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_23_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_23_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_23_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_23_0_0_3_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_23_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_23_0_0_3_0_0_2_0_0_0, JAVA_23_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_23_0_0_3_0_0_2_0 = INSTANCE.getJAVA_23_0_0_3_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_23_0_0_3_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_23_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_23_0_0_3_0_0_2 = INSTANCE.getJAVA_23_0_0_3_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_23_0_0_3_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_23_0_0_3_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_23_0_0_3_0_0_3 = INSTANCE.getJAVA_23_0_0_3_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_23_0_0_3_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_23_0_0_3_0_0 = INSTANCE.getJAVA_23_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_23_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_23_0_0_3_0_0_0, JAVA_23_0_0_3_0_0_1, JAVA_23_0_0_3_0_0_2, JAVA_23_0_0_3_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_23_0_0_3_0 = INSTANCE.getJAVA_23_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_23_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_23_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_23_0_0_3 = INSTANCE.getJAVA_23_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_23_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_23_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_23_0_0_4 = INSTANCE.getJAVA_23_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_23_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_23_0_0_5 = INSTANCE.getJAVA_23_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_23_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__ARRAY_DIMENSIONS_AFTER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_23_0_0 = INSTANCE.getJAVA_23_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_23_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_23_0_0_0, JAVA_23_0_0_1, JAVA_23_0_0_2, JAVA_23_0_0_3, JAVA_23_0_0_4, JAVA_23_0_0_5);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_23_0 = INSTANCE.getJAVA_23_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_23_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_23_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_23 = INSTANCE.getJAVA_23();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_23() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter(), JAVA_23_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_24_0_0_0 = INSTANCE.getJAVA_24_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_24_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_24_0_0_1 = INSTANCE.getJAVA_24_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_24_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_24_0_0_2 = INSTANCE.getJAVA_24_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_24_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_24_0_0_3_0_0_0 = INSTANCE.getJAVA_24_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_24_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_24_0_0_3_0_0_1 = INSTANCE.getJAVA_24_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_24_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_24_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_24_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_24_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_24_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_24_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_24_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_24_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_24_0_0_3_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_24_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_24_0_0_3_0_0_2_0_0_0, JAVA_24_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_24_0_0_3_0_0_2_0 = INSTANCE.getJAVA_24_0_0_3_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_24_0_0_3_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_24_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_24_0_0_3_0_0_2 = INSTANCE.getJAVA_24_0_0_3_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_24_0_0_3_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_24_0_0_3_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_24_0_0_3_0_0_3 = INSTANCE.getJAVA_24_0_0_3_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_24_0_0_3_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_24_0_0_3_0_0 = INSTANCE.getJAVA_24_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_24_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_24_0_0_3_0_0_0, JAVA_24_0_0_3_0_0_1, JAVA_24_0_0_3_0_0_2, JAVA_24_0_0_3_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_24_0_0_3_0 = INSTANCE.getJAVA_24_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_24_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_24_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_24_0_0_3 = INSTANCE.getJAVA_24_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_24_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_24_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_24_0_0_4 = INSTANCE.getJAVA_24_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_24_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("...", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_24_0_0_5 = INSTANCE.getJAVA_24_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_24_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_24_0_0 = INSTANCE.getJAVA_24_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_24_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_24_0_0_0, JAVA_24_0_0_1, JAVA_24_0_0_2, JAVA_24_0_0_3, JAVA_24_0_0_4, JAVA_24_0_0_5);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_24_0 = INSTANCE.getJAVA_24_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_24_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_24_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_24 = INSTANCE.getJAVA_24();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_24() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter(), JAVA_24_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_25_0_0_0 = INSTANCE.getJAVA_25_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_25_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_25_0_0_1 = INSTANCE.getJAVA_25_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_25_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_25_0_0_2 = INSTANCE.getJAVA_25_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_25_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_25_0_0_3_0_0_0 = INSTANCE.getJAVA_25_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_25_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_25_0_0_3_0_0_1 = INSTANCE.getJAVA_25_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_25_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_25_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_25_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_25_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_25_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_25_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_25_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_25_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_25_0_0_3_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_25_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_25_0_0_3_0_0_2_0_0_0, JAVA_25_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_25_0_0_3_0_0_2_0 = INSTANCE.getJAVA_25_0_0_3_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_25_0_0_3_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_25_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_25_0_0_3_0_0_2 = INSTANCE.getJAVA_25_0_0_3_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_25_0_0_3_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_25_0_0_3_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_25_0_0_3_0_0_3 = INSTANCE.getJAVA_25_0_0_3_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_25_0_0_3_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_25_0_0_3_0_0 = INSTANCE.getJAVA_25_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_25_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_25_0_0_3_0_0_0, JAVA_25_0_0_3_0_0_1, JAVA_25_0_0_3_0_0_2, JAVA_25_0_0_3_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_25_0_0_3_0 = INSTANCE.getJAVA_25_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_25_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_25_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_25_0_0_3 = INSTANCE.getJAVA_25_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_25_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_25_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_25_0_0_4 = INSTANCE.getJAVA_25_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_25_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_25_0_0_5 = INSTANCE.getJAVA_25_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_25_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_25_0_0_6_0_0_0 = INSTANCE.getJAVA_25_0_0_6_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_25_0_0_6_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_25_0_0_6_0_0_1 = INSTANCE.getJAVA_25_0_0_6_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_25_0_0_6_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_25_0_0_6_0_0_2 = INSTANCE.getJAVA_25_0_0_6_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_25_0_0_6_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_25_0_0_6_0_0_3 = INSTANCE.getJAVA_25_0_0_6_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_25_0_0_6_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_25_0_0_6_0_0 = INSTANCE.getJAVA_25_0_0_6_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_25_0_0_6_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_25_0_0_6_0_0_0, JAVA_25_0_0_6_0_0_1, JAVA_25_0_0_6_0_0_2, JAVA_25_0_0_6_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_25_0_0_6_0 = INSTANCE.getJAVA_25_0_0_6_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_25_0_0_6_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_25_0_0_6_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_25_0_0_6 = INSTANCE.getJAVA_25_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_25_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_25_0_0_6_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_25_0_0_7_0_0_0 = INSTANCE.getJAVA_25_0_0_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_25_0_0_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_25_0_0_7_0_0_1 = INSTANCE.getJAVA_25_0_0_7_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_25_0_0_7_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getAdditionalLocalVariable(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_25_0_0_7_0_0 = INSTANCE.getJAVA_25_0_0_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_25_0_0_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_25_0_0_7_0_0_0, JAVA_25_0_0_7_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_25_0_0_7_0 = INSTANCE.getJAVA_25_0_0_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_25_0_0_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_25_0_0_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_25_0_0_7 = INSTANCE.getJAVA_25_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_25_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_25_0_0_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_25_0_0 = INSTANCE.getJAVA_25_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_25_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_25_0_0_0, JAVA_25_0_0_1, JAVA_25_0_0_2, JAVA_25_0_0_3, JAVA_25_0_0_4, JAVA_25_0_0_5, JAVA_25_0_0_6, JAVA_25_0_0_7);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_25_0 = INSTANCE.getJAVA_25_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_25_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_25_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_25 = INSTANCE.getJAVA_25();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_25() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable(), JAVA_25_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_26_0_0_0 = INSTANCE.getJAVA_26_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_26_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getLocalVariableStatement().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.LOCAL_VARIABLE_STATEMENT__VARIABLE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_26_0_0_1 = INSTANCE.getJAVA_26_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_26_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_26_0_0 = INSTANCE.getJAVA_26_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_26_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_26_0_0_0, JAVA_26_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_26_0 = INSTANCE.getJAVA_26_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_26_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_26_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_26 = INSTANCE.getJAVA_26();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_26() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getLocalVariableStatement(), JAVA_26_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_27_0_0_0 = INSTANCE.getJAVA_27_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_27_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getAdditionalLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.ADDITIONAL_LOCAL_VARIABLE__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_27_0_0_1 = INSTANCE.getJAVA_27_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_27_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getAdditionalLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_27_0_0_2_0_0_0 = INSTANCE.getJAVA_27_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_27_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_27_0_0_2_0_0_1 = INSTANCE.getJAVA_27_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_27_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_27_0_0_2_0_0_2 = INSTANCE.getJAVA_27_0_0_2_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_27_0_0_2_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_27_0_0_2_0_0_3 = INSTANCE.getJAVA_27_0_0_2_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_27_0_0_2_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getAdditionalLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_27_0_0_2_0_0 = INSTANCE.getJAVA_27_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_27_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_27_0_0_2_0_0_0, JAVA_27_0_0_2_0_0_1, JAVA_27_0_0_2_0_0_2, JAVA_27_0_0_2_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_27_0_0_2_0 = INSTANCE.getJAVA_27_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_27_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_27_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_27_0_0_2 = INSTANCE.getJAVA_27_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_27_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_27_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_27_0_0 = INSTANCE.getJAVA_27_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_27_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_27_0_0_0, JAVA_27_0_0_1, JAVA_27_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_27_0 = INSTANCE.getJAVA_27_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_27_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_27_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_27 = INSTANCE.getJAVA_27();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_27() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getAdditionalLocalVariable(), JAVA_27_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_28_0_0_0 = INSTANCE.getJAVA_28_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_28_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_28_0_0_1 = INSTANCE.getJAVA_28_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_28_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_28_0_0_2 = INSTANCE.getJAVA_28_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_28_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_28_0_0_3_0_0_0 = INSTANCE.getJAVA_28_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_28_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_28_0_0_3_0_0_1 = INSTANCE.getJAVA_28_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_28_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_28_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_28_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_28_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_28_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_28_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_28_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_28_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_28_0_0_3_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_28_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_28_0_0_3_0_0_2_0_0_0, JAVA_28_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_28_0_0_3_0_0_2_0 = INSTANCE.getJAVA_28_0_0_3_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_28_0_0_3_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_28_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_28_0_0_3_0_0_2 = INSTANCE.getJAVA_28_0_0_3_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_28_0_0_3_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_28_0_0_3_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_28_0_0_3_0_0_3 = INSTANCE.getJAVA_28_0_0_3_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_28_0_0_3_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_28_0_0_3_0_0 = INSTANCE.getJAVA_28_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_28_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_28_0_0_3_0_0_0, JAVA_28_0_0_3_0_0_1, JAVA_28_0_0_3_0_0_2, JAVA_28_0_0_3_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_28_0_0_3_0 = INSTANCE.getJAVA_28_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_28_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_28_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_28_0_0_3 = INSTANCE.getJAVA_28_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_28_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_28_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_28_0_0_4 = INSTANCE.getJAVA_28_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_28_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_28_0_0_5 = INSTANCE.getJAVA_28_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_28_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_28_0_0_6_0_0_0 = INSTANCE.getJAVA_28_0_0_6_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_28_0_0_6_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_28_0_0_6_0_0_1 = INSTANCE.getJAVA_28_0_0_6_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_28_0_0_6_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_28_0_0_6_0_0_2 = INSTANCE.getJAVA_28_0_0_6_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_28_0_0_6_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_28_0_0_6_0_0_3 = INSTANCE.getJAVA_28_0_0_6_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_28_0_0_6_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__INITIAL_VALUE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_28_0_0_6_0_0 = INSTANCE.getJAVA_28_0_0_6_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_28_0_0_6_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_28_0_0_6_0_0_0, JAVA_28_0_0_6_0_0_1, JAVA_28_0_0_6_0_0_2, JAVA_28_0_0_6_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_28_0_0_6_0 = INSTANCE.getJAVA_28_0_0_6_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_28_0_0_6_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_28_0_0_6_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_28_0_0_6 = INSTANCE.getJAVA_28_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_28_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_28_0_0_6_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_28_0_0_7_0_0_0 = INSTANCE.getJAVA_28_0_0_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_28_0_0_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_28_0_0_7_0_0_1 = INSTANCE.getJAVA_28_0_0_7_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_28_0_0_7_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__ADDITIONAL_FIELDS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getAdditionalField(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_28_0_0_7_0_0 = INSTANCE.getJAVA_28_0_0_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_28_0_0_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_28_0_0_7_0_0_0, JAVA_28_0_0_7_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_28_0_0_7_0 = INSTANCE.getJAVA_28_0_0_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_28_0_0_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_28_0_0_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_28_0_0_7 = INSTANCE.getJAVA_28_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_28_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_28_0_0_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_28_0_0_8 = INSTANCE.getJAVA_28_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_28_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_28_0_0 = INSTANCE.getJAVA_28_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_28_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_28_0_0_0, JAVA_28_0_0_1, JAVA_28_0_0_2, JAVA_28_0_0_3, JAVA_28_0_0_4, JAVA_28_0_0_5, JAVA_28_0_0_6, JAVA_28_0_0_7, JAVA_28_0_0_8);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_28_0 = INSTANCE.getJAVA_28_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_28_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_28_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_28 = INSTANCE.getJAVA_28();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_28() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField(), JAVA_28_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_29_0_0_0 = INSTANCE.getJAVA_29_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_29_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getAdditionalField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ADDITIONAL_FIELD__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_29_0_0_1 = INSTANCE.getJAVA_29_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_29_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getAdditionalField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ADDITIONAL_FIELD__ARRAY_DIMENSIONS_AFTER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_29_0_0_2_0_0_0 = INSTANCE.getJAVA_29_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_29_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_29_0_0_2_0_0_1 = INSTANCE.getJAVA_29_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_29_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_29_0_0_2_0_0_2 = INSTANCE.getJAVA_29_0_0_2_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_29_0_0_2_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_29_0_0_2_0_0_3 = INSTANCE.getJAVA_29_0_0_2_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_29_0_0_2_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getAdditionalField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_29_0_0_2_0_0 = INSTANCE.getJAVA_29_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_29_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_29_0_0_2_0_0_0, JAVA_29_0_0_2_0_0_1, JAVA_29_0_0_2_0_0_2, JAVA_29_0_0_2_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_29_0_0_2_0 = INSTANCE.getJAVA_29_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_29_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_29_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_29_0_0_2 = INSTANCE.getJAVA_29_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_29_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_29_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_29_0_0 = INSTANCE.getJAVA_29_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_29_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_29_0_0_0, JAVA_29_0_0_1, JAVA_29_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_29_0 = INSTANCE.getJAVA_29_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_29_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_29_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_29 = INSTANCE.getJAVA_29();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_29() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getAdditionalField(), JAVA_29_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_30_0_0_0 = INSTANCE.getJAVA_30_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_30_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_30_0_0 = INSTANCE.getJAVA_30_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_30_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_30_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_30_0 = INSTANCE.getJAVA_30_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_30_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_30_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_30 = INSTANCE.getJAVA_30();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_30() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEmptyMember(), JAVA_30_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_31_0_0_0 = INSTANCE.getJAVA_31_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_31_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("new", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_31_0_0_1_0_0_0 = INSTANCE.getJAVA_31_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_31_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_31_0_0_1_0_0_1 = INSTANCE.getJAVA_31_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_31_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_31_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_31_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_31_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_31_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_31_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_31_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_31_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_31_0_0_1_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_31_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_1_0_0_2_0_0_0, JAVA_31_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_31_0_0_1_0_0_2_0 = INSTANCE.getJAVA_31_0_0_1_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_31_0_0_1_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_31_0_0_1_0_0_2 = INSTANCE.getJAVA_31_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_31_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_31_0_0_1_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_31_0_0_1_0_0_3 = INSTANCE.getJAVA_31_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_31_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_31_0_0_1_0_0 = INSTANCE.getJAVA_31_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_31_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_1_0_0_0, JAVA_31_0_0_1_0_0_1, JAVA_31_0_0_1_0_0_2, JAVA_31_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_31_0_0_1_0 = INSTANCE.getJAVA_31_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_31_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_31_0_0_1 = INSTANCE.getJAVA_31_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_31_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_31_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_31_0_0_2 = INSTANCE.getJAVA_31_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_31_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_31_0_0_3_0_0_0 = INSTANCE.getJAVA_31_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_31_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_31_0_0_3_0_0_1 = INSTANCE.getJAVA_31_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_31_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_31_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_31_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_31_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_31_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_31_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_31_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_31_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_31_0_0_3_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_31_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_3_0_0_2_0_0_0, JAVA_31_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_31_0_0_3_0_0_2_0 = INSTANCE.getJAVA_31_0_0_3_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_31_0_0_3_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_31_0_0_3_0_0_2 = INSTANCE.getJAVA_31_0_0_3_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_31_0_0_3_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_31_0_0_3_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_31_0_0_3_0_0_3 = INSTANCE.getJAVA_31_0_0_3_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_31_0_0_3_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_31_0_0_3_0_0 = INSTANCE.getJAVA_31_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_31_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_3_0_0_0, JAVA_31_0_0_3_0_0_1, JAVA_31_0_0_3_0_0_2, JAVA_31_0_0_3_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_31_0_0_3_0 = INSTANCE.getJAVA_31_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_31_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_31_0_0_3 = INSTANCE.getJAVA_31_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_31_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_31_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_31_0_0_4 = INSTANCE.getJAVA_31_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_31_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_31_0_0_5_0_0_0 = INSTANCE.getJAVA_31_0_0_5_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_31_0_0_5_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_31_0_0_5_0_0_1_0_0_0 = INSTANCE.getJAVA_31_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_31_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_31_0_0_5_0_0_1_0_0_1 = INSTANCE.getJAVA_31_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_31_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_31_0_0_5_0_0_1_0_0 = INSTANCE.getJAVA_31_0_0_5_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_31_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_5_0_0_1_0_0_0, JAVA_31_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_31_0_0_5_0_0_1_0 = INSTANCE.getJAVA_31_0_0_5_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_31_0_0_5_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_31_0_0_5_0_0_1 = INSTANCE.getJAVA_31_0_0_5_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_31_0_0_5_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_31_0_0_5_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_31_0_0_5_0_0 = INSTANCE.getJAVA_31_0_0_5_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_31_0_0_5_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_5_0_0_0, JAVA_31_0_0_5_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_31_0_0_5_0 = INSTANCE.getJAVA_31_0_0_5_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_31_0_0_5_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_5_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_31_0_0_5 = INSTANCE.getJAVA_31_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_31_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_31_0_0_5_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_31_0_0_6 = INSTANCE.getJAVA_31_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_31_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_31_0_0_7 = INSTANCE.getJAVA_31_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_31_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnonymousClass(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_31_0_0_8_0_0_0 = INSTANCE.getJAVA_31_0_0_8_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_31_0_0_8_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_31_0_0_8_0_0_1 = INSTANCE.getJAVA_31_0_0_8_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_31_0_0_8_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_31_0_0_8_0_0 = INSTANCE.getJAVA_31_0_0_8_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_31_0_0_8_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_8_0_0_0, JAVA_31_0_0_8_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_31_0_0_8_0 = INSTANCE.getJAVA_31_0_0_8_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_31_0_0_8_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_8_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_31_0_0_8 = INSTANCE.getJAVA_31_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_31_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_31_0_0_8_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_31_0_0 = INSTANCE.getJAVA_31_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_31_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0_0, JAVA_31_0_0_1, JAVA_31_0_0_2, JAVA_31_0_0_3, JAVA_31_0_0_4, JAVA_31_0_0_5, JAVA_31_0_0_6, JAVA_31_0_0_7, JAVA_31_0_0_8);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_31_0 = INSTANCE.getJAVA_31_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_31_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_31_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_31 = INSTANCE.getJAVA_31();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_31() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall(), JAVA_31_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_32_0_0_0_0_0_0 = INSTANCE.getJAVA_32_0_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_32_0_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_32_0_0_0_0_0_1 = INSTANCE.getJAVA_32_0_0_0_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_32_0_0_0_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_32_0_0_0_0_0_2_0_0_0 = INSTANCE.getJAVA_32_0_0_0_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_32_0_0_0_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_32_0_0_0_0_0_2_0_0_1 = INSTANCE.getJAVA_32_0_0_0_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_32_0_0_0_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_32_0_0_0_0_0_2_0_0 = INSTANCE.getJAVA_32_0_0_0_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_32_0_0_0_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0_0_0_0_2_0_0_0, JAVA_32_0_0_0_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_32_0_0_0_0_0_2_0 = INSTANCE.getJAVA_32_0_0_0_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_32_0_0_0_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0_0_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_32_0_0_0_0_0_2 = INSTANCE.getJAVA_32_0_0_0_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_32_0_0_0_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_32_0_0_0_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_32_0_0_0_0_0_3 = INSTANCE.getJAVA_32_0_0_0_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_32_0_0_0_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_32_0_0_0_0_0 = INSTANCE.getJAVA_32_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_32_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0_0_0_0_0, JAVA_32_0_0_0_0_0_1, JAVA_32_0_0_0_0_0_2, JAVA_32_0_0_0_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_32_0_0_0_0 = INSTANCE.getJAVA_32_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_32_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_32_0_0_0 = INSTANCE.getJAVA_32_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_32_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_32_0_0_0_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_32_0_0_1 = INSTANCE.getJAVA_32_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_32_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getSelf(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_32_0_0_2 = INSTANCE.getJAVA_32_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_32_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_32_0_0_3_0_0_0 = INSTANCE.getJAVA_32_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_32_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_32_0_0_3_0_0_1_0_0_0 = INSTANCE.getJAVA_32_0_0_3_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_32_0_0_3_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_32_0_0_3_0_0_1_0_0_1 = INSTANCE.getJAVA_32_0_0_3_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_32_0_0_3_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_32_0_0_3_0_0_1_0_0 = INSTANCE.getJAVA_32_0_0_3_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_32_0_0_3_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0_3_0_0_1_0_0_0, JAVA_32_0_0_3_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_32_0_0_3_0_0_1_0 = INSTANCE.getJAVA_32_0_0_3_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_32_0_0_3_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0_3_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_32_0_0_3_0_0_1 = INSTANCE.getJAVA_32_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_32_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_32_0_0_3_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_32_0_0_3_0_0 = INSTANCE.getJAVA_32_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_32_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0_3_0_0_0, JAVA_32_0_0_3_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_32_0_0_3_0 = INSTANCE.getJAVA_32_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_32_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_32_0_0_3 = INSTANCE.getJAVA_32_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_32_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_32_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_32_0_0_4 = INSTANCE.getJAVA_32_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_32_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_32_0_0_5_0_0_0 = INSTANCE.getJAVA_32_0_0_5_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_32_0_0_5_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_32_0_0_5_0_0_1 = INSTANCE.getJAVA_32_0_0_5_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_32_0_0_5_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_32_0_0_5_0_0 = INSTANCE.getJAVA_32_0_0_5_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_32_0_0_5_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0_5_0_0_0, JAVA_32_0_0_5_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_32_0_0_5_0 = INSTANCE.getJAVA_32_0_0_5_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_32_0_0_5_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0_5_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_32_0_0_5 = INSTANCE.getJAVA_32_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_32_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_32_0_0_5_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_32_0_0 = INSTANCE.getJAVA_32_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_32_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0_0, JAVA_32_0_0_1, JAVA_32_0_0_2, JAVA_32_0_0_3, JAVA_32_0_0_4, JAVA_32_0_0_5);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_32_0 = INSTANCE.getJAVA_32_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_32_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_32_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_32 = INSTANCE.getJAVA_32();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_32() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall(), JAVA_32_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_33_0_0_0 = INSTANCE.getJAVA_33_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_33_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("new", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_33_0_0_1 = INSTANCE.getJAVA_33_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_33_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_33_0_0_2 = INSTANCE.getJAVA_33_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_33_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_33_0_0_3 = INSTANCE.getJAVA_33_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_33_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_INITIALIZER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_33_0_0_4 = INSTANCE.getJAVA_33_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_33_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_SELECTORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_33_0_0_5_0_0_0 = INSTANCE.getJAVA_33_0_0_5_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_33_0_0_5_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_33_0_0_5_0_0_1 = INSTANCE.getJAVA_33_0_0_5_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_33_0_0_5_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_33_0_0_5_0_0 = INSTANCE.getJAVA_33_0_0_5_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_33_0_0_5_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_33_0_0_5_0_0_0, JAVA_33_0_0_5_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_33_0_0_5_0 = INSTANCE.getJAVA_33_0_0_5_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_33_0_0_5_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_33_0_0_5_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_33_0_0_5 = INSTANCE.getJAVA_33_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_33_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_33_0_0_5_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_33_0_0 = INSTANCE.getJAVA_33_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_33_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_33_0_0_0, JAVA_33_0_0_1, JAVA_33_0_0_2, JAVA_33_0_0_3, JAVA_33_0_0_4, JAVA_33_0_0_5);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_33_0 = INSTANCE.getJAVA_33_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_33_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_33_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_33 = INSTANCE.getJAVA_33();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_33() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped(), JAVA_33_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_34_0_0_0 = INSTANCE.getJAVA_34_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_34_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesUntyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__ARRAY_INITIALIZER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_34_0_0_1 = INSTANCE.getJAVA_34_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_34_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesUntyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__ARRAY_SELECTORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_34_0_0_2_0_0_0 = INSTANCE.getJAVA_34_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_34_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_34_0_0_2_0_0_1 = INSTANCE.getJAVA_34_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_34_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesUntyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_34_0_0_2_0_0 = INSTANCE.getJAVA_34_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_34_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_34_0_0_2_0_0_0, JAVA_34_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_34_0_0_2_0 = INSTANCE.getJAVA_34_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_34_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_34_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_34_0_0_2 = INSTANCE.getJAVA_34_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_34_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_34_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_34_0_0 = INSTANCE.getJAVA_34_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_34_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_34_0_0_0, JAVA_34_0_0_1, JAVA_34_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_34_0 = INSTANCE.getJAVA_34_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_34_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_34_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_34 = INSTANCE.getJAVA_34();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_34() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesUntyped(), JAVA_34_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_35_0_0_0 = INSTANCE.getJAVA_35_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_35_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("new", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_35_0_0_1 = INSTANCE.getJAVA_35_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_35_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationBySize().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_35_0_0_2_0_0_0 = INSTANCE.getJAVA_35_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_35_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("[", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_35_0_0_2_0_0_1 = INSTANCE.getJAVA_35_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_35_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationBySize().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__SIZES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_35_0_0_2_0_0_2 = INSTANCE.getJAVA_35_0_0_2_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_35_0_0_2_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("]", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_35_0_0_2_0_0 = INSTANCE.getJAVA_35_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_35_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_35_0_0_2_0_0_0, JAVA_35_0_0_2_0_0_1, JAVA_35_0_0_2_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_35_0_0_2_0 = INSTANCE.getJAVA_35_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_35_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_35_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_35_0_0_2 = INSTANCE.getJAVA_35_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_35_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_35_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.PLUS);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_35_0_0_3 = INSTANCE.getJAVA_35_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_35_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationBySize().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_35_0_0_4_0_0_0 = INSTANCE.getJAVA_35_0_0_4_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_35_0_0_4_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_35_0_0_4_0_0_1 = INSTANCE.getJAVA_35_0_0_4_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_35_0_0_4_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationBySize().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_35_0_0_4_0_0 = INSTANCE.getJAVA_35_0_0_4_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_35_0_0_4_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_35_0_0_4_0_0_0, JAVA_35_0_0_4_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_35_0_0_4_0 = INSTANCE.getJAVA_35_0_0_4_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_35_0_0_4_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_35_0_0_4_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_35_0_0_4 = INSTANCE.getJAVA_35_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_35_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_35_0_0_4_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_35_0_0 = INSTANCE.getJAVA_35_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_35_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_35_0_0_0, JAVA_35_0_0_1, JAVA_35_0_0_2, JAVA_35_0_0_3, JAVA_35_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_35_0 = INSTANCE.getJAVA_35_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_35_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_35_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_35 = INSTANCE.getJAVA_35();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_35() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationBySize(), JAVA_35_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_36_0_0_0 = INSTANCE.getJAVA_36_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_36_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_36_0_0_1 = INSTANCE.getJAVA_36_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_36_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_36_0_0_2_0_0_0 = INSTANCE.getJAVA_36_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_36_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INITIALIZER__INITIAL_VALUES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_36_0_0_2_0_0_1_0_0_0 = INSTANCE.getJAVA_36_0_0_2_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_36_0_0_2_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_36_0_0_2_0_0_1_0_0_1 = INSTANCE.getJAVA_36_0_0_2_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_36_0_0_2_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INITIALIZER__INITIAL_VALUES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_36_0_0_2_0_0_1_0_0 = INSTANCE.getJAVA_36_0_0_2_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_36_0_0_2_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_36_0_0_2_0_0_1_0_0_0, JAVA_36_0_0_2_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_36_0_0_2_0_0_1_0 = INSTANCE.getJAVA_36_0_0_2_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_36_0_0_2_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_36_0_0_2_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_36_0_0_2_0_0_1 = INSTANCE.getJAVA_36_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_36_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_36_0_0_2_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_36_0_0_2_0_0 = INSTANCE.getJAVA_36_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_36_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_36_0_0_2_0_0_0, JAVA_36_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_36_0_0_2_0 = INSTANCE.getJAVA_36_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_36_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_36_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_36_0_0_2 = INSTANCE.getJAVA_36_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_36_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_36_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_36_0_0_3_0_0_0 = INSTANCE.getJAVA_36_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_36_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_36_0_0_3_0_0 = INSTANCE.getJAVA_36_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_36_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_36_0_0_3_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_36_0_0_3_0 = INSTANCE.getJAVA_36_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_36_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_36_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_36_0_0_3 = INSTANCE.getJAVA_36_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_36_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_36_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_36_0_0_4 = INSTANCE.getJAVA_36_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_36_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_36_0_0 = INSTANCE.getJAVA_36_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_36_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_36_0_0_0, JAVA_36_0_0_1, JAVA_36_0_0_2, JAVA_36_0_0_3, JAVA_36_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_36_0 = INSTANCE.getJAVA_36_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_36_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_36_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_36 = INSTANCE.getJAVA_36();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_36() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), JAVA_36_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_37_0_0_0 = INSTANCE.getJAVA_37_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_37_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("[", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_37_0_0_1 = INSTANCE.getJAVA_37_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_37_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_SELECTOR__POSITION), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_37_0_0_2 = INSTANCE.getJAVA_37_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_37_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("]", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_37_0_0 = INSTANCE.getJAVA_37_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_37_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_37_0_0_0, JAVA_37_0_0_1, JAVA_37_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_37_0 = INSTANCE.getJAVA_37_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_37_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_37_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_37 = INSTANCE.getJAVA_37();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_37() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), JAVA_37_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_38_0_0_0_0_0_0 = INSTANCE.getJAVA_38_0_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_38_0_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_38_0_0_0_0_0_1 = INSTANCE.getJAVA_38_0_0_0_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_38_0_0_0_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_38_0_0_0_0_0 = INSTANCE.getJAVA_38_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_38_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_38_0_0_0_0_0_0, JAVA_38_0_0_0_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_38_0_0_0_0 = INSTANCE.getJAVA_38_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_38_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_38_0_0_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_38_0_0_0 = INSTANCE.getJAVA_38_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_38_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_38_0_0_0_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_38_0_0_1_0_0_0 = INSTANCE.getJAVA_38_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_38_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference(), }, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_38_0_0_1_0_0_1 = INSTANCE.getJAVA_38_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_38_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_38_0_0_1_0_0 = INSTANCE.getJAVA_38_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_38_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_38_0_0_1_0_0_0, JAVA_38_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_38_0_0_1_0 = INSTANCE.getJAVA_38_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_38_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_38_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_38_0_0_1 = INSTANCE.getJAVA_38_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_38_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_38_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_38_0_0_2 = INSTANCE.getJAVA_38_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_38_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_38_0_0 = INSTANCE.getJAVA_38_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_38_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_38_0_0_0, JAVA_38_0_0_1, JAVA_38_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_38_0 = INSTANCE.getJAVA_38_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_38_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_38_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_38 = INSTANCE.getJAVA_38();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_38() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), JAVA_38_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_39_0_0_0 = INSTANCE.getJAVA_39_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_39_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.CLASSIFIER_REFERENCE__TARGET), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_39_0_0_1_0_0_0 = INSTANCE.getJAVA_39_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_39_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_39_0_0_1_0_0_1 = INSTANCE.getJAVA_39_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_39_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_39_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_39_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_39_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_39_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_39_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_39_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_39_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_39_0_0_1_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_39_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_39_0_0_1_0_0_2_0_0_0, JAVA_39_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_39_0_0_1_0_0_2_0 = INSTANCE.getJAVA_39_0_0_1_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_39_0_0_1_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_39_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_39_0_0_1_0_0_2 = INSTANCE.getJAVA_39_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_39_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_39_0_0_1_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_39_0_0_1_0_0_3 = INSTANCE.getJAVA_39_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_39_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_39_0_0_1_0_0 = INSTANCE.getJAVA_39_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_39_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_39_0_0_1_0_0_0, JAVA_39_0_0_1_0_0_1, JAVA_39_0_0_1_0_0_2, JAVA_39_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_39_0_0_1_0 = INSTANCE.getJAVA_39_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_39_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_39_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_39_0_0_1 = INSTANCE.getJAVA_39_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_39_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_39_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_39_0_0 = INSTANCE.getJAVA_39_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_39_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_39_0_0_0, JAVA_39_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_39_0 = INSTANCE.getJAVA_39_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_39_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_39_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_39 = INSTANCE.getJAVA_39();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_39() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference(), JAVA_39_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_40_0_0_0_0_0_0 = INSTANCE.getJAVA_40_0_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_40_0_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_40_0_0_0_0_0_1 = INSTANCE.getJAVA_40_0_0_0_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_40_0_0_0_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_40_0_0_0_0_0_2_0_0_0 = INSTANCE.getJAVA_40_0_0_0_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_40_0_0_0_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_40_0_0_0_0_0_2_0_0_1 = INSTANCE.getJAVA_40_0_0_0_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_40_0_0_0_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_40_0_0_0_0_0_2_0_0 = INSTANCE.getJAVA_40_0_0_0_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_40_0_0_0_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_0_0_0_2_0_0_0, JAVA_40_0_0_0_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_40_0_0_0_0_0_2_0 = INSTANCE.getJAVA_40_0_0_0_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_40_0_0_0_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_0_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_40_0_0_0_0_0_2 = INSTANCE.getJAVA_40_0_0_0_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_40_0_0_0_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_40_0_0_0_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_40_0_0_0_0_0_3 = INSTANCE.getJAVA_40_0_0_0_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_40_0_0_0_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_40_0_0_0_0_0 = INSTANCE.getJAVA_40_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_40_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_0_0_0_0, JAVA_40_0_0_0_0_0_1, JAVA_40_0_0_0_0_0_2, JAVA_40_0_0_0_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_40_0_0_0_0 = INSTANCE.getJAVA_40_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_40_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_40_0_0_0 = INSTANCE.getJAVA_40_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_40_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_40_0_0_0_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_40_0_0_1 = INSTANCE.getJAVA_40_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_40_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__TARGET), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_40_0_0_2_0_0_0 = INSTANCE.getJAVA_40_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_40_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_40_0_0_2_0_0_1 = INSTANCE.getJAVA_40_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_40_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_40_0_0_2_0_0_2_0_0_0 = INSTANCE.getJAVA_40_0_0_2_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_40_0_0_2_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_40_0_0_2_0_0_2_0_0_1 = INSTANCE.getJAVA_40_0_0_2_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_40_0_0_2_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_40_0_0_2_0_0_2_0_0 = INSTANCE.getJAVA_40_0_0_2_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_40_0_0_2_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_2_0_0_2_0_0_0, JAVA_40_0_0_2_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_40_0_0_2_0_0_2_0 = INSTANCE.getJAVA_40_0_0_2_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_40_0_0_2_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_2_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_40_0_0_2_0_0_2 = INSTANCE.getJAVA_40_0_0_2_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_40_0_0_2_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_40_0_0_2_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_40_0_0_2_0_0_3 = INSTANCE.getJAVA_40_0_0_2_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_40_0_0_2_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_40_0_0_2_0_0 = INSTANCE.getJAVA_40_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_40_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_2_0_0_0, JAVA_40_0_0_2_0_0_1, JAVA_40_0_0_2_0_0_2, JAVA_40_0_0_2_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_40_0_0_2_0 = INSTANCE.getJAVA_40_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_40_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_40_0_0_2 = INSTANCE.getJAVA_40_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_40_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_40_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_40_0_0_3 = INSTANCE.getJAVA_40_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_40_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_40_0_0_4_0_0_0 = INSTANCE.getJAVA_40_0_0_4_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_40_0_0_4_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_40_0_0_4_0_0_1_0_0_0 = INSTANCE.getJAVA_40_0_0_4_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_40_0_0_4_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_40_0_0_4_0_0_1_0_0_1 = INSTANCE.getJAVA_40_0_0_4_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_40_0_0_4_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_40_0_0_4_0_0_1_0_0 = INSTANCE.getJAVA_40_0_0_4_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_40_0_0_4_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_4_0_0_1_0_0_0, JAVA_40_0_0_4_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_40_0_0_4_0_0_1_0 = INSTANCE.getJAVA_40_0_0_4_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_40_0_0_4_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_4_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_40_0_0_4_0_0_1 = INSTANCE.getJAVA_40_0_0_4_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_40_0_0_4_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_40_0_0_4_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_40_0_0_4_0_0 = INSTANCE.getJAVA_40_0_0_4_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_40_0_0_4_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_4_0_0_0, JAVA_40_0_0_4_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_40_0_0_4_0 = INSTANCE.getJAVA_40_0_0_4_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_40_0_0_4_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_4_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_40_0_0_4 = INSTANCE.getJAVA_40_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_40_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_40_0_0_4_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_40_0_0_5 = INSTANCE.getJAVA_40_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_40_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_40_0_0_6 = INSTANCE.getJAVA_40_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_40_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__ARRAY_SELECTORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_40_0_0_7_0_0_0 = INSTANCE.getJAVA_40_0_0_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_40_0_0_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_40_0_0_7_0_0_1 = INSTANCE.getJAVA_40_0_0_7_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_40_0_0_7_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_40_0_0_7_0_0 = INSTANCE.getJAVA_40_0_0_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_40_0_0_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_7_0_0_0, JAVA_40_0_0_7_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_40_0_0_7_0 = INSTANCE.getJAVA_40_0_0_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_40_0_0_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_40_0_0_7 = INSTANCE.getJAVA_40_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_40_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_40_0_0_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_40_0_0 = INSTANCE.getJAVA_40_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_40_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0_0, JAVA_40_0_0_1, JAVA_40_0_0_2, JAVA_40_0_0_3, JAVA_40_0_0_4, JAVA_40_0_0_5, JAVA_40_0_0_6, JAVA_40_0_0_7);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_40_0 = INSTANCE.getJAVA_40_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_40_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_40_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_40 = INSTANCE.getJAVA_40();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_40() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall(), JAVA_40_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_41_0_0_0 = INSTANCE.getJAVA_41_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_41_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.IDENTIFIER_REFERENCE__TARGET), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_41_0_0_1_0_0_0 = INSTANCE.getJAVA_41_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_41_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_41_0_0_1_0_0_1 = INSTANCE.getJAVA_41_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_41_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.IDENTIFIER_REFERENCE__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_41_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_41_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_41_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_41_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_41_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_41_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.IDENTIFIER_REFERENCE__TYPE_ARGUMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_41_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_41_0_0_1_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_41_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_41_0_0_1_0_0_2_0_0_0, JAVA_41_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_41_0_0_1_0_0_2_0 = INSTANCE.getJAVA_41_0_0_1_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_41_0_0_1_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_41_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_41_0_0_1_0_0_2 = INSTANCE.getJAVA_41_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_41_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_41_0_0_1_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_41_0_0_1_0_0_3 = INSTANCE.getJAVA_41_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_41_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_41_0_0_1_0_0 = INSTANCE.getJAVA_41_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_41_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_41_0_0_1_0_0_0, JAVA_41_0_0_1_0_0_1, JAVA_41_0_0_1_0_0_2, JAVA_41_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_41_0_0_1_0 = INSTANCE.getJAVA_41_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_41_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_41_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_41_0_0_1 = INSTANCE.getJAVA_41_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_41_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_41_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_41_0_0_2 = INSTANCE.getJAVA_41_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_41_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.IDENTIFIER_REFERENCE__ARRAY_SELECTORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_41_0_0_3_0_0_0 = INSTANCE.getJAVA_41_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_41_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_41_0_0_3_0_0_1 = INSTANCE.getJAVA_41_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_41_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.IDENTIFIER_REFERENCE__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_41_0_0_3_0_0 = INSTANCE.getJAVA_41_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_41_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_41_0_0_3_0_0_0, JAVA_41_0_0_3_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_41_0_0_3_0 = INSTANCE.getJAVA_41_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_41_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_41_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_41_0_0_3 = INSTANCE.getJAVA_41_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_41_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_41_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_41_0_0 = INSTANCE.getJAVA_41_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_41_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_41_0_0_0, JAVA_41_0_0_1, JAVA_41_0_0_2, JAVA_41_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_41_0 = INSTANCE.getJAVA_41_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_41_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_41_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_41 = INSTANCE.getJAVA_41();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_41() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference(), JAVA_41_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_42_0_0_0 = INSTANCE.getJAVA_42_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_42_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("class", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_42_0_0_1_0_0_0 = INSTANCE.getJAVA_42_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_42_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_42_0_0_1_0_0_1 = INSTANCE.getJAVA_42_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_42_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReflectiveClassReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.REFLECTIVE_CLASS_REFERENCE__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_42_0_0_1_0_0 = INSTANCE.getJAVA_42_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_42_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_42_0_0_1_0_0_0, JAVA_42_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_42_0_0_1_0 = INSTANCE.getJAVA_42_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_42_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_42_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_42_0_0_1 = INSTANCE.getJAVA_42_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_42_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_42_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_42_0_0 = INSTANCE.getJAVA_42_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_42_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_42_0_0_0, JAVA_42_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_42_0 = INSTANCE.getJAVA_42_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_42_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_42_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_42 = INSTANCE.getJAVA_42();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_42() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReflectiveClassReference(), JAVA_42_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_43_0_0_0 = INSTANCE.getJAVA_43_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_43_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getSelfReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.SELF_REFERENCE__SELF), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getSelf(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_43_0_0_1_0_0_0 = INSTANCE.getJAVA_43_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_43_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_43_0_0_1_0_0_1 = INSTANCE.getJAVA_43_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_43_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getSelfReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.SELF_REFERENCE__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_43_0_0_1_0_0 = INSTANCE.getJAVA_43_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_43_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_43_0_0_1_0_0_0, JAVA_43_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_43_0_0_1_0 = INSTANCE.getJAVA_43_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_43_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_43_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_43_0_0_1 = INSTANCE.getJAVA_43_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_43_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_43_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_43_0_0 = INSTANCE.getJAVA_43_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_43_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_43_0_0_0, JAVA_43_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_43_0 = INSTANCE.getJAVA_43_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_43_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_43_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_43 = INSTANCE.getJAVA_43();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_43() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getSelfReference(), JAVA_43_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_44_0_0_0 = INSTANCE.getJAVA_44_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_44_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getPrimitiveTypeReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getPrimitiveType(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_44_0_0_1 = INSTANCE.getJAVA_44_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_44_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getPrimitiveTypeReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__ARRAY_SELECTORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_44_0_0_2_0_0_0 = INSTANCE.getJAVA_44_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_44_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_44_0_0_2_0_0_1 = INSTANCE.getJAVA_44_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_44_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getPrimitiveTypeReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_44_0_0_2_0_0 = INSTANCE.getJAVA_44_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_44_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_44_0_0_2_0_0_0, JAVA_44_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_44_0_0_2_0 = INSTANCE.getJAVA_44_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_44_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_44_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_44_0_0_2 = INSTANCE.getJAVA_44_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_44_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_44_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_44_0_0 = INSTANCE.getJAVA_44_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_44_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_44_0_0_0, JAVA_44_0_0_1, JAVA_44_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_44_0 = INSTANCE.getJAVA_44_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_44_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_44_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_44 = INSTANCE.getJAVA_44();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_44() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getPrimitiveTypeReference(), JAVA_44_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_45_0_0_0 = INSTANCE.getJAVA_45_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_45_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("this", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_45_0_0 = INSTANCE.getJAVA_45_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_45_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_45_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_45_0 = INSTANCE.getJAVA_45_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_45_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_45_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_45 = INSTANCE.getJAVA_45();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_45() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getThis(), JAVA_45_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_46_0_0_0 = INSTANCE.getJAVA_46_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_46_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("super", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_46_0_0 = INSTANCE.getJAVA_46_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_46_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_46_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_46_0 = INSTANCE.getJAVA_46_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_46_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_46_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_46 = INSTANCE.getJAVA_46();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_46() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getSuper(), JAVA_46_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_47_0_0_0 = INSTANCE.getJAVA_47_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_47_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getStringReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.STRING_REFERENCE__VALUE), "STRING_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_47_0_0_1_0_0_0 = INSTANCE.getJAVA_47_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_47_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_47_0_0_1_0_0_1 = INSTANCE.getJAVA_47_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_47_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getStringReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.STRING_REFERENCE__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_47_0_0_1_0_0 = INSTANCE.getJAVA_47_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_47_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_47_0_0_1_0_0_0, JAVA_47_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_47_0_0_1_0 = INSTANCE.getJAVA_47_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_47_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_47_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_47_0_0_1 = INSTANCE.getJAVA_47_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_47_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_47_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_47_0_0 = INSTANCE.getJAVA_47_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_47_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_47_0_0_0, JAVA_47_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_47_0 = INSTANCE.getJAVA_47_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_47_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_47_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_47 = INSTANCE.getJAVA_47();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_47() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getStringReference(), JAVA_47_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_48_0_0_0 = INSTANCE.getJAVA_48_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_48_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getQualifiedTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_48_0_0_1 = INSTANCE.getJAVA_48_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_48_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getQualifiedTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.QUALIFIED_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_48_0_0 = INSTANCE.getJAVA_48_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_48_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_48_0_0_0, JAVA_48_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_48_0 = INSTANCE.getJAVA_48_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_48_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_48_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_48 = INSTANCE.getJAVA_48();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_48() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getQualifiedTypeArgument(), JAVA_48_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_49_0_0_0 = INSTANCE.getJAVA_49_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_49_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("?", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_49_0_0 = INSTANCE.getJAVA_49_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_49_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_49_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_49_0 = INSTANCE.getJAVA_49_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_49_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_49_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_49 = INSTANCE.getJAVA_49();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_49() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getUnknownTypeArgument(), JAVA_49_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_50_0_0_0 = INSTANCE.getJAVA_50_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_50_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("?", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_50_0_0_1 = INSTANCE.getJAVA_50_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_50_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("extends", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_50_0_0_2 = INSTANCE.getJAVA_50_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_50_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getExtendsTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_50_0_0_3_0_0_0 = INSTANCE.getJAVA_50_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_50_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("&", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_50_0_0_3_0_0_1 = INSTANCE.getJAVA_50_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_50_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getExtendsTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_50_0_0_3_0_0 = INSTANCE.getJAVA_50_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_50_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_50_0_0_3_0_0_0, JAVA_50_0_0_3_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_50_0_0_3_0 = INSTANCE.getJAVA_50_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_50_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_50_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_50_0_0_3 = INSTANCE.getJAVA_50_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_50_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_50_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_50_0_0_4 = INSTANCE.getJAVA_50_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_50_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getExtendsTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.EXTENDS_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_50_0_0 = INSTANCE.getJAVA_50_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_50_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_50_0_0_0, JAVA_50_0_0_1, JAVA_50_0_0_2, JAVA_50_0_0_3, JAVA_50_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_50_0 = INSTANCE.getJAVA_50_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_50_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_50_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_50 = INSTANCE.getJAVA_50();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_50() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getExtendsTypeArgument(), JAVA_50_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_51_0_0_0 = INSTANCE.getJAVA_51_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_51_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("?", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_51_0_0_1 = INSTANCE.getJAVA_51_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_51_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("super", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_51_0_0_2 = INSTANCE.getJAVA_51_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_51_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getSuperTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.SUPER_TYPE_ARGUMENT__SUPER_TYPE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_51_0_0_3 = INSTANCE.getJAVA_51_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_51_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getSuperTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.SUPER_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_51_0_0 = INSTANCE.getJAVA_51_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_51_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_51_0_0_0, JAVA_51_0_0_1, JAVA_51_0_0_2, JAVA_51_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_51_0 = INSTANCE.getJAVA_51_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_51_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_51_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_51 = INSTANCE.getJAVA_51();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_51() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getSuperTypeArgument(), JAVA_51_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_52_0_0_0 = INSTANCE.getJAVA_52_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_52_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("assert", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_52_0_0_1 = INSTANCE.getJAVA_52_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_52_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getAssert().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.ASSERT__CONDITION), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_52_0_0_2_0_0_0 = INSTANCE.getJAVA_52_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_52_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(":", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_52_0_0_2_0_0_1 = INSTANCE.getJAVA_52_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_52_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getAssert().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.ASSERT__ERROR_MESSAGE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_52_0_0_2_0_0 = INSTANCE.getJAVA_52_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_52_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_52_0_0_2_0_0_0, JAVA_52_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_52_0_0_2_0 = INSTANCE.getJAVA_52_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_52_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_52_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_52_0_0_2 = INSTANCE.getJAVA_52_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_52_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_52_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_52_0_0_3 = INSTANCE.getJAVA_52_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_52_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_52_0_0 = INSTANCE.getJAVA_52_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_52_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_52_0_0_0, JAVA_52_0_0_1, JAVA_52_0_0_2, JAVA_52_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_52_0 = INSTANCE.getJAVA_52_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_52_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_52_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_52 = INSTANCE.getJAVA_52();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_52() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getAssert(), JAVA_52_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_53_0_0_0 = INSTANCE.getJAVA_53_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_53_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("if", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_53_0_0_1 = INSTANCE.getJAVA_53_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_53_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_53_0_0_2 = INSTANCE.getJAVA_53_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_53_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_53_0_0_3 = INSTANCE.getJAVA_53_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_53_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCondition().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CONDITION__CONDITION), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_53_0_0_4 = INSTANCE.getJAVA_53_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_53_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_53_0_0_5 = INSTANCE.getJAVA_53_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_53_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCondition().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CONDITION__STATEMENT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_53_0_0_6_0_0_0 = INSTANCE.getJAVA_53_0_0_6_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_53_0_0_6_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("else", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_53_0_0_6_0_0_1 = INSTANCE.getJAVA_53_0_0_6_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_53_0_0_6_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCondition().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CONDITION__ELSE_STATEMENT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_53_0_0_6_0_0 = INSTANCE.getJAVA_53_0_0_6_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_53_0_0_6_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_53_0_0_6_0_0_0, JAVA_53_0_0_6_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_53_0_0_6_0 = INSTANCE.getJAVA_53_0_0_6_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_53_0_0_6_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_53_0_0_6_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_53_0_0_6 = INSTANCE.getJAVA_53_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_53_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_53_0_0_6_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_53_0_0 = INSTANCE.getJAVA_53_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_53_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_53_0_0_0, JAVA_53_0_0_1, JAVA_53_0_0_2, JAVA_53_0_0_3, JAVA_53_0_0_4, JAVA_53_0_0_5, JAVA_53_0_0_6);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_53_0 = INSTANCE.getJAVA_53_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_53_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_53_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_53 = INSTANCE.getJAVA_53();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_53() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCondition(), JAVA_53_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_54_0_0_0 = INSTANCE.getJAVA_54_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_54_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("for", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_54_0_0_1 = INSTANCE.getJAVA_54_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_54_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_54_0_0_2 = INSTANCE.getJAVA_54_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_54_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_54_0_0_3 = INSTANCE.getJAVA_54_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_54_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_LOOP__INIT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoopInitializer(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_54_0_0_4 = INSTANCE.getJAVA_54_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_54_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_54_0_0_5 = INSTANCE.getJAVA_54_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_54_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_LOOP__CONDITION), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_54_0_0_6 = INSTANCE.getJAVA_54_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_54_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_54_0_0_7_0_0_0 = INSTANCE.getJAVA_54_0_0_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_54_0_0_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_LOOP__UPDATES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_54_0_0_7_0_0_1_0_0_0 = INSTANCE.getJAVA_54_0_0_7_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_54_0_0_7_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_54_0_0_7_0_0_1_0_0_1 = INSTANCE.getJAVA_54_0_0_7_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_54_0_0_7_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_LOOP__UPDATES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_54_0_0_7_0_0_1_0_0 = INSTANCE.getJAVA_54_0_0_7_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_54_0_0_7_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_54_0_0_7_0_0_1_0_0_0, JAVA_54_0_0_7_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_54_0_0_7_0_0_1_0 = INSTANCE.getJAVA_54_0_0_7_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_54_0_0_7_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_54_0_0_7_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_54_0_0_7_0_0_1 = INSTANCE.getJAVA_54_0_0_7_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_54_0_0_7_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_54_0_0_7_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_54_0_0_7_0_0 = INSTANCE.getJAVA_54_0_0_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_54_0_0_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_54_0_0_7_0_0_0, JAVA_54_0_0_7_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_54_0_0_7_0 = INSTANCE.getJAVA_54_0_0_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_54_0_0_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_54_0_0_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_54_0_0_7 = INSTANCE.getJAVA_54_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_54_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_54_0_0_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_54_0_0_8 = INSTANCE.getJAVA_54_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_54_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_54_0_0_9 = INSTANCE.getJAVA_54_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_54_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_LOOP__STATEMENT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_54_0_0 = INSTANCE.getJAVA_54_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_54_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_54_0_0_0, JAVA_54_0_0_1, JAVA_54_0_0_2, JAVA_54_0_0_3, JAVA_54_0_0_4, JAVA_54_0_0_5, JAVA_54_0_0_6, JAVA_54_0_0_7, JAVA_54_0_0_8, JAVA_54_0_0_9);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_54_0 = INSTANCE.getJAVA_54_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_54_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_54_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_54 = INSTANCE.getJAVA_54();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_54() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop(), JAVA_54_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_55_0_0_0 = INSTANCE.getJAVA_55_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_55_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("for", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_55_0_0_1 = INSTANCE.getJAVA_55_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_55_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_55_0_0_2 = INSTANCE.getJAVA_55_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_55_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_55_0_0_3 = INSTANCE.getJAVA_55_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_55_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForEachLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_EACH_LOOP__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_55_0_0_4 = INSTANCE.getJAVA_55_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_55_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(":", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_55_0_0_5 = INSTANCE.getJAVA_55_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_55_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForEachLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_EACH_LOOP__COLLECTION), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_55_0_0_6 = INSTANCE.getJAVA_55_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_55_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_55_0_0_7 = INSTANCE.getJAVA_55_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_55_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForEachLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_EACH_LOOP__STATEMENT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_55_0_0 = INSTANCE.getJAVA_55_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_55_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_55_0_0_0, JAVA_55_0_0_1, JAVA_55_0_0_2, JAVA_55_0_0_3, JAVA_55_0_0_4, JAVA_55_0_0_5, JAVA_55_0_0_6, JAVA_55_0_0_7);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_55_0 = INSTANCE.getJAVA_55_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_55_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_55_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_55 = INSTANCE.getJAVA_55();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_55() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForEachLoop(), JAVA_55_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_56_0_0_0 = INSTANCE.getJAVA_56_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_56_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("while", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_56_0_0_1 = INSTANCE.getJAVA_56_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_56_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_56_0_0_2 = INSTANCE.getJAVA_56_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_56_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_56_0_0_3 = INSTANCE.getJAVA_56_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_56_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getWhileLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.WHILE_LOOP__CONDITION), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_56_0_0_4 = INSTANCE.getJAVA_56_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_56_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_56_0_0_5 = INSTANCE.getJAVA_56_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_56_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getWhileLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.WHILE_LOOP__STATEMENT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_56_0_0 = INSTANCE.getJAVA_56_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_56_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_56_0_0_0, JAVA_56_0_0_1, JAVA_56_0_0_2, JAVA_56_0_0_3, JAVA_56_0_0_4, JAVA_56_0_0_5);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_56_0 = INSTANCE.getJAVA_56_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_56_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_56_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_56 = INSTANCE.getJAVA_56();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_56() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getWhileLoop(), JAVA_56_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_57_0_0_0 = INSTANCE.getJAVA_57_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_57_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("do", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_57_0_0_1 = INSTANCE.getJAVA_57_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_57_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDoWhileLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.DO_WHILE_LOOP__STATEMENT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_57_0_0_2 = INSTANCE.getJAVA_57_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_57_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("while", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_57_0_0_3 = INSTANCE.getJAVA_57_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_57_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_57_0_0_4 = INSTANCE.getJAVA_57_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_57_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_57_0_0_5 = INSTANCE.getJAVA_57_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_57_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDoWhileLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.DO_WHILE_LOOP__CONDITION), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_57_0_0_6 = INSTANCE.getJAVA_57_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_57_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_57_0_0_7 = INSTANCE.getJAVA_57_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_57_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_57_0_0 = INSTANCE.getJAVA_57_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_57_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_57_0_0_0, JAVA_57_0_0_1, JAVA_57_0_0_2, JAVA_57_0_0_3, JAVA_57_0_0_4, JAVA_57_0_0_5, JAVA_57_0_0_6, JAVA_57_0_0_7);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_57_0 = INSTANCE.getJAVA_57_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_57_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_57_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_57 = INSTANCE.getJAVA_57();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_57() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDoWhileLoop(), JAVA_57_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_58_0_0_0 = INSTANCE.getJAVA_58_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_58_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_58_0_0 = INSTANCE.getJAVA_58_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_58_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_58_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_58_0 = INSTANCE.getJAVA_58_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_58_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_58_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_58 = INSTANCE.getJAVA_58();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_58() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getEmptyStatement(), JAVA_58_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_59_0_0_0 = INSTANCE.getJAVA_59_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_59_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("synchronized", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_59_0_0_1 = INSTANCE.getJAVA_59_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_59_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_59_0_0_2 = INSTANCE.getJAVA_59_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_59_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_59_0_0_3 = INSTANCE.getJAVA_59_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_59_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSynchronizedBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_59_0_0_4 = INSTANCE.getJAVA_59_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_59_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_59_0_0_5 = INSTANCE.getJAVA_59_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_59_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_59_0_0_6 = INSTANCE.getJAVA_59_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_59_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_59_0_0_7_0_0_0 = INSTANCE.getJAVA_59_0_0_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_59_0_0_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_59_0_0_7_0_0_1 = INSTANCE.getJAVA_59_0_0_7_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_59_0_0_7_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSynchronizedBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_59_0_0_7_0_0 = INSTANCE.getJAVA_59_0_0_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_59_0_0_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_59_0_0_7_0_0_0, JAVA_59_0_0_7_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_59_0_0_7_0 = INSTANCE.getJAVA_59_0_0_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_59_0_0_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_59_0_0_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_59_0_0_7 = INSTANCE.getJAVA_59_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_59_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_59_0_0_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_59_0_0_8 = INSTANCE.getJAVA_59_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_59_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_59_0_0_9 = INSTANCE.getJAVA_59_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_59_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_59_0_0 = INSTANCE.getJAVA_59_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_59_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_59_0_0_0, JAVA_59_0_0_1, JAVA_59_0_0_2, JAVA_59_0_0_3, JAVA_59_0_0_4, JAVA_59_0_0_5, JAVA_59_0_0_6, JAVA_59_0_0_7, JAVA_59_0_0_8, JAVA_59_0_0_9);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_59_0 = INSTANCE.getJAVA_59_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_59_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_59_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_59 = INSTANCE.getJAVA_59();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_59() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSynchronizedBlock(), JAVA_59_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_60_0_0_0 = INSTANCE.getJAVA_60_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_60_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("try", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_60_0_0_1 = INSTANCE.getJAVA_60_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_60_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_60_0_0_2 = INSTANCE.getJAVA_60_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_60_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_60_0_0_3_0_0_0 = INSTANCE.getJAVA_60_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_60_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_60_0_0_3_0_0_1 = INSTANCE.getJAVA_60_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_60_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getTryBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.TRY_BLOCK__STATEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_60_0_0_3_0_0 = INSTANCE.getJAVA_60_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_60_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_60_0_0_3_0_0_0, JAVA_60_0_0_3_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_60_0_0_3_0 = INSTANCE.getJAVA_60_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_60_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_60_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_60_0_0_3 = INSTANCE.getJAVA_60_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_60_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_60_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_60_0_0_4 = INSTANCE.getJAVA_60_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_60_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_60_0_0_5 = INSTANCE.getJAVA_60_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_60_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_60_0_0_6 = INSTANCE.getJAVA_60_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_60_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getTryBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCatchBlock(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_60_0_0_7_0_0_0 = INSTANCE.getJAVA_60_0_0_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_60_0_0_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("finally", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_60_0_0_7_0_0_1 = INSTANCE.getJAVA_60_0_0_7_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_60_0_0_7_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getTryBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.TRY_BLOCK__FINALLY_BLOCK), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBlock(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_60_0_0_7_0_0 = INSTANCE.getJAVA_60_0_0_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_60_0_0_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_60_0_0_7_0_0_0, JAVA_60_0_0_7_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_60_0_0_7_0 = INSTANCE.getJAVA_60_0_0_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_60_0_0_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_60_0_0_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_60_0_0_7 = INSTANCE.getJAVA_60_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_60_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_60_0_0_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_60_0_0 = INSTANCE.getJAVA_60_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_60_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_60_0_0_0, JAVA_60_0_0_1, JAVA_60_0_0_2, JAVA_60_0_0_3, JAVA_60_0_0_4, JAVA_60_0_0_5, JAVA_60_0_0_6, JAVA_60_0_0_7);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_60_0 = INSTANCE.getJAVA_60_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_60_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_60_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_60 = INSTANCE.getJAVA_60();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_60() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getTryBlock(), JAVA_60_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_61_0_0_0 = INSTANCE.getJAVA_61_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_61_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("catch", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_61_0_0_1 = INSTANCE.getJAVA_61_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_61_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_61_0_0_2 = INSTANCE.getJAVA_61_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_61_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_61_0_0_3 = INSTANCE.getJAVA_61_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_61_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCatchBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CATCH_BLOCK__PARAMETER), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_61_0_0_4 = INSTANCE.getJAVA_61_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_61_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_61_0_0_5 = INSTANCE.getJAVA_61_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_61_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_61_0_0_6 = INSTANCE.getJAVA_61_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_61_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_61_0_0_7_0_0_0 = INSTANCE.getJAVA_61_0_0_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_61_0_0_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_61_0_0_7_0_0_1 = INSTANCE.getJAVA_61_0_0_7_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_61_0_0_7_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCatchBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CATCH_BLOCK__STATEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_61_0_0_7_0_0 = INSTANCE.getJAVA_61_0_0_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_61_0_0_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_61_0_0_7_0_0_0, JAVA_61_0_0_7_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_61_0_0_7_0 = INSTANCE.getJAVA_61_0_0_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_61_0_0_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_61_0_0_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_61_0_0_7 = INSTANCE.getJAVA_61_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_61_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_61_0_0_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_61_0_0_8 = INSTANCE.getJAVA_61_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_61_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_61_0_0_9 = INSTANCE.getJAVA_61_0_0_9();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_61_0_0_9() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_61_0_0 = INSTANCE.getJAVA_61_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_61_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_61_0_0_0, JAVA_61_0_0_1, JAVA_61_0_0_2, JAVA_61_0_0_3, JAVA_61_0_0_4, JAVA_61_0_0_5, JAVA_61_0_0_6, JAVA_61_0_0_7, JAVA_61_0_0_8, JAVA_61_0_0_9);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_61_0 = INSTANCE.getJAVA_61_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_61_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_61_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_61 = INSTANCE.getJAVA_61();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_61() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCatchBlock(), JAVA_61_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_62_0_0_0 = INSTANCE.getJAVA_62_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_62_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("switch", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_62_0_0_1 = INSTANCE.getJAVA_62_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_62_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_62_0_0_2 = INSTANCE.getJAVA_62_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_62_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_62_0_0_3 = INSTANCE.getJAVA_62_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_62_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSwitch().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.SWITCH__VARIABLE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_62_0_0_4 = INSTANCE.getJAVA_62_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_62_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_62_0_0_5 = INSTANCE.getJAVA_62_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_62_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_62_0_0_6 = INSTANCE.getJAVA_62_0_0_6();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_62_0_0_6() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("{", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_62_0_0_7_0_0_0 = INSTANCE.getJAVA_62_0_0_7_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_62_0_0_7_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSwitch().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.SWITCH__CASES), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSwitchCase(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_62_0_0_7_0_0 = INSTANCE.getJAVA_62_0_0_7_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_62_0_0_7_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_62_0_0_7_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_62_0_0_7_0 = INSTANCE.getJAVA_62_0_0_7_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_62_0_0_7_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_62_0_0_7_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_62_0_0_7 = INSTANCE.getJAVA_62_0_0_7();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_62_0_0_7() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_62_0_0_7_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_62_0_0_8 = INSTANCE.getJAVA_62_0_0_8();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_62_0_0_8() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("}", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_62_0_0 = INSTANCE.getJAVA_62_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_62_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_62_0_0_0, JAVA_62_0_0_1, JAVA_62_0_0_2, JAVA_62_0_0_3, JAVA_62_0_0_4, JAVA_62_0_0_5, JAVA_62_0_0_6, JAVA_62_0_0_7, JAVA_62_0_0_8);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_62_0 = INSTANCE.getJAVA_62_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_62_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_62_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_62 = INSTANCE.getJAVA_62();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_62() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSwitch(), JAVA_62_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_63_0_0_0 = INSTANCE.getJAVA_63_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_63_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("case", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_63_0_0_1 = INSTANCE.getJAVA_63_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_63_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getNormalSwitchCase().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.NORMAL_SWITCH_CASE__CONDITION), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_63_0_0_2 = INSTANCE.getJAVA_63_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_63_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(":", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_63_0_0_3_0_0_0 = INSTANCE.getJAVA_63_0_0_3_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_63_0_0_3_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_63_0_0_3_0_0_1 = INSTANCE.getJAVA_63_0_0_3_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_63_0_0_3_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getNormalSwitchCase().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.NORMAL_SWITCH_CASE__STATEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_63_0_0_3_0_0 = INSTANCE.getJAVA_63_0_0_3_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_63_0_0_3_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_63_0_0_3_0_0_0, JAVA_63_0_0_3_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_63_0_0_3_0 = INSTANCE.getJAVA_63_0_0_3_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_63_0_0_3_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_63_0_0_3_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_63_0_0_3 = INSTANCE.getJAVA_63_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_63_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_63_0_0_3_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_63_0_0_4 = INSTANCE.getJAVA_63_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_63_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_63_0_0 = INSTANCE.getJAVA_63_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_63_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_63_0_0_0, JAVA_63_0_0_1, JAVA_63_0_0_2, JAVA_63_0_0_3, JAVA_63_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_63_0 = INSTANCE.getJAVA_63_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_63_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_63_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_63 = INSTANCE.getJAVA_63();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_63() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getNormalSwitchCase(), JAVA_63_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_64_0_0_0 = INSTANCE.getJAVA_64_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_64_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("default", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_64_0_0_1 = INSTANCE.getJAVA_64_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_64_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(":", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_64_0_0_2_0_0_0 = INSTANCE.getJAVA_64_0_0_2_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_64_0_0_2_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_64_0_0_2_0_0_1 = INSTANCE.getJAVA_64_0_0_2_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_64_0_0_2_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDefaultSwitchCase().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.DEFAULT_SWITCH_CASE__STATEMENTS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_64_0_0_2_0_0 = INSTANCE.getJAVA_64_0_0_2_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_64_0_0_2_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_64_0_0_2_0_0_0, JAVA_64_0_0_2_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_64_0_0_2_0 = INSTANCE.getJAVA_64_0_0_2_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_64_0_0_2_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_64_0_0_2_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_64_0_0_2 = INSTANCE.getJAVA_64_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_64_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_64_0_0_2_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak JAVA_64_0_0_3 = INSTANCE.getJAVA_64_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak getJAVA_64_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjLineBreak(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_64_0_0 = INSTANCE.getJAVA_64_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_64_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_64_0_0_0, JAVA_64_0_0_1, JAVA_64_0_0_2, JAVA_64_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_64_0 = INSTANCE.getJAVA_64_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_64_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_64_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_64 = INSTANCE.getJAVA_64();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_64() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDefaultSwitchCase(), JAVA_64_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_65_0_0_0 = INSTANCE.getJAVA_65_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_65_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("return", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_65_0_0_1 = INSTANCE.getJAVA_65_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_65_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getReturn().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.RETURN__RETURN_VALUE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_65_0_0_2 = INSTANCE.getJAVA_65_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_65_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_65_0_0 = INSTANCE.getJAVA_65_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_65_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_65_0_0_0, JAVA_65_0_0_1, JAVA_65_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_65_0 = INSTANCE.getJAVA_65_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_65_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_65_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_65 = INSTANCE.getJAVA_65();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_65() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getReturn(), JAVA_65_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_66_0_0_0 = INSTANCE.getJAVA_66_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_66_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("throw", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_66_0_0_1 = INSTANCE.getJAVA_66_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_66_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getThrow().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.THROW__THROWABLE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_66_0_0_2 = INSTANCE.getJAVA_66_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_66_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_66_0_0 = INSTANCE.getJAVA_66_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_66_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_66_0_0_0, JAVA_66_0_0_1, JAVA_66_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_66_0 = INSTANCE.getJAVA_66_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_66_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_66_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_66 = INSTANCE.getJAVA_66();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_66() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getThrow(), JAVA_66_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_67_0_0_0 = INSTANCE.getJAVA_67_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_67_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("break", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_67_0_0_1_0_0_0 = INSTANCE.getJAVA_67_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_67_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBreak().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.BREAK__TARGET), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_67_0_0_1_0_0 = INSTANCE.getJAVA_67_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_67_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_67_0_0_1_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_67_0_0_1_0 = INSTANCE.getJAVA_67_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_67_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_67_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_67_0_0_1 = INSTANCE.getJAVA_67_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_67_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_67_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_67_0_0_2 = INSTANCE.getJAVA_67_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_67_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_67_0_0 = INSTANCE.getJAVA_67_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_67_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_67_0_0_0, JAVA_67_0_0_1, JAVA_67_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_67_0 = INSTANCE.getJAVA_67_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_67_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_67_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_67 = INSTANCE.getJAVA_67();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_67() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBreak(), JAVA_67_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_68_0_0_0 = INSTANCE.getJAVA_68_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_68_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("continue", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_68_0_0_1_0_0_0 = INSTANCE.getJAVA_68_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_68_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getContinue().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CONTINUE__TARGET), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_68_0_0_1_0_0 = INSTANCE.getJAVA_68_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_68_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_68_0_0_1_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_68_0_0_1_0 = INSTANCE.getJAVA_68_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_68_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_68_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_68_0_0_1 = INSTANCE.getJAVA_68_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_68_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_68_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_68_0_0_2 = INSTANCE.getJAVA_68_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_68_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_68_0_0 = INSTANCE.getJAVA_68_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_68_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_68_0_0_0, JAVA_68_0_0_1, JAVA_68_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_68_0 = INSTANCE.getJAVA_68_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_68_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_68_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_68 = INSTANCE.getJAVA_68();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_68() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getContinue(), JAVA_68_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_69_0_0_0 = INSTANCE.getJAVA_69_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_69_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJumpLabel().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.JUMP_LABEL__NAME), "IDENTIFIER", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_69_0_0_1 = INSTANCE.getJAVA_69_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_69_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(":", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_69_0_0_2 = INSTANCE.getJAVA_69_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_69_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJumpLabel().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.JUMP_LABEL__STATEMENT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_69_0_0 = INSTANCE.getJAVA_69_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_69_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_69_0_0_0, JAVA_69_0_0_1, JAVA_69_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_69_0 = INSTANCE.getJAVA_69_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_69_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_69_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_69 = INSTANCE.getJAVA_69();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_69() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJumpLabel(), JAVA_69_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_70_0_0_0 = INSTANCE.getJAVA_70_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_70_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getExpressionStatement().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.EXPRESSION_STATEMENT__EXPRESSION), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_70_0_0_1 = INSTANCE.getJAVA_70_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_70_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(";", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_70_0_0 = INSTANCE.getJAVA_70_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_70_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_70_0_0_0, JAVA_70_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_70_0 = INSTANCE.getJAVA_70_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_70_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_70_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_70 = INSTANCE.getJAVA_70();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_70() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getExpressionStatement(), JAVA_70_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_71_0_0_0 = INSTANCE.getJAVA_71_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_71_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExpressionList().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EXPRESSION_LIST__EXPRESSIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_71_0_0_1_0_0_0 = INSTANCE.getJAVA_71_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_71_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(",", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_71_0_0_1_0_0_1 = INSTANCE.getJAVA_71_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_71_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExpressionList().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EXPRESSION_LIST__EXPRESSIONS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_71_0_0_1_0_0 = INSTANCE.getJAVA_71_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_71_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_71_0_0_1_0_0_0, JAVA_71_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_71_0_0_1_0 = INSTANCE.getJAVA_71_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_71_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_71_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_71_0_0_1 = INSTANCE.getJAVA_71_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_71_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_71_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_71_0_0 = INSTANCE.getJAVA_71_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_71_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_71_0_0_0, JAVA_71_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_71_0 = INSTANCE.getJAVA_71_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_71_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_71_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_71 = INSTANCE.getJAVA_71();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_71() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExpressionList(), JAVA_71_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_72_0_0_0 = INSTANCE.getJAVA_72_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_72_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_72_0_0_1_0_0_0 = INSTANCE.getJAVA_72_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_72_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_72_0_0_1_0_0_1 = INSTANCE.getJAVA_72_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_72_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_72_0_0_1_0_0_2 = INSTANCE.getJAVA_72_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_72_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_72_0_0_1_0_0_3 = INSTANCE.getJAVA_72_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_72_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_72_0_0_1_0_0 = INSTANCE.getJAVA_72_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_72_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_72_0_0_1_0_0_0, JAVA_72_0_0_1_0_0_1, JAVA_72_0_0_1_0_0_2, JAVA_72_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_72_0_0_1_0 = INSTANCE.getJAVA_72_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_72_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_72_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_72_0_0_1 = INSTANCE.getJAVA_72_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_72_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_72_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_72_0_0 = INSTANCE.getJAVA_72_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_72_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_72_0_0_0, JAVA_72_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_72_0 = INSTANCE.getJAVA_72_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_72_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_72_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_72 = INSTANCE.getJAVA_72();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_72() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), JAVA_72_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_73_0_0_0 = INSTANCE.getJAVA_73_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_73_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalOrExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_73_0_0_1_0_0_0 = INSTANCE.getJAVA_73_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_73_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("?", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_73_0_0_1_0_0_1 = INSTANCE.getJAVA_73_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_73_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_73_0_0_1_0_0_2 = INSTANCE.getJAVA_73_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_73_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(":", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_73_0_0_1_0_0_3 = INSTANCE.getJAVA_73_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_73_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_73_0_0_1_0_0 = INSTANCE.getJAVA_73_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_73_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_73_0_0_1_0_0_0, JAVA_73_0_0_1_0_0_1, JAVA_73_0_0_1_0_0_2, JAVA_73_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_73_0_0_1_0 = INSTANCE.getJAVA_73_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_73_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_73_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_73_0_0_1 = INSTANCE.getJAVA_73_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_73_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_73_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_73_0_0 = INSTANCE.getJAVA_73_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_73_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_73_0_0_0, JAVA_73_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_73_0 = INSTANCE.getJAVA_73_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_73_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_73_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_73 = INSTANCE.getJAVA_73();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_73() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), JAVA_73_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_74_0_0_0 = INSTANCE.getJAVA_74_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_74_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_74_0_0_1_0_0_0 = INSTANCE.getJAVA_74_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_74_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("||", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_74_0_0_1_0_0_1 = INSTANCE.getJAVA_74_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_74_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_74_0_0_1_0_0 = INSTANCE.getJAVA_74_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_74_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_74_0_0_1_0_0_0, JAVA_74_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_74_0_0_1_0 = INSTANCE.getJAVA_74_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_74_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_74_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_74_0_0_1 = INSTANCE.getJAVA_74_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_74_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_74_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_74_0_0 = INSTANCE.getJAVA_74_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_74_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_74_0_0_0, JAVA_74_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_74_0 = INSTANCE.getJAVA_74_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_74_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_74_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_74 = INSTANCE.getJAVA_74();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_74() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalOrExpression(), JAVA_74_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_75_0_0_0 = INSTANCE.getJAVA_75_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_75_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_AND_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_75_0_0_1_0_0_0 = INSTANCE.getJAVA_75_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_75_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("&&", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_75_0_0_1_0_0_1 = INSTANCE.getJAVA_75_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_75_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_AND_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_75_0_0_1_0_0 = INSTANCE.getJAVA_75_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_75_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_75_0_0_1_0_0_0, JAVA_75_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_75_0_0_1_0 = INSTANCE.getJAVA_75_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_75_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_75_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_75_0_0_1 = INSTANCE.getJAVA_75_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_75_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_75_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_75_0_0 = INSTANCE.getJAVA_75_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_75_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_75_0_0_0, JAVA_75_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_75_0 = INSTANCE.getJAVA_75_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_75_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_75_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_75 = INSTANCE.getJAVA_75();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_75() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpression(), JAVA_75_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_76_0_0_0 = INSTANCE.getJAVA_76_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_76_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.INCLUSIVE_OR_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_76_0_0_1_0_0_0 = INSTANCE.getJAVA_76_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_76_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("|", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_76_0_0_1_0_0_1 = INSTANCE.getJAVA_76_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_76_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.INCLUSIVE_OR_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_76_0_0_1_0_0 = INSTANCE.getJAVA_76_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_76_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_76_0_0_1_0_0_0, JAVA_76_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_76_0_0_1_0 = INSTANCE.getJAVA_76_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_76_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_76_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_76_0_0_1 = INSTANCE.getJAVA_76_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_76_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_76_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_76_0_0 = INSTANCE.getJAVA_76_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_76_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_76_0_0_0, JAVA_76_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_76_0 = INSTANCE.getJAVA_76_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_76_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_76_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_76 = INSTANCE.getJAVA_76();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_76() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpression(), JAVA_76_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_77_0_0_0 = INSTANCE.getJAVA_77_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_77_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EXCLUSIVE_OR_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_77_0_0_1_0_0_0 = INSTANCE.getJAVA_77_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_77_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("^", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_77_0_0_1_0_0_1 = INSTANCE.getJAVA_77_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_77_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EXCLUSIVE_OR_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_77_0_0_1_0_0 = INSTANCE.getJAVA_77_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_77_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_77_0_0_1_0_0_0, JAVA_77_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_77_0_0_1_0 = INSTANCE.getJAVA_77_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_77_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_77_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_77_0_0_1 = INSTANCE.getJAVA_77_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_77_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_77_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_77_0_0 = INSTANCE.getJAVA_77_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_77_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_77_0_0_0, JAVA_77_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_77_0 = INSTANCE.getJAVA_77_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_77_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_77_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_77 = INSTANCE.getJAVA_77();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_77() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpression(), JAVA_77_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_78_0_0_0 = INSTANCE.getJAVA_78_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_78_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.AND_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_78_0_0_1_0_0_0 = INSTANCE.getJAVA_78_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_78_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("&", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_78_0_0_1_0_0_1 = INSTANCE.getJAVA_78_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_78_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.AND_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_78_0_0_1_0_0 = INSTANCE.getJAVA_78_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_78_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_78_0_0_1_0_0_0, JAVA_78_0_0_1_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_78_0_0_1_0 = INSTANCE.getJAVA_78_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_78_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_78_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_78_0_0_1 = INSTANCE.getJAVA_78_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_78_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_78_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_78_0_0 = INSTANCE.getJAVA_78_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_78_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_78_0_0_0, JAVA_78_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_78_0 = INSTANCE.getJAVA_78_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_78_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_78_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_78 = INSTANCE.getJAVA_78();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_78() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpression(), JAVA_78_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_79_0_0_0 = INSTANCE.getJAVA_79_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_79_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EQUALITY_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_79_0_0_1_0_0_0 = INSTANCE.getJAVA_79_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_79_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_79_0_0_1_0_0_1 = INSTANCE.getJAVA_79_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_79_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getEqualityOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_79_0_0_1_0_0_2 = INSTANCE.getJAVA_79_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_79_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_79_0_0_1_0_0_3 = INSTANCE.getJAVA_79_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_79_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EQUALITY_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_79_0_0_1_0_0 = INSTANCE.getJAVA_79_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_79_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_79_0_0_1_0_0_0, JAVA_79_0_0_1_0_0_1, JAVA_79_0_0_1_0_0_2, JAVA_79_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_79_0_0_1_0 = INSTANCE.getJAVA_79_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_79_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_79_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_79_0_0_1 = INSTANCE.getJAVA_79_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_79_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_79_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_79_0_0 = INSTANCE.getJAVA_79_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_79_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_79_0_0_0, JAVA_79_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_79_0 = INSTANCE.getJAVA_79_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_79_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_79_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_79 = INSTANCE.getJAVA_79();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_79() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression(), JAVA_79_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_80_0_0_0 = INSTANCE.getJAVA_80_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_80_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_80_0_0_1_0_0_0 = INSTANCE.getJAVA_80_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_80_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("instanceof", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_80_0_0_1_0_0_1 = INSTANCE.getJAVA_80_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_80_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_80_0_0_1_0_0_2 = INSTANCE.getJAVA_80_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_80_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.INSTANCE_OF_EXPRESSION__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_80_0_0_1_0_0 = INSTANCE.getJAVA_80_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_80_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_80_0_0_1_0_0_0, JAVA_80_0_0_1_0_0_1, JAVA_80_0_0_1_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_80_0_0_1_0 = INSTANCE.getJAVA_80_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_80_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_80_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_80_0_0_1 = INSTANCE.getJAVA_80_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_80_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_80_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_80_0_0 = INSTANCE.getJAVA_80_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_80_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_80_0_0_0, JAVA_80_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_80_0 = INSTANCE.getJAVA_80_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_80_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_80_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_80 = INSTANCE.getJAVA_80();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_80() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression(), JAVA_80_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_81_0_0_0 = INSTANCE.getJAVA_81_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_81_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.RELATION_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_81_0_0_1_0_0_0 = INSTANCE.getJAVA_81_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_81_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_81_0_0_1_0_0_1 = INSTANCE.getJAVA_81_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_81_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getRelationOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_81_0_0_1_0_0_2 = INSTANCE.getJAVA_81_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_81_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_81_0_0_1_0_0_3 = INSTANCE.getJAVA_81_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_81_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.RELATION_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_81_0_0_1_0_0 = INSTANCE.getJAVA_81_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_81_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_81_0_0_1_0_0_0, JAVA_81_0_0_1_0_0_1, JAVA_81_0_0_1_0_0_2, JAVA_81_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_81_0_0_1_0 = INSTANCE.getJAVA_81_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_81_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_81_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_81_0_0_1 = INSTANCE.getJAVA_81_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_81_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_81_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_81_0_0 = INSTANCE.getJAVA_81_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_81_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_81_0_0_0, JAVA_81_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_81_0 = INSTANCE.getJAVA_81_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_81_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_81_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_81 = INSTANCE.getJAVA_81();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_81() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpression(), JAVA_81_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_82_0_0_0 = INSTANCE.getJAVA_82_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_82_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_82_0_0_1_0_0_0 = INSTANCE.getJAVA_82_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_82_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_82_0_0_1_0_0_1 = INSTANCE.getJAVA_82_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_82_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getShiftOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_82_0_0_1_0_0_2 = INSTANCE.getJAVA_82_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_82_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_82_0_0_1_0_0_3 = INSTANCE.getJAVA_82_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_82_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_82_0_0_1_0_0 = INSTANCE.getJAVA_82_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_82_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_82_0_0_1_0_0_0, JAVA_82_0_0_1_0_0_1, JAVA_82_0_0_1_0_0_2, JAVA_82_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_82_0_0_1_0 = INSTANCE.getJAVA_82_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_82_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_82_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_82_0_0_1 = INSTANCE.getJAVA_82_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_82_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_82_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_82_0_0 = INSTANCE.getJAVA_82_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_82_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_82_0_0_0, JAVA_82_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_82_0 = INSTANCE.getJAVA_82_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_82_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_82_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_82 = INSTANCE.getJAVA_82();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_82() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression(), JAVA_82_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_83_0_0_0 = INSTANCE.getJAVA_83_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_83_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_83_0_0_1_0_0_0 = INSTANCE.getJAVA_83_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_83_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_83_0_0_1_0_0_1 = INSTANCE.getJAVA_83_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_83_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAdditiveOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_83_0_0_1_0_0_2 = INSTANCE.getJAVA_83_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_83_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_83_0_0_1_0_0_3 = INSTANCE.getJAVA_83_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_83_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_83_0_0_1_0_0 = INSTANCE.getJAVA_83_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_83_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_83_0_0_1_0_0_0, JAVA_83_0_0_1_0_0_1, JAVA_83_0_0_1_0_0_2, JAVA_83_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_83_0_0_1_0 = INSTANCE.getJAVA_83_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_83_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_83_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_83_0_0_1 = INSTANCE.getJAVA_83_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_83_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_83_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_83_0_0 = INSTANCE.getJAVA_83_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_83_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_83_0_0_0, JAVA_83_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_83_0 = INSTANCE.getJAVA_83_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_83_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_83_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_83 = INSTANCE.getJAVA_83();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_83() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression(), JAVA_83_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_84_0_0_0 = INSTANCE.getJAVA_84_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_84_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_84_0_0_1_0_0_0 = INSTANCE.getJAVA_84_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_84_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_84_0_0_1_0_0_1 = INSTANCE.getJAVA_84_0_0_1_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_84_0_0_1_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getMultiplicativeOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_84_0_0_1_0_0_2 = INSTANCE.getJAVA_84_0_0_1_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_84_0_0_1_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_84_0_0_1_0_0_3 = INSTANCE.getJAVA_84_0_0_1_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_84_0_0_1_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__CHILDREN), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_84_0_0_1_0_0 = INSTANCE.getJAVA_84_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_84_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_84_0_0_1_0_0_0, JAVA_84_0_0_1_0_0_1, JAVA_84_0_0_1_0_0_2, JAVA_84_0_0_1_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_84_0_0_1_0 = INSTANCE.getJAVA_84_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_84_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_84_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_84_0_0_1 = INSTANCE.getJAVA_84_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_84_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_84_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_84_0_0 = INSTANCE.getJAVA_84_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_84_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_84_0_0_0, JAVA_84_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_84_0 = INSTANCE.getJAVA_84_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_84_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_84_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_84 = INSTANCE.getJAVA_84();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_84() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression(), JAVA_84_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_85_0_0_0 = INSTANCE.getJAVA_85_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_85_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.UNARY_EXPRESSION__OPERATORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getUnaryOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_85_0_0_1 = INSTANCE.getJAVA_85_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_85_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.UNARY_EXPRESSION__CHILD), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryModificationExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_85_0_0 = INSTANCE.getJAVA_85_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_85_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_85_0_0_0, JAVA_85_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_85_0 = INSTANCE.getJAVA_85_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_85_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_85_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_85 = INSTANCE.getJAVA_85();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_85() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression(), JAVA_85_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_86_0_0_0 = INSTANCE.getJAVA_86_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_86_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getSuffixUnaryModificationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.SUFFIX_UNARY_MODIFICATION_EXPRESSION__CHILD), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryModificationExpressionChild(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_86_0_0_1_0_0_0 = INSTANCE.getJAVA_86_0_0_1_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_86_0_0_1_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getSuffixUnaryModificationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.SUFFIX_UNARY_MODIFICATION_EXPRESSION__OPERATOR), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getUnaryModificationOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_86_0_0_1_0_0 = INSTANCE.getJAVA_86_0_0_1_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_86_0_0_1_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_86_0_0_1_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_86_0_0_1_0 = INSTANCE.getJAVA_86_0_0_1_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_86_0_0_1_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_86_0_0_1_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_86_0_0_1 = INSTANCE.getJAVA_86_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_86_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_86_0_0_1_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_86_0_0 = INSTANCE.getJAVA_86_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_86_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_86_0_0_0, JAVA_86_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_86_0 = INSTANCE.getJAVA_86_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_86_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_86_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_86 = INSTANCE.getJAVA_86();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_86() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getSuffixUnaryModificationExpression(), JAVA_86_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_87_0_0_0_0_0_0 = INSTANCE.getJAVA_87_0_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_87_0_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getPrefixUnaryModificationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.PREFIX_UNARY_MODIFICATION_EXPRESSION__OPERATOR), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getUnaryModificationOperator(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_87_0_0_0_0_0 = INSTANCE.getJAVA_87_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_87_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_87_0_0_0_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_87_0_0_0_0 = INSTANCE.getJAVA_87_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_87_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_87_0_0_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_87_0_0_0 = INSTANCE.getJAVA_87_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_87_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_87_0_0_0_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_87_0_0_1 = INSTANCE.getJAVA_87_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_87_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getPrefixUnaryModificationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.PREFIX_UNARY_MODIFICATION_EXPRESSION__CHILD), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryModificationExpressionChild(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_87_0_0 = INSTANCE.getJAVA_87_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_87_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_87_0_0_0, JAVA_87_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_87_0 = INSTANCE.getJAVA_87_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_87_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_87_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_87 = INSTANCE.getJAVA_87();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_87() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getPrefixUnaryModificationExpression(), JAVA_87_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_88_0_0_0 = INSTANCE.getJAVA_88_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_88_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_88_0_0_1 = INSTANCE.getJAVA_88_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_88_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getCastExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CAST_EXPRESSION__TYPE_REFERENCE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_88_0_0_2 = INSTANCE.getJAVA_88_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_88_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getCastExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_88_0_0_3 = INSTANCE.getJAVA_88_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_88_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace JAVA_88_0_0_4 = INSTANCE.getJAVA_88_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace getJAVA_88_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjWhiteSpace(1, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_88_0_0_5 = INSTANCE.getJAVA_88_0_0_5();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_88_0_0_5() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getCastExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CAST_EXPRESSION__CHILD), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_88_0_0 = INSTANCE.getJAVA_88_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_88_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_88_0_0_0, JAVA_88_0_0_1, JAVA_88_0_0_2, JAVA_88_0_0_3, JAVA_88_0_0_4, JAVA_88_0_0_5);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_88_0 = INSTANCE.getJAVA_88_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_88_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_88_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_88 = INSTANCE.getJAVA_88();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_88() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getCastExpression(), JAVA_88_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_89_0_0_0 = INSTANCE.getJAVA_89_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_89_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("(", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_89_0_0_1 = INSTANCE.getJAVA_89_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_89_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getNestedExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.NESTED_EXPRESSION__EXPRESSION), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_89_0_0_2 = INSTANCE.getJAVA_89_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_89_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(")", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_89_0_0_3 = INSTANCE.getJAVA_89_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_89_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getNestedExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.NESTED_EXPRESSION__ARRAY_SELECTORS), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_89_0_0_4_0_0_0 = INSTANCE.getJAVA_89_0_0_4_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_89_0_0_4_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(".", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment JAVA_89_0_0_4_0_0_1 = INSTANCE.getJAVA_89_0_0_4_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment getJAVA_89_0_0_4_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getNestedExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.NESTED_EXPRESSION__NEXT), org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_89_0_0_4_0_0 = INSTANCE.getJAVA_89_0_0_4_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_89_0_0_4_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_89_0_0_4_0_0_0, JAVA_89_0_0_4_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_89_0_0_4_0 = INSTANCE.getJAVA_89_0_0_4_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_89_0_0_4_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_89_0_0_4_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_89_0_0_4 = INSTANCE.getJAVA_89_0_0_4();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_89_0_0_4() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_89_0_0_4_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_89_0_0 = INSTANCE.getJAVA_89_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_89_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_89_0_0_0, JAVA_89_0_0_1, JAVA_89_0_0_2, JAVA_89_0_0_3, JAVA_89_0_0_4);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_89_0 = INSTANCE.getJAVA_89_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_89_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_89_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_89 = INSTANCE.getJAVA_89();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_89() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getNestedExpression(), JAVA_89_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_90_0_0_0 = INSTANCE.getJAVA_90_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_90_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_90_0_0 = INSTANCE.getJAVA_90_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_90_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_90_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_90_0 = INSTANCE.getJAVA_90_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_90_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_90_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_90 = INSTANCE.getJAVA_90();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_90() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignment(), JAVA_90_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_91_0_0_0 = INSTANCE.getJAVA_91_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_91_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("+=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_91_0_0 = INSTANCE.getJAVA_91_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_91_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_91_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_91_0 = INSTANCE.getJAVA_91_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_91_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_91_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_91 = INSTANCE.getJAVA_91();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_91() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentPlus(), JAVA_91_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_92_0_0_0 = INSTANCE.getJAVA_92_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_92_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("-=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_92_0_0 = INSTANCE.getJAVA_92_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_92_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_92_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_92_0 = INSTANCE.getJAVA_92_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_92_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_92_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_92 = INSTANCE.getJAVA_92();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_92() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentMinus(), JAVA_92_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_93_0_0_0 = INSTANCE.getJAVA_93_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_93_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("*=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_93_0_0 = INSTANCE.getJAVA_93_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_93_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_93_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_93_0 = INSTANCE.getJAVA_93_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_93_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_93_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_93 = INSTANCE.getJAVA_93();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_93() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentMultiplication(), JAVA_93_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_94_0_0_0 = INSTANCE.getJAVA_94_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_94_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("/=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_94_0_0 = INSTANCE.getJAVA_94_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_94_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_94_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_94_0 = INSTANCE.getJAVA_94_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_94_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_94_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_94 = INSTANCE.getJAVA_94();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_94() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentDivision(), JAVA_94_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_95_0_0_0 = INSTANCE.getJAVA_95_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_95_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("&=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_95_0_0 = INSTANCE.getJAVA_95_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_95_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_95_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_95_0 = INSTANCE.getJAVA_95_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_95_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_95_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_95 = INSTANCE.getJAVA_95();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_95() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentAnd(), JAVA_95_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_96_0_0_0 = INSTANCE.getJAVA_96_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_96_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("|=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_96_0_0 = INSTANCE.getJAVA_96_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_96_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_96_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_96_0 = INSTANCE.getJAVA_96_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_96_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_96_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_96 = INSTANCE.getJAVA_96();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_96() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentOr(), JAVA_96_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_97_0_0_0 = INSTANCE.getJAVA_97_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_97_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("^=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_97_0_0 = INSTANCE.getJAVA_97_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_97_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_97_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_97_0 = INSTANCE.getJAVA_97_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_97_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_97_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_97 = INSTANCE.getJAVA_97();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_97() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentExclusiveOr(), JAVA_97_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_98_0_0_0 = INSTANCE.getJAVA_98_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_98_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("%=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_98_0_0 = INSTANCE.getJAVA_98_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_98_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_98_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_98_0 = INSTANCE.getJAVA_98_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_98_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_98_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_98 = INSTANCE.getJAVA_98();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_98() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentModulo(), JAVA_98_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_99_0_0_0 = INSTANCE.getJAVA_99_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_99_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_99_0_0_1 = INSTANCE.getJAVA_99_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_99_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_99_0_0_2 = INSTANCE.getJAVA_99_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_99_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_99_0_0 = INSTANCE.getJAVA_99_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_99_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_99_0_0_0, JAVA_99_0_0_1, JAVA_99_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_99_0 = INSTANCE.getJAVA_99_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_99_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_99_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_99 = INSTANCE.getJAVA_99();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_99() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentLeftShift(), JAVA_99_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_100_0_0_0 = INSTANCE.getJAVA_100_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_100_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_100_0_0_1 = INSTANCE.getJAVA_100_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_100_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_100_0_0_2 = INSTANCE.getJAVA_100_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_100_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_100_0_0 = INSTANCE.getJAVA_100_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_100_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_100_0_0_0, JAVA_100_0_0_1, JAVA_100_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_100_0 = INSTANCE.getJAVA_100_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_100_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_100_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_100 = INSTANCE.getJAVA_100();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_100() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentRightShift(), JAVA_100_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_101_0_0_0 = INSTANCE.getJAVA_101_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_101_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_101_0_0_1 = INSTANCE.getJAVA_101_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_101_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_101_0_0_2 = INSTANCE.getJAVA_101_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_101_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_101_0_0_3 = INSTANCE.getJAVA_101_0_0_3();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_101_0_0_3() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_101_0_0 = INSTANCE.getJAVA_101_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_101_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_101_0_0_0, JAVA_101_0_0_1, JAVA_101_0_0_2, JAVA_101_0_0_3);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_101_0 = INSTANCE.getJAVA_101_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_101_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_101_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_101 = INSTANCE.getJAVA_101();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_101() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentUnsignedRightShift(), JAVA_101_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_102_0_0_0 = INSTANCE.getJAVA_102_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_102_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("+", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_102_0_0 = INSTANCE.getJAVA_102_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_102_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_102_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_102_0 = INSTANCE.getJAVA_102_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_102_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_102_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_102 = INSTANCE.getJAVA_102();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_102() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAddition(), JAVA_102_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_103_0_0_0 = INSTANCE.getJAVA_103_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_103_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("-", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_103_0_0 = INSTANCE.getJAVA_103_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_103_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_103_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_103_0 = INSTANCE.getJAVA_103_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_103_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_103_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_103 = INSTANCE.getJAVA_103();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_103() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getSubtraction(), JAVA_103_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_104_0_0_0 = INSTANCE.getJAVA_104_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_104_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("*", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_104_0_0 = INSTANCE.getJAVA_104_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_104_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_104_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_104_0 = INSTANCE.getJAVA_104_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_104_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_104_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_104 = INSTANCE.getJAVA_104();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_104() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getMultiplication(), JAVA_104_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_105_0_0_0 = INSTANCE.getJAVA_105_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_105_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("/", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_105_0_0 = INSTANCE.getJAVA_105_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_105_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_105_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_105_0 = INSTANCE.getJAVA_105_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_105_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_105_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_105 = INSTANCE.getJAVA_105();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_105() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getDivision(), JAVA_105_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_106_0_0_0 = INSTANCE.getJAVA_106_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_106_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("%", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_106_0_0 = INSTANCE.getJAVA_106_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_106_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_106_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_106_0 = INSTANCE.getJAVA_106_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_106_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_106_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_106 = INSTANCE.getJAVA_106();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_106() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getRemainder(), JAVA_106_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_107_0_0_0 = INSTANCE.getJAVA_107_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_107_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_107_0_0 = INSTANCE.getJAVA_107_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_107_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_107_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_107_0 = INSTANCE.getJAVA_107_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_107_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_107_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_107 = INSTANCE.getJAVA_107();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_107() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getLessThan(), JAVA_107_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_108_0_0_0 = INSTANCE.getJAVA_108_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_108_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_108_0_0_1 = INSTANCE.getJAVA_108_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_108_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_108_0_0 = INSTANCE.getJAVA_108_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_108_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_108_0_0_0, JAVA_108_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_108_0 = INSTANCE.getJAVA_108_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_108_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_108_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_108 = INSTANCE.getJAVA_108();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_108() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getLessThanOrEqual(), JAVA_108_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_109_0_0_0 = INSTANCE.getJAVA_109_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_109_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_109_0_0 = INSTANCE.getJAVA_109_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_109_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_109_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_109_0 = INSTANCE.getJAVA_109_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_109_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_109_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_109 = INSTANCE.getJAVA_109();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_109() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getGreaterThan(), JAVA_109_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_110_0_0_0 = INSTANCE.getJAVA_110_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_110_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_110_0_0_1 = INSTANCE.getJAVA_110_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_110_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_110_0_0 = INSTANCE.getJAVA_110_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_110_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_110_0_0_0, JAVA_110_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_110_0 = INSTANCE.getJAVA_110_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_110_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_110_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_110 = INSTANCE.getJAVA_110();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_110() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getGreaterThanOrEqual(), JAVA_110_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_111_0_0_0 = INSTANCE.getJAVA_111_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_111_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_111_0_0_1 = INSTANCE.getJAVA_111_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_111_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("<", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_111_0_0 = INSTANCE.getJAVA_111_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_111_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_111_0_0_0, JAVA_111_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_111_0 = INSTANCE.getJAVA_111_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_111_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_111_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_111 = INSTANCE.getJAVA_111();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_111() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getLeftShift(), JAVA_111_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_112_0_0_0 = INSTANCE.getJAVA_112_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_112_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_112_0_0_1 = INSTANCE.getJAVA_112_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_112_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_112_0_0 = INSTANCE.getJAVA_112_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_112_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_112_0_0_0, JAVA_112_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_112_0 = INSTANCE.getJAVA_112_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_112_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_112_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_112 = INSTANCE.getJAVA_112();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_112() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getRightShift(), JAVA_112_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_113_0_0_0 = INSTANCE.getJAVA_113_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_113_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_113_0_0_1 = INSTANCE.getJAVA_113_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_113_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_113_0_0_2 = INSTANCE.getJAVA_113_0_0_2();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_113_0_0_2() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword(">", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_113_0_0 = INSTANCE.getJAVA_113_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_113_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_113_0_0_0, JAVA_113_0_0_1, JAVA_113_0_0_2);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_113_0 = INSTANCE.getJAVA_113_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_113_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_113_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_113 = INSTANCE.getJAVA_113();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_113() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getUnsignedRightShift(), JAVA_113_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_114_0_0_0 = INSTANCE.getJAVA_114_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_114_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("==", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_114_0_0 = INSTANCE.getJAVA_114_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_114_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_114_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_114_0 = INSTANCE.getJAVA_114_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_114_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_114_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_114 = INSTANCE.getJAVA_114();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_114() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getEqual(), JAVA_114_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_115_0_0_0 = INSTANCE.getJAVA_115_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_115_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("!=", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_115_0_0 = INSTANCE.getJAVA_115_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_115_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_115_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_115_0 = INSTANCE.getJAVA_115_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_115_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_115_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_115 = INSTANCE.getJAVA_115();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_115() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getNotEqual(), JAVA_115_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_116_0_0_0 = INSTANCE.getJAVA_116_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_116_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("++", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_116_0_0 = INSTANCE.getJAVA_116_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_116_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_116_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_116_0 = INSTANCE.getJAVA_116_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_116_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_116_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_116 = INSTANCE.getJAVA_116();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_116() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getPlusPlus(), JAVA_116_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_117_0_0_0 = INSTANCE.getJAVA_117_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_117_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("--", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_117_0_0 = INSTANCE.getJAVA_117_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_117_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_117_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_117_0 = INSTANCE.getJAVA_117_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_117_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_117_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_117 = INSTANCE.getJAVA_117();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_117() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getMinusMinus(), JAVA_117_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_118_0_0_0 = INSTANCE.getJAVA_118_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_118_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("~", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_118_0_0 = INSTANCE.getJAVA_118_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_118_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_118_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_118_0 = INSTANCE.getJAVA_118_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_118_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_118_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_118 = INSTANCE.getJAVA_118();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_118() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getComplement(), JAVA_118_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_119_0_0_0 = INSTANCE.getJAVA_119_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_119_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("!", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_119_0_0 = INSTANCE.getJAVA_119_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_119_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_119_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_119_0 = INSTANCE.getJAVA_119_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_119_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_119_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_119 = INSTANCE.getJAVA_119();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_119() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getNegate(), JAVA_119_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_120_0_0_0_0_0_0 = INSTANCE.getJAVA_120_0_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_120_0_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("[", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_120_0_0_0_0_0_1 = INSTANCE.getJAVA_120_0_0_0_0_0_1();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_120_0_0_0_0_0_1() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("]", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_120_0_0_0_0_0 = INSTANCE.getJAVA_120_0_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_120_0_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_120_0_0_0_0_0_0, JAVA_120_0_0_0_0_0_1);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_120_0_0_0_0 = INSTANCE.getJAVA_120_0_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_120_0_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_120_0_0_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound JAVA_120_0_0_0 = INSTANCE.getJAVA_120_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound getJAVA_120_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCompound(JAVA_120_0_0_0_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_120_0_0 = INSTANCE.getJAVA_120_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_120_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_120_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_120_0 = INSTANCE.getJAVA_120_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_120_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_120_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_120 = INSTANCE.getJAVA_120();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_120() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), JAVA_120_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_121_0_0_0 = INSTANCE.getJAVA_121_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_121_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("null", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_121_0_0 = INSTANCE.getJAVA_121_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_121_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_121_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_121_0 = INSTANCE.getJAVA_121_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_121_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_121_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_121 = INSTANCE.getJAVA_121();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_121() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getNullLiteral(), JAVA_121_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_122_0_0_0 = INSTANCE.getJAVA_122_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_122_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("public", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_122_0_0 = INSTANCE.getJAVA_122_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_122_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_122_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_122_0 = INSTANCE.getJAVA_122_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_122_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_122_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_122 = INSTANCE.getJAVA_122();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_122() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getPublic(), JAVA_122_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_123_0_0_0 = INSTANCE.getJAVA_123_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_123_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("abstract", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_123_0_0 = INSTANCE.getJAVA_123_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_123_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_123_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_123_0 = INSTANCE.getJAVA_123_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_123_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_123_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_123 = INSTANCE.getJAVA_123();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_123() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAbstract(), JAVA_123_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_124_0_0_0 = INSTANCE.getJAVA_124_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_124_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("protected", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_124_0_0 = INSTANCE.getJAVA_124_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_124_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_124_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_124_0 = INSTANCE.getJAVA_124_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_124_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_124_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_124 = INSTANCE.getJAVA_124();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_124() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getProtected(), JAVA_124_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_125_0_0_0 = INSTANCE.getJAVA_125_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_125_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("private", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_125_0_0 = INSTANCE.getJAVA_125_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_125_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_125_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_125_0 = INSTANCE.getJAVA_125_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_125_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_125_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_125 = INSTANCE.getJAVA_125();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_125() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getPrivate(), JAVA_125_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_126_0_0_0 = INSTANCE.getJAVA_126_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_126_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("final", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_126_0_0 = INSTANCE.getJAVA_126_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_126_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_126_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_126_0 = INSTANCE.getJAVA_126_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_126_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_126_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_126 = INSTANCE.getJAVA_126();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_126() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getFinal(), JAVA_126_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_127_0_0_0 = INSTANCE.getJAVA_127_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_127_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("static", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_127_0_0 = INSTANCE.getJAVA_127_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_127_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_127_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_127_0 = INSTANCE.getJAVA_127_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_127_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_127_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_127 = INSTANCE.getJAVA_127();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_127() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getStatic(), JAVA_127_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_128_0_0_0 = INSTANCE.getJAVA_128_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_128_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("native", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_128_0_0 = INSTANCE.getJAVA_128_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_128_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_128_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_128_0 = INSTANCE.getJAVA_128_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_128_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_128_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_128 = INSTANCE.getJAVA_128();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_128() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getNative(), JAVA_128_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_129_0_0_0 = INSTANCE.getJAVA_129_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_129_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("synchronized", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_129_0_0 = INSTANCE.getJAVA_129_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_129_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_129_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_129_0 = INSTANCE.getJAVA_129_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_129_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_129_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_129 = INSTANCE.getJAVA_129();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_129() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getSynchronized(), JAVA_129_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_130_0_0_0 = INSTANCE.getJAVA_130_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_130_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("transient", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_130_0_0 = INSTANCE.getJAVA_130_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_130_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_130_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_130_0 = INSTANCE.getJAVA_130_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_130_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_130_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_130 = INSTANCE.getJAVA_130();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_130() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getTransient(), JAVA_130_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_131_0_0_0 = INSTANCE.getJAVA_131_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_131_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("volatile", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_131_0_0 = INSTANCE.getJAVA_131_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_131_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_131_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_131_0 = INSTANCE.getJAVA_131_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_131_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_131_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_131 = INSTANCE.getJAVA_131();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_131() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getVolatile(), JAVA_131_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_132_0_0_0 = INSTANCE.getJAVA_132_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_132_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("strictfp", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_132_0_0 = INSTANCE.getJAVA_132_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_132_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_132_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_132_0 = INSTANCE.getJAVA_132_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_132_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_132_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_132 = INSTANCE.getJAVA_132();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_132() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getStrictfp(), JAVA_132_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_133_0_0_0 = INSTANCE.getJAVA_133_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_133_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("void", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_133_0_0 = INSTANCE.getJAVA_133_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_133_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_133_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_133_0 = INSTANCE.getJAVA_133_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_133_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_133_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_133 = INSTANCE.getJAVA_133();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_133() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getVoid(), JAVA_133_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_134_0_0_0 = INSTANCE.getJAVA_134_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_134_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("boolean", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_134_0_0 = INSTANCE.getJAVA_134_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_134_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_134_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_134_0 = INSTANCE.getJAVA_134_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_134_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_134_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_134 = INSTANCE.getJAVA_134();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_134() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getBoolean(), JAVA_134_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_135_0_0_0 = INSTANCE.getJAVA_135_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_135_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("char", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_135_0_0 = INSTANCE.getJAVA_135_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_135_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_135_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_135_0 = INSTANCE.getJAVA_135_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_135_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_135_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_135 = INSTANCE.getJAVA_135();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_135() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getChar(), JAVA_135_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_136_0_0_0 = INSTANCE.getJAVA_136_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_136_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("byte", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_136_0_0 = INSTANCE.getJAVA_136_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_136_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_136_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_136_0 = INSTANCE.getJAVA_136_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_136_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_136_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_136 = INSTANCE.getJAVA_136();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_136() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getByte(), JAVA_136_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_137_0_0_0 = INSTANCE.getJAVA_137_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_137_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("short", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_137_0_0 = INSTANCE.getJAVA_137_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_137_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_137_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_137_0 = INSTANCE.getJAVA_137_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_137_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_137_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_137 = INSTANCE.getJAVA_137();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_137() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getShort(), JAVA_137_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_138_0_0_0 = INSTANCE.getJAVA_138_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_138_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("int", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_138_0_0 = INSTANCE.getJAVA_138_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_138_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_138_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_138_0 = INSTANCE.getJAVA_138_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_138_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_138_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_138 = INSTANCE.getJAVA_138();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_138() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getInt(), JAVA_138_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_139_0_0_0 = INSTANCE.getJAVA_139_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_139_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("long", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_139_0_0 = INSTANCE.getJAVA_139_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_139_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_139_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_139_0 = INSTANCE.getJAVA_139_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_139_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_139_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_139 = INSTANCE.getJAVA_139();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_139() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getLong(), JAVA_139_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_140_0_0_0 = INSTANCE.getJAVA_140_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_140_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("float", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_140_0_0 = INSTANCE.getJAVA_140_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_140_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_140_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_140_0 = INSTANCE.getJAVA_140_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_140_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_140_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_140 = INSTANCE.getJAVA_140();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_140() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getFloat(), JAVA_140_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword JAVA_141_0_0_0 = INSTANCE.getJAVA_141_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword getJAVA_141_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword("double", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_141_0_0 = INSTANCE.getJAVA_141_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_141_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_141_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_141_0 = INSTANCE.getJAVA_141_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_141_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_141_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_141 = INSTANCE.getJAVA_141();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_141() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getDouble(), JAVA_141_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_142_0_0_0 = INSTANCE.getJAVA_142_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_142_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalLongLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.DECIMAL_LONG_LITERAL__DECIMAL_VALUE), "DECIMAL_LONG_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_142_0_0 = INSTANCE.getJAVA_142_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_142_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_142_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_142_0 = INSTANCE.getJAVA_142_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_142_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_142_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_142 = INSTANCE.getJAVA_142();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_142() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalLongLiteral(), JAVA_142_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_143_0_0_0 = INSTANCE.getJAVA_143_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_143_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalFloatLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE), "DECIMAL_FLOAT_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_143_0_0 = INSTANCE.getJAVA_143_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_143_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_143_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_143_0 = INSTANCE.getJAVA_143_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_143_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_143_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_143 = INSTANCE.getJAVA_143();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_143() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalFloatLiteral(), JAVA_143_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_144_0_0_0 = INSTANCE.getJAVA_144_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_144_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalIntegerLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE), "DECIMAL_INTEGER_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_144_0_0 = INSTANCE.getJAVA_144_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_144_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_144_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_144_0 = INSTANCE.getJAVA_144_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_144_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_144_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_144 = INSTANCE.getJAVA_144();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_144() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalIntegerLiteral(), JAVA_144_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_145_0_0_0 = INSTANCE.getJAVA_145_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_145_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalDoubleLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.DECIMAL_DOUBLE_LITERAL__DECIMAL_VALUE), "DECIMAL_DOUBLE_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_145_0_0 = INSTANCE.getJAVA_145_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_145_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_145_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_145_0 = INSTANCE.getJAVA_145_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_145_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_145_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_145 = INSTANCE.getJAVA_145();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_145() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalDoubleLiteral(), JAVA_145_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_146_0_0_0 = INSTANCE.getJAVA_146_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_146_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexLongLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.HEX_LONG_LITERAL__HEX_VALUE), "HEX_LONG_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_146_0_0 = INSTANCE.getJAVA_146_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_146_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_146_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_146_0 = INSTANCE.getJAVA_146_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_146_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_146_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_146 = INSTANCE.getJAVA_146();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_146() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexLongLiteral(), JAVA_146_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_147_0_0_0 = INSTANCE.getJAVA_147_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_147_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexFloatLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.HEX_FLOAT_LITERAL__HEX_VALUE), "HEX_FLOAT_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_147_0_0 = INSTANCE.getJAVA_147_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_147_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_147_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_147_0 = INSTANCE.getJAVA_147_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_147_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_147_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_147 = INSTANCE.getJAVA_147();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_147() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexFloatLiteral(), JAVA_147_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_148_0_0_0 = INSTANCE.getJAVA_148_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_148_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexDoubleLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.HEX_DOUBLE_LITERAL__HEX_VALUE), "HEX_DOUBLE_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_148_0_0 = INSTANCE.getJAVA_148_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_148_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_148_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_148_0 = INSTANCE.getJAVA_148_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_148_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_148_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_148 = INSTANCE.getJAVA_148();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_148() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexDoubleLiteral(), JAVA_148_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_149_0_0_0 = INSTANCE.getJAVA_149_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_149_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexIntegerLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.HEX_INTEGER_LITERAL__HEX_VALUE), "HEX_INTEGER_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_149_0_0 = INSTANCE.getJAVA_149_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_149_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_149_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_149_0 = INSTANCE.getJAVA_149_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_149_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_149_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_149 = INSTANCE.getJAVA_149();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_149() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexIntegerLiteral(), JAVA_149_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_150_0_0_0 = INSTANCE.getJAVA_150_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_150_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getOctalLongLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.OCTAL_LONG_LITERAL__OCTAL_VALUE), "OCTAL_LONG_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_150_0_0 = INSTANCE.getJAVA_150_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_150_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_150_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_150_0 = INSTANCE.getJAVA_150_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_150_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_150_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_150 = INSTANCE.getJAVA_150();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_150() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getOctalLongLiteral(), JAVA_150_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_151_0_0_0 = INSTANCE.getJAVA_151_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_151_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getOctalIntegerLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.OCTAL_INTEGER_LITERAL__OCTAL_VALUE), "OCTAL_INTEGER_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_151_0_0 = INSTANCE.getJAVA_151_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_151_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_151_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_151_0 = INSTANCE.getJAVA_151_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_151_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_151_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_151 = INSTANCE.getJAVA_151();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_151() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getOctalIntegerLiteral(), JAVA_151_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_152_0_0_0 = INSTANCE.getJAVA_152_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_152_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getCharacterLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.CHARACTER_LITERAL__VALUE), "CHARACTER_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_152_0_0 = INSTANCE.getJAVA_152_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_152_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_152_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_152_0 = INSTANCE.getJAVA_152_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_152_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_152_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_152 = INSTANCE.getJAVA_152();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_152() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getCharacterLiteral(), JAVA_152_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder JAVA_153_0_0_0 = INSTANCE.getJAVA_153_0_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder getJAVA_153_0_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getBooleanLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.BOOLEAN_LITERAL__VALUE), "BOOLEAN_LITERAL", org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, 0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence JAVA_153_0_0 = INSTANCE.getJAVA_153_0_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence getJAVA_153_0_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSequence(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_153_0_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice JAVA_153_0 = INSTANCE.getJAVA_153_0();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice getJAVA_153_0() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjChoice(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE, JAVA_153_0_0);
	}
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule JAVA_153 = INSTANCE.getJAVA_153();
	private org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule getJAVA_153() {
		return new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getBooleanLiteral(), JAVA_153_0, org.kardo.language.aspectj.resource.aspectj.grammar.AspectjCardinality.ONE);
	}
	
	public static String getSyntaxElementID(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : org.kardo.language.aspectj.resource.aspectj.grammar.AspectjGrammarInformationProvider.class.getFields()) {
			Object fieldValue;
			try {
				fieldValue = field.get(null);
				if (fieldValue == syntaxElement) {
					String id = field.getName();
					return id;
				}
			} catch (Exception e) { }
		}
		return null;
	}
	
	public static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement) org.kardo.language.aspectj.resource.aspectj.grammar.AspectjGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule[] RULES = new org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule[] {
		ASPECTJ_0,
		ASPECTJ_1,
		ASPECTJ_2,
		ASPECTJ_3,
		ASPECTJ_4,
		ASPECTJ_5,
		ASPECTJ_6,
		ASPECTJ_7,
		ASPECTJ_8,
		ASPECTJ_9,
		ASPECTJ_10,
		ASPECTJ_11,
		ASPECTJ_12,
		ASPECTJ_13,
		ASPECTJ_14,
		ASPECTJ_15,
		ASPECTJ_16,
		ASPECTJ_17,
		ASPECTJ_18,
		ASPECTJ_19,
		ASPECTJ_20,
		ASPECTJ_21,
		ASPECTJ_22,
		ASPECTJ_23,
		ASPECTJ_24,
		ASPECTJ_25,
		ASPECTJ_26,
		JAVA_0,
		JAVA_1,
		JAVA_2,
		JAVA_3,
		JAVA_4,
		JAVA_5,
		JAVA_6,
		JAVA_7,
		JAVA_8,
		JAVA_9,
		JAVA_10,
		JAVA_11,
		JAVA_12,
		JAVA_13,
		JAVA_14,
		JAVA_15,
		JAVA_16,
		JAVA_17,
		JAVA_18,
		JAVA_19,
		JAVA_20,
		JAVA_21,
		JAVA_22,
		JAVA_23,
		JAVA_24,
		JAVA_25,
		JAVA_26,
		JAVA_27,
		JAVA_28,
		JAVA_29,
		JAVA_30,
		JAVA_31,
		JAVA_32,
		JAVA_33,
		JAVA_34,
		JAVA_35,
		JAVA_36,
		JAVA_37,
		JAVA_38,
		JAVA_39,
		JAVA_40,
		JAVA_41,
		JAVA_42,
		JAVA_43,
		JAVA_44,
		JAVA_45,
		JAVA_46,
		JAVA_47,
		JAVA_48,
		JAVA_49,
		JAVA_50,
		JAVA_51,
		JAVA_52,
		JAVA_53,
		JAVA_54,
		JAVA_55,
		JAVA_56,
		JAVA_57,
		JAVA_58,
		JAVA_59,
		JAVA_60,
		JAVA_61,
		JAVA_62,
		JAVA_63,
		JAVA_64,
		JAVA_65,
		JAVA_66,
		JAVA_67,
		JAVA_68,
		JAVA_69,
		JAVA_70,
		JAVA_71,
		JAVA_72,
		JAVA_73,
		JAVA_74,
		JAVA_75,
		JAVA_76,
		JAVA_77,
		JAVA_78,
		JAVA_79,
		JAVA_80,
		JAVA_81,
		JAVA_82,
		JAVA_83,
		JAVA_84,
		JAVA_85,
		JAVA_86,
		JAVA_87,
		JAVA_88,
		JAVA_89,
		JAVA_90,
		JAVA_91,
		JAVA_92,
		JAVA_93,
		JAVA_94,
		JAVA_95,
		JAVA_96,
		JAVA_97,
		JAVA_98,
		JAVA_99,
		JAVA_100,
		JAVA_101,
		JAVA_102,
		JAVA_103,
		JAVA_104,
		JAVA_105,
		JAVA_106,
		JAVA_107,
		JAVA_108,
		JAVA_109,
		JAVA_110,
		JAVA_111,
		JAVA_112,
		JAVA_113,
		JAVA_114,
		JAVA_115,
		JAVA_116,
		JAVA_117,
		JAVA_118,
		JAVA_119,
		JAVA_120,
		JAVA_121,
		JAVA_122,
		JAVA_123,
		JAVA_124,
		JAVA_125,
		JAVA_126,
		JAVA_127,
		JAVA_128,
		JAVA_129,
		JAVA_130,
		JAVA_131,
		JAVA_132,
		JAVA_133,
		JAVA_134,
		JAVA_135,
		JAVA_136,
		JAVA_137,
		JAVA_138,
		JAVA_139,
		JAVA_140,
		JAVA_141,
		JAVA_142,
		JAVA_143,
		JAVA_144,
		JAVA_145,
		JAVA_146,
		JAVA_147,
		JAVA_148,
		JAVA_149,
		JAVA_150,
		JAVA_151,
		JAVA_152,
		JAVA_153,
	};
	
	/**
	 * Returns all keywords of the grammar. This includes all literals for boolean and
	 * enumeration terminals.
	 */
	public java.util.Set<String> getKeywords() {
		if (this.keywords == null) {
			this.keywords = new java.util.LinkedHashSet<String>();
			for (org.kardo.language.aspectj.resource.aspectj.grammar.AspectjRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword) {
			keywords.add(((org.kardo.language.aspectj.resource.aspectj.grammar.AspectjKeyword) element).getValue());
		} else if (element instanceof org.kardo.language.aspectj.resource.aspectj.grammar.AspectjBooleanTerminal) {
			keywords.add(((org.kardo.language.aspectj.resource.aspectj.grammar.AspectjBooleanTerminal) element).getTrueLiteral());
			keywords.add(((org.kardo.language.aspectj.resource.aspectj.grammar.AspectjBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof org.kardo.language.aspectj.resource.aspectj.grammar.AspectjEnumerationTerminal) {
			org.kardo.language.aspectj.resource.aspectj.grammar.AspectjEnumerationTerminal terminal = (org.kardo.language.aspectj.resource.aspectj.grammar.AspectjEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (org.kardo.language.aspectj.resource.aspectj.grammar.AspectjSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
