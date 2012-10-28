/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.grammar;

public class IpcGrammarInformationProvider {
	
	public final static org.eclipse.emf.ecore.EStructuralFeature ANONYMOUS_FEATURE = org.eclipse.emf.ecore.EcoreFactory.eINSTANCE.createEAttribute();
	static {
		ANONYMOUS_FEATURE.setName("_");
	}
	
	public final static IpcGrammarInformationProvider INSTANCE = new IpcGrammarInformationProvider();
	
	private java.util.Set<String> keywords;
	
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_0_0_0_0 = INSTANCE.getIPC_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("instance pointcut", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder IPC_0_0_0_1 = INSTANCE.getIPC_0_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getIPC_0_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.kardo.language.ipc.IpcPackage.eINSTANCE.getInstancePointcut().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.INSTANCE_POINTCUT__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace IPC_0_0_0_2 = INSTANCE.getIPC_0_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getIPC_0_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_0_0_0_3 = INSTANCE.getIPC_0_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_0_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_0_0_0_4 = INSTANCE.getIPC_0_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_0_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getInstancePointcut().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.INSTANCE_POINTCUT__TYPE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_0_0_0_5 = INSTANCE.getIPC_0_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_0_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_0_0_0_6 = INSTANCE.getIPC_0_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_0_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getInstancePointcut().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.INSTANCE_POINTCUT__ASSIGN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPcAssignmentOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_0_0_0_7 = INSTANCE.getIPC_0_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_0_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getInstancePointcut().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.INSTANCE_POINTCUT__EXPR), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_0_0_0_8 = INSTANCE.getIPC_0_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_0_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence IPC_0_0_0 = INSTANCE.getIPC_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getIPC_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_0_0_0_0, IPC_0_0_0_1, IPC_0_0_0_2, IPC_0_0_0_3, IPC_0_0_0_4, IPC_0_0_0_5, IPC_0_0_0_6, IPC_0_0_0_7, IPC_0_0_0_8);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice IPC_0_0 = INSTANCE.getIPC_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getIPC_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule IPC_0 = INSTANCE.getIPC_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getIPC_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.ipc.IpcPackage.eINSTANCE.getInstancePointcut(), IPC_0_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_1_0_0_0 = INSTANCE.getIPC_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcExpression().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.IPC_EXPRESSION__ADD_EXPRESSION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcSubExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_1_0_0_1_0_0_0 = INSTANCE.getIPC_1_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_1_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("UNTIL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_1_0_0_1_0_0_1 = INSTANCE.getIPC_1_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_1_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcExpression().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.IPC_EXPRESSION__REMOVE_EXPRESSION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcSubExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence IPC_1_0_0_1_0_0 = INSTANCE.getIPC_1_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getIPC_1_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_1_0_0_1_0_0_0, IPC_1_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice IPC_1_0_0_1_0 = INSTANCE.getIPC_1_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getIPC_1_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_1_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound IPC_1_0_0_1 = INSTANCE.getIPC_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getIPC_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(IPC_1_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence IPC_1_0_0 = INSTANCE.getIPC_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getIPC_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_1_0_0_0, IPC_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice IPC_1_0 = INSTANCE.getIPC_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getIPC_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule IPC_1 = INSTANCE.getIPC_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getIPC_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcExpression(), IPC_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_2_0_0_0 = INSTANCE.getIPC_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcSubExpression().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.IPC_SUB_EXPRESSION__BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.ipc.IpcPackage.eINSTANCE.getBeforeEvent(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_2_0_0_1 = INSTANCE.getIPC_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("||", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_2_0_0_2 = INSTANCE.getIPC_2_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_2_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcSubExpression().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.IPC_SUB_EXPRESSION__AFTER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.ipc.IpcPackage.eINSTANCE.getAfterEvent(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence IPC_2_0_0 = INSTANCE.getIPC_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getIPC_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_2_0_0_0, IPC_2_0_0_1, IPC_2_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_2_0_1_0 = INSTANCE.getIPC_2_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_2_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcSubExpression().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.IPC_SUB_EXPRESSION__AFTER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.ipc.IpcPackage.eINSTANCE.getAfterEvent(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_2_0_1_1 = INSTANCE.getIPC_2_0_1_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_2_0_1_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("||", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_2_0_1_2 = INSTANCE.getIPC_2_0_1_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_2_0_1_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcSubExpression().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.IPC_SUB_EXPRESSION__BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.ipc.IpcPackage.eINSTANCE.getBeforeEvent(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence IPC_2_0_1 = INSTANCE.getIPC_2_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getIPC_2_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_2_0_1_0, IPC_2_0_1_1, IPC_2_0_1_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_2_0_2_0 = INSTANCE.getIPC_2_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_2_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcSubExpression().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.IPC_SUB_EXPRESSION__BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.ipc.IpcPackage.eINSTANCE.getBeforeEvent(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence IPC_2_0_2 = INSTANCE.getIPC_2_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getIPC_2_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_2_0_2_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_2_0_3_0 = INSTANCE.getIPC_2_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_2_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcSubExpression().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.IPC_SUB_EXPRESSION__AFTER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.ipc.IpcPackage.eINSTANCE.getAfterEvent(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence IPC_2_0_3 = INSTANCE.getIPC_2_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getIPC_2_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_2_0_3_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice IPC_2_0 = INSTANCE.getIPC_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getIPC_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_2_0_0, IPC_2_0_1, IPC_2_0_2, IPC_2_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule IPC_2 = INSTANCE.getIPC_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getIPC_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.ipc.IpcPackage.eINSTANCE.getIpcSubExpression(), IPC_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_3_0_0_0 = INSTANCE.getIPC_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("after", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace IPC_3_0_0_1 = INSTANCE.getIPC_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getIPC_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_3_0_0_2 = INSTANCE.getIPC_3_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_3_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_3_0_0_3 = INSTANCE.getIPC_3_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_3_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getAfterEvent().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.AFTER_EVENT__PCEXP), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_3_0_0_4 = INSTANCE.getIPC_3_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_3_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence IPC_3_0_0 = INSTANCE.getIPC_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getIPC_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_3_0_0_0, IPC_3_0_0_1, IPC_3_0_0_2, IPC_3_0_0_3, IPC_3_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice IPC_3_0 = INSTANCE.getIPC_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getIPC_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule IPC_3 = INSTANCE.getIPC_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getIPC_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.ipc.IpcPackage.eINSTANCE.getAfterEvent(), IPC_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_4_0_0_0 = INSTANCE.getIPC_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("before", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace IPC_4_0_0_1 = INSTANCE.getIPC_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getIPC_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_4_0_0_2 = INSTANCE.getIPC_4_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_4_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment IPC_4_0_0_3 = INSTANCE.getIPC_4_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getIPC_4_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.ipc.IpcPackage.eINSTANCE.getBeforeEvent().getEStructuralFeature(org.kardo.language.ipc.IpcPackage.BEFORE_EVENT__PCEXP), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword IPC_4_0_0_4 = INSTANCE.getIPC_4_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getIPC_4_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence IPC_4_0_0 = INSTANCE.getIPC_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getIPC_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_4_0_0_0, IPC_4_0_0_1, IPC_4_0_0_2, IPC_4_0_0_3, IPC_4_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice IPC_4_0 = INSTANCE.getIPC_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getIPC_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, IPC_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule IPC_4 = INSTANCE.getIPC_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getIPC_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.ipc.IpcPackage.eINSTANCE.getBeforeEvent(), IPC_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_0_0_0_0_0_0_0 = INSTANCE.getASPECTJ_0_0_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_0_0_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("package", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder ASPECTJ_0_0_0_0_0_0_1 = INSTANCE.getASPECTJ_0_0_0_0_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getASPECTJ_0_0_0_0_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectJCompilationUnit().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT_JCOMPILATION_UNIT__NAMESPACES), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_0_0_0_0_0_0_2_0_0_0 = INSTANCE.getASPECTJ_0_0_0_0_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_0_0_0_0_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder ASPECTJ_0_0_0_0_0_0_2_0_0_1 = INSTANCE.getASPECTJ_0_0_0_0_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getASPECTJ_0_0_0_0_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectJCompilationUnit().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT_JCOMPILATION_UNIT__NAMESPACES), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_0_0_0_0_0_0_2_0_0 = INSTANCE.getASPECTJ_0_0_0_0_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_0_0_0_0_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_0_0_0_2_0_0_0, ASPECTJ_0_0_0_0_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_0_0_0_0_0_0_2_0 = INSTANCE.getASPECTJ_0_0_0_0_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_0_0_0_0_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_0_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_0_0_0_0_0_0_2 = INSTANCE.getASPECTJ_0_0_0_0_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_0_0_0_0_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_0_0_0_0_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_0_0_0_0_0_0_3 = INSTANCE.getASPECTJ_0_0_0_0_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_0_0_0_0_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_0_0_0_0_0_0 = INSTANCE.getASPECTJ_0_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_0_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_0_0_0_0, ASPECTJ_0_0_0_0_0_0_1, ASPECTJ_0_0_0_0_0_0_2, ASPECTJ_0_0_0_0_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_0_0_0_0_0 = INSTANCE.getASPECTJ_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_0_0_0_0 = INSTANCE.getASPECTJ_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_0_0_0_0_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak ASPECTJ_0_0_0_1 = INSTANCE.getASPECTJ_0_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getASPECTJ_0_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak ASPECTJ_0_0_0_2 = INSTANCE.getASPECTJ_0_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getASPECTJ_0_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_0_0_0_3_0_0_0 = INSTANCE.getASPECTJ_0_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_0_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectJCompilationUnit().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT_JCOMPILATION_UNIT__IMPORTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getImport(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak ASPECTJ_0_0_0_3_0_0_1 = INSTANCE.getASPECTJ_0_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getASPECTJ_0_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_0_0_0_3_0_0 = INSTANCE.getASPECTJ_0_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_0_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_3_0_0_0, ASPECTJ_0_0_0_3_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_0_0_0_3_0 = INSTANCE.getASPECTJ_0_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_0_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_0_0_0_3 = INSTANCE.getASPECTJ_0_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_0_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_0_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_0_0_0_4_0_0_0 = INSTANCE.getASPECTJ_0_0_0_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_0_0_0_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak ASPECTJ_0_0_0_4_0_0_1 = INSTANCE.getASPECTJ_0_0_0_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getASPECTJ_0_0_0_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_0_0_0_4_0_0 = INSTANCE.getASPECTJ_0_0_0_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_0_0_0_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_4_0_0_0, ASPECTJ_0_0_0_4_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_0_0_0_4_0 = INSTANCE.getASPECTJ_0_0_0_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_0_0_0_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_0_0_0_4 = INSTANCE.getASPECTJ_0_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_0_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_0_0_0_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak ASPECTJ_0_0_0_5 = INSTANCE.getASPECTJ_0_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getASPECTJ_0_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_0_0_0_6_0_0_0 = INSTANCE.getASPECTJ_0_0_0_6_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_0_0_0_6_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectJCompilationUnit().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT_JCOMPILATION_UNIT__CLASSIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_0_0_0_6_0_0_1_0_0_0 = INSTANCE.getASPECTJ_0_0_0_6_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_0_0_0_6_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_0_0_0_6_0_0_1_0_0 = INSTANCE.getASPECTJ_0_0_0_6_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_0_0_0_6_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_6_0_0_1_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_0_0_0_6_0_0_1_0 = INSTANCE.getASPECTJ_0_0_0_6_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_0_0_0_6_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_6_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_0_0_0_6_0_0_1 = INSTANCE.getASPECTJ_0_0_0_6_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_0_0_0_6_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_0_0_0_6_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak ASPECTJ_0_0_0_6_0_0_2 = INSTANCE.getASPECTJ_0_0_0_6_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getASPECTJ_0_0_0_6_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak ASPECTJ_0_0_0_6_0_0_3 = INSTANCE.getASPECTJ_0_0_0_6_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getASPECTJ_0_0_0_6_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_0_0_0_6_0_0 = INSTANCE.getASPECTJ_0_0_0_6_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_0_0_0_6_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_6_0_0_0, ASPECTJ_0_0_0_6_0_0_1, ASPECTJ_0_0_0_6_0_0_2, ASPECTJ_0_0_0_6_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_0_0_0_6_0 = INSTANCE.getASPECTJ_0_0_0_6_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_0_0_0_6_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_6_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_0_0_0_6 = INSTANCE.getASPECTJ_0_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_0_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_0_0_0_6_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.PLUS);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_0_0_0 = INSTANCE.getASPECTJ_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0_0, ASPECTJ_0_0_0_1, ASPECTJ_0_0_0_2, ASPECTJ_0_0_0_3, ASPECTJ_0_0_0_4, ASPECTJ_0_0_0_5, ASPECTJ_0_0_0_6);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_0_0 = INSTANCE.getASPECTJ_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_0 = INSTANCE.getASPECTJ_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectJCompilationUnit(), ASPECTJ_0_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcBooleanTerminal ASPECTJ_1_0_0_0 = INSTANCE.getASPECTJ_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcBooleanTerminal getASPECTJ_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcBooleanTerminal(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__PRIVILIGED), "privileged", "", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_1_0_0_1 = INSTANCE.getASPECTJ_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_1_0_0_2 = INSTANCE.getASPECTJ_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("aspect", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder ASPECTJ_1_0_0_3 = INSTANCE.getASPECTJ_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getASPECTJ_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_1_0_0_4_0_0_0 = INSTANCE.getASPECTJ_1_0_0_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_1_0_0_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("extends", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_1_0_0_4_0_0_1 = INSTANCE.getASPECTJ_1_0_0_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_1_0_0_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__EXTEND), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_1_0_0_4_0_0 = INSTANCE.getASPECTJ_1_0_0_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_1_0_0_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_1_0_0_4_0_0_0, ASPECTJ_1_0_0_4_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_1_0_0_4_0 = INSTANCE.getASPECTJ_1_0_0_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_1_0_0_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_1_0_0_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_1_0_0_4 = INSTANCE.getASPECTJ_1_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_1_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_1_0_0_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_1_0_0_5_0_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_1_0_0_5_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("implements", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_1_0_0_5_0_0_1_0_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_1_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__IMPLEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_1 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__IMPLEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_0, ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_1_0_0_5_0_0_1_0_0_1_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_1_0_0_5_0_0_1_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_1_0_0_5_0_0_1_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_1_0_0_5_0_0_1_0_0_1 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_1_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_1_0_0_5_0_0_1_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_1_0_0_5_0_0_1_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_1_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_1_0_0_5_0_0_1_0_0_0, ASPECTJ_1_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_1_0_0_5_0_0_1_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_1_0_0_5_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_1_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_1_0_0_5_0_0_1 = INSTANCE.getASPECTJ_1_0_0_5_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_1_0_0_5_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_1_0_0_5_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_1_0_0_5_0_0 = INSTANCE.getASPECTJ_1_0_0_5_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_1_0_0_5_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_1_0_0_5_0_0_0, ASPECTJ_1_0_0_5_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_1_0_0_5_0 = INSTANCE.getASPECTJ_1_0_0_5_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_1_0_0_5_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_1_0_0_5_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_1_0_0_5 = INSTANCE.getASPECTJ_1_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_1_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_1_0_0_5_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_1_0_0_6 = INSTANCE.getASPECTJ_1_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_1_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak ASPECTJ_1_0_0_7 = INSTANCE.getASPECTJ_1_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getASPECTJ_1_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_1_0_0_8 = INSTANCE.getASPECTJ_1_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_1_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect().getEStructuralFeature(org.kardo.language.aspectj.commons.CommonsPackage.ASPECT__MEMBERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspectMember(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_1_0_0_9 = INSTANCE.getASPECTJ_1_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_1_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_1_0_0 = INSTANCE.getASPECTJ_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_1_0_0_0, ASPECTJ_1_0_0_1, ASPECTJ_1_0_0_2, ASPECTJ_1_0_0_3, ASPECTJ_1_0_0_4, ASPECTJ_1_0_0_5, ASPECTJ_1_0_0_6, ASPECTJ_1_0_0_7, ASPECTJ_1_0_0_8, ASPECTJ_1_0_0_9);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_1_0 = INSTANCE.getASPECTJ_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_1 = INSTANCE.getASPECTJ_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.commons.CommonsPackage.eINSTANCE.getAspect(), ASPECTJ_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_2_0_0_0 = INSTANCE.getASPECTJ_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("call", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_2_0_0_1 = INSTANCE.getASPECTJ_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_2_0_0_2 = INSTANCE.getASPECTJ_2_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_2_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_2_0_0_3 = INSTANCE.getASPECTJ_2_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_2_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getCallPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.CALL_POINTCUT__PATTERN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getAbstractMethodPattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_2_0_0_4 = INSTANCE.getASPECTJ_2_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_2_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_2_0_0 = INSTANCE.getASPECTJ_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_2_0_0_0, ASPECTJ_2_0_0_1, ASPECTJ_2_0_0_2, ASPECTJ_2_0_0_3, ASPECTJ_2_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_2_0 = INSTANCE.getASPECTJ_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_2 = INSTANCE.getASPECTJ_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getCallPointcut(), ASPECTJ_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_3_0_0_0 = INSTANCE.getASPECTJ_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("execution", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_3_0_0_1 = INSTANCE.getASPECTJ_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_3_0_0_2 = INSTANCE.getASPECTJ_3_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_3_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_3_0_0_3 = INSTANCE.getASPECTJ_3_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_3_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getExecutionPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.EXECUTION_POINTCUT__PATTERN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getAbstractMethodPattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_3_0_0_4 = INSTANCE.getASPECTJ_3_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_3_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_3_0_0 = INSTANCE.getASPECTJ_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_3_0_0_0, ASPECTJ_3_0_0_1, ASPECTJ_3_0_0_2, ASPECTJ_3_0_0_3, ASPECTJ_3_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_3_0 = INSTANCE.getASPECTJ_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_3 = INSTANCE.getASPECTJ_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getExecutionPointcut(), ASPECTJ_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_4_0_0_0 = INSTANCE.getASPECTJ_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("get", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_4_0_0_1 = INSTANCE.getASPECTJ_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_4_0_0_2 = INSTANCE.getASPECTJ_4_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_4_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_4_0_0_3 = INSTANCE.getASPECTJ_4_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_4_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getGetPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.GET_POINTCUT__PATTERN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_4_0_0_4 = INSTANCE.getASPECTJ_4_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_4_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_4_0_0 = INSTANCE.getASPECTJ_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_4_0_0_0, ASPECTJ_4_0_0_1, ASPECTJ_4_0_0_2, ASPECTJ_4_0_0_3, ASPECTJ_4_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_4_0 = INSTANCE.getASPECTJ_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_4 = INSTANCE.getASPECTJ_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getGetPointcut(), ASPECTJ_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_5_0_0_0 = INSTANCE.getASPECTJ_5_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_5_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("set", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_5_0_0_1 = INSTANCE.getASPECTJ_5_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_5_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_5_0_0_2 = INSTANCE.getASPECTJ_5_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_5_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_5_0_0_3 = INSTANCE.getASPECTJ_5_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_5_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getSetPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.SET_POINTCUT__PATTERN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_5_0_0_4 = INSTANCE.getASPECTJ_5_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_5_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_5_0_0 = INSTANCE.getASPECTJ_5_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_5_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_5_0_0_0, ASPECTJ_5_0_0_1, ASPECTJ_5_0_0_2, ASPECTJ_5_0_0_3, ASPECTJ_5_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_5_0 = INSTANCE.getASPECTJ_5_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_5_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_5_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_5 = INSTANCE.getASPECTJ_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getSetPointcut(), ASPECTJ_5_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_6_0_0_0 = INSTANCE.getASPECTJ_6_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_6_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("this", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_6_0_0_1 = INSTANCE.getASPECTJ_6_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_6_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_6_0_0_2 = INSTANCE.getASPECTJ_6_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_6_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_6_0_0_3 = INSTANCE.getASPECTJ_6_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_6_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getThisPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.THIS_POINTCUT__PATTERN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypeOrIdPattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_6_0_0_4 = INSTANCE.getASPECTJ_6_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_6_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_6_0_0 = INSTANCE.getASPECTJ_6_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_6_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_6_0_0_0, ASPECTJ_6_0_0_1, ASPECTJ_6_0_0_2, ASPECTJ_6_0_0_3, ASPECTJ_6_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_6_0 = INSTANCE.getASPECTJ_6_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_6_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_6_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_6 = INSTANCE.getASPECTJ_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getThisPointcut(), ASPECTJ_6_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_7_0_0_0 = INSTANCE.getASPECTJ_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("args", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_7_0_0_1 = INSTANCE.getASPECTJ_7_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_7_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_7_0_0_2 = INSTANCE.getASPECTJ_7_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_7_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_7_0_0_3 = INSTANCE.getASPECTJ_7_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_7_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getArgsPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ARGS_POINTCUT__PATTERN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypeOrIdPattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_7_0_0_4 = INSTANCE.getASPECTJ_7_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_7_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_7_0_0 = INSTANCE.getASPECTJ_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_7_0_0_0, ASPECTJ_7_0_0_1, ASPECTJ_7_0_0_2, ASPECTJ_7_0_0_3, ASPECTJ_7_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_7_0 = INSTANCE.getASPECTJ_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_7 = INSTANCE.getASPECTJ_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getArgsPointcut(), ASPECTJ_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_8_0_0_0 = INSTANCE.getASPECTJ_8_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_8_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("within", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_8_0_0_1 = INSTANCE.getASPECTJ_8_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_8_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_8_0_0_2 = INSTANCE.getASPECTJ_8_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_8_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_8_0_0_3 = INSTANCE.getASPECTJ_8_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_8_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getWithinPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.WITHIN_POINTCUT__PATTERN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getIdPattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_8_0_0_4 = INSTANCE.getASPECTJ_8_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_8_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_8_0_0 = INSTANCE.getASPECTJ_8_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_8_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_8_0_0_0, ASPECTJ_8_0_0_1, ASPECTJ_8_0_0_2, ASPECTJ_8_0_0_3, ASPECTJ_8_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_8_0 = INSTANCE.getASPECTJ_8_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_8_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_8_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_8 = INSTANCE.getASPECTJ_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getWithinPointcut(), ASPECTJ_8_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_9_0_0_0 = INSTANCE.getASPECTJ_9_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_9_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("target", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_9_0_0_1 = INSTANCE.getASPECTJ_9_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_9_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_9_0_0_2 = INSTANCE.getASPECTJ_9_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_9_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_9_0_0_3 = INSTANCE.getASPECTJ_9_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_9_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getTargetPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.TARGET_POINTCUT__PATTERN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypeOrIdPattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_9_0_0_4 = INSTANCE.getASPECTJ_9_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_9_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_9_0_0 = INSTANCE.getASPECTJ_9_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_9_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_9_0_0_0, ASPECTJ_9_0_0_1, ASPECTJ_9_0_0_2, ASPECTJ_9_0_0_3, ASPECTJ_9_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_9_0 = INSTANCE.getASPECTJ_9_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_9_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_9_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_9 = INSTANCE.getASPECTJ_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getTargetPointcut(), ASPECTJ_9_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_10_0_0_0 = INSTANCE.getASPECTJ_10_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_10_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("if", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_10_0_0_1 = INSTANCE.getASPECTJ_10_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_10_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_10_0_0_2 = INSTANCE.getASPECTJ_10_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_10_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_10_0_0_3 = INSTANCE.getASPECTJ_10_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_10_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getIfPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.IF_POINTCUT__PATTERN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConditionalExprPattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_10_0_0_4 = INSTANCE.getASPECTJ_10_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_10_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_10_0_0 = INSTANCE.getASPECTJ_10_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_10_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_10_0_0_0, ASPECTJ_10_0_0_1, ASPECTJ_10_0_0_2, ASPECTJ_10_0_0_3, ASPECTJ_10_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_10_0 = INSTANCE.getASPECTJ_10_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_10_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_10_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_10 = INSTANCE.getASPECTJ_10();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_10() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getIfPointcut(), ASPECTJ_10_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_11_0_0_0 = INSTANCE.getASPECTJ_11_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_11_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("returning", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_11_0_0_1 = INSTANCE.getASPECTJ_11_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_11_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_11_0_0_2 = INSTANCE.getASPECTJ_11_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_11_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getReturningPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.RETURNING_POINTCUT__PATTERN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getIdPattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_11_0_0_3 = INSTANCE.getASPECTJ_11_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_11_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_11_0_0 = INSTANCE.getASPECTJ_11_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_11_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_11_0_0_0, ASPECTJ_11_0_0_1, ASPECTJ_11_0_0_2, ASPECTJ_11_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_11_0 = INSTANCE.getASPECTJ_11_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_11_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_11_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_11 = INSTANCE.getASPECTJ_11();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_11() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getReturningPointcut(), ASPECTJ_11_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_12_0_0_0 = INSTANCE.getASPECTJ_12_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_12_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__ABSTRACT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAbstract(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_12_0_0_1 = INSTANCE.getASPECTJ_12_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_12_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("pointcut", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder ASPECTJ_12_0_0_2 = INSTANCE.getASPECTJ_12_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getASPECTJ_12_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_12_0_0_3 = INSTANCE.getASPECTJ_12_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_12_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_12_0_0_4 = INSTANCE.getASPECTJ_12_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_12_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_12_0_0_5 = INSTANCE.getASPECTJ_12_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_12_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_12_0_0_6_0_0_0 = INSTANCE.getASPECTJ_12_0_0_6_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_12_0_0_6_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_12_0_0_6_0_0_1_0_0_0 = INSTANCE.getASPECTJ_12_0_0_6_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_12_0_0_6_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_12_0_0_6_0_0_1_0_0_1 = INSTANCE.getASPECTJ_12_0_0_6_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_12_0_0_6_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_12_0_0_6_0_0_1_0_0 = INSTANCE.getASPECTJ_12_0_0_6_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_12_0_0_6_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_12_0_0_6_0_0_1_0_0_0, ASPECTJ_12_0_0_6_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_12_0_0_6_0_0_1_0 = INSTANCE.getASPECTJ_12_0_0_6_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_12_0_0_6_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_12_0_0_6_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_12_0_0_6_0_0_1 = INSTANCE.getASPECTJ_12_0_0_6_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_12_0_0_6_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_12_0_0_6_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_12_0_0_6_0_0 = INSTANCE.getASPECTJ_12_0_0_6_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_12_0_0_6_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_12_0_0_6_0_0_0, ASPECTJ_12_0_0_6_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_12_0_0_6_0 = INSTANCE.getASPECTJ_12_0_0_6_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_12_0_0_6_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_12_0_0_6_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_12_0_0_6 = INSTANCE.getASPECTJ_12_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_12_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_12_0_0_6_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_12_0_0_7 = INSTANCE.getASPECTJ_12_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_12_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_12_0_0_8 = INSTANCE.getASPECTJ_12_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_12_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_12_0_0_9_0_0_0 = INSTANCE.getASPECTJ_12_0_0_9_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_12_0_0_9_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__ASSIGN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPcAssignmentOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_12_0_0_9_0_0_1 = INSTANCE.getASPECTJ_12_0_0_9_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_12_0_0_9_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut().getEStructuralFeature(org.kardo.language.aspectj.pointcuts.PointcutsPackage.ASPECT_JPOINTCUT__EXP), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_12_0_0_9_0_0 = INSTANCE.getASPECTJ_12_0_0_9_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_12_0_0_9_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_12_0_0_9_0_0_0, ASPECTJ_12_0_0_9_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_12_0_0_9_0 = INSTANCE.getASPECTJ_12_0_0_9_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_12_0_0_9_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_12_0_0_9_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_12_0_0_9 = INSTANCE.getASPECTJ_12_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_12_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_12_0_0_9_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_12_0_0_10 = INSTANCE.getASPECTJ_12_0_0_10();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_12_0_0_10() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_12_0_0 = INSTANCE.getASPECTJ_12_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_12_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_12_0_0_0, ASPECTJ_12_0_0_1, ASPECTJ_12_0_0_2, ASPECTJ_12_0_0_3, ASPECTJ_12_0_0_4, ASPECTJ_12_0_0_5, ASPECTJ_12_0_0_6, ASPECTJ_12_0_0_7, ASPECTJ_12_0_0_8, ASPECTJ_12_0_0_9, ASPECTJ_12_0_0_10);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_12_0 = INSTANCE.getASPECTJ_12_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_12_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_12_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_12 = INSTANCE.getASPECTJ_12();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_12() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getAspectJPointcut(), ASPECTJ_12_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_13_0_0_0 = INSTANCE.getASPECTJ_13_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_13_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConditionalExprPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONDITIONAL_EXPR_PATTERN__EXPR), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_13_0_0 = INSTANCE.getASPECTJ_13_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_13_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_13_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_13_0 = INSTANCE.getASPECTJ_13_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_13_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_13_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_13 = INSTANCE.getASPECTJ_13();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_13() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConditionalExprPattern(), ASPECTJ_13_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_14_0_0_0 = INSTANCE.getASPECTJ_14_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_14_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.FIELD_PATTERN__MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_14_0_0_1 = INSTANCE.getASPECTJ_14_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_14_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.FIELD_PATTERN__FIELD_TYPE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_14_0_0_2 = INSTANCE.getASPECTJ_14_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_14_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.FIELD_PATTERN__DECLARING_TYPE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_14_0_0_3 = INSTANCE.getASPECTJ_14_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_14_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder ASPECTJ_14_0_0_4 = INSTANCE.getASPECTJ_14_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getASPECTJ_14_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.FIELD_PATTERN__FIELDNAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_14_0_0 = INSTANCE.getASPECTJ_14_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_14_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_14_0_0_0, ASPECTJ_14_0_0_1, ASPECTJ_14_0_0_2, ASPECTJ_14_0_0_3, ASPECTJ_14_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_14_0 = INSTANCE.getASPECTJ_14_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_14_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_14_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_14 = INSTANCE.getASPECTJ_14();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_14() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getFieldPattern(), ASPECTJ_14_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_15_0_0_0 = INSTANCE.getASPECTJ_15_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_15_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConstructorPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_15_0_0_1 = INSTANCE.getASPECTJ_15_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_15_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConstructorPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__DECLARING_TYPE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_15_0_0_2 = INSTANCE.getASPECTJ_15_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_15_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_15_0_0_3 = INSTANCE.getASPECTJ_15_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_15_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("->", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_15_0_0_4 = INSTANCE.getASPECTJ_15_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_15_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_15_0_0_5 = INSTANCE.getASPECTJ_15_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_15_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("new", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_15_0_0_6 = INSTANCE.getASPECTJ_15_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_15_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_15_0_0_7 = INSTANCE.getASPECTJ_15_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_15_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_15_0_0_8 = INSTANCE.getASPECTJ_15_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_15_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConstructorPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getWildcardOrTypePattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_15_0_0_9_0_0_0 = INSTANCE.getASPECTJ_15_0_0_9_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_15_0_0_9_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_15_0_0_9_0_0_1 = INSTANCE.getASPECTJ_15_0_0_9_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_15_0_0_9_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConstructorPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getWildcardOrTypePattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_15_0_0_9_0_0 = INSTANCE.getASPECTJ_15_0_0_9_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_15_0_0_9_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_15_0_0_9_0_0_0, ASPECTJ_15_0_0_9_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_15_0_0_9_0 = INSTANCE.getASPECTJ_15_0_0_9_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_15_0_0_9_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_15_0_0_9_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_15_0_0_9 = INSTANCE.getASPECTJ_15_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_15_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_15_0_0_9_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_15_0_0_10 = INSTANCE.getASPECTJ_15_0_0_10();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_15_0_0_10() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_15_0_0 = INSTANCE.getASPECTJ_15_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_15_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_15_0_0_0, ASPECTJ_15_0_0_1, ASPECTJ_15_0_0_2, ASPECTJ_15_0_0_3, ASPECTJ_15_0_0_4, ASPECTJ_15_0_0_5, ASPECTJ_15_0_0_6, ASPECTJ_15_0_0_7, ASPECTJ_15_0_0_8, ASPECTJ_15_0_0_9, ASPECTJ_15_0_0_10);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_15_0 = INSTANCE.getASPECTJ_15_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_15_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_15_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_15 = INSTANCE.getASPECTJ_15();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_15() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getConstructorPattern(), ASPECTJ_15_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_16_0_0_0 = INSTANCE.getASPECTJ_16_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_16_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_16_0_0_1 = INSTANCE.getASPECTJ_16_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_16_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__RETURN_TYPE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_16_0_0_2 = INSTANCE.getASPECTJ_16_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_16_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__DECLARING_TYPE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_16_0_0_3 = INSTANCE.getASPECTJ_16_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_16_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_16_0_0_4 = INSTANCE.getASPECTJ_16_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_16_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("->", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_16_0_0_5 = INSTANCE.getASPECTJ_16_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_16_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_16_0_0_6 = INSTANCE.getASPECTJ_16_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_16_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__METHODNAME), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getStringReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_16_0_0_7 = INSTANCE.getASPECTJ_16_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_16_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_16_0_0_8 = INSTANCE.getASPECTJ_16_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_16_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_16_0_0_9 = INSTANCE.getASPECTJ_16_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_16_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getWildcardOrTypePattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_16_0_0_10_0_0_0 = INSTANCE.getASPECTJ_16_0_0_10_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_16_0_0_10_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_16_0_0_10_0_0_1 = INSTANCE.getASPECTJ_16_0_0_10_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_16_0_0_10_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getWildcardOrTypePattern(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_16_0_0_10_0_0 = INSTANCE.getASPECTJ_16_0_0_10_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_16_0_0_10_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_16_0_0_10_0_0_0, ASPECTJ_16_0_0_10_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_16_0_0_10_0 = INSTANCE.getASPECTJ_16_0_0_10_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_16_0_0_10_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_16_0_0_10_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_16_0_0_10 = INSTANCE.getASPECTJ_16_0_0_10();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_16_0_0_10() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_16_0_0_10_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_16_0_0_11 = INSTANCE.getASPECTJ_16_0_0_11();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_16_0_0_11() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_16_0_0 = INSTANCE.getASPECTJ_16_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_16_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_16_0_0_0, ASPECTJ_16_0_0_1, ASPECTJ_16_0_0_2, ASPECTJ_16_0_0_3, ASPECTJ_16_0_0_4, ASPECTJ_16_0_0_5, ASPECTJ_16_0_0_6, ASPECTJ_16_0_0_7, ASPECTJ_16_0_0_8, ASPECTJ_16_0_0_9, ASPECTJ_16_0_0_10, ASPECTJ_16_0_0_11);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_16_0 = INSTANCE.getASPECTJ_16_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_16_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_16_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_16 = INSTANCE.getASPECTJ_16();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_16() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getMethodPattern(), ASPECTJ_16_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_17_0_0_0 = INSTANCE.getASPECTJ_17_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_17_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.TYPE_PATTERN__TYPE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace ASPECTJ_17_0_0_1 = INSTANCE.getASPECTJ_17_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getASPECTJ_17_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_17_0_0_2 = INSTANCE.getASPECTJ_17_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_17_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.TYPE_PATTERN__SUBTYPES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAddition(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_17_0_0 = INSTANCE.getASPECTJ_17_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_17_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_17_0_0_0, ASPECTJ_17_0_0_1, ASPECTJ_17_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_17_0 = INSTANCE.getASPECTJ_17_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_17_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_17_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_17 = INSTANCE.getASPECTJ_17();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_17() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getTypePattern(), ASPECTJ_17_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder ASPECTJ_18_0_0_0 = INSTANCE.getASPECTJ_18_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getASPECTJ_18_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getIdPattern().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.ID_PATTERN__ID), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_18_0_0 = INSTANCE.getASPECTJ_18_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_18_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_18_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_18_0 = INSTANCE.getASPECTJ_18_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_18_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_18_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_18 = INSTANCE.getASPECTJ_18();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_18() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getIdPattern(), ASPECTJ_18_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_19_0_0_0 = INSTANCE.getASPECTJ_19_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_19_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("..", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_19_0_0 = INSTANCE.getASPECTJ_19_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_19_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_19_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_19_0 = INSTANCE.getASPECTJ_19_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_19_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_19_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_19 = INSTANCE.getASPECTJ_19();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_19() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.patterns.PatternsPackage.eINSTANCE.getParameterWildcard(), ASPECTJ_19_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_20_0_0_0 = INSTANCE.getASPECTJ_20_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_20_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("after", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_20_0_0_1 = INSTANCE.getASPECTJ_20_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_20_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_20_0_0_2_0_0_0 = INSTANCE.getASPECTJ_20_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_20_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_ADVICE__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_20_0_0_2_0_0_1_0_0_0 = INSTANCE.getASPECTJ_20_0_0_2_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_20_0_0_2_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_20_0_0_2_0_0_1_0_0_1 = INSTANCE.getASPECTJ_20_0_0_2_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_20_0_0_2_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_ADVICE__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_20_0_0_2_0_0_1_0_0 = INSTANCE.getASPECTJ_20_0_0_2_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_20_0_0_2_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_20_0_0_2_0_0_1_0_0_0, ASPECTJ_20_0_0_2_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_20_0_0_2_0_0_1_0 = INSTANCE.getASPECTJ_20_0_0_2_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_20_0_0_2_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_20_0_0_2_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_20_0_0_2_0_0_1 = INSTANCE.getASPECTJ_20_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_20_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_20_0_0_2_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_20_0_0_2_0_0 = INSTANCE.getASPECTJ_20_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_20_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_20_0_0_2_0_0_0, ASPECTJ_20_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_20_0_0_2_0 = INSTANCE.getASPECTJ_20_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_20_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_20_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_20_0_0_2 = INSTANCE.getASPECTJ_20_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_20_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_20_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_20_0_0_3 = INSTANCE.getASPECTJ_20_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_20_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_20_0_0_4 = INSTANCE.getASPECTJ_20_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_20_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_ADVICE__ASSIGN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPcAssignmentOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder ASPECTJ_20_0_0_5 = INSTANCE.getASPECTJ_20_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getASPECTJ_20_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_ADVICE__PCREF), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_20_0_0_6 = INSTANCE.getASPECTJ_20_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_20_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_20_0_0_7 = INSTANCE.getASPECTJ_20_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_20_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_ADVICE__STATEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_20_0_0_8 = INSTANCE.getASPECTJ_20_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_20_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_20_0_0 = INSTANCE.getASPECTJ_20_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_20_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_20_0_0_0, ASPECTJ_20_0_0_1, ASPECTJ_20_0_0_2, ASPECTJ_20_0_0_3, ASPECTJ_20_0_0_4, ASPECTJ_20_0_0_5, ASPECTJ_20_0_0_6, ASPECTJ_20_0_0_7, ASPECTJ_20_0_0_8);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_20_0 = INSTANCE.getASPECTJ_20_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_20_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_20_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_20 = INSTANCE.getASPECTJ_20();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_20() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterAdvice(), ASPECTJ_20_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_21_0_0_0 = INSTANCE.getASPECTJ_21_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_21_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("after", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_21_0_0_1 = INSTANCE.getASPECTJ_21_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_21_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_21_0_0_2_0_0_0 = INSTANCE.getASPECTJ_21_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_21_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_21_0_0_2_0_0_1_0_0_0 = INSTANCE.getASPECTJ_21_0_0_2_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_21_0_0_2_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_21_0_0_2_0_0_1_0_0_1 = INSTANCE.getASPECTJ_21_0_0_2_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_21_0_0_2_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_21_0_0_2_0_0_1_0_0 = INSTANCE.getASPECTJ_21_0_0_2_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_21_0_0_2_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_21_0_0_2_0_0_1_0_0_0, ASPECTJ_21_0_0_2_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_21_0_0_2_0_0_1_0 = INSTANCE.getASPECTJ_21_0_0_2_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_21_0_0_2_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_21_0_0_2_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_21_0_0_2_0_0_1 = INSTANCE.getASPECTJ_21_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_21_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_21_0_0_2_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_21_0_0_2_0_0 = INSTANCE.getASPECTJ_21_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_21_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_21_0_0_2_0_0_0, ASPECTJ_21_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_21_0_0_2_0 = INSTANCE.getASPECTJ_21_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_21_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_21_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_21_0_0_2 = INSTANCE.getASPECTJ_21_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_21_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_21_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_21_0_0_3 = INSTANCE.getASPECTJ_21_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_21_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_21_0_0_4 = INSTANCE.getASPECTJ_21_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_21_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__RETURNING), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getReturningPointcut(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_21_0_0_5 = INSTANCE.getASPECTJ_21_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_21_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__ASSIGN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPcAssignmentOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder ASPECTJ_21_0_0_6 = INSTANCE.getASPECTJ_21_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getASPECTJ_21_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__PCREF), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_21_0_0_7 = INSTANCE.getASPECTJ_21_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_21_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_21_0_0_8 = INSTANCE.getASPECTJ_21_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_21_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.AFTER_RETURNING__STATEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_21_0_0_9 = INSTANCE.getASPECTJ_21_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_21_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_21_0_0 = INSTANCE.getASPECTJ_21_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_21_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_21_0_0_0, ASPECTJ_21_0_0_1, ASPECTJ_21_0_0_2, ASPECTJ_21_0_0_3, ASPECTJ_21_0_0_4, ASPECTJ_21_0_0_5, ASPECTJ_21_0_0_6, ASPECTJ_21_0_0_7, ASPECTJ_21_0_0_8, ASPECTJ_21_0_0_9);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_21_0 = INSTANCE.getASPECTJ_21_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_21_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_21_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_21 = INSTANCE.getASPECTJ_21();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_21() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getAfterReturning(), ASPECTJ_21_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_22_0_0_0 = INSTANCE.getASPECTJ_22_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_22_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("before", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_22_0_0_1 = INSTANCE.getASPECTJ_22_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_22_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_22_0_0_2_0_0_0 = INSTANCE.getASPECTJ_22_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_22_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.BEFORE_ADVICE__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_22_0_0_2_0_0_1_0_0_0 = INSTANCE.getASPECTJ_22_0_0_2_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_22_0_0_2_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_22_0_0_2_0_0_1_0_0_1 = INSTANCE.getASPECTJ_22_0_0_2_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_22_0_0_2_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.BEFORE_ADVICE__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_22_0_0_2_0_0_1_0_0 = INSTANCE.getASPECTJ_22_0_0_2_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_22_0_0_2_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_22_0_0_2_0_0_1_0_0_0, ASPECTJ_22_0_0_2_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_22_0_0_2_0_0_1_0 = INSTANCE.getASPECTJ_22_0_0_2_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_22_0_0_2_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_22_0_0_2_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_22_0_0_2_0_0_1 = INSTANCE.getASPECTJ_22_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_22_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_22_0_0_2_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_22_0_0_2_0_0 = INSTANCE.getASPECTJ_22_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_22_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_22_0_0_2_0_0_0, ASPECTJ_22_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_22_0_0_2_0 = INSTANCE.getASPECTJ_22_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_22_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_22_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_22_0_0_2 = INSTANCE.getASPECTJ_22_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_22_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_22_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_22_0_0_3 = INSTANCE.getASPECTJ_22_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_22_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_22_0_0_4 = INSTANCE.getASPECTJ_22_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_22_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.BEFORE_ADVICE__ASSIGN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPcAssignmentOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder ASPECTJ_22_0_0_5 = INSTANCE.getASPECTJ_22_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getASPECTJ_22_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.BEFORE_ADVICE__PCREF), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_22_0_0_6 = INSTANCE.getASPECTJ_22_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_22_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_22_0_0_7 = INSTANCE.getASPECTJ_22_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_22_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice().getEStructuralFeature(org.kardo.language.aspectj.advice.AdvicePackage.BEFORE_ADVICE__STATEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_22_0_0_8 = INSTANCE.getASPECTJ_22_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_22_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_22_0_0 = INSTANCE.getASPECTJ_22_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_22_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_22_0_0_0, ASPECTJ_22_0_0_1, ASPECTJ_22_0_0_2, ASPECTJ_22_0_0_3, ASPECTJ_22_0_0_4, ASPECTJ_22_0_0_5, ASPECTJ_22_0_0_6, ASPECTJ_22_0_0_7, ASPECTJ_22_0_0_8);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_22_0 = INSTANCE.getASPECTJ_22_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_22_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_22_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_22 = INSTANCE.getASPECTJ_22();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_22() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.advice.AdvicePackage.eINSTANCE.getBeforeAdvice(), ASPECTJ_22_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_23_0_0_0 = INSTANCE.getASPECTJ_23_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_23_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutExpression().getEStructuralFeature(org.kardo.language.aspectj.pcexp.PcexpPackage.POINTCUT_EXPRESSION__CHILD), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutOrExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_23_0_0 = INSTANCE.getASPECTJ_23_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_23_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_23_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_23_0 = INSTANCE.getASPECTJ_23_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_23_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_23_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_23 = INSTANCE.getASPECTJ_23();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_23() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutExpression(), ASPECTJ_23_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_24_0_0_0 = INSTANCE.getASPECTJ_24_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_24_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutOrExpression().getEStructuralFeature(org.kardo.language.aspectj.pcexp.PcexpPackage.POINTCUT_OR_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutAndExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_24_0_0_1_0_0_0 = INSTANCE.getASPECTJ_24_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_24_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("||", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_24_0_0_1_0_0_1 = INSTANCE.getASPECTJ_24_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_24_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutOrExpression().getEStructuralFeature(org.kardo.language.aspectj.pcexp.PcexpPackage.POINTCUT_OR_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutAndExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_24_0_0_1_0_0 = INSTANCE.getASPECTJ_24_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_24_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_24_0_0_1_0_0_0, ASPECTJ_24_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_24_0_0_1_0 = INSTANCE.getASPECTJ_24_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_24_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_24_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_24_0_0_1 = INSTANCE.getASPECTJ_24_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_24_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_24_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_24_0_0 = INSTANCE.getASPECTJ_24_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_24_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_24_0_0_0, ASPECTJ_24_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_24_0 = INSTANCE.getASPECTJ_24_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_24_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_24_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_24 = INSTANCE.getASPECTJ_24();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_24() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutOrExpression(), ASPECTJ_24_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_25_0_0_0 = INSTANCE.getASPECTJ_25_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_25_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutAndExpression().getEStructuralFeature(org.kardo.language.aspectj.pcexp.PcexpPackage.POINTCUT_AND_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getPrimitivePointcut(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_25_0_0_1_0_0_0 = INSTANCE.getASPECTJ_25_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_25_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("&&", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment ASPECTJ_25_0_0_1_0_0_1 = INSTANCE.getASPECTJ_25_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getASPECTJ_25_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutAndExpression().getEStructuralFeature(org.kardo.language.aspectj.pcexp.PcexpPackage.POINTCUT_AND_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.kardo.language.aspectj.pointcuts.PointcutsPackage.eINSTANCE.getPrimitivePointcut(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_25_0_0_1_0_0 = INSTANCE.getASPECTJ_25_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_25_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_25_0_0_1_0_0_0, ASPECTJ_25_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_25_0_0_1_0 = INSTANCE.getASPECTJ_25_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_25_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_25_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound ASPECTJ_25_0_0_1 = INSTANCE.getASPECTJ_25_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getASPECTJ_25_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(ASPECTJ_25_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_25_0_0 = INSTANCE.getASPECTJ_25_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_25_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_25_0_0_0, ASPECTJ_25_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_25_0 = INSTANCE.getASPECTJ_25_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_25_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_25_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_25 = INSTANCE.getASPECTJ_25();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_25() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPointcutAndExpression(), ASPECTJ_25_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword ASPECTJ_26_0_0_0 = INSTANCE.getASPECTJ_26_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getASPECTJ_26_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(":", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence ASPECTJ_26_0_0 = INSTANCE.getASPECTJ_26_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getASPECTJ_26_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_26_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice ASPECTJ_26_0 = INSTANCE.getASPECTJ_26_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getASPECTJ_26_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, ASPECTJ_26_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule ASPECTJ_26 = INSTANCE.getASPECTJ_26();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getASPECTJ_26() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.kardo.language.aspectj.pcexp.PcexpPackage.eINSTANCE.getPcAssignmentOperator(), ASPECTJ_26_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_0_0_0_0_0_0_0 = INSTANCE.getJAVA_0_0_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_0_0_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getEmptyModel().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.EMPTY_MODEL__IMPORTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getImport(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_0_0_0_0_0_0_1 = INSTANCE.getJAVA_0_0_0_0_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_0_0_0_0_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_0_0_0_0_0_0_2 = INSTANCE.getJAVA_0_0_0_0_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_0_0_0_0_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_0_0_0_0_0_0 = INSTANCE.getJAVA_0_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_0_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_0_0_0_0_0_0_0, JAVA_0_0_0_0_0_0_1, JAVA_0_0_0_0_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_0_0_0_0_0 = INSTANCE.getJAVA_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_0_0_0_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_0_0_0_0 = INSTANCE.getJAVA_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_0_0_0_0_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_0_0_0_1_0_0_0 = INSTANCE.getJAVA_0_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_0_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_0_0_0_1_0_0 = INSTANCE.getJAVA_0_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_0_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_0_0_0_1_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_0_0_0_1_0 = INSTANCE.getJAVA_0_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_0_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_0_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_0_0_0_1 = INSTANCE.getJAVA_0_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_0_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_0_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_0_0_0 = INSTANCE.getJAVA_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_0_0_0_0, JAVA_0_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_0_0 = INSTANCE.getJAVA_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_0 = INSTANCE.getJAVA_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getEmptyModel(), JAVA_0_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_1_0_0_0 = INSTANCE.getJAVA_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.PACKAGE__ANNOTATIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_1_0_0_1 = INSTANCE.getJAVA_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("package", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_1_0_0_2_0_0_0 = INSTANCE.getJAVA_1_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_1_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.PACKAGE__NAMESPACES), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_1_0_0_2_0_0_1 = INSTANCE.getJAVA_1_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_1_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_1_0_0_2_0_0 = INSTANCE.getJAVA_1_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_1_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_1_0_0_2_0_0_0, JAVA_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_1_0_0_2_0 = INSTANCE.getJAVA_1_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_1_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_1_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_1_0_0_2 = INSTANCE.getJAVA_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_1_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_1_0_0_3 = INSTANCE.getJAVA_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.PACKAGE__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_1_0_0_4 = INSTANCE.getJAVA_1_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_1_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_1_0_0_5_0_0_0 = INSTANCE.getJAVA_1_0_0_5_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_1_0_0_5_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_1_0_0_5_0_0 = INSTANCE.getJAVA_1_0_0_5_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_1_0_0_5_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_1_0_0_5_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_1_0_0_5_0 = INSTANCE.getJAVA_1_0_0_5_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_1_0_0_5_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_1_0_0_5_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_1_0_0_5 = INSTANCE.getJAVA_1_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_1_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_1_0_0_5_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_1_0_0_6 = INSTANCE.getJAVA_1_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_1_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_1_0_0_7 = INSTANCE.getJAVA_1_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_1_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_1_0_0_8_0_0_0 = INSTANCE.getJAVA_1_0_0_8_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_1_0_0_8_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.PACKAGE__IMPORTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getImport(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_1_0_0_8_0_0_1 = INSTANCE.getJAVA_1_0_0_8_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_1_0_0_8_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_1_0_0_8_0_0 = INSTANCE.getJAVA_1_0_0_8_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_1_0_0_8_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_1_0_0_8_0_0_0, JAVA_1_0_0_8_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_1_0_0_8_0 = INSTANCE.getJAVA_1_0_0_8_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_1_0_0_8_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_1_0_0_8_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_1_0_0_8 = INSTANCE.getJAVA_1_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_1_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_1_0_0_8_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_1_0_0_9_0_0_0 = INSTANCE.getJAVA_1_0_0_9_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_1_0_0_9_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_1_0_0_9_0_0 = INSTANCE.getJAVA_1_0_0_9_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_1_0_0_9_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_1_0_0_9_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_1_0_0_9_0 = INSTANCE.getJAVA_1_0_0_9_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_1_0_0_9_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_1_0_0_9_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_1_0_0_9 = INSTANCE.getJAVA_1_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_1_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_1_0_0_9_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_1_0_0 = INSTANCE.getJAVA_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_1_0_0_0, JAVA_1_0_0_1, JAVA_1_0_0_2, JAVA_1_0_0_3, JAVA_1_0_0_4, JAVA_1_0_0_5, JAVA_1_0_0_6, JAVA_1_0_0_7, JAVA_1_0_0_8, JAVA_1_0_0_9);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_1_0 = INSTANCE.getJAVA_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_1 = INSTANCE.getJAVA_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getPackage(), JAVA_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_2_0_0_0_0_0_0 = INSTANCE.getJAVA_2_0_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_2_0_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("package", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_2_0_0_0_0_0_1 = INSTANCE.getJAVA_2_0_0_0_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_2_0_0_0_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.COMPILATION_UNIT__NAMESPACES), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_2_0_0_0_0_0_2_0_0_0 = INSTANCE.getJAVA_2_0_0_0_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_2_0_0_0_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_2_0_0_0_0_0_2_0_0_1 = INSTANCE.getJAVA_2_0_0_0_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_2_0_0_0_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.COMPILATION_UNIT__NAMESPACES), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_2_0_0_0_0_0_2_0_0 = INSTANCE.getJAVA_2_0_0_0_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_2_0_0_0_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_0_0_0_2_0_0_0, JAVA_2_0_0_0_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_2_0_0_0_0_0_2_0 = INSTANCE.getJAVA_2_0_0_0_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_2_0_0_0_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_0_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_2_0_0_0_0_0_2 = INSTANCE.getJAVA_2_0_0_0_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_2_0_0_0_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_2_0_0_0_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_2_0_0_0_0_0_3 = INSTANCE.getJAVA_2_0_0_0_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_2_0_0_0_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_2_0_0_0_0_0 = INSTANCE.getJAVA_2_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_2_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_0_0_0_0, JAVA_2_0_0_0_0_0_1, JAVA_2_0_0_0_0_0_2, JAVA_2_0_0_0_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_2_0_0_0_0 = INSTANCE.getJAVA_2_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_2_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_2_0_0_0 = INSTANCE.getJAVA_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_2_0_0_0_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_2_0_0_1 = INSTANCE.getJAVA_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_2_0_0_2 = INSTANCE.getJAVA_2_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_2_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_2_0_0_3_0_0_0 = INSTANCE.getJAVA_2_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_2_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.COMPILATION_UNIT__IMPORTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getImport(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_2_0_0_3_0_0_1 = INSTANCE.getJAVA_2_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_2_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_2_0_0_3_0_0 = INSTANCE.getJAVA_2_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_2_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_3_0_0_0, JAVA_2_0_0_3_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_2_0_0_3_0 = INSTANCE.getJAVA_2_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_2_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_2_0_0_3 = INSTANCE.getJAVA_2_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_2_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_2_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_2_0_0_4_0_0_0 = INSTANCE.getJAVA_2_0_0_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_2_0_0_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_2_0_0_4_0_0_1 = INSTANCE.getJAVA_2_0_0_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_2_0_0_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_2_0_0_4_0_0 = INSTANCE.getJAVA_2_0_0_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_2_0_0_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_4_0_0_0, JAVA_2_0_0_4_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_2_0_0_4_0 = INSTANCE.getJAVA_2_0_0_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_2_0_0_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_2_0_0_4 = INSTANCE.getJAVA_2_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_2_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_2_0_0_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_2_0_0_5 = INSTANCE.getJAVA_2_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_2_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_2_0_0_6_0_0_0 = INSTANCE.getJAVA_2_0_0_6_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_2_0_0_6_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit().getEStructuralFeature(org.emftext.language.java.containers.ContainersPackage.COMPILATION_UNIT__CLASSIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getConcreteClassifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_2_0_0_6_0_0_1_0_0_0 = INSTANCE.getJAVA_2_0_0_6_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_2_0_0_6_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_2_0_0_6_0_0_1_0_0 = INSTANCE.getJAVA_2_0_0_6_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_2_0_0_6_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_6_0_0_1_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_2_0_0_6_0_0_1_0 = INSTANCE.getJAVA_2_0_0_6_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_2_0_0_6_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_6_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_2_0_0_6_0_0_1 = INSTANCE.getJAVA_2_0_0_6_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_2_0_0_6_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_2_0_0_6_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_2_0_0_6_0_0_2 = INSTANCE.getJAVA_2_0_0_6_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_2_0_0_6_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_2_0_0_6_0_0_3 = INSTANCE.getJAVA_2_0_0_6_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_2_0_0_6_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_2_0_0_6_0_0 = INSTANCE.getJAVA_2_0_0_6_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_2_0_0_6_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_6_0_0_0, JAVA_2_0_0_6_0_0_1, JAVA_2_0_0_6_0_0_2, JAVA_2_0_0_6_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_2_0_0_6_0 = INSTANCE.getJAVA_2_0_0_6_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_2_0_0_6_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_6_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_2_0_0_6 = INSTANCE.getJAVA_2_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_2_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_2_0_0_6_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.PLUS);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_2_0_0_7_0_0_0 = INSTANCE.getJAVA_2_0_0_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_2_0_0_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("\u001a", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_2_0_0_7_0_0 = INSTANCE.getJAVA_2_0_0_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_2_0_0_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_7_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_2_0_0_7_0 = INSTANCE.getJAVA_2_0_0_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_2_0_0_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_2_0_0_7 = INSTANCE.getJAVA_2_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_2_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_2_0_0_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_2_0_0 = INSTANCE.getJAVA_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0_0, JAVA_2_0_0_1, JAVA_2_0_0_2, JAVA_2_0_0_3, JAVA_2_0_0_4, JAVA_2_0_0_5, JAVA_2_0_0_6, JAVA_2_0_0_7);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_2_0 = INSTANCE.getJAVA_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_2 = INSTANCE.getJAVA_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.containers.ContainersPackage.eINSTANCE.getCompilationUnit(), JAVA_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_3_0_0_0 = INSTANCE.getJAVA_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("import", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_3_0_0_1_0_0_0 = INSTANCE.getJAVA_3_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_3_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.CLASSIFIER_IMPORT__NAMESPACES), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_3_0_0_1_0_0_1 = INSTANCE.getJAVA_3_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_3_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_3_0_0_1_0_0 = INSTANCE.getJAVA_3_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_3_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_3_0_0_1_0_0_0, JAVA_3_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_3_0_0_1_0 = INSTANCE.getJAVA_3_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_3_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_3_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_3_0_0_1 = INSTANCE.getJAVA_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_3_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_3_0_0_2 = INSTANCE.getJAVA_3_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_3_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.CLASSIFIER_IMPORT__CLASSIFIER), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_3_0_0_3 = INSTANCE.getJAVA_3_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_3_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_3_0_0 = INSTANCE.getJAVA_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_3_0_0_0, JAVA_3_0_0_1, JAVA_3_0_0_2, JAVA_3_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_3_0 = INSTANCE.getJAVA_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_3 = INSTANCE.getJAVA_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getClassifierImport(), JAVA_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_4_0_0_0 = INSTANCE.getJAVA_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("import", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_4_0_0_1_0_0_0 = INSTANCE.getJAVA_4_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_4_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getPackageImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.PACKAGE_IMPORT__NAMESPACES), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_4_0_0_1_0_0_1 = INSTANCE.getJAVA_4_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_4_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_4_0_0_1_0_0 = INSTANCE.getJAVA_4_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_4_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_4_0_0_1_0_0_0, JAVA_4_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_4_0_0_1_0 = INSTANCE.getJAVA_4_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_4_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_4_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_4_0_0_1 = INSTANCE.getJAVA_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_4_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.PLUS);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_4_0_0_2 = INSTANCE.getJAVA_4_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_4_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("*", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_4_0_0_3 = INSTANCE.getJAVA_4_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_4_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_4_0_0 = INSTANCE.getJAVA_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_4_0_0_0, JAVA_4_0_0_1, JAVA_4_0_0_2, JAVA_4_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_4_0 = INSTANCE.getJAVA_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_4 = INSTANCE.getJAVA_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getPackageImport(), JAVA_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_5_0_0_0 = INSTANCE.getJAVA_5_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_5_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("import", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_5_0_0_1 = INSTANCE.getJAVA_5_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_5_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.STATIC_MEMBER_IMPORT__STATIC), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getStatic(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_5_0_0_2_0_0_0 = INSTANCE.getJAVA_5_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_5_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.STATIC_MEMBER_IMPORT__NAMESPACES), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_5_0_0_2_0_0_1 = INSTANCE.getJAVA_5_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_5_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_5_0_0_2_0_0 = INSTANCE.getJAVA_5_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_5_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_5_0_0_2_0_0_0, JAVA_5_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_5_0_0_2_0 = INSTANCE.getJAVA_5_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_5_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_5_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_5_0_0_2 = INSTANCE.getJAVA_5_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_5_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_5_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_5_0_0_3 = INSTANCE.getJAVA_5_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_5_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.STATIC_MEMBER_IMPORT__STATIC_MEMBERS), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_5_0_0_4 = INSTANCE.getJAVA_5_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_5_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_5_0_0 = INSTANCE.getJAVA_5_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_5_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_5_0_0_0, JAVA_5_0_0_1, JAVA_5_0_0_2, JAVA_5_0_0_3, JAVA_5_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_5_0 = INSTANCE.getJAVA_5_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_5_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_5_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_5 = INSTANCE.getJAVA_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticMemberImport(), JAVA_5_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_6_0_0_0 = INSTANCE.getJAVA_6_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_6_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("import", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_6_0_0_1 = INSTANCE.getJAVA_6_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_6_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticClassifierImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.STATIC_CLASSIFIER_IMPORT__STATIC), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getStatic(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_6_0_0_2_0_0_0 = INSTANCE.getJAVA_6_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_6_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticClassifierImport().getEStructuralFeature(org.emftext.language.java.imports.ImportsPackage.STATIC_CLASSIFIER_IMPORT__NAMESPACES), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_6_0_0_2_0_0_1 = INSTANCE.getJAVA_6_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_6_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_6_0_0_2_0_0 = INSTANCE.getJAVA_6_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_6_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_6_0_0_2_0_0_0, JAVA_6_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_6_0_0_2_0 = INSTANCE.getJAVA_6_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_6_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_6_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_6_0_0_2 = INSTANCE.getJAVA_6_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_6_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_6_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.PLUS);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_6_0_0_3 = INSTANCE.getJAVA_6_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_6_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("*", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_6_0_0_4 = INSTANCE.getJAVA_6_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_6_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_6_0_0 = INSTANCE.getJAVA_6_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_6_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_6_0_0_0, JAVA_6_0_0_1, JAVA_6_0_0_2, JAVA_6_0_0_3, JAVA_6_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_6_0 = INSTANCE.getJAVA_6_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_6_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_6_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_6 = INSTANCE.getJAVA_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.imports.ImportsPackage.eINSTANCE.getStaticClassifierImport(), JAVA_6_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_7_0_0_0 = INSTANCE.getJAVA_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_7_0_0_1 = INSTANCE.getJAVA_7_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_7_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("class", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_7_0_0_2 = INSTANCE.getJAVA_7_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_7_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_7_0_0_3_0_0_0 = INSTANCE.getJAVA_7_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_7_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_7_0_0_3_0_0_1 = INSTANCE.getJAVA_7_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_7_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_7_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_7_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_7_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_7_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_7_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_7_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_7_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_7_0_0_3_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_7_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_3_0_0_2_0_0_0, JAVA_7_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_7_0_0_3_0_0_2_0 = INSTANCE.getJAVA_7_0_0_3_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_7_0_0_3_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_7_0_0_3_0_0_2 = INSTANCE.getJAVA_7_0_0_3_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_7_0_0_3_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_7_0_0_3_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_7_0_0_3_0_0_3 = INSTANCE.getJAVA_7_0_0_3_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_7_0_0_3_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_7_0_0_3_0_0 = INSTANCE.getJAVA_7_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_7_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_3_0_0_0, JAVA_7_0_0_3_0_0_1, JAVA_7_0_0_3_0_0_2, JAVA_7_0_0_3_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_7_0_0_3_0 = INSTANCE.getJAVA_7_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_7_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_7_0_0_3 = INSTANCE.getJAVA_7_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_7_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_7_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_7_0_0_4_0_0_0 = INSTANCE.getJAVA_7_0_0_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_7_0_0_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("extends", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_7_0_0_4_0_0_1 = INSTANCE.getJAVA_7_0_0_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_7_0_0_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__EXTENDS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_7_0_0_4_0_0 = INSTANCE.getJAVA_7_0_0_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_7_0_0_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_4_0_0_0, JAVA_7_0_0_4_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_7_0_0_4_0 = INSTANCE.getJAVA_7_0_0_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_7_0_0_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_7_0_0_4 = INSTANCE.getJAVA_7_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_7_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_7_0_0_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_7_0_0_5_0_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_7_0_0_5_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("implements", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_7_0_0_5_0_0_1_0_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_7_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__IMPLEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_7_0_0_5_0_0_1_0_0_1_0_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_7_0_0_5_0_0_1_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_7_0_0_5_0_0_1_0_0_1_0_0_1 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_7_0_0_5_0_0_1_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__IMPLEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_7_0_0_5_0_0_1_0_0_1_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_7_0_0_5_0_0_1_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_5_0_0_1_0_0_1_0_0_0, JAVA_7_0_0_5_0_0_1_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_7_0_0_5_0_0_1_0_0_1_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_7_0_0_5_0_0_1_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_5_0_0_1_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_7_0_0_5_0_0_1_0_0_1 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_7_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_7_0_0_5_0_0_1_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_7_0_0_5_0_0_1_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_7_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_5_0_0_1_0_0_0, JAVA_7_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_7_0_0_5_0_0_1_0 = INSTANCE.getJAVA_7_0_0_5_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_7_0_0_5_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_7_0_0_5_0_0_1 = INSTANCE.getJAVA_7_0_0_5_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_7_0_0_5_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_7_0_0_5_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_7_0_0_5_0_0 = INSTANCE.getJAVA_7_0_0_5_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_7_0_0_5_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_5_0_0_0, JAVA_7_0_0_5_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_7_0_0_5_0 = INSTANCE.getJAVA_7_0_0_5_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_7_0_0_5_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_5_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_7_0_0_5 = INSTANCE.getJAVA_7_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_7_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_7_0_0_5_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_7_0_0_6 = INSTANCE.getJAVA_7_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_7_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_7_0_0_7 = INSTANCE.getJAVA_7_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_7_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_7_0_0_8_0_0_0 = INSTANCE.getJAVA_7_0_0_8_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_7_0_0_8_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_7_0_0_8_0_0_1 = INSTANCE.getJAVA_7_0_0_8_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_7_0_0_8_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.CLASS__MEMBERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getMember(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_7_0_0_8_0_0 = INSTANCE.getJAVA_7_0_0_8_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_7_0_0_8_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_8_0_0_0, JAVA_7_0_0_8_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_7_0_0_8_0 = INSTANCE.getJAVA_7_0_0_8_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_7_0_0_8_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_8_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_7_0_0_8 = INSTANCE.getJAVA_7_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_7_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_7_0_0_8_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_7_0_0_9 = INSTANCE.getJAVA_7_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_7_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_7_0_0_10 = INSTANCE.getJAVA_7_0_0_10();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_7_0_0_10() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_7_0_0 = INSTANCE.getJAVA_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0_0, JAVA_7_0_0_1, JAVA_7_0_0_2, JAVA_7_0_0_3, JAVA_7_0_0_4, JAVA_7_0_0_5, JAVA_7_0_0_6, JAVA_7_0_0_7, JAVA_7_0_0_8, JAVA_7_0_0_9, JAVA_7_0_0_10);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_7_0 = INSTANCE.getJAVA_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_7 = INSTANCE.getJAVA_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getClass_(), JAVA_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_8_0_0_0 = INSTANCE.getJAVA_8_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_8_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_8_0_0_1 = INSTANCE.getJAVA_8_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_8_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_8_0_0_2_0_0_0 = INSTANCE.getJAVA_8_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_8_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_8_0_0_2_0_0_1 = INSTANCE.getJAVA_8_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_8_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnonymousClass().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ANONYMOUS_CLASS__MEMBERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getMember(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_8_0_0_2_0_0 = INSTANCE.getJAVA_8_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_8_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_8_0_0_2_0_0_0, JAVA_8_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_8_0_0_2_0 = INSTANCE.getJAVA_8_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_8_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_8_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_8_0_0_2 = INSTANCE.getJAVA_8_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_8_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_8_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_8_0_0_3 = INSTANCE.getJAVA_8_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_8_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_8_0_0_4 = INSTANCE.getJAVA_8_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_8_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_8_0_0 = INSTANCE.getJAVA_8_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_8_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_8_0_0_0, JAVA_8_0_0_1, JAVA_8_0_0_2, JAVA_8_0_0_3, JAVA_8_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_8_0 = INSTANCE.getJAVA_8_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_8_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_8_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_8 = INSTANCE.getJAVA_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnonymousClass(), JAVA_8_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_9_0_0_0 = INSTANCE.getJAVA_9_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_9_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_9_0_0_1 = INSTANCE.getJAVA_9_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_9_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("interface", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_9_0_0_2 = INSTANCE.getJAVA_9_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_9_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_9_0_0_3_0_0_0 = INSTANCE.getJAVA_9_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_9_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_9_0_0_3_0_0_1 = INSTANCE.getJAVA_9_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_9_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_9_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_9_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_9_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_9_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_9_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_9_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_9_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_9_0_0_3_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_9_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_3_0_0_2_0_0_0, JAVA_9_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_9_0_0_3_0_0_2_0 = INSTANCE.getJAVA_9_0_0_3_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_9_0_0_3_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_9_0_0_3_0_0_2 = INSTANCE.getJAVA_9_0_0_3_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_9_0_0_3_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_9_0_0_3_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_9_0_0_3_0_0_3 = INSTANCE.getJAVA_9_0_0_3_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_9_0_0_3_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_9_0_0_3_0_0 = INSTANCE.getJAVA_9_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_9_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_3_0_0_0, JAVA_9_0_0_3_0_0_1, JAVA_9_0_0_3_0_0_2, JAVA_9_0_0_3_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_9_0_0_3_0 = INSTANCE.getJAVA_9_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_9_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_9_0_0_3 = INSTANCE.getJAVA_9_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_9_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_9_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_9_0_0_4_0_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_9_0_0_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("extends", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_9_0_0_4_0_0_1_0_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_9_0_0_4_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__EXTENDS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_9_0_0_4_0_0_1_0_0_1_0_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_9_0_0_4_0_0_1_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_9_0_0_4_0_0_1_0_0_1_0_0_1 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_9_0_0_4_0_0_1_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__EXTENDS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_9_0_0_4_0_0_1_0_0_1_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_9_0_0_4_0_0_1_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_4_0_0_1_0_0_1_0_0_0, JAVA_9_0_0_4_0_0_1_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_9_0_0_4_0_0_1_0_0_1_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_9_0_0_4_0_0_1_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_4_0_0_1_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_9_0_0_4_0_0_1_0_0_1 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_9_0_0_4_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_9_0_0_4_0_0_1_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_9_0_0_4_0_0_1_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_9_0_0_4_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_4_0_0_1_0_0_0, JAVA_9_0_0_4_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_9_0_0_4_0_0_1_0 = INSTANCE.getJAVA_9_0_0_4_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_9_0_0_4_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_4_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_9_0_0_4_0_0_1 = INSTANCE.getJAVA_9_0_0_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_9_0_0_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_9_0_0_4_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_9_0_0_4_0_0 = INSTANCE.getJAVA_9_0_0_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_9_0_0_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_4_0_0_0, JAVA_9_0_0_4_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_9_0_0_4_0 = INSTANCE.getJAVA_9_0_0_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_9_0_0_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_9_0_0_4 = INSTANCE.getJAVA_9_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_9_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_9_0_0_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_9_0_0_5 = INSTANCE.getJAVA_9_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_9_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_9_0_0_6 = INSTANCE.getJAVA_9_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_9_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_9_0_0_7_0_0_0 = INSTANCE.getJAVA_9_0_0_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_9_0_0_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_9_0_0_7_0_0_1 = INSTANCE.getJAVA_9_0_0_7_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_9_0_0_7_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.INTERFACE__MEMBERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getMember(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_9_0_0_7_0_0 = INSTANCE.getJAVA_9_0_0_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_9_0_0_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_7_0_0_0, JAVA_9_0_0_7_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_9_0_0_7_0 = INSTANCE.getJAVA_9_0_0_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_9_0_0_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_9_0_0_7 = INSTANCE.getJAVA_9_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_9_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_9_0_0_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_9_0_0_8 = INSTANCE.getJAVA_9_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_9_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_9_0_0_9 = INSTANCE.getJAVA_9_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_9_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_9_0_0 = INSTANCE.getJAVA_9_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_9_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0_0, JAVA_9_0_0_1, JAVA_9_0_0_2, JAVA_9_0_0_3, JAVA_9_0_0_4, JAVA_9_0_0_5, JAVA_9_0_0_6, JAVA_9_0_0_7, JAVA_9_0_0_8, JAVA_9_0_0_9);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_9_0 = INSTANCE.getJAVA_9_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_9_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_9_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_9 = INSTANCE.getJAVA_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getInterface(), JAVA_9_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_10_0_0_0 = INSTANCE.getJAVA_10_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_10_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_10_0_0_1 = INSTANCE.getJAVA_10_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_10_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("enum", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_10_0_0_2 = INSTANCE.getJAVA_10_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_10_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_10_0_0_3_0_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_10_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("implements", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_10_0_0_3_0_0_1_0_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_10_0_0_3_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__IMPLEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_10_0_0_3_0_0_1_0_0_1_0_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_10_0_0_3_0_0_1_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_10_0_0_3_0_0_1_0_0_1_0_0_1 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_10_0_0_3_0_0_1_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__IMPLEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_10_0_0_3_0_0_1_0_0_1_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_10_0_0_3_0_0_1_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_3_0_0_1_0_0_1_0_0_0, JAVA_10_0_0_3_0_0_1_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_10_0_0_3_0_0_1_0_0_1_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_10_0_0_3_0_0_1_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_3_0_0_1_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_10_0_0_3_0_0_1_0_0_1 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_10_0_0_3_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_10_0_0_3_0_0_1_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_10_0_0_3_0_0_1_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_10_0_0_3_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_3_0_0_1_0_0_0, JAVA_10_0_0_3_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_10_0_0_3_0_0_1_0 = INSTANCE.getJAVA_10_0_0_3_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_10_0_0_3_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_3_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_10_0_0_3_0_0_1 = INSTANCE.getJAVA_10_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_10_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_10_0_0_3_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_10_0_0_3_0_0 = INSTANCE.getJAVA_10_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_10_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_3_0_0_0, JAVA_10_0_0_3_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_10_0_0_3_0 = INSTANCE.getJAVA_10_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_10_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_10_0_0_3 = INSTANCE.getJAVA_10_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_10_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_10_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_10_0_0_4 = INSTANCE.getJAVA_10_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_10_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_10_0_0_5 = INSTANCE.getJAVA_10_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_10_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_10_0_0_6_0_0_0 = INSTANCE.getJAVA_10_0_0_6_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_10_0_0_6_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_10_0_0_6_0_0_1 = INSTANCE.getJAVA_10_0_0_6_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_10_0_0_6_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__CONSTANTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_10_0_0_6_0_0_2_0_0_0 = INSTANCE.getJAVA_10_0_0_6_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_10_0_0_6_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_10_0_0_6_0_0_2_0_0_1 = INSTANCE.getJAVA_10_0_0_6_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_10_0_0_6_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_10_0_0_6_0_0_2_0_0_2 = INSTANCE.getJAVA_10_0_0_6_0_0_2_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_10_0_0_6_0_0_2_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__CONSTANTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_10_0_0_6_0_0_2_0_0 = INSTANCE.getJAVA_10_0_0_6_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_10_0_0_6_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_6_0_0_2_0_0_0, JAVA_10_0_0_6_0_0_2_0_0_1, JAVA_10_0_0_6_0_0_2_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_10_0_0_6_0_0_2_0 = INSTANCE.getJAVA_10_0_0_6_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_10_0_0_6_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_6_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_10_0_0_6_0_0_2 = INSTANCE.getJAVA_10_0_0_6_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_10_0_0_6_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_10_0_0_6_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_10_0_0_6_0_0 = INSTANCE.getJAVA_10_0_0_6_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_10_0_0_6_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_6_0_0_0, JAVA_10_0_0_6_0_0_1, JAVA_10_0_0_6_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_10_0_0_6_0 = INSTANCE.getJAVA_10_0_0_6_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_10_0_0_6_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_6_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_10_0_0_6 = INSTANCE.getJAVA_10_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_10_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_10_0_0_6_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_10_0_0_7_0_0_0 = INSTANCE.getJAVA_10_0_0_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_10_0_0_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_10_0_0_7_0_0 = INSTANCE.getJAVA_10_0_0_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_10_0_0_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_7_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_10_0_0_7_0 = INSTANCE.getJAVA_10_0_0_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_10_0_0_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_10_0_0_7 = INSTANCE.getJAVA_10_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_10_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_10_0_0_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_10_0_0_8_0_0_0 = INSTANCE.getJAVA_10_0_0_8_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_10_0_0_8_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_10_0_0_8_0_0_1_0_0_0 = INSTANCE.getJAVA_10_0_0_8_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_10_0_0_8_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_10_0_0_8_0_0_1_0_0_1 = INSTANCE.getJAVA_10_0_0_8_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_10_0_0_8_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ENUMERATION__MEMBERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getMember(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_10_0_0_8_0_0_1_0_0 = INSTANCE.getJAVA_10_0_0_8_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_10_0_0_8_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_8_0_0_1_0_0_0, JAVA_10_0_0_8_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_10_0_0_8_0_0_1_0 = INSTANCE.getJAVA_10_0_0_8_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_10_0_0_8_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_8_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_10_0_0_8_0_0_1 = INSTANCE.getJAVA_10_0_0_8_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_10_0_0_8_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_10_0_0_8_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_10_0_0_8_0_0_2 = INSTANCE.getJAVA_10_0_0_8_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_10_0_0_8_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_10_0_0_8_0_0 = INSTANCE.getJAVA_10_0_0_8_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_10_0_0_8_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_8_0_0_0, JAVA_10_0_0_8_0_0_1, JAVA_10_0_0_8_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_10_0_0_8_0 = INSTANCE.getJAVA_10_0_0_8_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_10_0_0_8_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_8_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_10_0_0_8 = INSTANCE.getJAVA_10_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_10_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_10_0_0_8_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_10_0_0_9 = INSTANCE.getJAVA_10_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_10_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_10_0_0 = INSTANCE.getJAVA_10_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_10_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0_0, JAVA_10_0_0_1, JAVA_10_0_0_2, JAVA_10_0_0_3, JAVA_10_0_0_4, JAVA_10_0_0_5, JAVA_10_0_0_6, JAVA_10_0_0_7, JAVA_10_0_0_8, JAVA_10_0_0_9);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_10_0 = INSTANCE.getJAVA_10_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_10_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_10_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_10 = INSTANCE.getJAVA_10();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_10() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getEnumeration(), JAVA_10_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_11_0_0_0 = INSTANCE.getJAVA_11_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_11_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnnotation().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ANNOTATION__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_11_0_0_1 = INSTANCE.getJAVA_11_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_11_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("@", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_11_0_0_2 = INSTANCE.getJAVA_11_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_11_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("interface", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_11_0_0_3 = INSTANCE.getJAVA_11_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_11_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnnotation().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ANNOTATION__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_11_0_0_4 = INSTANCE.getJAVA_11_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_11_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_11_0_0_5 = INSTANCE.getJAVA_11_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_11_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_11_0_0_6_0_0_0 = INSTANCE.getJAVA_11_0_0_6_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_11_0_0_6_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_11_0_0_6_0_0_1 = INSTANCE.getJAVA_11_0_0_6_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_11_0_0_6_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnnotation().getEStructuralFeature(org.emftext.language.java.classifiers.ClassifiersPackage.ANNOTATION__MEMBERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getMember(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_11_0_0_6_0_0 = INSTANCE.getJAVA_11_0_0_6_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_11_0_0_6_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_11_0_0_6_0_0_0, JAVA_11_0_0_6_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_11_0_0_6_0 = INSTANCE.getJAVA_11_0_0_6_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_11_0_0_6_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_11_0_0_6_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_11_0_0_6 = INSTANCE.getJAVA_11_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_11_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_11_0_0_6_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_11_0_0_7 = INSTANCE.getJAVA_11_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_11_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_11_0_0_8 = INSTANCE.getJAVA_11_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_11_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_11_0_0 = INSTANCE.getJAVA_11_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_11_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_11_0_0_0, JAVA_11_0_0_1, JAVA_11_0_0_2, JAVA_11_0_0_3, JAVA_11_0_0_4, JAVA_11_0_0_5, JAVA_11_0_0_6, JAVA_11_0_0_7, JAVA_11_0_0_8);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_11_0 = INSTANCE.getJAVA_11_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_11_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_11_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_11 = INSTANCE.getJAVA_11();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_11() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnnotation(), JAVA_11_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_12_0_0_0 = INSTANCE.getJAVA_12_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_12_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("@", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_12_0_0_1_0_0_0 = INSTANCE.getJAVA_12_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_12_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_INSTANCE__NAMESPACES), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_12_0_0_1_0_0_1 = INSTANCE.getJAVA_12_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_12_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_12_0_0_1_0_0 = INSTANCE.getJAVA_12_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_12_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_12_0_0_1_0_0_0, JAVA_12_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_12_0_0_1_0 = INSTANCE.getJAVA_12_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_12_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_12_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_12_0_0_1 = INSTANCE.getJAVA_12_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_12_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_12_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_12_0_0_2 = INSTANCE.getJAVA_12_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_12_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_INSTANCE__ANNOTATION), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_12_0_0_3_0_0_0 = INSTANCE.getJAVA_12_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_12_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_INSTANCE__PARAMETER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_12_0_0_3_0_0 = INSTANCE.getJAVA_12_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_12_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_12_0_0_3_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_12_0_0_3_0 = INSTANCE.getJAVA_12_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_12_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_12_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_12_0_0_3 = INSTANCE.getJAVA_12_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_12_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_12_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_12_0_0 = INSTANCE.getJAVA_12_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_12_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_12_0_0_0, JAVA_12_0_0_1, JAVA_12_0_0_2, JAVA_12_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_12_0 = INSTANCE.getJAVA_12_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_12_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_12_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_12 = INSTANCE.getJAVA_12();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_12() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance(), JAVA_12_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_13_0_0_0 = INSTANCE.getJAVA_13_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_13_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_13_0_0_1 = INSTANCE.getJAVA_13_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_13_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getSingleAnnotationParameter().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.SINGLE_ANNOTATION_PARAMETER__VALUE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_13_0_0_2 = INSTANCE.getJAVA_13_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_13_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_13_0_0 = INSTANCE.getJAVA_13_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_13_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_13_0_0_0, JAVA_13_0_0_1, JAVA_13_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_13_0 = INSTANCE.getJAVA_13_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_13_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_13_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_13 = INSTANCE.getJAVA_13();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_13() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getSingleAnnotationParameter(), JAVA_13_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_14_0_0_0 = INSTANCE.getJAVA_14_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_14_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_14_0_0_1_0_0_0 = INSTANCE.getJAVA_14_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_14_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationParameterList().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_PARAMETER_LIST__SETTINGS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_14_0_0_1_0_0_1_0_0_0 = INSTANCE.getJAVA_14_0_0_1_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_14_0_0_1_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_14_0_0_1_0_0_1_0_0_1 = INSTANCE.getJAVA_14_0_0_1_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_14_0_0_1_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationParameterList().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_PARAMETER_LIST__SETTINGS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_14_0_0_1_0_0_1_0_0 = INSTANCE.getJAVA_14_0_0_1_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_14_0_0_1_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_14_0_0_1_0_0_1_0_0_0, JAVA_14_0_0_1_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_14_0_0_1_0_0_1_0 = INSTANCE.getJAVA_14_0_0_1_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_14_0_0_1_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_14_0_0_1_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_14_0_0_1_0_0_1 = INSTANCE.getJAVA_14_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_14_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_14_0_0_1_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_14_0_0_1_0_0 = INSTANCE.getJAVA_14_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_14_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_14_0_0_1_0_0_0, JAVA_14_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_14_0_0_1_0 = INSTANCE.getJAVA_14_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_14_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_14_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_14_0_0_1 = INSTANCE.getJAVA_14_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_14_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_14_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_14_0_0_2 = INSTANCE.getJAVA_14_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_14_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_14_0_0 = INSTANCE.getJAVA_14_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_14_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_14_0_0_0, JAVA_14_0_0_1, JAVA_14_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_14_0 = INSTANCE.getJAVA_14_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_14_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_14_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_14 = INSTANCE.getJAVA_14();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_14() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationParameterList(), JAVA_14_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_15_0_0_0 = INSTANCE.getJAVA_15_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_15_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__ATTRIBUTE), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_15_0_0_1 = INSTANCE.getJAVA_15_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_15_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_15_0_0_2 = INSTANCE.getJAVA_15_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_15_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_15_0_0_3 = INSTANCE.getJAVA_15_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_15_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_15_0_0_4 = INSTANCE.getJAVA_15_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_15_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE_SETTING__VALUE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_15_0_0 = INSTANCE.getJAVA_15_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_15_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_15_0_0_0, JAVA_15_0_0_1, JAVA_15_0_0_2, JAVA_15_0_0_3, JAVA_15_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_15_0 = INSTANCE.getJAVA_15_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_15_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_15_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_15 = INSTANCE.getJAVA_15();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_15() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttributeSetting(), JAVA_15_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_16_0_0_0 = INSTANCE.getJAVA_16_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_16_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.TYPE_PARAMETER__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_16_0_0_1_0_0_0 = INSTANCE.getJAVA_16_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_16_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("extends", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_16_0_0_1_0_0_1 = INSTANCE.getJAVA_16_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_16_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_16_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_16_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_16_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("&", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_16_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_16_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_16_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.TYPE_PARAMETER__EXTEND_TYPES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_16_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_16_0_0_1_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_16_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_16_0_0_1_0_0_2_0_0_0, JAVA_16_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_16_0_0_1_0_0_2_0 = INSTANCE.getJAVA_16_0_0_1_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_16_0_0_1_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_16_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_16_0_0_1_0_0_2 = INSTANCE.getJAVA_16_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_16_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_16_0_0_1_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_16_0_0_1_0_0 = INSTANCE.getJAVA_16_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_16_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_16_0_0_1_0_0_0, JAVA_16_0_0_1_0_0_1, JAVA_16_0_0_1_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_16_0_0_1_0 = INSTANCE.getJAVA_16_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_16_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_16_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_16_0_0_1 = INSTANCE.getJAVA_16_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_16_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_16_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_16_0_0 = INSTANCE.getJAVA_16_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_16_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_16_0_0_0, JAVA_16_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_16_0 = INSTANCE.getJAVA_16_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_16_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_16_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_16 = INSTANCE.getJAVA_16();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_16() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), JAVA_16_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_17_0_0_0 = INSTANCE.getJAVA_17_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_17_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ENUM_CONSTANT__ANNOTATIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationInstance(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_17_0_0_1 = INSTANCE.getJAVA_17_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_17_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ENUM_CONSTANT__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_17_0_0_2_0_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_17_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_17_0_0_2_0_0_1 = INSTANCE.getJAVA_17_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_17_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_17_0_0_2_0_0_2_0_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_17_0_0_2_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ENUM_CONSTANT__ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_17_0_0_2_0_0_2_0_0_1_0_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_17_0_0_2_0_0_2_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_17_0_0_2_0_0_2_0_0_1_0_0_1 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_17_0_0_2_0_0_2_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ENUM_CONSTANT__ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_17_0_0_2_0_0_2_0_0_1_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_17_0_0_2_0_0_2_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_17_0_0_2_0_0_2_0_0_1_0_0_0, JAVA_17_0_0_2_0_0_2_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_17_0_0_2_0_0_2_0_0_1_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_17_0_0_2_0_0_2_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_17_0_0_2_0_0_2_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_17_0_0_2_0_0_2_0_0_1 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_17_0_0_2_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_17_0_0_2_0_0_2_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_17_0_0_2_0_0_2_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_17_0_0_2_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_17_0_0_2_0_0_2_0_0_0, JAVA_17_0_0_2_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_17_0_0_2_0_0_2_0 = INSTANCE.getJAVA_17_0_0_2_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_17_0_0_2_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_17_0_0_2_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_17_0_0_2_0_0_2 = INSTANCE.getJAVA_17_0_0_2_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_17_0_0_2_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_17_0_0_2_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_17_0_0_2_0_0_3 = INSTANCE.getJAVA_17_0_0_2_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_17_0_0_2_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_17_0_0_2_0_0 = INSTANCE.getJAVA_17_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_17_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_17_0_0_2_0_0_0, JAVA_17_0_0_2_0_0_1, JAVA_17_0_0_2_0_0_2, JAVA_17_0_0_2_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_17_0_0_2_0 = INSTANCE.getJAVA_17_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_17_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_17_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_17_0_0_2 = INSTANCE.getJAVA_17_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_17_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_17_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_17_0_0_3_0_0_0 = INSTANCE.getJAVA_17_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_17_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ENUM_CONSTANT__ANONYMOUS_CLASS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnonymousClass(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_17_0_0_3_0_0 = INSTANCE.getJAVA_17_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_17_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_17_0_0_3_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_17_0_0_3_0 = INSTANCE.getJAVA_17_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_17_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_17_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_17_0_0_3 = INSTANCE.getJAVA_17_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_17_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_17_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_17_0_0 = INSTANCE.getJAVA_17_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_17_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_17_0_0_0, JAVA_17_0_0_1, JAVA_17_0_0_2, JAVA_17_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_17_0 = INSTANCE.getJAVA_17_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_17_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_17_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_17 = INSTANCE.getJAVA_17();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_17() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEnumConstant(), JAVA_17_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_18_0_0_0 = INSTANCE.getJAVA_18_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_18_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.BLOCK__MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_18_0_0_1 = INSTANCE.getJAVA_18_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_18_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_18_0_0_2 = INSTANCE.getJAVA_18_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_18_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_18_0_0_3_0_0_0 = INSTANCE.getJAVA_18_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_18_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_18_0_0_3_0_0_1 = INSTANCE.getJAVA_18_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_18_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.BLOCK__STATEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_18_0_0_3_0_0 = INSTANCE.getJAVA_18_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_18_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_18_0_0_3_0_0_0, JAVA_18_0_0_3_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_18_0_0_3_0 = INSTANCE.getJAVA_18_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_18_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_18_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_18_0_0_3 = INSTANCE.getJAVA_18_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_18_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_18_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_18_0_0_4 = INSTANCE.getJAVA_18_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_18_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_18_0_0_5 = INSTANCE.getJAVA_18_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_18_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_18_0_0 = INSTANCE.getJAVA_18_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_18_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_18_0_0_0, JAVA_18_0_0_1, JAVA_18_0_0_2, JAVA_18_0_0_3, JAVA_18_0_0_4, JAVA_18_0_0_5);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_18_0 = INSTANCE.getJAVA_18_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_18_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_18_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_18 = INSTANCE.getJAVA_18();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_18() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBlock(), JAVA_18_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_19_0_0_0 = INSTANCE.getJAVA_19_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_19_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_19_0_0_1_0_0_0 = INSTANCE.getJAVA_19_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_19_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_19_0_0_1_0_0_1 = INSTANCE.getJAVA_19_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_19_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_19_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_19_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_19_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_19_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_19_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_19_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_19_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_19_0_0_1_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_19_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_1_0_0_2_0_0_0, JAVA_19_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_19_0_0_1_0_0_2_0 = INSTANCE.getJAVA_19_0_0_1_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_19_0_0_1_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_19_0_0_1_0_0_2 = INSTANCE.getJAVA_19_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_19_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_19_0_0_1_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_19_0_0_1_0_0_3 = INSTANCE.getJAVA_19_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_19_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_19_0_0_1_0_0 = INSTANCE.getJAVA_19_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_19_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_1_0_0_0, JAVA_19_0_0_1_0_0_1, JAVA_19_0_0_1_0_0_2, JAVA_19_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_19_0_0_1_0 = INSTANCE.getJAVA_19_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_19_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_19_0_0_1 = INSTANCE.getJAVA_19_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_19_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_19_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_19_0_0_2 = INSTANCE.getJAVA_19_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_19_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_19_0_0_3 = INSTANCE.getJAVA_19_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_19_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_19_0_0_4_0_0_0 = INSTANCE.getJAVA_19_0_0_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_19_0_0_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_19_0_0_4_0_0_1_0_0_0 = INSTANCE.getJAVA_19_0_0_4_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_19_0_0_4_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_19_0_0_4_0_0_1_0_0_1 = INSTANCE.getJAVA_19_0_0_4_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_19_0_0_4_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_19_0_0_4_0_0_1_0_0 = INSTANCE.getJAVA_19_0_0_4_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_19_0_0_4_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_4_0_0_1_0_0_0, JAVA_19_0_0_4_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_19_0_0_4_0_0_1_0 = INSTANCE.getJAVA_19_0_0_4_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_19_0_0_4_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_4_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_19_0_0_4_0_0_1 = INSTANCE.getJAVA_19_0_0_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_19_0_0_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_19_0_0_4_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_19_0_0_4_0_0 = INSTANCE.getJAVA_19_0_0_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_19_0_0_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_4_0_0_0, JAVA_19_0_0_4_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_19_0_0_4_0 = INSTANCE.getJAVA_19_0_0_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_19_0_0_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_19_0_0_4 = INSTANCE.getJAVA_19_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_19_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_19_0_0_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_19_0_0_5 = INSTANCE.getJAVA_19_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_19_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_19_0_0_6_0_0_0 = INSTANCE.getJAVA_19_0_0_6_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_19_0_0_6_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("throws", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_19_0_0_6_0_0_1 = INSTANCE.getJAVA_19_0_0_6_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_19_0_0_6_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__EXCEPTIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_19_0_0_6_0_0_2_0_0_0 = INSTANCE.getJAVA_19_0_0_6_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_19_0_0_6_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_19_0_0_6_0_0_2_0_0_1 = INSTANCE.getJAVA_19_0_0_6_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_19_0_0_6_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__EXCEPTIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_19_0_0_6_0_0_2_0_0 = INSTANCE.getJAVA_19_0_0_6_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_19_0_0_6_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_6_0_0_2_0_0_0, JAVA_19_0_0_6_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_19_0_0_6_0_0_2_0 = INSTANCE.getJAVA_19_0_0_6_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_19_0_0_6_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_6_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_19_0_0_6_0_0_2 = INSTANCE.getJAVA_19_0_0_6_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_19_0_0_6_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_19_0_0_6_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_19_0_0_6_0_0 = INSTANCE.getJAVA_19_0_0_6_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_19_0_0_6_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_6_0_0_0, JAVA_19_0_0_6_0_0_1, JAVA_19_0_0_6_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_19_0_0_6_0 = INSTANCE.getJAVA_19_0_0_6_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_19_0_0_6_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_6_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_19_0_0_6 = INSTANCE.getJAVA_19_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_19_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_19_0_0_6_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_19_0_0_7 = INSTANCE.getJAVA_19_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_19_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_19_0_0_8 = INSTANCE.getJAVA_19_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_19_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_19_0_0_9_0_0_0 = INSTANCE.getJAVA_19_0_0_9_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_19_0_0_9_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_19_0_0_9_0_0_1 = INSTANCE.getJAVA_19_0_0_9_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_19_0_0_9_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CONSTRUCTOR__STATEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_19_0_0_9_0_0 = INSTANCE.getJAVA_19_0_0_9_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_19_0_0_9_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_9_0_0_0, JAVA_19_0_0_9_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_19_0_0_9_0 = INSTANCE.getJAVA_19_0_0_9_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_19_0_0_9_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_9_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_19_0_0_9 = INSTANCE.getJAVA_19_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_19_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_19_0_0_9_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_19_0_0_10 = INSTANCE.getJAVA_19_0_0_10();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_19_0_0_10() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_19_0_0_11 = INSTANCE.getJAVA_19_0_0_11();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_19_0_0_11() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_19_0_0 = INSTANCE.getJAVA_19_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_19_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0_0, JAVA_19_0_0_1, JAVA_19_0_0_2, JAVA_19_0_0_3, JAVA_19_0_0_4, JAVA_19_0_0_5, JAVA_19_0_0_6, JAVA_19_0_0_7, JAVA_19_0_0_8, JAVA_19_0_0_9, JAVA_19_0_0_10, JAVA_19_0_0_11);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_19_0 = INSTANCE.getJAVA_19_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_19_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_19_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_19 = INSTANCE.getJAVA_19();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_19() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getConstructor(), JAVA_19_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_20_0_0_0 = INSTANCE.getJAVA_20_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_20_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_20_0_0_1_0_0_0 = INSTANCE.getJAVA_20_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_20_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_20_0_0_1_0_0_1 = INSTANCE.getJAVA_20_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_20_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_20_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_20_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_20_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_20_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_20_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_20_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_20_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_20_0_0_1_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_20_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_1_0_0_2_0_0_0, JAVA_20_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_20_0_0_1_0_0_2_0 = INSTANCE.getJAVA_20_0_0_1_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_20_0_0_1_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_20_0_0_1_0_0_2 = INSTANCE.getJAVA_20_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_20_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_20_0_0_1_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_20_0_0_1_0_0_3 = INSTANCE.getJAVA_20_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_20_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_20_0_0_1_0_0 = INSTANCE.getJAVA_20_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_20_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_1_0_0_0, JAVA_20_0_0_1_0_0_1, JAVA_20_0_0_1_0_0_2, JAVA_20_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_20_0_0_1_0 = INSTANCE.getJAVA_20_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_20_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_20_0_0_1 = INSTANCE.getJAVA_20_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_20_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_20_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_20_0_0_2_0_0_0 = INSTANCE.getJAVA_20_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_20_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_20_0_0_2_0_0_1 = INSTANCE.getJAVA_20_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_20_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_20_0_0_2_0_0 = INSTANCE.getJAVA_20_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_20_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_2_0_0_0, JAVA_20_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_20_0_0_2_0 = INSTANCE.getJAVA_20_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_20_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_20_0_0_2 = INSTANCE.getJAVA_20_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_20_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_20_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_20_0_0_3 = INSTANCE.getJAVA_20_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_20_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_20_0_0_4 = INSTANCE.getJAVA_20_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_20_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_20_0_0_5_0_0_0 = INSTANCE.getJAVA_20_0_0_5_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_20_0_0_5_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_20_0_0_5_0_0_1_0_0_0 = INSTANCE.getJAVA_20_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_20_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_20_0_0_5_0_0_1_0_0_1 = INSTANCE.getJAVA_20_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_20_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_20_0_0_5_0_0_1_0_0 = INSTANCE.getJAVA_20_0_0_5_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_20_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_5_0_0_1_0_0_0, JAVA_20_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_20_0_0_5_0_0_1_0 = INSTANCE.getJAVA_20_0_0_5_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_20_0_0_5_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_20_0_0_5_0_0_1 = INSTANCE.getJAVA_20_0_0_5_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_20_0_0_5_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_20_0_0_5_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_20_0_0_5_0_0 = INSTANCE.getJAVA_20_0_0_5_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_20_0_0_5_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_5_0_0_0, JAVA_20_0_0_5_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_20_0_0_5_0 = INSTANCE.getJAVA_20_0_0_5_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_20_0_0_5_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_5_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_20_0_0_5 = INSTANCE.getJAVA_20_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_20_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_20_0_0_5_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_20_0_0_6 = INSTANCE.getJAVA_20_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_20_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_20_0_0_7 = INSTANCE.getJAVA_20_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_20_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__ARRAY_DIMENSIONS_AFTER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_20_0_0_8_0_0_0 = INSTANCE.getJAVA_20_0_0_8_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_20_0_0_8_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("throws", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_20_0_0_8_0_0_1 = INSTANCE.getJAVA_20_0_0_8_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_20_0_0_8_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__EXCEPTIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_20_0_0_8_0_0_2_0_0_0 = INSTANCE.getJAVA_20_0_0_8_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_20_0_0_8_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_20_0_0_8_0_0_2_0_0_1 = INSTANCE.getJAVA_20_0_0_8_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_20_0_0_8_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.INTERFACE_METHOD__EXCEPTIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_20_0_0_8_0_0_2_0_0 = INSTANCE.getJAVA_20_0_0_8_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_20_0_0_8_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_8_0_0_2_0_0_0, JAVA_20_0_0_8_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_20_0_0_8_0_0_2_0 = INSTANCE.getJAVA_20_0_0_8_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_20_0_0_8_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_8_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_20_0_0_8_0_0_2 = INSTANCE.getJAVA_20_0_0_8_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_20_0_0_8_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_20_0_0_8_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_20_0_0_8_0_0 = INSTANCE.getJAVA_20_0_0_8_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_20_0_0_8_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_8_0_0_0, JAVA_20_0_0_8_0_0_1, JAVA_20_0_0_8_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_20_0_0_8_0 = INSTANCE.getJAVA_20_0_0_8_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_20_0_0_8_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_8_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_20_0_0_8 = INSTANCE.getJAVA_20_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_20_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_20_0_0_8_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_20_0_0_9 = INSTANCE.getJAVA_20_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_20_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_20_0_0 = INSTANCE.getJAVA_20_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_20_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0_0, JAVA_20_0_0_1, JAVA_20_0_0_2, JAVA_20_0_0_3, JAVA_20_0_0_4, JAVA_20_0_0_5, JAVA_20_0_0_6, JAVA_20_0_0_7, JAVA_20_0_0_8, JAVA_20_0_0_9);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_20_0 = INSTANCE.getJAVA_20_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_20_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_20_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_20 = INSTANCE.getJAVA_20();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_20() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getInterfaceMethod(), JAVA_20_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_21_0_0_0 = INSTANCE.getJAVA_21_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_21_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_21_0_0_1_0_0_0 = INSTANCE.getJAVA_21_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_21_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_21_0_0_1_0_0_1 = INSTANCE.getJAVA_21_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_21_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_21_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_21_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_21_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_21_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_21_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_21_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_21_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_21_0_0_1_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_21_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_1_0_0_2_0_0_0, JAVA_21_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_21_0_0_1_0_0_2_0 = INSTANCE.getJAVA_21_0_0_1_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_21_0_0_1_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_21_0_0_1_0_0_2 = INSTANCE.getJAVA_21_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_21_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_21_0_0_1_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_21_0_0_1_0_0_3 = INSTANCE.getJAVA_21_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_21_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_21_0_0_1_0_0 = INSTANCE.getJAVA_21_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_21_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_1_0_0_0, JAVA_21_0_0_1_0_0_1, JAVA_21_0_0_1_0_0_2, JAVA_21_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_21_0_0_1_0 = INSTANCE.getJAVA_21_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_21_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_21_0_0_1 = INSTANCE.getJAVA_21_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_21_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_21_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_21_0_0_2_0_0_0 = INSTANCE.getJAVA_21_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_21_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_21_0_0_2_0_0_1 = INSTANCE.getJAVA_21_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_21_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_21_0_0_2_0_0 = INSTANCE.getJAVA_21_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_21_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_2_0_0_0, JAVA_21_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_21_0_0_2_0 = INSTANCE.getJAVA_21_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_21_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_21_0_0_2 = INSTANCE.getJAVA_21_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_21_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_21_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_21_0_0_3 = INSTANCE.getJAVA_21_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_21_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_21_0_0_4 = INSTANCE.getJAVA_21_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_21_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_21_0_0_5_0_0_0 = INSTANCE.getJAVA_21_0_0_5_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_21_0_0_5_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_21_0_0_5_0_0_1_0_0_0 = INSTANCE.getJAVA_21_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_21_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_21_0_0_5_0_0_1_0_0_1 = INSTANCE.getJAVA_21_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_21_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_21_0_0_5_0_0_1_0_0 = INSTANCE.getJAVA_21_0_0_5_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_21_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_5_0_0_1_0_0_0, JAVA_21_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_21_0_0_5_0_0_1_0 = INSTANCE.getJAVA_21_0_0_5_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_21_0_0_5_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_21_0_0_5_0_0_1 = INSTANCE.getJAVA_21_0_0_5_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_21_0_0_5_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_21_0_0_5_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_21_0_0_5_0_0 = INSTANCE.getJAVA_21_0_0_5_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_21_0_0_5_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_5_0_0_0, JAVA_21_0_0_5_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_21_0_0_5_0 = INSTANCE.getJAVA_21_0_0_5_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_21_0_0_5_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_5_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_21_0_0_5 = INSTANCE.getJAVA_21_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_21_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_21_0_0_5_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_21_0_0_6 = INSTANCE.getJAVA_21_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_21_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_21_0_0_7 = INSTANCE.getJAVA_21_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_21_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__ARRAY_DIMENSIONS_AFTER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_21_0_0_8_0_0_0 = INSTANCE.getJAVA_21_0_0_8_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_21_0_0_8_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("throws", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_21_0_0_8_0_0_1 = INSTANCE.getJAVA_21_0_0_8_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_21_0_0_8_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__EXCEPTIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_21_0_0_8_0_0_2_0_0_0 = INSTANCE.getJAVA_21_0_0_8_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_21_0_0_8_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_21_0_0_8_0_0_2_0_0_1 = INSTANCE.getJAVA_21_0_0_8_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_21_0_0_8_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__EXCEPTIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_21_0_0_8_0_0_2_0_0 = INSTANCE.getJAVA_21_0_0_8_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_21_0_0_8_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_8_0_0_2_0_0_0, JAVA_21_0_0_8_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_21_0_0_8_0_0_2_0 = INSTANCE.getJAVA_21_0_0_8_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_21_0_0_8_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_8_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_21_0_0_8_0_0_2 = INSTANCE.getJAVA_21_0_0_8_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_21_0_0_8_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_21_0_0_8_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_21_0_0_8_0_0 = INSTANCE.getJAVA_21_0_0_8_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_21_0_0_8_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_8_0_0_0, JAVA_21_0_0_8_0_0_1, JAVA_21_0_0_8_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_21_0_0_8_0 = INSTANCE.getJAVA_21_0_0_8_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_21_0_0_8_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_8_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_21_0_0_8 = INSTANCE.getJAVA_21_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_21_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_21_0_0_8_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_21_0_0_9 = INSTANCE.getJAVA_21_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_21_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_21_0_0_10 = INSTANCE.getJAVA_21_0_0_10();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_21_0_0_10() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_21_0_0_11_0_0_0 = INSTANCE.getJAVA_21_0_0_11_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_21_0_0_11_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_21_0_0_11_0_0_1 = INSTANCE.getJAVA_21_0_0_11_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_21_0_0_11_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.CLASS_METHOD__STATEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_21_0_0_11_0_0 = INSTANCE.getJAVA_21_0_0_11_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_21_0_0_11_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_11_0_0_0, JAVA_21_0_0_11_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_21_0_0_11_0 = INSTANCE.getJAVA_21_0_0_11_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_21_0_0_11_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_11_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_21_0_0_11 = INSTANCE.getJAVA_21_0_0_11();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_21_0_0_11() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_21_0_0_11_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_21_0_0_12 = INSTANCE.getJAVA_21_0_0_12();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_21_0_0_12() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_21_0_0_13 = INSTANCE.getJAVA_21_0_0_13();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_21_0_0_13() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_21_0_0 = INSTANCE.getJAVA_21_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_21_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0_0, JAVA_21_0_0_1, JAVA_21_0_0_2, JAVA_21_0_0_3, JAVA_21_0_0_4, JAVA_21_0_0_5, JAVA_21_0_0_6, JAVA_21_0_0_7, JAVA_21_0_0_8, JAVA_21_0_0_9, JAVA_21_0_0_10, JAVA_21_0_0_11, JAVA_21_0_0_12, JAVA_21_0_0_13);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_21_0 = INSTANCE.getJAVA_21_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_21_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_21_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_21 = INSTANCE.getJAVA_21();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_21() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getClassMethod(), JAVA_21_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_22_0_0_0 = INSTANCE.getJAVA_22_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_22_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_22_0_0_1_0_0_0 = INSTANCE.getJAVA_22_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_22_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_22_0_0_1_0_0_1 = INSTANCE.getJAVA_22_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_22_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_22_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_22_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_22_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_22_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_22_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_22_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__TYPE_PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_22_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_22_0_0_1_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_22_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_1_0_0_2_0_0_0, JAVA_22_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_22_0_0_1_0_0_2_0 = INSTANCE.getJAVA_22_0_0_1_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_22_0_0_1_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_22_0_0_1_0_0_2 = INSTANCE.getJAVA_22_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_22_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_22_0_0_1_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_22_0_0_1_0_0_3 = INSTANCE.getJAVA_22_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_22_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_22_0_0_1_0_0 = INSTANCE.getJAVA_22_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_22_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_1_0_0_0, JAVA_22_0_0_1_0_0_1, JAVA_22_0_0_1_0_0_2, JAVA_22_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_22_0_0_1_0 = INSTANCE.getJAVA_22_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_22_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_22_0_0_1 = INSTANCE.getJAVA_22_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_22_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_22_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_22_0_0_2_0_0_0 = INSTANCE.getJAVA_22_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_22_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_22_0_0_2_0_0_1 = INSTANCE.getJAVA_22_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_22_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_22_0_0_2_0_0 = INSTANCE.getJAVA_22_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_22_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_2_0_0_0, JAVA_22_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_22_0_0_2_0 = INSTANCE.getJAVA_22_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_22_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_22_0_0_2 = INSTANCE.getJAVA_22_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_22_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_22_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_22_0_0_3 = INSTANCE.getJAVA_22_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_22_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_22_0_0_4 = INSTANCE.getJAVA_22_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_22_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_22_0_0_5_0_0_0 = INSTANCE.getJAVA_22_0_0_5_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_22_0_0_5_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_22_0_0_5_0_0_1_0_0_0 = INSTANCE.getJAVA_22_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_22_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_22_0_0_5_0_0_1_0_0_1 = INSTANCE.getJAVA_22_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_22_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__PARAMETERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_22_0_0_5_0_0_1_0_0 = INSTANCE.getJAVA_22_0_0_5_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_22_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_5_0_0_1_0_0_0, JAVA_22_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_22_0_0_5_0_0_1_0 = INSTANCE.getJAVA_22_0_0_5_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_22_0_0_5_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_22_0_0_5_0_0_1 = INSTANCE.getJAVA_22_0_0_5_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_22_0_0_5_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_22_0_0_5_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_22_0_0_5_0_0 = INSTANCE.getJAVA_22_0_0_5_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_22_0_0_5_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_5_0_0_0, JAVA_22_0_0_5_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_22_0_0_5_0 = INSTANCE.getJAVA_22_0_0_5_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_22_0_0_5_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_5_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_22_0_0_5 = INSTANCE.getJAVA_22_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_22_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_22_0_0_5_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_22_0_0_6 = INSTANCE.getJAVA_22_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_22_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_22_0_0_7 = INSTANCE.getJAVA_22_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_22_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__ARRAY_DIMENSIONS_AFTER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_22_0_0_8_0_0_0 = INSTANCE.getJAVA_22_0_0_8_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_22_0_0_8_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("throws", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_22_0_0_8_0_0_1 = INSTANCE.getJAVA_22_0_0_8_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_22_0_0_8_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__EXCEPTIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_22_0_0_8_0_0_2_0_0_0 = INSTANCE.getJAVA_22_0_0_8_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_22_0_0_8_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_22_0_0_8_0_0_2_0_0_1 = INSTANCE.getJAVA_22_0_0_8_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_22_0_0_8_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__EXCEPTIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_22_0_0_8_0_0_2_0_0 = INSTANCE.getJAVA_22_0_0_8_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_22_0_0_8_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_8_0_0_2_0_0_0, JAVA_22_0_0_8_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_22_0_0_8_0_0_2_0 = INSTANCE.getJAVA_22_0_0_8_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_22_0_0_8_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_8_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_22_0_0_8_0_0_2 = INSTANCE.getJAVA_22_0_0_8_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_22_0_0_8_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_22_0_0_8_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_22_0_0_8_0_0 = INSTANCE.getJAVA_22_0_0_8_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_22_0_0_8_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_8_0_0_0, JAVA_22_0_0_8_0_0_1, JAVA_22_0_0_8_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_22_0_0_8_0 = INSTANCE.getJAVA_22_0_0_8_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_22_0_0_8_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_8_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_22_0_0_8 = INSTANCE.getJAVA_22_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_22_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_22_0_0_8_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_22_0_0_9 = INSTANCE.getJAVA_22_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_22_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("default", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_22_0_0_10 = INSTANCE.getJAVA_22_0_0_10();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_22_0_0_10() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute().getEStructuralFeature(org.emftext.language.java.annotations.AnnotationsPackage.ANNOTATION_ATTRIBUTE__DEFAULT_VALUE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_22_0_0_11 = INSTANCE.getJAVA_22_0_0_11();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_22_0_0_11() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_22_0_0 = INSTANCE.getJAVA_22_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_22_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0_0, JAVA_22_0_0_1, JAVA_22_0_0_2, JAVA_22_0_0_3, JAVA_22_0_0_4, JAVA_22_0_0_5, JAVA_22_0_0_6, JAVA_22_0_0_7, JAVA_22_0_0_8, JAVA_22_0_0_9, JAVA_22_0_0_10, JAVA_22_0_0_11);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_22_0 = INSTANCE.getJAVA_22_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_22_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_22_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_22 = INSTANCE.getJAVA_22();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_22() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.annotations.AnnotationsPackage.eINSTANCE.getAnnotationAttribute(), JAVA_22_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_23_0_0_0 = INSTANCE.getJAVA_23_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_23_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_23_0_0_1 = INSTANCE.getJAVA_23_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_23_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_23_0_0_2 = INSTANCE.getJAVA_23_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_23_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_23_0_0_3_0_0_0 = INSTANCE.getJAVA_23_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_23_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_23_0_0_3_0_0_1 = INSTANCE.getJAVA_23_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_23_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_23_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_23_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_23_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_23_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_23_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_23_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_23_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_23_0_0_3_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_23_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_23_0_0_3_0_0_2_0_0_0, JAVA_23_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_23_0_0_3_0_0_2_0 = INSTANCE.getJAVA_23_0_0_3_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_23_0_0_3_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_23_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_23_0_0_3_0_0_2 = INSTANCE.getJAVA_23_0_0_3_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_23_0_0_3_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_23_0_0_3_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_23_0_0_3_0_0_3 = INSTANCE.getJAVA_23_0_0_3_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_23_0_0_3_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_23_0_0_3_0_0 = INSTANCE.getJAVA_23_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_23_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_23_0_0_3_0_0_0, JAVA_23_0_0_3_0_0_1, JAVA_23_0_0_3_0_0_2, JAVA_23_0_0_3_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_23_0_0_3_0 = INSTANCE.getJAVA_23_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_23_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_23_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_23_0_0_3 = INSTANCE.getJAVA_23_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_23_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_23_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_23_0_0_4 = INSTANCE.getJAVA_23_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_23_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_23_0_0_5 = INSTANCE.getJAVA_23_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_23_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.ORDINARY_PARAMETER__ARRAY_DIMENSIONS_AFTER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_23_0_0 = INSTANCE.getJAVA_23_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_23_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_23_0_0_0, JAVA_23_0_0_1, JAVA_23_0_0_2, JAVA_23_0_0_3, JAVA_23_0_0_4, JAVA_23_0_0_5);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_23_0 = INSTANCE.getJAVA_23_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_23_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_23_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_23 = INSTANCE.getJAVA_23();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_23() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter(), JAVA_23_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_24_0_0_0 = INSTANCE.getJAVA_24_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_24_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_24_0_0_1 = INSTANCE.getJAVA_24_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_24_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_24_0_0_2 = INSTANCE.getJAVA_24_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_24_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_24_0_0_3_0_0_0 = INSTANCE.getJAVA_24_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_24_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_24_0_0_3_0_0_1 = INSTANCE.getJAVA_24_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_24_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_24_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_24_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_24_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_24_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_24_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_24_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_24_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_24_0_0_3_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_24_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_24_0_0_3_0_0_2_0_0_0, JAVA_24_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_24_0_0_3_0_0_2_0 = INSTANCE.getJAVA_24_0_0_3_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_24_0_0_3_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_24_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_24_0_0_3_0_0_2 = INSTANCE.getJAVA_24_0_0_3_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_24_0_0_3_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_24_0_0_3_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_24_0_0_3_0_0_3 = INSTANCE.getJAVA_24_0_0_3_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_24_0_0_3_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_24_0_0_3_0_0 = INSTANCE.getJAVA_24_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_24_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_24_0_0_3_0_0_0, JAVA_24_0_0_3_0_0_1, JAVA_24_0_0_3_0_0_2, JAVA_24_0_0_3_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_24_0_0_3_0 = INSTANCE.getJAVA_24_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_24_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_24_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_24_0_0_3 = INSTANCE.getJAVA_24_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_24_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_24_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_24_0_0_4 = INSTANCE.getJAVA_24_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_24_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("...", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_24_0_0_5 = INSTANCE.getJAVA_24_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_24_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter().getEStructuralFeature(org.emftext.language.java.parameters.ParametersPackage.VARIABLE_LENGTH_PARAMETER__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_24_0_0 = INSTANCE.getJAVA_24_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_24_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_24_0_0_0, JAVA_24_0_0_1, JAVA_24_0_0_2, JAVA_24_0_0_3, JAVA_24_0_0_4, JAVA_24_0_0_5);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_24_0 = INSTANCE.getJAVA_24_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_24_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_24_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_24 = INSTANCE.getJAVA_24();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_24() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getVariableLengthParameter(), JAVA_24_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_25_0_0_0 = INSTANCE.getJAVA_25_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_25_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_25_0_0_1 = INSTANCE.getJAVA_25_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_25_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_25_0_0_2 = INSTANCE.getJAVA_25_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_25_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_25_0_0_3_0_0_0 = INSTANCE.getJAVA_25_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_25_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_25_0_0_3_0_0_1 = INSTANCE.getJAVA_25_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_25_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_25_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_25_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_25_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_25_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_25_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_25_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_25_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_25_0_0_3_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_25_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_25_0_0_3_0_0_2_0_0_0, JAVA_25_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_25_0_0_3_0_0_2_0 = INSTANCE.getJAVA_25_0_0_3_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_25_0_0_3_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_25_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_25_0_0_3_0_0_2 = INSTANCE.getJAVA_25_0_0_3_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_25_0_0_3_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_25_0_0_3_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_25_0_0_3_0_0_3 = INSTANCE.getJAVA_25_0_0_3_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_25_0_0_3_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_25_0_0_3_0_0 = INSTANCE.getJAVA_25_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_25_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_25_0_0_3_0_0_0, JAVA_25_0_0_3_0_0_1, JAVA_25_0_0_3_0_0_2, JAVA_25_0_0_3_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_25_0_0_3_0 = INSTANCE.getJAVA_25_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_25_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_25_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_25_0_0_3 = INSTANCE.getJAVA_25_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_25_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_25_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_25_0_0_4 = INSTANCE.getJAVA_25_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_25_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_25_0_0_5 = INSTANCE.getJAVA_25_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_25_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_25_0_0_6_0_0_0 = INSTANCE.getJAVA_25_0_0_6_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_25_0_0_6_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_25_0_0_6_0_0_1 = INSTANCE.getJAVA_25_0_0_6_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_25_0_0_6_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_25_0_0_6_0_0_2 = INSTANCE.getJAVA_25_0_0_6_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_25_0_0_6_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_25_0_0_6_0_0_3 = INSTANCE.getJAVA_25_0_0_6_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_25_0_0_6_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__INITIAL_VALUE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_25_0_0_6_0_0 = INSTANCE.getJAVA_25_0_0_6_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_25_0_0_6_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_25_0_0_6_0_0_0, JAVA_25_0_0_6_0_0_1, JAVA_25_0_0_6_0_0_2, JAVA_25_0_0_6_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_25_0_0_6_0 = INSTANCE.getJAVA_25_0_0_6_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_25_0_0_6_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_25_0_0_6_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_25_0_0_6 = INSTANCE.getJAVA_25_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_25_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_25_0_0_6_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_25_0_0_7_0_0_0 = INSTANCE.getJAVA_25_0_0_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_25_0_0_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_25_0_0_7_0_0_1 = INSTANCE.getJAVA_25_0_0_7_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_25_0_0_7_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.LOCAL_VARIABLE__ADDITIONAL_LOCAL_VARIABLES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getAdditionalLocalVariable(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_25_0_0_7_0_0 = INSTANCE.getJAVA_25_0_0_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_25_0_0_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_25_0_0_7_0_0_0, JAVA_25_0_0_7_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_25_0_0_7_0 = INSTANCE.getJAVA_25_0_0_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_25_0_0_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_25_0_0_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_25_0_0_7 = INSTANCE.getJAVA_25_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_25_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_25_0_0_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_25_0_0 = INSTANCE.getJAVA_25_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_25_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_25_0_0_0, JAVA_25_0_0_1, JAVA_25_0_0_2, JAVA_25_0_0_3, JAVA_25_0_0_4, JAVA_25_0_0_5, JAVA_25_0_0_6, JAVA_25_0_0_7);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_25_0 = INSTANCE.getJAVA_25_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_25_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_25_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_25 = INSTANCE.getJAVA_25();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_25() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable(), JAVA_25_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_26_0_0_0 = INSTANCE.getJAVA_26_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_26_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getLocalVariableStatement().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.LOCAL_VARIABLE_STATEMENT__VARIABLE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getLocalVariable(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_26_0_0_1 = INSTANCE.getJAVA_26_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_26_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_26_0_0 = INSTANCE.getJAVA_26_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_26_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_26_0_0_0, JAVA_26_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_26_0 = INSTANCE.getJAVA_26_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_26_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_26_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_26 = INSTANCE.getJAVA_26();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_26() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getLocalVariableStatement(), JAVA_26_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_27_0_0_0 = INSTANCE.getJAVA_27_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_27_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getAdditionalLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.ADDITIONAL_LOCAL_VARIABLE__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_27_0_0_1 = INSTANCE.getJAVA_27_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_27_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getAdditionalLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.ADDITIONAL_LOCAL_VARIABLE__ARRAY_DIMENSIONS_AFTER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_27_0_0_2_0_0_0 = INSTANCE.getJAVA_27_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_27_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_27_0_0_2_0_0_1 = INSTANCE.getJAVA_27_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_27_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_27_0_0_2_0_0_2 = INSTANCE.getJAVA_27_0_0_2_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_27_0_0_2_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_27_0_0_2_0_0_3 = INSTANCE.getJAVA_27_0_0_2_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_27_0_0_2_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getAdditionalLocalVariable().getEStructuralFeature(org.emftext.language.java.variables.VariablesPackage.ADDITIONAL_LOCAL_VARIABLE__INITIAL_VALUE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_27_0_0_2_0_0 = INSTANCE.getJAVA_27_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_27_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_27_0_0_2_0_0_0, JAVA_27_0_0_2_0_0_1, JAVA_27_0_0_2_0_0_2, JAVA_27_0_0_2_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_27_0_0_2_0 = INSTANCE.getJAVA_27_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_27_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_27_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_27_0_0_2 = INSTANCE.getJAVA_27_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_27_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_27_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_27_0_0 = INSTANCE.getJAVA_27_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_27_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_27_0_0_0, JAVA_27_0_0_1, JAVA_27_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_27_0 = INSTANCE.getJAVA_27_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_27_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_27_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_27 = INSTANCE.getJAVA_27();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_27() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.variables.VariablesPackage.eINSTANCE.getAdditionalLocalVariable(), JAVA_27_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_28_0_0_0 = INSTANCE.getJAVA_28_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_28_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__ANNOTATIONS_AND_MODIFIERS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAnnotationInstanceOrModifier(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_28_0_0_1 = INSTANCE.getJAVA_28_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_28_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_28_0_0_2 = INSTANCE.getJAVA_28_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_28_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_28_0_0_3_0_0_0 = INSTANCE.getJAVA_28_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_28_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_28_0_0_3_0_0_1 = INSTANCE.getJAVA_28_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_28_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_28_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_28_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_28_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_28_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_28_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_28_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_28_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_28_0_0_3_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_28_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_28_0_0_3_0_0_2_0_0_0, JAVA_28_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_28_0_0_3_0_0_2_0 = INSTANCE.getJAVA_28_0_0_3_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_28_0_0_3_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_28_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_28_0_0_3_0_0_2 = INSTANCE.getJAVA_28_0_0_3_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_28_0_0_3_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_28_0_0_3_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_28_0_0_3_0_0_3 = INSTANCE.getJAVA_28_0_0_3_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_28_0_0_3_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_28_0_0_3_0_0 = INSTANCE.getJAVA_28_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_28_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_28_0_0_3_0_0_0, JAVA_28_0_0_3_0_0_1, JAVA_28_0_0_3_0_0_2, JAVA_28_0_0_3_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_28_0_0_3_0 = INSTANCE.getJAVA_28_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_28_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_28_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_28_0_0_3 = INSTANCE.getJAVA_28_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_28_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_28_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_28_0_0_4 = INSTANCE.getJAVA_28_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_28_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_28_0_0_5 = INSTANCE.getJAVA_28_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_28_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__ARRAY_DIMENSIONS_AFTER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_28_0_0_6_0_0_0 = INSTANCE.getJAVA_28_0_0_6_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_28_0_0_6_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_28_0_0_6_0_0_1 = INSTANCE.getJAVA_28_0_0_6_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_28_0_0_6_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_28_0_0_6_0_0_2 = INSTANCE.getJAVA_28_0_0_6_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_28_0_0_6_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_28_0_0_6_0_0_3 = INSTANCE.getJAVA_28_0_0_6_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_28_0_0_6_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__INITIAL_VALUE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_28_0_0_6_0_0 = INSTANCE.getJAVA_28_0_0_6_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_28_0_0_6_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_28_0_0_6_0_0_0, JAVA_28_0_0_6_0_0_1, JAVA_28_0_0_6_0_0_2, JAVA_28_0_0_6_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_28_0_0_6_0 = INSTANCE.getJAVA_28_0_0_6_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_28_0_0_6_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_28_0_0_6_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_28_0_0_6 = INSTANCE.getJAVA_28_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_28_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_28_0_0_6_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_28_0_0_7_0_0_0 = INSTANCE.getJAVA_28_0_0_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_28_0_0_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_28_0_0_7_0_0_1 = INSTANCE.getJAVA_28_0_0_7_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_28_0_0_7_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.FIELD__ADDITIONAL_FIELDS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.members.MembersPackage.eINSTANCE.getAdditionalField(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_28_0_0_7_0_0 = INSTANCE.getJAVA_28_0_0_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_28_0_0_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_28_0_0_7_0_0_0, JAVA_28_0_0_7_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_28_0_0_7_0 = INSTANCE.getJAVA_28_0_0_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_28_0_0_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_28_0_0_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_28_0_0_7 = INSTANCE.getJAVA_28_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_28_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_28_0_0_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_28_0_0_8 = INSTANCE.getJAVA_28_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_28_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_28_0_0 = INSTANCE.getJAVA_28_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_28_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_28_0_0_0, JAVA_28_0_0_1, JAVA_28_0_0_2, JAVA_28_0_0_3, JAVA_28_0_0_4, JAVA_28_0_0_5, JAVA_28_0_0_6, JAVA_28_0_0_7, JAVA_28_0_0_8);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_28_0 = INSTANCE.getJAVA_28_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_28_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_28_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_28 = INSTANCE.getJAVA_28();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_28() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getField(), JAVA_28_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_29_0_0_0 = INSTANCE.getJAVA_29_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_29_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.members.MembersPackage.eINSTANCE.getAdditionalField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ADDITIONAL_FIELD__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_29_0_0_1 = INSTANCE.getJAVA_29_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_29_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getAdditionalField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ADDITIONAL_FIELD__ARRAY_DIMENSIONS_AFTER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_29_0_0_2_0_0_0 = INSTANCE.getJAVA_29_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_29_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_29_0_0_2_0_0_1 = INSTANCE.getJAVA_29_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_29_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_29_0_0_2_0_0_2 = INSTANCE.getJAVA_29_0_0_2_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_29_0_0_2_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_29_0_0_2_0_0_3 = INSTANCE.getJAVA_29_0_0_2_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_29_0_0_2_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.members.MembersPackage.eINSTANCE.getAdditionalField().getEStructuralFeature(org.emftext.language.java.members.MembersPackage.ADDITIONAL_FIELD__INITIAL_VALUE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_29_0_0_2_0_0 = INSTANCE.getJAVA_29_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_29_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_29_0_0_2_0_0_0, JAVA_29_0_0_2_0_0_1, JAVA_29_0_0_2_0_0_2, JAVA_29_0_0_2_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_29_0_0_2_0 = INSTANCE.getJAVA_29_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_29_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_29_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_29_0_0_2 = INSTANCE.getJAVA_29_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_29_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_29_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_29_0_0 = INSTANCE.getJAVA_29_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_29_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_29_0_0_0, JAVA_29_0_0_1, JAVA_29_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_29_0 = INSTANCE.getJAVA_29_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_29_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_29_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_29 = INSTANCE.getJAVA_29();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_29() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getAdditionalField(), JAVA_29_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_30_0_0_0 = INSTANCE.getJAVA_30_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_30_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_30_0_0 = INSTANCE.getJAVA_30_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_30_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_30_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_30_0 = INSTANCE.getJAVA_30_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_30_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_30_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_30 = INSTANCE.getJAVA_30();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_30() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.members.MembersPackage.eINSTANCE.getEmptyMember(), JAVA_30_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_31_0_0_0 = INSTANCE.getJAVA_31_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_31_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("new", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_31_0_0_1_0_0_0 = INSTANCE.getJAVA_31_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_31_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_31_0_0_1_0_0_1 = INSTANCE.getJAVA_31_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_31_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_31_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_31_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_31_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_31_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_31_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_31_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_31_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_31_0_0_1_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_31_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_1_0_0_2_0_0_0, JAVA_31_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_31_0_0_1_0_0_2_0 = INSTANCE.getJAVA_31_0_0_1_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_31_0_0_1_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_31_0_0_1_0_0_2 = INSTANCE.getJAVA_31_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_31_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_31_0_0_1_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_31_0_0_1_0_0_3 = INSTANCE.getJAVA_31_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_31_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_31_0_0_1_0_0 = INSTANCE.getJAVA_31_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_31_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_1_0_0_0, JAVA_31_0_0_1_0_0_1, JAVA_31_0_0_1_0_0_2, JAVA_31_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_31_0_0_1_0 = INSTANCE.getJAVA_31_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_31_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_31_0_0_1 = INSTANCE.getJAVA_31_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_31_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_31_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_31_0_0_2 = INSTANCE.getJAVA_31_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_31_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_31_0_0_3_0_0_0 = INSTANCE.getJAVA_31_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_31_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_31_0_0_3_0_0_1 = INSTANCE.getJAVA_31_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_31_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_31_0_0_3_0_0_2_0_0_0 = INSTANCE.getJAVA_31_0_0_3_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_31_0_0_3_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_31_0_0_3_0_0_2_0_0_1 = INSTANCE.getJAVA_31_0_0_3_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_31_0_0_3_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__CALL_TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_31_0_0_3_0_0_2_0_0 = INSTANCE.getJAVA_31_0_0_3_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_31_0_0_3_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_3_0_0_2_0_0_0, JAVA_31_0_0_3_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_31_0_0_3_0_0_2_0 = INSTANCE.getJAVA_31_0_0_3_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_31_0_0_3_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_3_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_31_0_0_3_0_0_2 = INSTANCE.getJAVA_31_0_0_3_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_31_0_0_3_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_31_0_0_3_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_31_0_0_3_0_0_3 = INSTANCE.getJAVA_31_0_0_3_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_31_0_0_3_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_31_0_0_3_0_0 = INSTANCE.getJAVA_31_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_31_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_3_0_0_0, JAVA_31_0_0_3_0_0_1, JAVA_31_0_0_3_0_0_2, JAVA_31_0_0_3_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_31_0_0_3_0 = INSTANCE.getJAVA_31_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_31_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_31_0_0_3 = INSTANCE.getJAVA_31_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_31_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_31_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_31_0_0_4 = INSTANCE.getJAVA_31_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_31_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_31_0_0_5_0_0_0 = INSTANCE.getJAVA_31_0_0_5_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_31_0_0_5_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_31_0_0_5_0_0_1_0_0_0 = INSTANCE.getJAVA_31_0_0_5_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_31_0_0_5_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_31_0_0_5_0_0_1_0_0_1 = INSTANCE.getJAVA_31_0_0_5_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_31_0_0_5_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_31_0_0_5_0_0_1_0_0 = INSTANCE.getJAVA_31_0_0_5_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_31_0_0_5_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_5_0_0_1_0_0_0, JAVA_31_0_0_5_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_31_0_0_5_0_0_1_0 = INSTANCE.getJAVA_31_0_0_5_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_31_0_0_5_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_5_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_31_0_0_5_0_0_1 = INSTANCE.getJAVA_31_0_0_5_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_31_0_0_5_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_31_0_0_5_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_31_0_0_5_0_0 = INSTANCE.getJAVA_31_0_0_5_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_31_0_0_5_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_5_0_0_0, JAVA_31_0_0_5_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_31_0_0_5_0 = INSTANCE.getJAVA_31_0_0_5_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_31_0_0_5_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_5_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_31_0_0_5 = INSTANCE.getJAVA_31_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_31_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_31_0_0_5_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_31_0_0_6 = INSTANCE.getJAVA_31_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_31_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_31_0_0_7 = INSTANCE.getJAVA_31_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_31_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__ANONYMOUS_CLASS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.classifiers.ClassifiersPackage.eINSTANCE.getAnonymousClass(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_31_0_0_8_0_0_0 = INSTANCE.getJAVA_31_0_0_8_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_31_0_0_8_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_31_0_0_8_0_0_1 = INSTANCE.getJAVA_31_0_0_8_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_31_0_0_8_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.NEW_CONSTRUCTOR_CALL__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_31_0_0_8_0_0 = INSTANCE.getJAVA_31_0_0_8_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_31_0_0_8_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_8_0_0_0, JAVA_31_0_0_8_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_31_0_0_8_0 = INSTANCE.getJAVA_31_0_0_8_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_31_0_0_8_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_8_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_31_0_0_8 = INSTANCE.getJAVA_31_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_31_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_31_0_0_8_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_31_0_0 = INSTANCE.getJAVA_31_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_31_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0_0, JAVA_31_0_0_1, JAVA_31_0_0_2, JAVA_31_0_0_3, JAVA_31_0_0_4, JAVA_31_0_0_5, JAVA_31_0_0_6, JAVA_31_0_0_7, JAVA_31_0_0_8);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_31_0 = INSTANCE.getJAVA_31_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_31_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_31_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_31 = INSTANCE.getJAVA_31();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_31() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getNewConstructorCall(), JAVA_31_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_32_0_0_0_0_0_0 = INSTANCE.getJAVA_32_0_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_32_0_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_32_0_0_0_0_0_1 = INSTANCE.getJAVA_32_0_0_0_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_32_0_0_0_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_32_0_0_0_0_0_2_0_0_0 = INSTANCE.getJAVA_32_0_0_0_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_32_0_0_0_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_32_0_0_0_0_0_2_0_0_1 = INSTANCE.getJAVA_32_0_0_0_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_32_0_0_0_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_32_0_0_0_0_0_2_0_0 = INSTANCE.getJAVA_32_0_0_0_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_32_0_0_0_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0_0_0_0_2_0_0_0, JAVA_32_0_0_0_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_32_0_0_0_0_0_2_0 = INSTANCE.getJAVA_32_0_0_0_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_32_0_0_0_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0_0_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_32_0_0_0_0_0_2 = INSTANCE.getJAVA_32_0_0_0_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_32_0_0_0_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_32_0_0_0_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_32_0_0_0_0_0_3 = INSTANCE.getJAVA_32_0_0_0_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_32_0_0_0_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_32_0_0_0_0_0 = INSTANCE.getJAVA_32_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_32_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0_0_0_0_0, JAVA_32_0_0_0_0_0_1, JAVA_32_0_0_0_0_0_2, JAVA_32_0_0_0_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_32_0_0_0_0 = INSTANCE.getJAVA_32_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_32_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_32_0_0_0 = INSTANCE.getJAVA_32_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_32_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_32_0_0_0_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_32_0_0_1 = INSTANCE.getJAVA_32_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_32_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__CALL_TARGET), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getSelf(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_32_0_0_2 = INSTANCE.getJAVA_32_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_32_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_32_0_0_3_0_0_0 = INSTANCE.getJAVA_32_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_32_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_32_0_0_3_0_0_1_0_0_0 = INSTANCE.getJAVA_32_0_0_3_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_32_0_0_3_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_32_0_0_3_0_0_1_0_0_1 = INSTANCE.getJAVA_32_0_0_3_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_32_0_0_3_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_32_0_0_3_0_0_1_0_0 = INSTANCE.getJAVA_32_0_0_3_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_32_0_0_3_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0_3_0_0_1_0_0_0, JAVA_32_0_0_3_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_32_0_0_3_0_0_1_0 = INSTANCE.getJAVA_32_0_0_3_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_32_0_0_3_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0_3_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_32_0_0_3_0_0_1 = INSTANCE.getJAVA_32_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_32_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_32_0_0_3_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_32_0_0_3_0_0 = INSTANCE.getJAVA_32_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_32_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0_3_0_0_0, JAVA_32_0_0_3_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_32_0_0_3_0 = INSTANCE.getJAVA_32_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_32_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_32_0_0_3 = INSTANCE.getJAVA_32_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_32_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_32_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_32_0_0_4 = INSTANCE.getJAVA_32_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_32_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_32_0_0_5_0_0_0 = INSTANCE.getJAVA_32_0_0_5_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_32_0_0_5_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_32_0_0_5_0_0_1 = INSTANCE.getJAVA_32_0_0_5_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_32_0_0_5_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall().getEStructuralFeature(org.emftext.language.java.instantiations.InstantiationsPackage.EXPLICIT_CONSTRUCTOR_CALL__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_32_0_0_5_0_0 = INSTANCE.getJAVA_32_0_0_5_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_32_0_0_5_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0_5_0_0_0, JAVA_32_0_0_5_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_32_0_0_5_0 = INSTANCE.getJAVA_32_0_0_5_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_32_0_0_5_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0_5_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_32_0_0_5 = INSTANCE.getJAVA_32_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_32_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_32_0_0_5_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_32_0_0 = INSTANCE.getJAVA_32_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_32_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0_0, JAVA_32_0_0_1, JAVA_32_0_0_2, JAVA_32_0_0_3, JAVA_32_0_0_4, JAVA_32_0_0_5);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_32_0 = INSTANCE.getJAVA_32_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_32_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_32_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_32 = INSTANCE.getJAVA_32();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_32() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.instantiations.InstantiationsPackage.eINSTANCE.getExplicitConstructorCall(), JAVA_32_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_33_0_0_0 = INSTANCE.getJAVA_33_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_33_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("new", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_33_0_0_1 = INSTANCE.getJAVA_33_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_33_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_33_0_0_2 = INSTANCE.getJAVA_33_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_33_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.PLUS, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_33_0_0_3 = INSTANCE.getJAVA_33_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_33_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_INITIALIZER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_33_0_0_4 = INSTANCE.getJAVA_33_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_33_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__ARRAY_SELECTORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_33_0_0_5_0_0_0 = INSTANCE.getJAVA_33_0_0_5_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_33_0_0_5_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_33_0_0_5_0_0_1 = INSTANCE.getJAVA_33_0_0_5_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_33_0_0_5_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_TYPED__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_33_0_0_5_0_0 = INSTANCE.getJAVA_33_0_0_5_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_33_0_0_5_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_33_0_0_5_0_0_0, JAVA_33_0_0_5_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_33_0_0_5_0 = INSTANCE.getJAVA_33_0_0_5_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_33_0_0_5_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_33_0_0_5_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_33_0_0_5 = INSTANCE.getJAVA_33_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_33_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_33_0_0_5_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_33_0_0 = INSTANCE.getJAVA_33_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_33_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_33_0_0_0, JAVA_33_0_0_1, JAVA_33_0_0_2, JAVA_33_0_0_3, JAVA_33_0_0_4, JAVA_33_0_0_5);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_33_0 = INSTANCE.getJAVA_33_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_33_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_33_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_33 = INSTANCE.getJAVA_33();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_33() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesTyped(), JAVA_33_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_34_0_0_0 = INSTANCE.getJAVA_34_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_34_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesUntyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__ARRAY_INITIALIZER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_34_0_0_1 = INSTANCE.getJAVA_34_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_34_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesUntyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__ARRAY_SELECTORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_34_0_0_2_0_0_0 = INSTANCE.getJAVA_34_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_34_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_34_0_0_2_0_0_1 = INSTANCE.getJAVA_34_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_34_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesUntyped().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_VALUES_UNTYPED__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_34_0_0_2_0_0 = INSTANCE.getJAVA_34_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_34_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_34_0_0_2_0_0_0, JAVA_34_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_34_0_0_2_0 = INSTANCE.getJAVA_34_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_34_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_34_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_34_0_0_2 = INSTANCE.getJAVA_34_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_34_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_34_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_34_0_0 = INSTANCE.getJAVA_34_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_34_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_34_0_0_0, JAVA_34_0_0_1, JAVA_34_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_34_0 = INSTANCE.getJAVA_34_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_34_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_34_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_34 = INSTANCE.getJAVA_34();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_34() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationByValuesUntyped(), JAVA_34_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_35_0_0_0 = INSTANCE.getJAVA_35_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_35_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("new", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_35_0_0_1 = INSTANCE.getJAVA_35_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_35_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationBySize().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_35_0_0_2_0_0_0 = INSTANCE.getJAVA_35_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_35_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("[", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_35_0_0_2_0_0_1 = INSTANCE.getJAVA_35_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_35_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationBySize().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__SIZES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_35_0_0_2_0_0_2 = INSTANCE.getJAVA_35_0_0_2_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_35_0_0_2_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("]", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_35_0_0_2_0_0 = INSTANCE.getJAVA_35_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_35_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_35_0_0_2_0_0_0, JAVA_35_0_0_2_0_0_1, JAVA_35_0_0_2_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_35_0_0_2_0 = INSTANCE.getJAVA_35_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_35_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_35_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_35_0_0_2 = INSTANCE.getJAVA_35_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_35_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_35_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.PLUS);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_35_0_0_3 = INSTANCE.getJAVA_35_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_35_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationBySize().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_35_0_0_4_0_0_0 = INSTANCE.getJAVA_35_0_0_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_35_0_0_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_35_0_0_4_0_0_1 = INSTANCE.getJAVA_35_0_0_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_35_0_0_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationBySize().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INSTANTIATION_BY_SIZE__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_35_0_0_4_0_0 = INSTANCE.getJAVA_35_0_0_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_35_0_0_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_35_0_0_4_0_0_0, JAVA_35_0_0_4_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_35_0_0_4_0 = INSTANCE.getJAVA_35_0_0_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_35_0_0_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_35_0_0_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_35_0_0_4 = INSTANCE.getJAVA_35_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_35_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_35_0_0_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_35_0_0 = INSTANCE.getJAVA_35_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_35_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_35_0_0_0, JAVA_35_0_0_1, JAVA_35_0_0_2, JAVA_35_0_0_3, JAVA_35_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_35_0 = INSTANCE.getJAVA_35_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_35_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_35_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_35 = INSTANCE.getJAVA_35();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_35() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInstantiationBySize(), JAVA_35_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_36_0_0_0 = INSTANCE.getJAVA_36_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_36_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_36_0_0_1 = INSTANCE.getJAVA_36_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_36_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_36_0_0_2_0_0_0 = INSTANCE.getJAVA_36_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_36_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INITIALIZER__INITIAL_VALUES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_36_0_0_2_0_0_1_0_0_0 = INSTANCE.getJAVA_36_0_0_2_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_36_0_0_2_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_36_0_0_2_0_0_1_0_0_1 = INSTANCE.getJAVA_36_0_0_2_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_36_0_0_2_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_INITIALIZER__INITIAL_VALUES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_36_0_0_2_0_0_1_0_0 = INSTANCE.getJAVA_36_0_0_2_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_36_0_0_2_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_36_0_0_2_0_0_1_0_0_0, JAVA_36_0_0_2_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_36_0_0_2_0_0_1_0 = INSTANCE.getJAVA_36_0_0_2_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_36_0_0_2_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_36_0_0_2_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_36_0_0_2_0_0_1 = INSTANCE.getJAVA_36_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_36_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_36_0_0_2_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_36_0_0_2_0_0 = INSTANCE.getJAVA_36_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_36_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_36_0_0_2_0_0_0, JAVA_36_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_36_0_0_2_0 = INSTANCE.getJAVA_36_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_36_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_36_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_36_0_0_2 = INSTANCE.getJAVA_36_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_36_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_36_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_36_0_0_3_0_0_0 = INSTANCE.getJAVA_36_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_36_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_36_0_0_3_0_0 = INSTANCE.getJAVA_36_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_36_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_36_0_0_3_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_36_0_0_3_0 = INSTANCE.getJAVA_36_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_36_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_36_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_36_0_0_3 = INSTANCE.getJAVA_36_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_36_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_36_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_36_0_0_4 = INSTANCE.getJAVA_36_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_36_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_36_0_0 = INSTANCE.getJAVA_36_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_36_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_36_0_0_0, JAVA_36_0_0_1, JAVA_36_0_0_2, JAVA_36_0_0_3, JAVA_36_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_36_0 = INSTANCE.getJAVA_36_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_36_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_36_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_36 = INSTANCE.getJAVA_36();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_36() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayInitializer(), JAVA_36_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_37_0_0_0 = INSTANCE.getJAVA_37_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_37_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("[", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_37_0_0_1 = INSTANCE.getJAVA_37_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_37_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector().getEStructuralFeature(org.emftext.language.java.arrays.ArraysPackage.ARRAY_SELECTOR__POSITION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_37_0_0_2 = INSTANCE.getJAVA_37_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_37_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("]", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_37_0_0 = INSTANCE.getJAVA_37_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_37_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_37_0_0_0, JAVA_37_0_0_1, JAVA_37_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_37_0 = INSTANCE.getJAVA_37_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_37_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_37_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_37 = INSTANCE.getJAVA_37();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_37() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), JAVA_37_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_38_0_0_0_0_0_0 = INSTANCE.getJAVA_38_0_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_38_0_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__NAMESPACES), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_38_0_0_0_0_0_1 = INSTANCE.getJAVA_38_0_0_0_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_38_0_0_0_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_38_0_0_0_0_0 = INSTANCE.getJAVA_38_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_38_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_38_0_0_0_0_0_0, JAVA_38_0_0_0_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_38_0_0_0_0 = INSTANCE.getJAVA_38_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_38_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_38_0_0_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_38_0_0_0 = INSTANCE.getJAVA_38_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_38_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_38_0_0_0_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_38_0_0_1_0_0_0 = INSTANCE.getJAVA_38_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_38_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference(), }, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_38_0_0_1_0_0_1 = INSTANCE.getJAVA_38_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_38_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_38_0_0_1_0_0 = INSTANCE.getJAVA_38_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_38_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_38_0_0_1_0_0_0, JAVA_38_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_38_0_0_1_0 = INSTANCE.getJAVA_38_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_38_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_38_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_38_0_0_1 = INSTANCE.getJAVA_38_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_38_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_38_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_38_0_0_2 = INSTANCE.getJAVA_38_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_38_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.NAMESPACE_CLASSIFIER_REFERENCE__CLASSIFIER_REFERENCES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_38_0_0 = INSTANCE.getJAVA_38_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_38_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_38_0_0_0, JAVA_38_0_0_1, JAVA_38_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_38_0 = INSTANCE.getJAVA_38_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_38_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_38_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_38 = INSTANCE.getJAVA_38();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_38() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getNamespaceClassifierReference(), JAVA_38_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_39_0_0_0 = INSTANCE.getJAVA_39_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_39_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.CLASSIFIER_REFERENCE__TARGET), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_39_0_0_1_0_0_0 = INSTANCE.getJAVA_39_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_39_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_39_0_0_1_0_0_1 = INSTANCE.getJAVA_39_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_39_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_39_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_39_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_39_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_39_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_39_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_39_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference().getEStructuralFeature(org.emftext.language.java.types.TypesPackage.CLASSIFIER_REFERENCE__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_39_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_39_0_0_1_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_39_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_39_0_0_1_0_0_2_0_0_0, JAVA_39_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_39_0_0_1_0_0_2_0 = INSTANCE.getJAVA_39_0_0_1_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_39_0_0_1_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_39_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_39_0_0_1_0_0_2 = INSTANCE.getJAVA_39_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_39_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_39_0_0_1_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_39_0_0_1_0_0_3 = INSTANCE.getJAVA_39_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_39_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_39_0_0_1_0_0 = INSTANCE.getJAVA_39_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_39_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_39_0_0_1_0_0_0, JAVA_39_0_0_1_0_0_1, JAVA_39_0_0_1_0_0_2, JAVA_39_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_39_0_0_1_0 = INSTANCE.getJAVA_39_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_39_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_39_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_39_0_0_1 = INSTANCE.getJAVA_39_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_39_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_39_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_39_0_0 = INSTANCE.getJAVA_39_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_39_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_39_0_0_0, JAVA_39_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_39_0 = INSTANCE.getJAVA_39_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_39_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_39_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_39 = INSTANCE.getJAVA_39();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_39() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getClassifierReference(), JAVA_39_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_40_0_0_0_0_0_0 = INSTANCE.getJAVA_40_0_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_40_0_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_40_0_0_0_0_0_1 = INSTANCE.getJAVA_40_0_0_0_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_40_0_0_0_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_40_0_0_0_0_0_2_0_0_0 = INSTANCE.getJAVA_40_0_0_0_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_40_0_0_0_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_40_0_0_0_0_0_2_0_0_1 = INSTANCE.getJAVA_40_0_0_0_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_40_0_0_0_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__CALL_TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_40_0_0_0_0_0_2_0_0 = INSTANCE.getJAVA_40_0_0_0_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_40_0_0_0_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_0_0_0_2_0_0_0, JAVA_40_0_0_0_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_40_0_0_0_0_0_2_0 = INSTANCE.getJAVA_40_0_0_0_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_40_0_0_0_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_0_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_40_0_0_0_0_0_2 = INSTANCE.getJAVA_40_0_0_0_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_40_0_0_0_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_40_0_0_0_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_40_0_0_0_0_0_3 = INSTANCE.getJAVA_40_0_0_0_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_40_0_0_0_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_40_0_0_0_0_0 = INSTANCE.getJAVA_40_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_40_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_0_0_0_0, JAVA_40_0_0_0_0_0_1, JAVA_40_0_0_0_0_0_2, JAVA_40_0_0_0_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_40_0_0_0_0 = INSTANCE.getJAVA_40_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_40_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_40_0_0_0 = INSTANCE.getJAVA_40_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_40_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_40_0_0_0_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_40_0_0_1 = INSTANCE.getJAVA_40_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_40_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__TARGET), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_40_0_0_2_0_0_0 = INSTANCE.getJAVA_40_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_40_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_40_0_0_2_0_0_1 = INSTANCE.getJAVA_40_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_40_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_40_0_0_2_0_0_2_0_0_0 = INSTANCE.getJAVA_40_0_0_2_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_40_0_0_2_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_40_0_0_2_0_0_2_0_0_1 = INSTANCE.getJAVA_40_0_0_2_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_40_0_0_2_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_40_0_0_2_0_0_2_0_0 = INSTANCE.getJAVA_40_0_0_2_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_40_0_0_2_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_2_0_0_2_0_0_0, JAVA_40_0_0_2_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_40_0_0_2_0_0_2_0 = INSTANCE.getJAVA_40_0_0_2_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_40_0_0_2_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_2_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_40_0_0_2_0_0_2 = INSTANCE.getJAVA_40_0_0_2_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_40_0_0_2_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_40_0_0_2_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_40_0_0_2_0_0_3 = INSTANCE.getJAVA_40_0_0_2_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_40_0_0_2_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_40_0_0_2_0_0 = INSTANCE.getJAVA_40_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_40_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_2_0_0_0, JAVA_40_0_0_2_0_0_1, JAVA_40_0_0_2_0_0_2, JAVA_40_0_0_2_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_40_0_0_2_0 = INSTANCE.getJAVA_40_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_40_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_40_0_0_2 = INSTANCE.getJAVA_40_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_40_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_40_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_40_0_0_3 = INSTANCE.getJAVA_40_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_40_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_40_0_0_4_0_0_0 = INSTANCE.getJAVA_40_0_0_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_40_0_0_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_40_0_0_4_0_0_1_0_0_0 = INSTANCE.getJAVA_40_0_0_4_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_40_0_0_4_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_40_0_0_4_0_0_1_0_0_1 = INSTANCE.getJAVA_40_0_0_4_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_40_0_0_4_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_40_0_0_4_0_0_1_0_0 = INSTANCE.getJAVA_40_0_0_4_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_40_0_0_4_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_4_0_0_1_0_0_0, JAVA_40_0_0_4_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_40_0_0_4_0_0_1_0 = INSTANCE.getJAVA_40_0_0_4_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_40_0_0_4_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_4_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_40_0_0_4_0_0_1 = INSTANCE.getJAVA_40_0_0_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_40_0_0_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_40_0_0_4_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_40_0_0_4_0_0 = INSTANCE.getJAVA_40_0_0_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_40_0_0_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_4_0_0_0, JAVA_40_0_0_4_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_40_0_0_4_0 = INSTANCE.getJAVA_40_0_0_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_40_0_0_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_40_0_0_4 = INSTANCE.getJAVA_40_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_40_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_40_0_0_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_40_0_0_5 = INSTANCE.getJAVA_40_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_40_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_40_0_0_6 = INSTANCE.getJAVA_40_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_40_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__ARRAY_SELECTORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_40_0_0_7_0_0_0 = INSTANCE.getJAVA_40_0_0_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_40_0_0_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_40_0_0_7_0_0_1 = INSTANCE.getJAVA_40_0_0_7_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_40_0_0_7_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.METHOD_CALL__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_40_0_0_7_0_0 = INSTANCE.getJAVA_40_0_0_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_40_0_0_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_7_0_0_0, JAVA_40_0_0_7_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_40_0_0_7_0 = INSTANCE.getJAVA_40_0_0_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_40_0_0_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_40_0_0_7 = INSTANCE.getJAVA_40_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_40_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_40_0_0_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_40_0_0 = INSTANCE.getJAVA_40_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_40_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0_0, JAVA_40_0_0_1, JAVA_40_0_0_2, JAVA_40_0_0_3, JAVA_40_0_0_4, JAVA_40_0_0_5, JAVA_40_0_0_6, JAVA_40_0_0_7);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_40_0 = INSTANCE.getJAVA_40_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_40_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_40_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_40 = INSTANCE.getJAVA_40();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_40() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getMethodCall(), JAVA_40_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_41_0_0_0 = INSTANCE.getJAVA_41_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_41_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.IDENTIFIER_REFERENCE__TARGET), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_41_0_0_1_0_0_0 = INSTANCE.getJAVA_41_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_41_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_41_0_0_1_0_0_1 = INSTANCE.getJAVA_41_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_41_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.IDENTIFIER_REFERENCE__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_41_0_0_1_0_0_2_0_0_0 = INSTANCE.getJAVA_41_0_0_1_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_41_0_0_1_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_41_0_0_1_0_0_2_0_0_1 = INSTANCE.getJAVA_41_0_0_1_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_41_0_0_1_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.IDENTIFIER_REFERENCE__TYPE_ARGUMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getTypeArgument(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_41_0_0_1_0_0_2_0_0 = INSTANCE.getJAVA_41_0_0_1_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_41_0_0_1_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_41_0_0_1_0_0_2_0_0_0, JAVA_41_0_0_1_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_41_0_0_1_0_0_2_0 = INSTANCE.getJAVA_41_0_0_1_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_41_0_0_1_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_41_0_0_1_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_41_0_0_1_0_0_2 = INSTANCE.getJAVA_41_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_41_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_41_0_0_1_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_41_0_0_1_0_0_3 = INSTANCE.getJAVA_41_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_41_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_41_0_0_1_0_0 = INSTANCE.getJAVA_41_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_41_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_41_0_0_1_0_0_0, JAVA_41_0_0_1_0_0_1, JAVA_41_0_0_1_0_0_2, JAVA_41_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_41_0_0_1_0 = INSTANCE.getJAVA_41_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_41_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_41_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_41_0_0_1 = INSTANCE.getJAVA_41_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_41_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_41_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_41_0_0_2 = INSTANCE.getJAVA_41_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_41_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.IDENTIFIER_REFERENCE__ARRAY_SELECTORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_41_0_0_3_0_0_0 = INSTANCE.getJAVA_41_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_41_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_41_0_0_3_0_0_1 = INSTANCE.getJAVA_41_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_41_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.IDENTIFIER_REFERENCE__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_41_0_0_3_0_0 = INSTANCE.getJAVA_41_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_41_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_41_0_0_3_0_0_0, JAVA_41_0_0_3_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_41_0_0_3_0 = INSTANCE.getJAVA_41_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_41_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_41_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_41_0_0_3 = INSTANCE.getJAVA_41_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_41_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_41_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_41_0_0 = INSTANCE.getJAVA_41_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_41_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_41_0_0_0, JAVA_41_0_0_1, JAVA_41_0_0_2, JAVA_41_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_41_0 = INSTANCE.getJAVA_41_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_41_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_41_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_41 = INSTANCE.getJAVA_41();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_41() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getIdentifierReference(), JAVA_41_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_42_0_0_0 = INSTANCE.getJAVA_42_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_42_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("class", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_42_0_0_1_0_0_0 = INSTANCE.getJAVA_42_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_42_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_42_0_0_1_0_0_1 = INSTANCE.getJAVA_42_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_42_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReflectiveClassReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.REFLECTIVE_CLASS_REFERENCE__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_42_0_0_1_0_0 = INSTANCE.getJAVA_42_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_42_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_42_0_0_1_0_0_0, JAVA_42_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_42_0_0_1_0 = INSTANCE.getJAVA_42_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_42_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_42_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_42_0_0_1 = INSTANCE.getJAVA_42_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_42_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_42_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_42_0_0 = INSTANCE.getJAVA_42_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_42_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_42_0_0_0, JAVA_42_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_42_0 = INSTANCE.getJAVA_42_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_42_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_42_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_42 = INSTANCE.getJAVA_42();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_42() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReflectiveClassReference(), JAVA_42_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_43_0_0_0 = INSTANCE.getJAVA_43_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_43_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getSelfReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.SELF_REFERENCE__SELF), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getSelf(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_43_0_0_1_0_0_0 = INSTANCE.getJAVA_43_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_43_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_43_0_0_1_0_0_1 = INSTANCE.getJAVA_43_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_43_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getSelfReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.SELF_REFERENCE__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_43_0_0_1_0_0 = INSTANCE.getJAVA_43_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_43_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_43_0_0_1_0_0_0, JAVA_43_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_43_0_0_1_0 = INSTANCE.getJAVA_43_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_43_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_43_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_43_0_0_1 = INSTANCE.getJAVA_43_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_43_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_43_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_43_0_0 = INSTANCE.getJAVA_43_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_43_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_43_0_0_0, JAVA_43_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_43_0 = INSTANCE.getJAVA_43_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_43_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_43_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_43 = INSTANCE.getJAVA_43();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_43() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getSelfReference(), JAVA_43_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_44_0_0_0 = INSTANCE.getJAVA_44_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_44_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getPrimitiveTypeReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__PRIMITIVE_TYPE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getPrimitiveType(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_44_0_0_1 = INSTANCE.getJAVA_44_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_44_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getPrimitiveTypeReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__ARRAY_SELECTORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_44_0_0_2_0_0_0 = INSTANCE.getJAVA_44_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_44_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_44_0_0_2_0_0_1 = INSTANCE.getJAVA_44_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_44_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getPrimitiveTypeReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.PRIMITIVE_TYPE_REFERENCE__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_44_0_0_2_0_0 = INSTANCE.getJAVA_44_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_44_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_44_0_0_2_0_0_0, JAVA_44_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_44_0_0_2_0 = INSTANCE.getJAVA_44_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_44_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_44_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_44_0_0_2 = INSTANCE.getJAVA_44_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_44_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_44_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_44_0_0 = INSTANCE.getJAVA_44_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_44_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_44_0_0_0, JAVA_44_0_0_1, JAVA_44_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_44_0 = INSTANCE.getJAVA_44_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_44_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_44_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_44 = INSTANCE.getJAVA_44();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_44() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getPrimitiveTypeReference(), JAVA_44_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_45_0_0_0 = INSTANCE.getJAVA_45_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_45_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("this", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_45_0_0 = INSTANCE.getJAVA_45_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_45_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_45_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_45_0 = INSTANCE.getJAVA_45_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_45_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_45_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_45 = INSTANCE.getJAVA_45();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_45() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getThis(), JAVA_45_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_46_0_0_0 = INSTANCE.getJAVA_46_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_46_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("super", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_46_0_0 = INSTANCE.getJAVA_46_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_46_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_46_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_46_0 = INSTANCE.getJAVA_46_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_46_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_46_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_46 = INSTANCE.getJAVA_46();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_46() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getSuper(), JAVA_46_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_47_0_0_0 = INSTANCE.getJAVA_47_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_47_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getStringReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.STRING_REFERENCE__VALUE), "STRING_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_47_0_0_1_0_0_0 = INSTANCE.getJAVA_47_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_47_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_47_0_0_1_0_0_1 = INSTANCE.getJAVA_47_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_47_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getStringReference().getEStructuralFeature(org.emftext.language.java.references.ReferencesPackage.STRING_REFERENCE__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_47_0_0_1_0_0 = INSTANCE.getJAVA_47_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_47_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_47_0_0_1_0_0_0, JAVA_47_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_47_0_0_1_0 = INSTANCE.getJAVA_47_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_47_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_47_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_47_0_0_1 = INSTANCE.getJAVA_47_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_47_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_47_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_47_0_0 = INSTANCE.getJAVA_47_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_47_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_47_0_0_0, JAVA_47_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_47_0 = INSTANCE.getJAVA_47_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_47_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_47_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_47 = INSTANCE.getJAVA_47();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_47() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getStringReference(), JAVA_47_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_48_0_0_0 = INSTANCE.getJAVA_48_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_48_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getQualifiedTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.QUALIFIED_TYPE_ARGUMENT__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_48_0_0_1 = INSTANCE.getJAVA_48_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_48_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getQualifiedTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.QUALIFIED_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_48_0_0 = INSTANCE.getJAVA_48_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_48_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_48_0_0_0, JAVA_48_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_48_0 = INSTANCE.getJAVA_48_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_48_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_48_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_48 = INSTANCE.getJAVA_48();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_48() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getQualifiedTypeArgument(), JAVA_48_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_49_0_0_0 = INSTANCE.getJAVA_49_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_49_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("?", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_49_0_0 = INSTANCE.getJAVA_49_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_49_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_49_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_49_0 = INSTANCE.getJAVA_49_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_49_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_49_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_49 = INSTANCE.getJAVA_49();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_49() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getUnknownTypeArgument(), JAVA_49_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_50_0_0_0 = INSTANCE.getJAVA_50_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_50_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("?", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_50_0_0_1 = INSTANCE.getJAVA_50_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_50_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("extends", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_50_0_0_2 = INSTANCE.getJAVA_50_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_50_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getExtendsTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_50_0_0_3_0_0_0 = INSTANCE.getJAVA_50_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_50_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("&", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_50_0_0_3_0_0_1 = INSTANCE.getJAVA_50_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_50_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getExtendsTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.EXTENDS_TYPE_ARGUMENT__EXTEND_TYPES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_50_0_0_3_0_0 = INSTANCE.getJAVA_50_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_50_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_50_0_0_3_0_0_0, JAVA_50_0_0_3_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_50_0_0_3_0 = INSTANCE.getJAVA_50_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_50_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_50_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_50_0_0_3 = INSTANCE.getJAVA_50_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_50_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_50_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_50_0_0_4 = INSTANCE.getJAVA_50_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_50_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getExtendsTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.EXTENDS_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_50_0_0 = INSTANCE.getJAVA_50_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_50_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_50_0_0_0, JAVA_50_0_0_1, JAVA_50_0_0_2, JAVA_50_0_0_3, JAVA_50_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_50_0 = INSTANCE.getJAVA_50_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_50_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_50_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_50 = INSTANCE.getJAVA_50();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_50() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getExtendsTypeArgument(), JAVA_50_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_51_0_0_0 = INSTANCE.getJAVA_51_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_51_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("?", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_51_0_0_1 = INSTANCE.getJAVA_51_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_51_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("super", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_51_0_0_2 = INSTANCE.getJAVA_51_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_51_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getSuperTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.SUPER_TYPE_ARGUMENT__SUPER_TYPE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_51_0_0_3 = INSTANCE.getJAVA_51_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_51_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getSuperTypeArgument().getEStructuralFeature(org.emftext.language.java.generics.GenericsPackage.SUPER_TYPE_ARGUMENT__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_51_0_0 = INSTANCE.getJAVA_51_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_51_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_51_0_0_0, JAVA_51_0_0_1, JAVA_51_0_0_2, JAVA_51_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_51_0 = INSTANCE.getJAVA_51_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_51_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_51_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_51 = INSTANCE.getJAVA_51();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_51() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.generics.GenericsPackage.eINSTANCE.getSuperTypeArgument(), JAVA_51_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_52_0_0_0 = INSTANCE.getJAVA_52_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_52_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("assert", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_52_0_0_1 = INSTANCE.getJAVA_52_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_52_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getAssert().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.ASSERT__CONDITION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_52_0_0_2_0_0_0 = INSTANCE.getJAVA_52_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_52_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(":", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_52_0_0_2_0_0_1 = INSTANCE.getJAVA_52_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_52_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getAssert().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.ASSERT__ERROR_MESSAGE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_52_0_0_2_0_0 = INSTANCE.getJAVA_52_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_52_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_52_0_0_2_0_0_0, JAVA_52_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_52_0_0_2_0 = INSTANCE.getJAVA_52_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_52_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_52_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_52_0_0_2 = INSTANCE.getJAVA_52_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_52_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_52_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_52_0_0_3 = INSTANCE.getJAVA_52_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_52_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_52_0_0 = INSTANCE.getJAVA_52_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_52_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_52_0_0_0, JAVA_52_0_0_1, JAVA_52_0_0_2, JAVA_52_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_52_0 = INSTANCE.getJAVA_52_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_52_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_52_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_52 = INSTANCE.getJAVA_52();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_52() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getAssert(), JAVA_52_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_53_0_0_0 = INSTANCE.getJAVA_53_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_53_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("if", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_53_0_0_1 = INSTANCE.getJAVA_53_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_53_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_53_0_0_2 = INSTANCE.getJAVA_53_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_53_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_53_0_0_3 = INSTANCE.getJAVA_53_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_53_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCondition().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CONDITION__CONDITION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_53_0_0_4 = INSTANCE.getJAVA_53_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_53_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_53_0_0_5 = INSTANCE.getJAVA_53_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_53_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCondition().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CONDITION__STATEMENT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_53_0_0_6_0_0_0 = INSTANCE.getJAVA_53_0_0_6_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_53_0_0_6_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("else", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_53_0_0_6_0_0_1 = INSTANCE.getJAVA_53_0_0_6_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_53_0_0_6_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCondition().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CONDITION__ELSE_STATEMENT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_53_0_0_6_0_0 = INSTANCE.getJAVA_53_0_0_6_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_53_0_0_6_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_53_0_0_6_0_0_0, JAVA_53_0_0_6_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_53_0_0_6_0 = INSTANCE.getJAVA_53_0_0_6_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_53_0_0_6_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_53_0_0_6_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_53_0_0_6 = INSTANCE.getJAVA_53_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_53_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_53_0_0_6_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_53_0_0 = INSTANCE.getJAVA_53_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_53_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_53_0_0_0, JAVA_53_0_0_1, JAVA_53_0_0_2, JAVA_53_0_0_3, JAVA_53_0_0_4, JAVA_53_0_0_5, JAVA_53_0_0_6);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_53_0 = INSTANCE.getJAVA_53_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_53_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_53_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_53 = INSTANCE.getJAVA_53();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_53() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCondition(), JAVA_53_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_54_0_0_0 = INSTANCE.getJAVA_54_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_54_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("for", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_54_0_0_1 = INSTANCE.getJAVA_54_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_54_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_54_0_0_2 = INSTANCE.getJAVA_54_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_54_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_54_0_0_3 = INSTANCE.getJAVA_54_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_54_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_LOOP__INIT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoopInitializer(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_54_0_0_4 = INSTANCE.getJAVA_54_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_54_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_54_0_0_5 = INSTANCE.getJAVA_54_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_54_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_LOOP__CONDITION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_54_0_0_6 = INSTANCE.getJAVA_54_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_54_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_54_0_0_7_0_0_0 = INSTANCE.getJAVA_54_0_0_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_54_0_0_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_LOOP__UPDATES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_54_0_0_7_0_0_1_0_0_0 = INSTANCE.getJAVA_54_0_0_7_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_54_0_0_7_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_54_0_0_7_0_0_1_0_0_1 = INSTANCE.getJAVA_54_0_0_7_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_54_0_0_7_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_LOOP__UPDATES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_54_0_0_7_0_0_1_0_0 = INSTANCE.getJAVA_54_0_0_7_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_54_0_0_7_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_54_0_0_7_0_0_1_0_0_0, JAVA_54_0_0_7_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_54_0_0_7_0_0_1_0 = INSTANCE.getJAVA_54_0_0_7_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_54_0_0_7_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_54_0_0_7_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_54_0_0_7_0_0_1 = INSTANCE.getJAVA_54_0_0_7_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_54_0_0_7_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_54_0_0_7_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_54_0_0_7_0_0 = INSTANCE.getJAVA_54_0_0_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_54_0_0_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_54_0_0_7_0_0_0, JAVA_54_0_0_7_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_54_0_0_7_0 = INSTANCE.getJAVA_54_0_0_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_54_0_0_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_54_0_0_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_54_0_0_7 = INSTANCE.getJAVA_54_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_54_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_54_0_0_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_54_0_0_8 = INSTANCE.getJAVA_54_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_54_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_54_0_0_9 = INSTANCE.getJAVA_54_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_54_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_LOOP__STATEMENT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_54_0_0 = INSTANCE.getJAVA_54_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_54_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_54_0_0_0, JAVA_54_0_0_1, JAVA_54_0_0_2, JAVA_54_0_0_3, JAVA_54_0_0_4, JAVA_54_0_0_5, JAVA_54_0_0_6, JAVA_54_0_0_7, JAVA_54_0_0_8, JAVA_54_0_0_9);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_54_0 = INSTANCE.getJAVA_54_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_54_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_54_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_54 = INSTANCE.getJAVA_54();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_54() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForLoop(), JAVA_54_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_55_0_0_0 = INSTANCE.getJAVA_55_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_55_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("for", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_55_0_0_1 = INSTANCE.getJAVA_55_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_55_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_55_0_0_2 = INSTANCE.getJAVA_55_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_55_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_55_0_0_3 = INSTANCE.getJAVA_55_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_55_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForEachLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_EACH_LOOP__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_55_0_0_4 = INSTANCE.getJAVA_55_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_55_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(":", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_55_0_0_5 = INSTANCE.getJAVA_55_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_55_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForEachLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_EACH_LOOP__COLLECTION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_55_0_0_6 = INSTANCE.getJAVA_55_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_55_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_55_0_0_7 = INSTANCE.getJAVA_55_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_55_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForEachLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.FOR_EACH_LOOP__STATEMENT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_55_0_0 = INSTANCE.getJAVA_55_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_55_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_55_0_0_0, JAVA_55_0_0_1, JAVA_55_0_0_2, JAVA_55_0_0_3, JAVA_55_0_0_4, JAVA_55_0_0_5, JAVA_55_0_0_6, JAVA_55_0_0_7);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_55_0 = INSTANCE.getJAVA_55_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_55_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_55_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_55 = INSTANCE.getJAVA_55();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_55() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getForEachLoop(), JAVA_55_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_56_0_0_0 = INSTANCE.getJAVA_56_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_56_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("while", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_56_0_0_1 = INSTANCE.getJAVA_56_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_56_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_56_0_0_2 = INSTANCE.getJAVA_56_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_56_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_56_0_0_3 = INSTANCE.getJAVA_56_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_56_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getWhileLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.WHILE_LOOP__CONDITION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_56_0_0_4 = INSTANCE.getJAVA_56_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_56_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_56_0_0_5 = INSTANCE.getJAVA_56_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_56_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getWhileLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.WHILE_LOOP__STATEMENT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_56_0_0 = INSTANCE.getJAVA_56_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_56_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_56_0_0_0, JAVA_56_0_0_1, JAVA_56_0_0_2, JAVA_56_0_0_3, JAVA_56_0_0_4, JAVA_56_0_0_5);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_56_0 = INSTANCE.getJAVA_56_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_56_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_56_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_56 = INSTANCE.getJAVA_56();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_56() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getWhileLoop(), JAVA_56_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_57_0_0_0 = INSTANCE.getJAVA_57_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_57_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("do", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_57_0_0_1 = INSTANCE.getJAVA_57_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_57_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDoWhileLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.DO_WHILE_LOOP__STATEMENT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_57_0_0_2 = INSTANCE.getJAVA_57_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_57_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("while", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_57_0_0_3 = INSTANCE.getJAVA_57_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_57_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_57_0_0_4 = INSTANCE.getJAVA_57_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_57_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_57_0_0_5 = INSTANCE.getJAVA_57_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_57_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDoWhileLoop().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.DO_WHILE_LOOP__CONDITION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_57_0_0_6 = INSTANCE.getJAVA_57_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_57_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_57_0_0_7 = INSTANCE.getJAVA_57_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_57_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_57_0_0 = INSTANCE.getJAVA_57_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_57_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_57_0_0_0, JAVA_57_0_0_1, JAVA_57_0_0_2, JAVA_57_0_0_3, JAVA_57_0_0_4, JAVA_57_0_0_5, JAVA_57_0_0_6, JAVA_57_0_0_7);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_57_0 = INSTANCE.getJAVA_57_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_57_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_57_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_57 = INSTANCE.getJAVA_57();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_57() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDoWhileLoop(), JAVA_57_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_58_0_0_0 = INSTANCE.getJAVA_58_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_58_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_58_0_0 = INSTANCE.getJAVA_58_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_58_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_58_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_58_0 = INSTANCE.getJAVA_58_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_58_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_58_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_58 = INSTANCE.getJAVA_58();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_58() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getEmptyStatement(), JAVA_58_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_59_0_0_0 = INSTANCE.getJAVA_59_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_59_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("synchronized", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_59_0_0_1 = INSTANCE.getJAVA_59_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_59_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_59_0_0_2 = INSTANCE.getJAVA_59_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_59_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_59_0_0_3 = INSTANCE.getJAVA_59_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_59_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSynchronizedBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.SYNCHRONIZED_BLOCK__LOCK_PROVIDER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_59_0_0_4 = INSTANCE.getJAVA_59_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_59_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_59_0_0_5 = INSTANCE.getJAVA_59_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_59_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_59_0_0_6 = INSTANCE.getJAVA_59_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_59_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_59_0_0_7_0_0_0 = INSTANCE.getJAVA_59_0_0_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_59_0_0_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_59_0_0_7_0_0_1 = INSTANCE.getJAVA_59_0_0_7_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_59_0_0_7_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSynchronizedBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.SYNCHRONIZED_BLOCK__STATEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_59_0_0_7_0_0 = INSTANCE.getJAVA_59_0_0_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_59_0_0_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_59_0_0_7_0_0_0, JAVA_59_0_0_7_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_59_0_0_7_0 = INSTANCE.getJAVA_59_0_0_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_59_0_0_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_59_0_0_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_59_0_0_7 = INSTANCE.getJAVA_59_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_59_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_59_0_0_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_59_0_0_8 = INSTANCE.getJAVA_59_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_59_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_59_0_0_9 = INSTANCE.getJAVA_59_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_59_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_59_0_0 = INSTANCE.getJAVA_59_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_59_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_59_0_0_0, JAVA_59_0_0_1, JAVA_59_0_0_2, JAVA_59_0_0_3, JAVA_59_0_0_4, JAVA_59_0_0_5, JAVA_59_0_0_6, JAVA_59_0_0_7, JAVA_59_0_0_8, JAVA_59_0_0_9);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_59_0 = INSTANCE.getJAVA_59_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_59_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_59_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_59 = INSTANCE.getJAVA_59();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_59() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSynchronizedBlock(), JAVA_59_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_60_0_0_0 = INSTANCE.getJAVA_60_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_60_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("try", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_60_0_0_1 = INSTANCE.getJAVA_60_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_60_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_60_0_0_2 = INSTANCE.getJAVA_60_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_60_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_60_0_0_3_0_0_0 = INSTANCE.getJAVA_60_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_60_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_60_0_0_3_0_0_1 = INSTANCE.getJAVA_60_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_60_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getTryBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.TRY_BLOCK__STATEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_60_0_0_3_0_0 = INSTANCE.getJAVA_60_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_60_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_60_0_0_3_0_0_0, JAVA_60_0_0_3_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_60_0_0_3_0 = INSTANCE.getJAVA_60_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_60_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_60_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_60_0_0_3 = INSTANCE.getJAVA_60_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_60_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_60_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_60_0_0_4 = INSTANCE.getJAVA_60_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_60_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_60_0_0_5 = INSTANCE.getJAVA_60_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_60_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_60_0_0_6 = INSTANCE.getJAVA_60_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_60_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getTryBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.TRY_BLOCK__CATCHE_BLOCKS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCatchBlock(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_60_0_0_7_0_0_0 = INSTANCE.getJAVA_60_0_0_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_60_0_0_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("finally", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_60_0_0_7_0_0_1 = INSTANCE.getJAVA_60_0_0_7_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_60_0_0_7_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getTryBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.TRY_BLOCK__FINALLY_BLOCK), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBlock(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_60_0_0_7_0_0 = INSTANCE.getJAVA_60_0_0_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_60_0_0_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_60_0_0_7_0_0_0, JAVA_60_0_0_7_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_60_0_0_7_0 = INSTANCE.getJAVA_60_0_0_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_60_0_0_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_60_0_0_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_60_0_0_7 = INSTANCE.getJAVA_60_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_60_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_60_0_0_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_60_0_0 = INSTANCE.getJAVA_60_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_60_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_60_0_0_0, JAVA_60_0_0_1, JAVA_60_0_0_2, JAVA_60_0_0_3, JAVA_60_0_0_4, JAVA_60_0_0_5, JAVA_60_0_0_6, JAVA_60_0_0_7);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_60_0 = INSTANCE.getJAVA_60_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_60_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_60_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_60 = INSTANCE.getJAVA_60();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_60() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getTryBlock(), JAVA_60_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_61_0_0_0 = INSTANCE.getJAVA_61_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_61_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("catch", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_61_0_0_1 = INSTANCE.getJAVA_61_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_61_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_61_0_0_2 = INSTANCE.getJAVA_61_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_61_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_61_0_0_3 = INSTANCE.getJAVA_61_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_61_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCatchBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CATCH_BLOCK__PARAMETER), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.parameters.ParametersPackage.eINSTANCE.getOrdinaryParameter(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_61_0_0_4 = INSTANCE.getJAVA_61_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_61_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_61_0_0_5 = INSTANCE.getJAVA_61_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_61_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_61_0_0_6 = INSTANCE.getJAVA_61_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_61_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_61_0_0_7_0_0_0 = INSTANCE.getJAVA_61_0_0_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_61_0_0_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_61_0_0_7_0_0_1 = INSTANCE.getJAVA_61_0_0_7_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_61_0_0_7_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCatchBlock().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CATCH_BLOCK__STATEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_61_0_0_7_0_0 = INSTANCE.getJAVA_61_0_0_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_61_0_0_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_61_0_0_7_0_0_0, JAVA_61_0_0_7_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_61_0_0_7_0 = INSTANCE.getJAVA_61_0_0_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_61_0_0_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_61_0_0_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_61_0_0_7 = INSTANCE.getJAVA_61_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_61_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_61_0_0_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_61_0_0_8 = INSTANCE.getJAVA_61_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_61_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_61_0_0_9 = INSTANCE.getJAVA_61_0_0_9();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_61_0_0_9() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_61_0_0 = INSTANCE.getJAVA_61_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_61_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_61_0_0_0, JAVA_61_0_0_1, JAVA_61_0_0_2, JAVA_61_0_0_3, JAVA_61_0_0_4, JAVA_61_0_0_5, JAVA_61_0_0_6, JAVA_61_0_0_7, JAVA_61_0_0_8, JAVA_61_0_0_9);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_61_0 = INSTANCE.getJAVA_61_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_61_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_61_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_61 = INSTANCE.getJAVA_61();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_61() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getCatchBlock(), JAVA_61_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_62_0_0_0 = INSTANCE.getJAVA_62_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_62_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("switch", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_62_0_0_1 = INSTANCE.getJAVA_62_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_62_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_62_0_0_2 = INSTANCE.getJAVA_62_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_62_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_62_0_0_3 = INSTANCE.getJAVA_62_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_62_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSwitch().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.SWITCH__VARIABLE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_62_0_0_4 = INSTANCE.getJAVA_62_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_62_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_62_0_0_5 = INSTANCE.getJAVA_62_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_62_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_62_0_0_6 = INSTANCE.getJAVA_62_0_0_6();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_62_0_0_6() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("{", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_62_0_0_7_0_0_0 = INSTANCE.getJAVA_62_0_0_7_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_62_0_0_7_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSwitch().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.SWITCH__CASES), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSwitchCase(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_62_0_0_7_0_0 = INSTANCE.getJAVA_62_0_0_7_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_62_0_0_7_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_62_0_0_7_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_62_0_0_7_0 = INSTANCE.getJAVA_62_0_0_7_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_62_0_0_7_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_62_0_0_7_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_62_0_0_7 = INSTANCE.getJAVA_62_0_0_7();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_62_0_0_7() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_62_0_0_7_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_62_0_0_8 = INSTANCE.getJAVA_62_0_0_8();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_62_0_0_8() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("}", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_62_0_0 = INSTANCE.getJAVA_62_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_62_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_62_0_0_0, JAVA_62_0_0_1, JAVA_62_0_0_2, JAVA_62_0_0_3, JAVA_62_0_0_4, JAVA_62_0_0_5, JAVA_62_0_0_6, JAVA_62_0_0_7, JAVA_62_0_0_8);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_62_0 = INSTANCE.getJAVA_62_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_62_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_62_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_62 = INSTANCE.getJAVA_62();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_62() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getSwitch(), JAVA_62_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_63_0_0_0 = INSTANCE.getJAVA_63_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_63_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("case", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_63_0_0_1 = INSTANCE.getJAVA_63_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_63_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getNormalSwitchCase().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.NORMAL_SWITCH_CASE__CONDITION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_63_0_0_2 = INSTANCE.getJAVA_63_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_63_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(":", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_63_0_0_3_0_0_0 = INSTANCE.getJAVA_63_0_0_3_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_63_0_0_3_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_63_0_0_3_0_0_1 = INSTANCE.getJAVA_63_0_0_3_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_63_0_0_3_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getNormalSwitchCase().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.NORMAL_SWITCH_CASE__STATEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_63_0_0_3_0_0 = INSTANCE.getJAVA_63_0_0_3_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_63_0_0_3_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_63_0_0_3_0_0_0, JAVA_63_0_0_3_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_63_0_0_3_0 = INSTANCE.getJAVA_63_0_0_3_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_63_0_0_3_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_63_0_0_3_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_63_0_0_3 = INSTANCE.getJAVA_63_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_63_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_63_0_0_3_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_63_0_0_4 = INSTANCE.getJAVA_63_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_63_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_63_0_0 = INSTANCE.getJAVA_63_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_63_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_63_0_0_0, JAVA_63_0_0_1, JAVA_63_0_0_2, JAVA_63_0_0_3, JAVA_63_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_63_0 = INSTANCE.getJAVA_63_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_63_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_63_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_63 = INSTANCE.getJAVA_63();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_63() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getNormalSwitchCase(), JAVA_63_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_64_0_0_0 = INSTANCE.getJAVA_64_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_64_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("default", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_64_0_0_1 = INSTANCE.getJAVA_64_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_64_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(":", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_64_0_0_2_0_0_0 = INSTANCE.getJAVA_64_0_0_2_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_64_0_0_2_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_64_0_0_2_0_0_1 = INSTANCE.getJAVA_64_0_0_2_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_64_0_0_2_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDefaultSwitchCase().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.DEFAULT_SWITCH_CASE__STATEMENTS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_64_0_0_2_0_0 = INSTANCE.getJAVA_64_0_0_2_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_64_0_0_2_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_64_0_0_2_0_0_0, JAVA_64_0_0_2_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_64_0_0_2_0 = INSTANCE.getJAVA_64_0_0_2_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_64_0_0_2_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_64_0_0_2_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_64_0_0_2 = INSTANCE.getJAVA_64_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_64_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_64_0_0_2_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak JAVA_64_0_0_3 = INSTANCE.getJAVA_64_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak getJAVA_64_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_64_0_0 = INSTANCE.getJAVA_64_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_64_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_64_0_0_0, JAVA_64_0_0_1, JAVA_64_0_0_2, JAVA_64_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_64_0 = INSTANCE.getJAVA_64_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_64_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_64_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_64 = INSTANCE.getJAVA_64();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_64() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getDefaultSwitchCase(), JAVA_64_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_65_0_0_0 = INSTANCE.getJAVA_65_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_65_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("return", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_65_0_0_1 = INSTANCE.getJAVA_65_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_65_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getReturn().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.RETURN__RETURN_VALUE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_65_0_0_2 = INSTANCE.getJAVA_65_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_65_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_65_0_0 = INSTANCE.getJAVA_65_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_65_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_65_0_0_0, JAVA_65_0_0_1, JAVA_65_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_65_0 = INSTANCE.getJAVA_65_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_65_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_65_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_65 = INSTANCE.getJAVA_65();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_65() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getReturn(), JAVA_65_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_66_0_0_0 = INSTANCE.getJAVA_66_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_66_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("throw", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_66_0_0_1 = INSTANCE.getJAVA_66_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_66_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getThrow().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.THROW__THROWABLE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_66_0_0_2 = INSTANCE.getJAVA_66_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_66_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_66_0_0 = INSTANCE.getJAVA_66_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_66_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_66_0_0_0, JAVA_66_0_0_1, JAVA_66_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_66_0 = INSTANCE.getJAVA_66_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_66_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_66_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_66 = INSTANCE.getJAVA_66();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_66() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getThrow(), JAVA_66_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_67_0_0_0 = INSTANCE.getJAVA_67_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_67_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("break", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_67_0_0_1_0_0_0 = INSTANCE.getJAVA_67_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_67_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBreak().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.BREAK__TARGET), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_67_0_0_1_0_0 = INSTANCE.getJAVA_67_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_67_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_67_0_0_1_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_67_0_0_1_0 = INSTANCE.getJAVA_67_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_67_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_67_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_67_0_0_1 = INSTANCE.getJAVA_67_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_67_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_67_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_67_0_0_2 = INSTANCE.getJAVA_67_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_67_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_67_0_0 = INSTANCE.getJAVA_67_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_67_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_67_0_0_0, JAVA_67_0_0_1, JAVA_67_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_67_0 = INSTANCE.getJAVA_67_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_67_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_67_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_67 = INSTANCE.getJAVA_67();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_67() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getBreak(), JAVA_67_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_68_0_0_0 = INSTANCE.getJAVA_68_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_68_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("continue", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_68_0_0_1_0_0_0 = INSTANCE.getJAVA_68_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_68_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getContinue().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.CONTINUE__TARGET), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_68_0_0_1_0_0 = INSTANCE.getJAVA_68_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_68_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_68_0_0_1_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_68_0_0_1_0 = INSTANCE.getJAVA_68_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_68_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_68_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_68_0_0_1 = INSTANCE.getJAVA_68_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_68_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_68_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_68_0_0_2 = INSTANCE.getJAVA_68_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_68_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_68_0_0 = INSTANCE.getJAVA_68_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_68_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_68_0_0_0, JAVA_68_0_0_1, JAVA_68_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_68_0 = INSTANCE.getJAVA_68_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_68_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_68_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_68 = INSTANCE.getJAVA_68();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_68() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getContinue(), JAVA_68_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_69_0_0_0 = INSTANCE.getJAVA_69_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_69_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJumpLabel().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.JUMP_LABEL__NAME), "IDENTIFIER", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_69_0_0_1 = INSTANCE.getJAVA_69_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_69_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(":", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_69_0_0_2 = INSTANCE.getJAVA_69_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_69_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJumpLabel().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.JUMP_LABEL__STATEMENT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getStatement(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_69_0_0 = INSTANCE.getJAVA_69_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_69_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_69_0_0_0, JAVA_69_0_0_1, JAVA_69_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_69_0 = INSTANCE.getJAVA_69_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_69_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_69_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_69 = INSTANCE.getJAVA_69();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_69() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getJumpLabel(), JAVA_69_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_70_0_0_0 = INSTANCE.getJAVA_70_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_70_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getExpressionStatement().getEStructuralFeature(org.emftext.language.java.statements.StatementsPackage.EXPRESSION_STATEMENT__EXPRESSION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_70_0_0_1 = INSTANCE.getJAVA_70_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_70_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(";", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_70_0_0 = INSTANCE.getJAVA_70_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_70_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_70_0_0_0, JAVA_70_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_70_0 = INSTANCE.getJAVA_70_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_70_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_70_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_70 = INSTANCE.getJAVA_70();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_70() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.statements.StatementsPackage.eINSTANCE.getExpressionStatement(), JAVA_70_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_71_0_0_0 = INSTANCE.getJAVA_71_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_71_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExpressionList().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EXPRESSION_LIST__EXPRESSIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_71_0_0_1_0_0_0 = INSTANCE.getJAVA_71_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_71_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(",", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_71_0_0_1_0_0_1 = INSTANCE.getJAVA_71_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_71_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExpressionList().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EXPRESSION_LIST__EXPRESSIONS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_71_0_0_1_0_0 = INSTANCE.getJAVA_71_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_71_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_71_0_0_1_0_0_0, JAVA_71_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_71_0_0_1_0 = INSTANCE.getJAVA_71_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_71_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_71_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_71_0_0_1 = INSTANCE.getJAVA_71_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_71_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_71_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_71_0_0 = INSTANCE.getJAVA_71_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_71_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_71_0_0_0, JAVA_71_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_71_0 = INSTANCE.getJAVA_71_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_71_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_71_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_71 = INSTANCE.getJAVA_71();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_71() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExpressionList(), JAVA_71_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_72_0_0_0 = INSTANCE.getJAVA_72_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_72_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ASSIGNMENT_EXPRESSION__CHILD), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_72_0_0_1_0_0_0 = INSTANCE.getJAVA_72_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_72_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_72_0_0_1_0_0_1 = INSTANCE.getJAVA_72_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_72_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_72_0_0_1_0_0_2 = INSTANCE.getJAVA_72_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_72_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_72_0_0_1_0_0_3 = INSTANCE.getJAVA_72_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_72_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ASSIGNMENT_EXPRESSION__VALUE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_72_0_0_1_0_0 = INSTANCE.getJAVA_72_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_72_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_72_0_0_1_0_0_0, JAVA_72_0_0_1_0_0_1, JAVA_72_0_0_1_0_0_2, JAVA_72_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_72_0_0_1_0 = INSTANCE.getJAVA_72_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_72_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_72_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_72_0_0_1 = INSTANCE.getJAVA_72_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_72_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_72_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_72_0_0 = INSTANCE.getJAVA_72_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_72_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_72_0_0_0, JAVA_72_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_72_0 = INSTANCE.getJAVA_72_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_72_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_72_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_72 = INSTANCE.getJAVA_72();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_72() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), JAVA_72_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_73_0_0_0 = INSTANCE.getJAVA_73_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_73_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_EXPRESSION__CHILD), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalOrExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_73_0_0_1_0_0_0 = INSTANCE.getJAVA_73_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_73_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("?", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_73_0_0_1_0_0_1 = INSTANCE.getJAVA_73_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_73_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_IF), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_73_0_0_1_0_0_2 = INSTANCE.getJAVA_73_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_73_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(":", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_73_0_0_1_0_0_3 = INSTANCE.getJAVA_73_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_73_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_EXPRESSION__EXPRESSION_ELSE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_73_0_0_1_0_0 = INSTANCE.getJAVA_73_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_73_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_73_0_0_1_0_0_0, JAVA_73_0_0_1_0_0_1, JAVA_73_0_0_1_0_0_2, JAVA_73_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_73_0_0_1_0 = INSTANCE.getJAVA_73_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_73_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_73_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_73_0_0_1 = INSTANCE.getJAVA_73_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_73_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_73_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_73_0_0 = INSTANCE.getJAVA_73_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_73_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_73_0_0_0, JAVA_73_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_73_0 = INSTANCE.getJAVA_73_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_73_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_73_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_73 = INSTANCE.getJAVA_73();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_73() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalExpression(), JAVA_73_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_74_0_0_0 = INSTANCE.getJAVA_74_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_74_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_74_0_0_1_0_0_0 = INSTANCE.getJAVA_74_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_74_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("||", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_74_0_0_1_0_0_1 = INSTANCE.getJAVA_74_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_74_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_OR_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_74_0_0_1_0_0 = INSTANCE.getJAVA_74_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_74_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_74_0_0_1_0_0_0, JAVA_74_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_74_0_0_1_0 = INSTANCE.getJAVA_74_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_74_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_74_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_74_0_0_1 = INSTANCE.getJAVA_74_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_74_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_74_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_74_0_0 = INSTANCE.getJAVA_74_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_74_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_74_0_0_0, JAVA_74_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_74_0 = INSTANCE.getJAVA_74_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_74_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_74_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_74 = INSTANCE.getJAVA_74();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_74() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalOrExpression(), JAVA_74_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_75_0_0_0 = INSTANCE.getJAVA_75_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_75_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_AND_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_75_0_0_1_0_0_0 = INSTANCE.getJAVA_75_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_75_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("&&", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_75_0_0_1_0_0_1 = INSTANCE.getJAVA_75_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_75_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CONDITIONAL_AND_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_75_0_0_1_0_0 = INSTANCE.getJAVA_75_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_75_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_75_0_0_1_0_0_0, JAVA_75_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_75_0_0_1_0 = INSTANCE.getJAVA_75_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_75_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_75_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_75_0_0_1 = INSTANCE.getJAVA_75_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_75_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_75_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_75_0_0 = INSTANCE.getJAVA_75_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_75_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_75_0_0_0, JAVA_75_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_75_0 = INSTANCE.getJAVA_75_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_75_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_75_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_75 = INSTANCE.getJAVA_75();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_75() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getConditionalAndExpression(), JAVA_75_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_76_0_0_0 = INSTANCE.getJAVA_76_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_76_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.INCLUSIVE_OR_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_76_0_0_1_0_0_0 = INSTANCE.getJAVA_76_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_76_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("|", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_76_0_0_1_0_0_1 = INSTANCE.getJAVA_76_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_76_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.INCLUSIVE_OR_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_76_0_0_1_0_0 = INSTANCE.getJAVA_76_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_76_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_76_0_0_1_0_0_0, JAVA_76_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_76_0_0_1_0 = INSTANCE.getJAVA_76_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_76_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_76_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_76_0_0_1 = INSTANCE.getJAVA_76_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_76_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_76_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_76_0_0 = INSTANCE.getJAVA_76_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_76_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_76_0_0_0, JAVA_76_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_76_0 = INSTANCE.getJAVA_76_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_76_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_76_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_76 = INSTANCE.getJAVA_76();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_76() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInclusiveOrExpression(), JAVA_76_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_77_0_0_0 = INSTANCE.getJAVA_77_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_77_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EXCLUSIVE_OR_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_77_0_0_1_0_0_0 = INSTANCE.getJAVA_77_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_77_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("^", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_77_0_0_1_0_0_1 = INSTANCE.getJAVA_77_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_77_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EXCLUSIVE_OR_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_77_0_0_1_0_0 = INSTANCE.getJAVA_77_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_77_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_77_0_0_1_0_0_0, JAVA_77_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_77_0_0_1_0 = INSTANCE.getJAVA_77_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_77_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_77_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_77_0_0_1 = INSTANCE.getJAVA_77_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_77_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_77_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_77_0_0 = INSTANCE.getJAVA_77_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_77_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_77_0_0_0, JAVA_77_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_77_0 = INSTANCE.getJAVA_77_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_77_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_77_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_77 = INSTANCE.getJAVA_77();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_77() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getExclusiveOrExpression(), JAVA_77_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_78_0_0_0 = INSTANCE.getJAVA_78_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_78_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.AND_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_78_0_0_1_0_0_0 = INSTANCE.getJAVA_78_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_78_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("&", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_78_0_0_1_0_0_1 = INSTANCE.getJAVA_78_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_78_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.AND_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_78_0_0_1_0_0 = INSTANCE.getJAVA_78_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_78_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_78_0_0_1_0_0_0, JAVA_78_0_0_1_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_78_0_0_1_0 = INSTANCE.getJAVA_78_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_78_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_78_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_78_0_0_1 = INSTANCE.getJAVA_78_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_78_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_78_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_78_0_0 = INSTANCE.getJAVA_78_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_78_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_78_0_0_0, JAVA_78_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_78_0 = INSTANCE.getJAVA_78_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_78_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_78_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_78 = INSTANCE.getJAVA_78();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_78() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAndExpression(), JAVA_78_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_79_0_0_0 = INSTANCE.getJAVA_79_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_79_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EQUALITY_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_79_0_0_1_0_0_0 = INSTANCE.getJAVA_79_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_79_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_79_0_0_1_0_0_1 = INSTANCE.getJAVA_79_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_79_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EQUALITY_EXPRESSION__EQUALITY_OPERATORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getEqualityOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_79_0_0_1_0_0_2 = INSTANCE.getJAVA_79_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_79_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_79_0_0_1_0_0_3 = INSTANCE.getJAVA_79_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_79_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.EQUALITY_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_79_0_0_1_0_0 = INSTANCE.getJAVA_79_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_79_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_79_0_0_1_0_0_0, JAVA_79_0_0_1_0_0_1, JAVA_79_0_0_1_0_0_2, JAVA_79_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_79_0_0_1_0 = INSTANCE.getJAVA_79_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_79_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_79_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_79_0_0_1 = INSTANCE.getJAVA_79_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_79_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_79_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_79_0_0 = INSTANCE.getJAVA_79_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_79_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_79_0_0_0, JAVA_79_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_79_0 = INSTANCE.getJAVA_79_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_79_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_79_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_79 = INSTANCE.getJAVA_79();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_79() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getEqualityExpression(), JAVA_79_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_80_0_0_0 = INSTANCE.getJAVA_80_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_80_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.INSTANCE_OF_EXPRESSION__CHILD), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_80_0_0_1_0_0_0 = INSTANCE.getJAVA_80_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_80_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("instanceof", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_80_0_0_1_0_0_1 = INSTANCE.getJAVA_80_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_80_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.INSTANCE_OF_EXPRESSION__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_80_0_0_1_0_0_2 = INSTANCE.getJAVA_80_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_80_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.INSTANCE_OF_EXPRESSION__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_80_0_0_1_0_0 = INSTANCE.getJAVA_80_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_80_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_80_0_0_1_0_0_0, JAVA_80_0_0_1_0_0_1, JAVA_80_0_0_1_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_80_0_0_1_0 = INSTANCE.getJAVA_80_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_80_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_80_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_80_0_0_1 = INSTANCE.getJAVA_80_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_80_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_80_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_80_0_0 = INSTANCE.getJAVA_80_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_80_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_80_0_0_0, JAVA_80_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_80_0 = INSTANCE.getJAVA_80_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_80_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_80_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_80 = INSTANCE.getJAVA_80();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_80() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getInstanceOfExpression(), JAVA_80_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_81_0_0_0 = INSTANCE.getJAVA_81_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_81_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.RELATION_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_81_0_0_1_0_0_0 = INSTANCE.getJAVA_81_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_81_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_81_0_0_1_0_0_1 = INSTANCE.getJAVA_81_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_81_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.RELATION_EXPRESSION__RELATION_OPERATORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getRelationOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_81_0_0_1_0_0_2 = INSTANCE.getJAVA_81_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_81_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_81_0_0_1_0_0_3 = INSTANCE.getJAVA_81_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_81_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.RELATION_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_81_0_0_1_0_0 = INSTANCE.getJAVA_81_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_81_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_81_0_0_1_0_0_0, JAVA_81_0_0_1_0_0_1, JAVA_81_0_0_1_0_0_2, JAVA_81_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_81_0_0_1_0 = INSTANCE.getJAVA_81_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_81_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_81_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_81_0_0_1 = INSTANCE.getJAVA_81_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_81_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_81_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_81_0_0 = INSTANCE.getJAVA_81_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_81_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_81_0_0_0, JAVA_81_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_81_0 = INSTANCE.getJAVA_81_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_81_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_81_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_81 = INSTANCE.getJAVA_81();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_81() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getRelationExpression(), JAVA_81_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_82_0_0_0 = INSTANCE.getJAVA_82_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_82_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_82_0_0_1_0_0_0 = INSTANCE.getJAVA_82_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_82_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_82_0_0_1_0_0_1 = INSTANCE.getJAVA_82_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_82_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.SHIFT_EXPRESSION__SHIFT_OPERATORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getShiftOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_82_0_0_1_0_0_2 = INSTANCE.getJAVA_82_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_82_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_82_0_0_1_0_0_3 = INSTANCE.getJAVA_82_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_82_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.SHIFT_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_82_0_0_1_0_0 = INSTANCE.getJAVA_82_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_82_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_82_0_0_1_0_0_0, JAVA_82_0_0_1_0_0_1, JAVA_82_0_0_1_0_0_2, JAVA_82_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_82_0_0_1_0 = INSTANCE.getJAVA_82_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_82_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_82_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_82_0_0_1 = INSTANCE.getJAVA_82_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_82_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_82_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_82_0_0 = INSTANCE.getJAVA_82_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_82_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_82_0_0_0, JAVA_82_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_82_0 = INSTANCE.getJAVA_82_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_82_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_82_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_82 = INSTANCE.getJAVA_82();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_82() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getShiftExpression(), JAVA_82_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_83_0_0_0 = INSTANCE.getJAVA_83_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_83_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_83_0_0_1_0_0_0 = INSTANCE.getJAVA_83_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_83_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_83_0_0_1_0_0_1 = INSTANCE.getJAVA_83_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_83_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ADDITIVE_EXPRESSION__ADDITIVE_OPERATORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAdditiveOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_83_0_0_1_0_0_2 = INSTANCE.getJAVA_83_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_83_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_83_0_0_1_0_0_3 = INSTANCE.getJAVA_83_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_83_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.ADDITIVE_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_83_0_0_1_0_0 = INSTANCE.getJAVA_83_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_83_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_83_0_0_1_0_0_0, JAVA_83_0_0_1_0_0_1, JAVA_83_0_0_1_0_0_2, JAVA_83_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_83_0_0_1_0 = INSTANCE.getJAVA_83_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_83_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_83_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_83_0_0_1 = INSTANCE.getJAVA_83_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_83_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_83_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_83_0_0 = INSTANCE.getJAVA_83_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_83_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_83_0_0_0, JAVA_83_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_83_0 = INSTANCE.getJAVA_83_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_83_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_83_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_83 = INSTANCE.getJAVA_83();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_83() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAdditiveExpression(), JAVA_83_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_84_0_0_0 = INSTANCE.getJAVA_84_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_84_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_84_0_0_1_0_0_0 = INSTANCE.getJAVA_84_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_84_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_84_0_0_1_0_0_1 = INSTANCE.getJAVA_84_0_0_1_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_84_0_0_1_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__MULTIPLICATIVE_OPERATORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getMultiplicativeOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_84_0_0_1_0_0_2 = INSTANCE.getJAVA_84_0_0_1_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_84_0_0_1_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_84_0_0_1_0_0_3 = INSTANCE.getJAVA_84_0_0_1_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_84_0_0_1_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.MULTIPLICATIVE_EXPRESSION__CHILDREN), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_84_0_0_1_0_0 = INSTANCE.getJAVA_84_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_84_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_84_0_0_1_0_0_0, JAVA_84_0_0_1_0_0_1, JAVA_84_0_0_1_0_0_2, JAVA_84_0_0_1_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_84_0_0_1_0 = INSTANCE.getJAVA_84_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_84_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_84_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_84_0_0_1 = INSTANCE.getJAVA_84_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_84_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_84_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_84_0_0 = INSTANCE.getJAVA_84_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_84_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_84_0_0_0, JAVA_84_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_84_0 = INSTANCE.getJAVA_84_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_84_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_84_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_84 = INSTANCE.getJAVA_84();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_84() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getMultiplicativeExpression(), JAVA_84_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_85_0_0_0 = INSTANCE.getJAVA_85_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_85_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.UNARY_EXPRESSION__OPERATORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getUnaryOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_85_0_0_1 = INSTANCE.getJAVA_85_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_85_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.UNARY_EXPRESSION__CHILD), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryModificationExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_85_0_0 = INSTANCE.getJAVA_85_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_85_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_85_0_0_0, JAVA_85_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_85_0 = INSTANCE.getJAVA_85_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_85_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_85_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_85 = INSTANCE.getJAVA_85();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_85() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression(), JAVA_85_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_86_0_0_0 = INSTANCE.getJAVA_86_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_86_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getSuffixUnaryModificationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.SUFFIX_UNARY_MODIFICATION_EXPRESSION__CHILD), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryModificationExpressionChild(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_86_0_0_1_0_0_0 = INSTANCE.getJAVA_86_0_0_1_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_86_0_0_1_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getSuffixUnaryModificationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.SUFFIX_UNARY_MODIFICATION_EXPRESSION__OPERATOR), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getUnaryModificationOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_86_0_0_1_0_0 = INSTANCE.getJAVA_86_0_0_1_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_86_0_0_1_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_86_0_0_1_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_86_0_0_1_0 = INSTANCE.getJAVA_86_0_0_1_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_86_0_0_1_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_86_0_0_1_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_86_0_0_1 = INSTANCE.getJAVA_86_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_86_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_86_0_0_1_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_86_0_0 = INSTANCE.getJAVA_86_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_86_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_86_0_0_0, JAVA_86_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_86_0 = INSTANCE.getJAVA_86_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_86_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_86_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_86 = INSTANCE.getJAVA_86();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_86() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getSuffixUnaryModificationExpression(), JAVA_86_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_87_0_0_0_0_0_0 = INSTANCE.getJAVA_87_0_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_87_0_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getPrefixUnaryModificationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.PREFIX_UNARY_MODIFICATION_EXPRESSION__OPERATOR), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getUnaryModificationOperator(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_87_0_0_0_0_0 = INSTANCE.getJAVA_87_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_87_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_87_0_0_0_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_87_0_0_0_0 = INSTANCE.getJAVA_87_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_87_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_87_0_0_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_87_0_0_0 = INSTANCE.getJAVA_87_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_87_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_87_0_0_0_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_87_0_0_1 = INSTANCE.getJAVA_87_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_87_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getPrefixUnaryModificationExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.PREFIX_UNARY_MODIFICATION_EXPRESSION__CHILD), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryModificationExpressionChild(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_87_0_0 = INSTANCE.getJAVA_87_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_87_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_87_0_0_0, JAVA_87_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_87_0 = INSTANCE.getJAVA_87_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_87_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_87_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_87 = INSTANCE.getJAVA_87();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_87() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getPrefixUnaryModificationExpression(), JAVA_87_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_88_0_0_0 = INSTANCE.getJAVA_88_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_88_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_88_0_0_1 = INSTANCE.getJAVA_88_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_88_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getCastExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CAST_EXPRESSION__TYPE_REFERENCE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.types.TypesPackage.eINSTANCE.getTypeReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_88_0_0_2 = INSTANCE.getJAVA_88_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_88_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getCastExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CAST_EXPRESSION__ARRAY_DIMENSIONS_BEFORE), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_88_0_0_3 = INSTANCE.getJAVA_88_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_88_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace JAVA_88_0_0_4 = INSTANCE.getJAVA_88_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace getJAVA_88_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace(1, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_88_0_0_5 = INSTANCE.getJAVA_88_0_0_5();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_88_0_0_5() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getCastExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.CAST_EXPRESSION__CHILD), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getUnaryExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_88_0_0 = INSTANCE.getJAVA_88_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_88_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_88_0_0_0, JAVA_88_0_0_1, JAVA_88_0_0_2, JAVA_88_0_0_3, JAVA_88_0_0_4, JAVA_88_0_0_5);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_88_0 = INSTANCE.getJAVA_88_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_88_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_88_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_88 = INSTANCE.getJAVA_88();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_88() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getCastExpression(), JAVA_88_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_89_0_0_0 = INSTANCE.getJAVA_89_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_89_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("(", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_89_0_0_1 = INSTANCE.getJAVA_89_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_89_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getNestedExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.NESTED_EXPRESSION__EXPRESSION), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getAssignmentExpression(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_89_0_0_2 = INSTANCE.getJAVA_89_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_89_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(")", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_89_0_0_3 = INSTANCE.getJAVA_89_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_89_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getNestedExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.NESTED_EXPRESSION__ARRAY_SELECTORS), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArraySelector(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_89_0_0_4_0_0_0 = INSTANCE.getJAVA_89_0_0_4_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_89_0_0_4_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(".", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcContainment JAVA_89_0_0_4_0_0_1 = INSTANCE.getJAVA_89_0_0_4_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcContainment getJAVA_89_0_0_4_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcContainment(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getNestedExpression().getEStructuralFeature(org.emftext.language.java.expressions.ExpressionsPackage.NESTED_EXPRESSION__NEXT), org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, new org.eclipse.emf.ecore.EClass[] {org.emftext.language.java.references.ReferencesPackage.eINSTANCE.getReference(), }, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_89_0_0_4_0_0 = INSTANCE.getJAVA_89_0_0_4_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_89_0_0_4_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_89_0_0_4_0_0_0, JAVA_89_0_0_4_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_89_0_0_4_0 = INSTANCE.getJAVA_89_0_0_4_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_89_0_0_4_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_89_0_0_4_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_89_0_0_4 = INSTANCE.getJAVA_89_0_0_4();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_89_0_0_4() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_89_0_0_4_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_89_0_0 = INSTANCE.getJAVA_89_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_89_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_89_0_0_0, JAVA_89_0_0_1, JAVA_89_0_0_2, JAVA_89_0_0_3, JAVA_89_0_0_4);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_89_0 = INSTANCE.getJAVA_89_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_89_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_89_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_89 = INSTANCE.getJAVA_89();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_89() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.expressions.ExpressionsPackage.eINSTANCE.getNestedExpression(), JAVA_89_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_90_0_0_0 = INSTANCE.getJAVA_90_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_90_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_90_0_0 = INSTANCE.getJAVA_90_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_90_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_90_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_90_0 = INSTANCE.getJAVA_90_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_90_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_90_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_90 = INSTANCE.getJAVA_90();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_90() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignment(), JAVA_90_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_91_0_0_0 = INSTANCE.getJAVA_91_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_91_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("+=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_91_0_0 = INSTANCE.getJAVA_91_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_91_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_91_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_91_0 = INSTANCE.getJAVA_91_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_91_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_91_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_91 = INSTANCE.getJAVA_91();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_91() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentPlus(), JAVA_91_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_92_0_0_0 = INSTANCE.getJAVA_92_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_92_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("-=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_92_0_0 = INSTANCE.getJAVA_92_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_92_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_92_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_92_0 = INSTANCE.getJAVA_92_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_92_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_92_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_92 = INSTANCE.getJAVA_92();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_92() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentMinus(), JAVA_92_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_93_0_0_0 = INSTANCE.getJAVA_93_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_93_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("*=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_93_0_0 = INSTANCE.getJAVA_93_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_93_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_93_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_93_0 = INSTANCE.getJAVA_93_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_93_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_93_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_93 = INSTANCE.getJAVA_93();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_93() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentMultiplication(), JAVA_93_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_94_0_0_0 = INSTANCE.getJAVA_94_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_94_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("/=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_94_0_0 = INSTANCE.getJAVA_94_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_94_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_94_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_94_0 = INSTANCE.getJAVA_94_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_94_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_94_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_94 = INSTANCE.getJAVA_94();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_94() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentDivision(), JAVA_94_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_95_0_0_0 = INSTANCE.getJAVA_95_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_95_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("&=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_95_0_0 = INSTANCE.getJAVA_95_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_95_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_95_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_95_0 = INSTANCE.getJAVA_95_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_95_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_95_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_95 = INSTANCE.getJAVA_95();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_95() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentAnd(), JAVA_95_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_96_0_0_0 = INSTANCE.getJAVA_96_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_96_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("|=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_96_0_0 = INSTANCE.getJAVA_96_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_96_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_96_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_96_0 = INSTANCE.getJAVA_96_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_96_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_96_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_96 = INSTANCE.getJAVA_96();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_96() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentOr(), JAVA_96_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_97_0_0_0 = INSTANCE.getJAVA_97_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_97_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("^=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_97_0_0 = INSTANCE.getJAVA_97_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_97_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_97_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_97_0 = INSTANCE.getJAVA_97_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_97_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_97_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_97 = INSTANCE.getJAVA_97();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_97() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentExclusiveOr(), JAVA_97_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_98_0_0_0 = INSTANCE.getJAVA_98_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_98_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("%=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_98_0_0 = INSTANCE.getJAVA_98_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_98_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_98_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_98_0 = INSTANCE.getJAVA_98_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_98_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_98_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_98 = INSTANCE.getJAVA_98();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_98() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentModulo(), JAVA_98_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_99_0_0_0 = INSTANCE.getJAVA_99_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_99_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_99_0_0_1 = INSTANCE.getJAVA_99_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_99_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_99_0_0_2 = INSTANCE.getJAVA_99_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_99_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_99_0_0 = INSTANCE.getJAVA_99_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_99_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_99_0_0_0, JAVA_99_0_0_1, JAVA_99_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_99_0 = INSTANCE.getJAVA_99_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_99_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_99_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_99 = INSTANCE.getJAVA_99();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_99() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentLeftShift(), JAVA_99_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_100_0_0_0 = INSTANCE.getJAVA_100_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_100_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_100_0_0_1 = INSTANCE.getJAVA_100_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_100_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_100_0_0_2 = INSTANCE.getJAVA_100_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_100_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_100_0_0 = INSTANCE.getJAVA_100_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_100_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_100_0_0_0, JAVA_100_0_0_1, JAVA_100_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_100_0 = INSTANCE.getJAVA_100_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_100_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_100_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_100 = INSTANCE.getJAVA_100();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_100() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentRightShift(), JAVA_100_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_101_0_0_0 = INSTANCE.getJAVA_101_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_101_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_101_0_0_1 = INSTANCE.getJAVA_101_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_101_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_101_0_0_2 = INSTANCE.getJAVA_101_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_101_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_101_0_0_3 = INSTANCE.getJAVA_101_0_0_3();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_101_0_0_3() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_101_0_0 = INSTANCE.getJAVA_101_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_101_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_101_0_0_0, JAVA_101_0_0_1, JAVA_101_0_0_2, JAVA_101_0_0_3);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_101_0 = INSTANCE.getJAVA_101_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_101_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_101_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_101 = INSTANCE.getJAVA_101();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_101() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAssignmentUnsignedRightShift(), JAVA_101_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_102_0_0_0 = INSTANCE.getJAVA_102_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_102_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("+", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_102_0_0 = INSTANCE.getJAVA_102_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_102_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_102_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_102_0 = INSTANCE.getJAVA_102_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_102_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_102_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_102 = INSTANCE.getJAVA_102();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_102() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getAddition(), JAVA_102_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_103_0_0_0 = INSTANCE.getJAVA_103_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_103_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("-", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_103_0_0 = INSTANCE.getJAVA_103_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_103_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_103_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_103_0 = INSTANCE.getJAVA_103_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_103_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_103_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_103 = INSTANCE.getJAVA_103();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_103() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getSubtraction(), JAVA_103_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_104_0_0_0 = INSTANCE.getJAVA_104_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_104_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("*", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_104_0_0 = INSTANCE.getJAVA_104_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_104_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_104_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_104_0 = INSTANCE.getJAVA_104_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_104_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_104_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_104 = INSTANCE.getJAVA_104();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_104() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getMultiplication(), JAVA_104_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_105_0_0_0 = INSTANCE.getJAVA_105_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_105_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("/", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_105_0_0 = INSTANCE.getJAVA_105_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_105_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_105_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_105_0 = INSTANCE.getJAVA_105_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_105_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_105_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_105 = INSTANCE.getJAVA_105();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_105() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getDivision(), JAVA_105_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_106_0_0_0 = INSTANCE.getJAVA_106_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_106_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("%", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_106_0_0 = INSTANCE.getJAVA_106_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_106_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_106_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_106_0 = INSTANCE.getJAVA_106_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_106_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_106_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_106 = INSTANCE.getJAVA_106();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_106() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getRemainder(), JAVA_106_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_107_0_0_0 = INSTANCE.getJAVA_107_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_107_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_107_0_0 = INSTANCE.getJAVA_107_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_107_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_107_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_107_0 = INSTANCE.getJAVA_107_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_107_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_107_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_107 = INSTANCE.getJAVA_107();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_107() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getLessThan(), JAVA_107_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_108_0_0_0 = INSTANCE.getJAVA_108_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_108_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_108_0_0_1 = INSTANCE.getJAVA_108_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_108_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_108_0_0 = INSTANCE.getJAVA_108_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_108_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_108_0_0_0, JAVA_108_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_108_0 = INSTANCE.getJAVA_108_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_108_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_108_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_108 = INSTANCE.getJAVA_108();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_108() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getLessThanOrEqual(), JAVA_108_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_109_0_0_0 = INSTANCE.getJAVA_109_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_109_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_109_0_0 = INSTANCE.getJAVA_109_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_109_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_109_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_109_0 = INSTANCE.getJAVA_109_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_109_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_109_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_109 = INSTANCE.getJAVA_109();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_109() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getGreaterThan(), JAVA_109_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_110_0_0_0 = INSTANCE.getJAVA_110_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_110_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_110_0_0_1 = INSTANCE.getJAVA_110_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_110_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_110_0_0 = INSTANCE.getJAVA_110_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_110_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_110_0_0_0, JAVA_110_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_110_0 = INSTANCE.getJAVA_110_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_110_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_110_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_110 = INSTANCE.getJAVA_110();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_110() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getGreaterThanOrEqual(), JAVA_110_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_111_0_0_0 = INSTANCE.getJAVA_111_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_111_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_111_0_0_1 = INSTANCE.getJAVA_111_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_111_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("<", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_111_0_0 = INSTANCE.getJAVA_111_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_111_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_111_0_0_0, JAVA_111_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_111_0 = INSTANCE.getJAVA_111_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_111_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_111_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_111 = INSTANCE.getJAVA_111();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_111() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getLeftShift(), JAVA_111_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_112_0_0_0 = INSTANCE.getJAVA_112_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_112_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_112_0_0_1 = INSTANCE.getJAVA_112_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_112_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_112_0_0 = INSTANCE.getJAVA_112_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_112_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_112_0_0_0, JAVA_112_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_112_0 = INSTANCE.getJAVA_112_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_112_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_112_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_112 = INSTANCE.getJAVA_112();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_112() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getRightShift(), JAVA_112_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_113_0_0_0 = INSTANCE.getJAVA_113_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_113_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_113_0_0_1 = INSTANCE.getJAVA_113_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_113_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_113_0_0_2 = INSTANCE.getJAVA_113_0_0_2();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_113_0_0_2() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword(">", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_113_0_0 = INSTANCE.getJAVA_113_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_113_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_113_0_0_0, JAVA_113_0_0_1, JAVA_113_0_0_2);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_113_0 = INSTANCE.getJAVA_113_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_113_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_113_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_113 = INSTANCE.getJAVA_113();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_113() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getUnsignedRightShift(), JAVA_113_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_114_0_0_0 = INSTANCE.getJAVA_114_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_114_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("==", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_114_0_0 = INSTANCE.getJAVA_114_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_114_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_114_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_114_0 = INSTANCE.getJAVA_114_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_114_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_114_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_114 = INSTANCE.getJAVA_114();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_114() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getEqual(), JAVA_114_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_115_0_0_0 = INSTANCE.getJAVA_115_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_115_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("!=", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_115_0_0 = INSTANCE.getJAVA_115_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_115_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_115_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_115_0 = INSTANCE.getJAVA_115_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_115_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_115_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_115 = INSTANCE.getJAVA_115();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_115() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getNotEqual(), JAVA_115_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_116_0_0_0 = INSTANCE.getJAVA_116_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_116_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("++", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_116_0_0 = INSTANCE.getJAVA_116_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_116_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_116_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_116_0 = INSTANCE.getJAVA_116_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_116_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_116_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_116 = INSTANCE.getJAVA_116();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_116() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getPlusPlus(), JAVA_116_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_117_0_0_0 = INSTANCE.getJAVA_117_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_117_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("--", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_117_0_0 = INSTANCE.getJAVA_117_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_117_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_117_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_117_0 = INSTANCE.getJAVA_117_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_117_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_117_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_117 = INSTANCE.getJAVA_117();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_117() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getMinusMinus(), JAVA_117_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_118_0_0_0 = INSTANCE.getJAVA_118_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_118_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("~", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_118_0_0 = INSTANCE.getJAVA_118_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_118_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_118_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_118_0 = INSTANCE.getJAVA_118_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_118_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_118_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_118 = INSTANCE.getJAVA_118();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_118() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getComplement(), JAVA_118_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_119_0_0_0 = INSTANCE.getJAVA_119_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_119_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("!", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_119_0_0 = INSTANCE.getJAVA_119_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_119_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_119_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_119_0 = INSTANCE.getJAVA_119_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_119_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_119_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_119 = INSTANCE.getJAVA_119();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_119() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.operators.OperatorsPackage.eINSTANCE.getNegate(), JAVA_119_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_120_0_0_0_0_0_0 = INSTANCE.getJAVA_120_0_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_120_0_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("[", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_120_0_0_0_0_0_1 = INSTANCE.getJAVA_120_0_0_0_0_0_1();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_120_0_0_0_0_0_1() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("]", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_120_0_0_0_0_0 = INSTANCE.getJAVA_120_0_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_120_0_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_120_0_0_0_0_0_0, JAVA_120_0_0_0_0_0_1);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_120_0_0_0_0 = INSTANCE.getJAVA_120_0_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_120_0_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_120_0_0_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcCompound JAVA_120_0_0_0 = INSTANCE.getJAVA_120_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcCompound getJAVA_120_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcCompound(JAVA_120_0_0_0_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_120_0_0 = INSTANCE.getJAVA_120_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_120_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_120_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_120_0 = INSTANCE.getJAVA_120_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_120_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_120_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_120 = INSTANCE.getJAVA_120();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_120() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.arrays.ArraysPackage.eINSTANCE.getArrayDimension(), JAVA_120_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_121_0_0_0 = INSTANCE.getJAVA_121_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_121_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("null", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_121_0_0 = INSTANCE.getJAVA_121_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_121_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_121_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_121_0 = INSTANCE.getJAVA_121_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_121_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_121_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_121 = INSTANCE.getJAVA_121();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_121() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getNullLiteral(), JAVA_121_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_122_0_0_0 = INSTANCE.getJAVA_122_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_122_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("public", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_122_0_0 = INSTANCE.getJAVA_122_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_122_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_122_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_122_0 = INSTANCE.getJAVA_122_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_122_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_122_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_122 = INSTANCE.getJAVA_122();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_122() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getPublic(), JAVA_122_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_123_0_0_0 = INSTANCE.getJAVA_123_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_123_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("abstract", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_123_0_0 = INSTANCE.getJAVA_123_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_123_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_123_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_123_0 = INSTANCE.getJAVA_123_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_123_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_123_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_123 = INSTANCE.getJAVA_123();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_123() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getAbstract(), JAVA_123_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_124_0_0_0 = INSTANCE.getJAVA_124_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_124_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("protected", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_124_0_0 = INSTANCE.getJAVA_124_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_124_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_124_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_124_0 = INSTANCE.getJAVA_124_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_124_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_124_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_124 = INSTANCE.getJAVA_124();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_124() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getProtected(), JAVA_124_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_125_0_0_0 = INSTANCE.getJAVA_125_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_125_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("private", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_125_0_0 = INSTANCE.getJAVA_125_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_125_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_125_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_125_0 = INSTANCE.getJAVA_125_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_125_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_125_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_125 = INSTANCE.getJAVA_125();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_125() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getPrivate(), JAVA_125_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_126_0_0_0 = INSTANCE.getJAVA_126_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_126_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("final", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_126_0_0 = INSTANCE.getJAVA_126_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_126_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_126_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_126_0 = INSTANCE.getJAVA_126_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_126_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_126_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_126 = INSTANCE.getJAVA_126();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_126() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getFinal(), JAVA_126_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_127_0_0_0 = INSTANCE.getJAVA_127_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_127_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("static", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_127_0_0 = INSTANCE.getJAVA_127_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_127_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_127_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_127_0 = INSTANCE.getJAVA_127_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_127_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_127_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_127 = INSTANCE.getJAVA_127();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_127() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getStatic(), JAVA_127_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_128_0_0_0 = INSTANCE.getJAVA_128_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_128_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("native", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_128_0_0 = INSTANCE.getJAVA_128_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_128_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_128_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_128_0 = INSTANCE.getJAVA_128_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_128_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_128_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_128 = INSTANCE.getJAVA_128();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_128() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getNative(), JAVA_128_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_129_0_0_0 = INSTANCE.getJAVA_129_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_129_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("synchronized", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_129_0_0 = INSTANCE.getJAVA_129_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_129_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_129_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_129_0 = INSTANCE.getJAVA_129_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_129_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_129_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_129 = INSTANCE.getJAVA_129();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_129() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getSynchronized(), JAVA_129_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_130_0_0_0 = INSTANCE.getJAVA_130_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_130_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("transient", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_130_0_0 = INSTANCE.getJAVA_130_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_130_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_130_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_130_0 = INSTANCE.getJAVA_130_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_130_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_130_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_130 = INSTANCE.getJAVA_130();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_130() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getTransient(), JAVA_130_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_131_0_0_0 = INSTANCE.getJAVA_131_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_131_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("volatile", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_131_0_0 = INSTANCE.getJAVA_131_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_131_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_131_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_131_0 = INSTANCE.getJAVA_131_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_131_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_131_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_131 = INSTANCE.getJAVA_131();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_131() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getVolatile(), JAVA_131_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_132_0_0_0 = INSTANCE.getJAVA_132_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_132_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("strictfp", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_132_0_0 = INSTANCE.getJAVA_132_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_132_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_132_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_132_0 = INSTANCE.getJAVA_132_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_132_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_132_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_132 = INSTANCE.getJAVA_132();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_132() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.modifiers.ModifiersPackage.eINSTANCE.getStrictfp(), JAVA_132_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_133_0_0_0 = INSTANCE.getJAVA_133_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_133_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("void", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_133_0_0 = INSTANCE.getJAVA_133_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_133_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_133_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_133_0 = INSTANCE.getJAVA_133_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_133_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_133_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_133 = INSTANCE.getJAVA_133();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_133() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getVoid(), JAVA_133_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_134_0_0_0 = INSTANCE.getJAVA_134_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_134_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("boolean", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_134_0_0 = INSTANCE.getJAVA_134_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_134_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_134_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_134_0 = INSTANCE.getJAVA_134_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_134_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_134_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_134 = INSTANCE.getJAVA_134();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_134() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getBoolean(), JAVA_134_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_135_0_0_0 = INSTANCE.getJAVA_135_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_135_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("char", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_135_0_0 = INSTANCE.getJAVA_135_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_135_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_135_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_135_0 = INSTANCE.getJAVA_135_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_135_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_135_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_135 = INSTANCE.getJAVA_135();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_135() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getChar(), JAVA_135_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_136_0_0_0 = INSTANCE.getJAVA_136_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_136_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("byte", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_136_0_0 = INSTANCE.getJAVA_136_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_136_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_136_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_136_0 = INSTANCE.getJAVA_136_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_136_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_136_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_136 = INSTANCE.getJAVA_136();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_136() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getByte(), JAVA_136_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_137_0_0_0 = INSTANCE.getJAVA_137_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_137_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("short", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_137_0_0 = INSTANCE.getJAVA_137_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_137_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_137_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_137_0 = INSTANCE.getJAVA_137_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_137_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_137_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_137 = INSTANCE.getJAVA_137();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_137() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getShort(), JAVA_137_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_138_0_0_0 = INSTANCE.getJAVA_138_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_138_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("int", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_138_0_0 = INSTANCE.getJAVA_138_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_138_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_138_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_138_0 = INSTANCE.getJAVA_138_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_138_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_138_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_138 = INSTANCE.getJAVA_138();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_138() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getInt(), JAVA_138_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_139_0_0_0 = INSTANCE.getJAVA_139_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_139_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("long", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_139_0_0 = INSTANCE.getJAVA_139_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_139_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_139_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_139_0 = INSTANCE.getJAVA_139_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_139_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_139_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_139 = INSTANCE.getJAVA_139();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_139() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getLong(), JAVA_139_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_140_0_0_0 = INSTANCE.getJAVA_140_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_140_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("float", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_140_0_0 = INSTANCE.getJAVA_140_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_140_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_140_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_140_0 = INSTANCE.getJAVA_140_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_140_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_140_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_140 = INSTANCE.getJAVA_140();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_140() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getFloat(), JAVA_140_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword JAVA_141_0_0_0 = INSTANCE.getJAVA_141_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword getJAVA_141_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword("double", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_141_0_0 = INSTANCE.getJAVA_141_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_141_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_141_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_141_0 = INSTANCE.getJAVA_141_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_141_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_141_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_141 = INSTANCE.getJAVA_141();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_141() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.types.TypesPackage.eINSTANCE.getDouble(), JAVA_141_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_142_0_0_0 = INSTANCE.getJAVA_142_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_142_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalLongLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.DECIMAL_LONG_LITERAL__DECIMAL_VALUE), "DECIMAL_LONG_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_142_0_0 = INSTANCE.getJAVA_142_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_142_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_142_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_142_0 = INSTANCE.getJAVA_142_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_142_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_142_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_142 = INSTANCE.getJAVA_142();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_142() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalLongLiteral(), JAVA_142_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_143_0_0_0 = INSTANCE.getJAVA_143_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_143_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalFloatLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.DECIMAL_FLOAT_LITERAL__DECIMAL_VALUE), "DECIMAL_FLOAT_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_143_0_0 = INSTANCE.getJAVA_143_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_143_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_143_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_143_0 = INSTANCE.getJAVA_143_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_143_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_143_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_143 = INSTANCE.getJAVA_143();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_143() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalFloatLiteral(), JAVA_143_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_144_0_0_0 = INSTANCE.getJAVA_144_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_144_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalIntegerLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.DECIMAL_INTEGER_LITERAL__DECIMAL_VALUE), "DECIMAL_INTEGER_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_144_0_0 = INSTANCE.getJAVA_144_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_144_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_144_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_144_0 = INSTANCE.getJAVA_144_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_144_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_144_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_144 = INSTANCE.getJAVA_144();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_144() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalIntegerLiteral(), JAVA_144_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_145_0_0_0 = INSTANCE.getJAVA_145_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_145_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalDoubleLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.DECIMAL_DOUBLE_LITERAL__DECIMAL_VALUE), "DECIMAL_DOUBLE_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_145_0_0 = INSTANCE.getJAVA_145_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_145_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_145_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_145_0 = INSTANCE.getJAVA_145_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_145_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_145_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_145 = INSTANCE.getJAVA_145();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_145() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getDecimalDoubleLiteral(), JAVA_145_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_146_0_0_0 = INSTANCE.getJAVA_146_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_146_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexLongLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.HEX_LONG_LITERAL__HEX_VALUE), "HEX_LONG_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_146_0_0 = INSTANCE.getJAVA_146_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_146_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_146_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_146_0 = INSTANCE.getJAVA_146_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_146_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_146_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_146 = INSTANCE.getJAVA_146();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_146() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexLongLiteral(), JAVA_146_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_147_0_0_0 = INSTANCE.getJAVA_147_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_147_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexFloatLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.HEX_FLOAT_LITERAL__HEX_VALUE), "HEX_FLOAT_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_147_0_0 = INSTANCE.getJAVA_147_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_147_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_147_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_147_0 = INSTANCE.getJAVA_147_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_147_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_147_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_147 = INSTANCE.getJAVA_147();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_147() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexFloatLiteral(), JAVA_147_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_148_0_0_0 = INSTANCE.getJAVA_148_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_148_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexDoubleLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.HEX_DOUBLE_LITERAL__HEX_VALUE), "HEX_DOUBLE_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_148_0_0 = INSTANCE.getJAVA_148_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_148_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_148_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_148_0 = INSTANCE.getJAVA_148_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_148_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_148_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_148 = INSTANCE.getJAVA_148();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_148() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexDoubleLiteral(), JAVA_148_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_149_0_0_0 = INSTANCE.getJAVA_149_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_149_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexIntegerLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.HEX_INTEGER_LITERAL__HEX_VALUE), "HEX_INTEGER_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_149_0_0 = INSTANCE.getJAVA_149_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_149_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_149_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_149_0 = INSTANCE.getJAVA_149_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_149_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_149_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_149 = INSTANCE.getJAVA_149();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_149() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getHexIntegerLiteral(), JAVA_149_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_150_0_0_0 = INSTANCE.getJAVA_150_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_150_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getOctalLongLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.OCTAL_LONG_LITERAL__OCTAL_VALUE), "OCTAL_LONG_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_150_0_0 = INSTANCE.getJAVA_150_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_150_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_150_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_150_0 = INSTANCE.getJAVA_150_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_150_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_150_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_150 = INSTANCE.getJAVA_150();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_150() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getOctalLongLiteral(), JAVA_150_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_151_0_0_0 = INSTANCE.getJAVA_151_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_151_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getOctalIntegerLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.OCTAL_INTEGER_LITERAL__OCTAL_VALUE), "OCTAL_INTEGER_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_151_0_0 = INSTANCE.getJAVA_151_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_151_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_151_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_151_0 = INSTANCE.getJAVA_151_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_151_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_151_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_151 = INSTANCE.getJAVA_151();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_151() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getOctalIntegerLiteral(), JAVA_151_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_152_0_0_0 = INSTANCE.getJAVA_152_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_152_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getCharacterLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.CHARACTER_LITERAL__VALUE), "CHARACTER_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_152_0_0 = INSTANCE.getJAVA_152_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_152_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_152_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_152_0 = INSTANCE.getJAVA_152_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_152_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_152_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_152 = INSTANCE.getJAVA_152();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_152() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getCharacterLiteral(), JAVA_152_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder JAVA_153_0_0_0 = INSTANCE.getJAVA_153_0_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder getJAVA_153_0_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getBooleanLiteral().getEStructuralFeature(org.emftext.language.java.literals.LiteralsPackage.BOOLEAN_LITERAL__VALUE), "BOOLEAN_LITERAL", org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, 0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcSequence JAVA_153_0_0 = INSTANCE.getJAVA_153_0_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcSequence getJAVA_153_0_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcSequence(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_153_0_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcChoice JAVA_153_0 = INSTANCE.getJAVA_153_0();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcChoice getJAVA_153_0() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcChoice(org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE, JAVA_153_0_0);
	}
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule JAVA_153 = INSTANCE.getJAVA_153();
	private org.kardo.language.ipc.resource.ipc.grammar.IpcRule getJAVA_153() {
		return new org.kardo.language.ipc.resource.ipc.grammar.IpcRule(org.emftext.language.java.literals.LiteralsPackage.eINSTANCE.getBooleanLiteral(), JAVA_153_0, org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE);
	}
	
	public static String getSyntaxElementID(org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement syntaxElement) {
		if (syntaxElement == null) {
			// null indicates EOF
			return "<EOF>";
		}
		for (java.lang.reflect.Field field : org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.class.getFields()) {
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
	
	public static org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement getSyntaxElementByID(String syntaxElementID) {
		try {
			return (org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement) org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.class.getField(syntaxElementID).get(null);
		} catch (Exception e) {
			return null;
		}
	}
	
	public final static org.kardo.language.ipc.resource.ipc.grammar.IpcRule[] RULES = new org.kardo.language.ipc.resource.ipc.grammar.IpcRule[] {
		IPC_0,
		IPC_1,
		IPC_2,
		IPC_3,
		IPC_4,
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
			for (org.kardo.language.ipc.resource.ipc.grammar.IpcRule rule : RULES) {
				findKeywords(rule, this.keywords);
			}
		}
		return keywords;
	}
	
	/**
	 * Finds all keywords in the given element and its children and adds them to the
	 * set. This includes all literals for boolean and enumeration terminals.
	 */
	private void findKeywords(org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement element, java.util.Set<String> keywords) {
		if (element instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword) {
			keywords.add(((org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword) element).getValue());
		} else if (element instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcBooleanTerminal) {
			keywords.add(((org.kardo.language.ipc.resource.ipc.grammar.IpcBooleanTerminal) element).getTrueLiteral());
			keywords.add(((org.kardo.language.ipc.resource.ipc.grammar.IpcBooleanTerminal) element).getFalseLiteral());
		} else if (element instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcEnumerationTerminal) {
			org.kardo.language.ipc.resource.ipc.grammar.IpcEnumerationTerminal terminal = (org.kardo.language.ipc.resource.ipc.grammar.IpcEnumerationTerminal) element;
			for (String key : terminal.getLiteralMapping().keySet()) {
				keywords.add(key);
			}
		}
		for (org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement child : element.getChildren()) {
			findKeywords(child, this.keywords);
		}
	}
	
}
