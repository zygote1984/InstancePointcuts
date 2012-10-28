/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

public class IpcPrinter2 implements org.kardo.language.ipc.resource.ipc.IIpcTextPrinter {
	
	protected class PrintToken {
		
		private String text;
		private String tokenName;
		private org.eclipse.emf.ecore.EObject container;
		
		public PrintToken(String text, String tokenName, org.eclipse.emf.ecore.EObject container) {
			this.text = text;
			this.tokenName = tokenName;
			this.container = container;
		}
		
		public String getText() {
			return text;
		}
		
		public String getTokenName() {
			return tokenName;
		}
		
		public org.eclipse.emf.ecore.EObject getContainer() {
			return container;
		}
		
		public String toString() {
			return "'" + text + "' [" + tokenName + "]";
		}
		
	}
	
	/**
	 * The PrintCountingMap keeps tracks of the values that must be printed for each
	 * feature of an EObject. It is also used to store the indices of all values that
	 * have been printed. This knowledge is used to avoid printing values twice. We
	 * must store the concrete indices of the printed values instead of basically
	 * counting them, because values may be printed in an order that differs from the
	 * order in which they are stored in the EObject's feature.
	 */
	protected class PrintCountingMap {
		
		private java.util.Map<String, java.util.List<Object>> featureToValuesMap = new java.util.LinkedHashMap<String, java.util.List<Object>>();
		private java.util.Map<String, java.util.Set<Integer>> featureToPrintedIndicesMap = new java.util.LinkedHashMap<String, java.util.Set<Integer>>();
		
		public void setFeatureValues(String featureName, java.util.List<Object> values) {
			featureToValuesMap.put(featureName, values);
			// If the feature does not have values it won't be printed. An entry in
			// 'featureToPrintedIndicesMap' is therefore not needed in this case.
			if (values != null) {
				featureToPrintedIndicesMap.put(featureName, new java.util.LinkedHashSet<Integer>());
			}
		}
		
		public java.util.Set<Integer> getIndicesToPrint(String featureName) {
			return featureToPrintedIndicesMap.get(featureName);
		}
		
		public void addIndexToPrint(String featureName, int index) {
			featureToPrintedIndicesMap.get(featureName).add(index);
		}
		
		public int getCountLeft(org.kardo.language.ipc.resource.ipc.grammar.IpcTerminal terminal) {
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			String featureName = feature.getName();
			java.util.List<Object> totalValuesToPrint = featureToValuesMap.get(featureName);
			java.util.Set<Integer> printedIndices = featureToPrintedIndicesMap.get(featureName);
			if (totalValuesToPrint == null) {
				return 0;
			}
			if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
				// for attributes we do not need to check the type, since the CS languages does
				// not allow type restrictions for attributes.
				return totalValuesToPrint.size() - printedIndices.size();
			} else if (feature instanceof org.eclipse.emf.ecore.EReference) {
				org.eclipse.emf.ecore.EReference reference = (org.eclipse.emf.ecore.EReference) feature;
				if (!reference.isContainment()) {
					// for non-containment references we also do not need to check the type, since the
					// CS languages does not allow type restrictions for these either.
					return totalValuesToPrint.size() - printedIndices.size();
				}
			}
			// now we're left with containment references for which we check the type of the
			// objects to print
			java.util.List<Class<?>> allowedTypes = getAllowedTypes(terminal);
			java.util.Set<Integer> indicesWithCorrectType = new java.util.LinkedHashSet<Integer>();
			int index = 0;
			for (Object valueToPrint : totalValuesToPrint) {
				for (Class<?> allowedType : allowedTypes) {
					if (allowedType.isInstance(valueToPrint)) {
						indicesWithCorrectType.add(index);
					}
				}
				index++;
			}
			indicesWithCorrectType.removeAll(printedIndices);
			return indicesWithCorrectType.size();
		}
		
		public int getNextIndexToPrint(String featureName) {
			int printedValues = featureToPrintedIndicesMap.get(featureName).size();
			return printedValues;
		}
		
	}
	
	public final static String NEW_LINE = java.lang.System.getProperties().getProperty("line.separator");
	
	private final org.kardo.language.ipc.resource.ipc.util.IpcEClassUtil eClassUtil = new org.kardo.language.ipc.resource.ipc.util.IpcEClassUtil();
	
	/**
	 * Holds the resource that is associated with this printer. May be null if the
	 * printer is used stand alone.
	 */
	private org.kardo.language.ipc.resource.ipc.IIpcTextResource resource;
	
	private java.util.Map<?, ?> options;
	private java.io.OutputStream outputStream;
	private String encoding = System.getProperty("file.encoding");
	protected java.util.List<PrintToken> tokenOutputStream;
	private org.kardo.language.ipc.resource.ipc.IIpcTokenResolverFactory tokenResolverFactory = new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenResolverFactory();
	private boolean handleTokenSpaceAutomatically = true;
	private int tokenSpace = 1;
	/**
	 * A flag that indicates whether tokens have already been printed for some object.
	 * The flag is set to false whenever printing of an EObject tree is started. The
	 * status of the flag is used to avoid printing default token space in front of
	 * the root object.
	 */
	private boolean startedPrintingObject = false;
	/**
	 * The number of tab characters that were printed before the current line. This
	 * number is used to calculate the relative indentation when printing contained
	 * objects, because all contained objects must start with this indentation
	 * (tabsBeforeCurrentObject + currentTabs).
	 */
	private int currentTabs;
	/**
	 * The number of tab characters that must be printed before the current object.
	 * This number is used to calculate the indentation of new lines, when line breaks
	 * are printed within one object.
	 */
	private int tabsBeforeCurrentObject;
	/**
	 * This flag is used to indicate whether the number of tabs before the current
	 * object has been set for the current object. The flag is needed, because setting
	 * the number of tabs must be performed when the first token of the contained
	 * element is printed.
	 */
	private boolean startedPrintingContainedObject;
	
	public IpcPrinter2(java.io.OutputStream outputStream, org.kardo.language.ipc.resource.ipc.IIpcTextResource resource) {
		super();
		this.outputStream = outputStream;
		this.resource = resource;
	}
	
	public void print(org.eclipse.emf.ecore.EObject element) throws java.io.IOException {
		tokenOutputStream = new java.util.ArrayList<PrintToken>();
		currentTabs = 0;
		tabsBeforeCurrentObject = 0;
		startedPrintingObject = true;
		startedPrintingContainedObject = false;
		java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement>  formattingElements = new java.util.ArrayList<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement>();
		doPrint(element, formattingElements);
		// print all remaining formatting elements
		java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations = getCopyOfLayoutInformation(element);
		org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation eofLayoutInformation = getLayoutInformation(layoutInformations, null, null, null);
		printFormattingElements(element, formattingElements, layoutInformations, eofLayoutInformation);
		java.io.PrintWriter writer = new java.io.PrintWriter(new java.io.OutputStreamWriter(new java.io.BufferedOutputStream(outputStream), encoding));
		if (handleTokenSpaceAutomatically) {
			printSmart(writer);
		} else {
			printBasic(writer);
		}
		writer.flush();
	}
	
	protected void doPrint(org.eclipse.emf.ecore.EObject element, java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> foundFormattingElements) {
		if (element == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write.");
		}
		if (outputStream == null) {
			throw new java.lang.IllegalArgumentException("Nothing to write on.");
		}
		
		if (element instanceof org.kardo.language.ipc.InstancePointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.IPC_0, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.ipc.IpcExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.IPC_1, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.ipc.IpcSubExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.IPC_2, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.ipc.AfterEvent) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.IPC_3, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.ipc.BeforeEvent) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.IPC_4, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.commons.AspectJCompilationUnit) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_0, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.commons.Aspect) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_1, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pointcuts.CallPointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_2, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pointcuts.ExecutionPointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_3, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pointcuts.GetPointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_4, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pointcuts.SetPointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_5, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pointcuts.ThisPointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_6, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pointcuts.ArgsPointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_7, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pointcuts.WithinPointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_8, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pointcuts.TargetPointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_9, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pointcuts.IfPointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_10, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pointcuts.ReturningPointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_11, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pointcuts.AspectJPointcut) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_12, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.patterns.ConditionalExprPattern) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_13, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.patterns.FieldPattern) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_14, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.patterns.ConstructorPattern) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_15, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.patterns.MethodPattern) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_16, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.patterns.TypePattern) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_17, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.patterns.IdPattern) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_18, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.patterns.ParameterWildcard) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_19, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.advice.AfterReturning) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_21, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.advice.BeforeAdvice) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_22, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pcexp.PointcutExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_23, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pcexp.PointcutOrExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_24, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pcexp.PointcutAndExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_25, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.pcexp.PcAssignmentOperator) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_26, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.containers.EmptyModel) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_0, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.containers.Package) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_1, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.containers.CompilationUnit) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_2, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.imports.ClassifierImport) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_3, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.imports.PackageImport) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_4, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.imports.StaticMemberImport) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_5, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.imports.StaticClassifierImport) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_6, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.classifiers.Class) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_7, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.classifiers.AnonymousClass) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_8, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.classifiers.Interface) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_9, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.classifiers.Enumeration) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_10, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.classifiers.Annotation) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_11, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.annotations.AnnotationInstance) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_12, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.annotations.SingleAnnotationParameter) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_13, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.annotations.AnnotationParameterList) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_14, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.annotations.AnnotationAttributeSetting) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_15, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.generics.TypeParameter) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_16, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.members.EnumConstant) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_17, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.Block) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_18, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.members.Constructor) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_19, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.members.ClassMethod) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_21, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.annotations.AnnotationAttribute) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_22, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.parameters.OrdinaryParameter) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_23, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.parameters.VariableLengthParameter) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_24, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.variables.LocalVariable) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_25, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.LocalVariableStatement) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_26, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.variables.AdditionalLocalVariable) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_27, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.members.Field) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_28, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.members.AdditionalField) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_29, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.members.EmptyMember) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_30, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.instantiations.NewConstructorCall) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_31, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.instantiations.ExplicitConstructorCall) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_32, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.arrays.ArrayInstantiationByValuesTyped) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_33, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.arrays.ArrayInstantiationByValuesUntyped) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_34, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.arrays.ArrayInstantiationBySize) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_35, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.arrays.ArrayInitializer) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_36, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.arrays.ArraySelector) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_37, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.types.NamespaceClassifierReference) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_38, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.types.ClassifierReference) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_39, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.references.MethodCall) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_40, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.references.IdentifierReference) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_41, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.references.ReflectiveClassReference) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_42, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.references.SelfReference) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_43, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.references.PrimitiveTypeReference) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_44, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.This) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_45, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.Super) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_46, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.references.StringReference) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_47, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.generics.QualifiedTypeArgument) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_48, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.generics.UnknownTypeArgument) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_49, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.generics.ExtendsTypeArgument) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_50, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.generics.SuperTypeArgument) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_51, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.Assert) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_52, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.Condition) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_53, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.ForLoop) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_54, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.ForEachLoop) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_55, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.DoWhileLoop) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_57, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.EmptyStatement) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_58, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.SynchronizedBlock) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_59, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.TryBlock) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_60, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.CatchBlock) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_61, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.Switch) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_62, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.NormalSwitchCase) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_63, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.DefaultSwitchCase) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_64, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.Return) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_65, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.Throw) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_66, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.Break) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_67, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.Continue) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_68, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.JumpLabel) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_69, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.ExpressionStatement) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_70, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.ExpressionList) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_71, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.AssignmentExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_72, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.ConditionalExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_73, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.ConditionalOrExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_74, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.ConditionalAndExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_75, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.InclusiveOrExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_76, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.ExclusiveOrExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_77, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.AndExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_78, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.EqualityExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_79, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.InstanceOfExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_80, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.RelationExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_81, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.ShiftExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_82, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.AdditiveExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_83, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.MultiplicativeExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_84, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.UnaryExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_85, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.SuffixUnaryModificationExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_86, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.PrefixUnaryModificationExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_87, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.CastExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_88, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.expressions.NestedExpression) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_89, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.Assignment) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_90, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.AssignmentPlus) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_91, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.AssignmentMinus) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_92, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.AssignmentMultiplication) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_93, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.AssignmentDivision) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_94, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.AssignmentAnd) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_95, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.AssignmentOr) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_96, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.AssignmentExclusiveOr) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_97, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.AssignmentModulo) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_98, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.AssignmentLeftShift) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_99, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.AssignmentRightShift) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_100, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.AssignmentUnsignedRightShift) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_101, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.Addition) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_102, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.Subtraction) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_103, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.Multiplication) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_104, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.Division) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_105, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.Remainder) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_106, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.LessThan) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_107, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.LessThanOrEqual) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_108, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.GreaterThan) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_109, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.GreaterThanOrEqual) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_110, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.LeftShift) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_111, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.RightShift) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_112, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.UnsignedRightShift) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_113, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.Equal) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_114, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.NotEqual) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_115, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.PlusPlus) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_116, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.MinusMinus) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_117, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.Complement) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_118, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.operators.Negate) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_119, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.arrays.ArrayDimension) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_120, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.NullLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_121, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.modifiers.Public) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_122, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.modifiers.Abstract) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_123, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.modifiers.Protected) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_124, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.modifiers.Private) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_125, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.modifiers.Final) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_126, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.modifiers.Static) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_127, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.modifiers.Native) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_128, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.modifiers.Synchronized) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_129, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.modifiers.Transient) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_130, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.modifiers.Volatile) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_131, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.modifiers.Strictfp) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_132, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.types.Void) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_133, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.types.Boolean) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_134, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.types.Char) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_135, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.types.Byte) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_136, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.types.Short) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_137, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.types.Int) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_138, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.types.Long) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_139, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.types.Float) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_140, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.types.Double) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_141, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.DecimalLongLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_142, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.DecimalFloatLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_143, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.DecimalIntegerLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_144, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.DecimalDoubleLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_145, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.HexLongLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_146, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.HexFloatLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_147, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.HexDoubleLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_148, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.HexIntegerLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_149, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.OctalLongLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_150, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.OctalIntegerLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_151, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.CharacterLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_152, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.literals.BooleanLiteral) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_153, foundFormattingElements);
			return;
		}
		if (element instanceof org.kardo.language.aspectj.advice.AfterAdvice) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ASPECTJ_20, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.members.InterfaceMethod) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_20, foundFormattingElements);
			return;
		}
		if (element instanceof org.emftext.language.java.statements.WhileLoop) {
			printInternal(element, org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.JAVA_56, foundFormattingElements);
			return;
		}
		
		addWarningToResource("The printer can not handle " + element.eClass().getName() + " elements", element);
	}
	
	public void printInternal(org.eclipse.emf.ecore.EObject eObject, org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement ruleElement, java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> foundFormattingElements) {
		java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations = getCopyOfLayoutInformation(eObject);
		org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator decoratorTree = getDecoratorTree(ruleElement);
		decorateTree(decoratorTree, eObject);
		printTree(decoratorTree, eObject, foundFormattingElements, layoutInformations);
	}
	
	/**
	 * creates a tree of decorator objects which reflects the syntax tree that is
	 * attached to the given syntax element
	 */
	public org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator getDecoratorTree(org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement syntaxElement) {
		org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement[] children = syntaxElement.getChildren();
		int childCount = children.length;
		org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator[] childDecorators = new org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator[childCount];
		for (int i = 0; i < childCount; i++) {
			childDecorators[i] = getDecoratorTree(children[i]);
		}
		org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator decorator = new org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator(syntaxElement, childDecorators);
		return decorator;
	}
	
	public void decorateTree(org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject) {
		PrintCountingMap printCountingMap = initializePrintCountingMap(eObject);
		java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator> keywordsToPrint = new java.util.ArrayList<org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator>();
		decorateTreeBasic(decorator, eObject, printCountingMap, keywordsToPrint);
		for (org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator keywordToPrint : keywordsToPrint) {
			// for keywords the concrete index does not matter, but we must add one to
			// indicate that the keyword needs to be printed here. Thus, we use 0 as index.
			keywordToPrint.addIndexToPrint(0);
		}
	}
	
	/**
	 * Tries to decorate the decorator with an attribute value, or reference held by
	 * the given EObject. Returns true if an attribute value or reference was found.
	 */
	public boolean decorateTreeBasic(org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, PrintCountingMap printCountingMap, java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator> keywordsToPrint) {
		boolean foundFeatureToPrint = false;
		org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement syntaxElement = decorator.getDecoratedElement();
		org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality = syntaxElement.getCardinality();
		boolean isFirstIteration = true;
		while (true) {
			java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator> subKeywordsToPrint = new java.util.ArrayList<org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator>();
			boolean keepDecorating = false;
			if (syntaxElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword) {
				subKeywordsToPrint.add(decorator);
			} else if (syntaxElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcTerminal) {
				org.kardo.language.ipc.resource.ipc.grammar.IpcTerminal terminal = (org.kardo.language.ipc.resource.ipc.grammar.IpcTerminal) syntaxElement;
				org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
				if (feature == org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ANONYMOUS_FEATURE) {
					return false;
				}
				String featureName = feature.getName();
				int countLeft = printCountingMap.getCountLeft(terminal);
				if (countLeft > terminal.getMandatoryOccurencesAfter()) {
					// normally we print the element at the next index
					int indexToPrint = printCountingMap.getNextIndexToPrint(featureName);
					// But, if there are type restrictions for containments, we must choose an index
					// of an element that fits (i.e., which has the correct type)
					if (terminal instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcContainment) {
						org.kardo.language.ipc.resource.ipc.grammar.IpcContainment containment = (org.kardo.language.ipc.resource.ipc.grammar.IpcContainment) terminal;
						indexToPrint = findElementWithCorrectType(eObject, feature, printCountingMap.getIndicesToPrint(featureName), containment);
					}
					if (indexToPrint >= 0) {
						decorator.addIndexToPrint(indexToPrint);
						printCountingMap.addIndexToPrint(featureName, indexToPrint);
						keepDecorating = true;
					}
				}
			}
			if (syntaxElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcChoice) {
				// for choices we do print only the choice which does print at least one feature
				org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator childToPrint = null;
				for (org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					// pick first choice as default, will be overridden if a choice that prints a
					// feature is found
					if (childToPrint == null) {
						childToPrint = childDecorator;
					}
					if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
						childToPrint = childDecorator;
						break;
					}
				}
				keepDecorating |= decorateTreeBasic(childToPrint, eObject, printCountingMap, subKeywordsToPrint);
			} else {
				// for all other syntax element we do print all children
				for (org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
					keepDecorating |= decorateTreeBasic(childDecorator, eObject, printCountingMap, subKeywordsToPrint);
				}
			}
			foundFeatureToPrint |= keepDecorating;
			// only print keywords if a feature was printed or the syntax element is mandatory
			if (cardinality == org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			} else if (cardinality == org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.PLUS) {
				if (isFirstIteration) {
					keywordsToPrint.addAll(subKeywordsToPrint);
				} else {
					if (keepDecorating) {
						keywordsToPrint.addAll(subKeywordsToPrint);
					}
				}
			} else if (keepDecorating && (cardinality == org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR || cardinality == org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK)) {
				keywordsToPrint.addAll(subKeywordsToPrint);
			}
			if (cardinality == org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE || cardinality == org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK) {
				break;
			} else if (!keepDecorating) {
				break;
			}
			isFirstIteration = false;
		}
		return foundFeatureToPrint;
	}
	
	private int findElementWithCorrectType(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EStructuralFeature feature, java.util.Set<Integer> indicesToPrint, org.kardo.language.ipc.resource.ipc.grammar.IpcContainment containment) {
		// By default the type restrictions that are defined in the CS definition are
		// considered when printing models. You can change this behavior by setting the
		// 'ignoreTypeRestrictionsForPrinting' option to true.
		boolean ignoreTypeRestrictions = false;
		org.eclipse.emf.ecore.EClass[] allowedTypes = containment.getAllowedTypes();
		Object value = eObject.eGet(feature);
		if (value instanceof java.util.List<?>) {
			java.util.List<?> valueList = (java.util.List<?>) value;
			int listSize = valueList.size();
			for (int index = 0; index < listSize; index++) {
				if (indicesToPrint.contains(index)) {
					continue;
				}
				Object valueAtIndex = valueList.get(index);
				if (eClassUtil.isInstance(valueAtIndex, allowedTypes) || ignoreTypeRestrictions) {
					return index;
				}
			}
		} else {
			if (eClassUtil.isInstance(value, allowedTypes) || ignoreTypeRestrictions) {
				return 0;
			}
		}
		return -1;
	}
	
	/**
	 * Checks whether decorating the given node will use at least one attribute value,
	 * or reference held by eObject. Returns true if a printable attribute value or
	 * reference was found. This method is used to decide which choice to pick, when
	 * multiple choices are available. We pick the choice that prints at least one
	 * attribute or reference.
	 */
	public boolean doesPrintFeature(org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, PrintCountingMap printCountingMap) {
		org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement syntaxElement = decorator.getDecoratedElement();
		if (syntaxElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcTerminal) {
			org.kardo.language.ipc.resource.ipc.grammar.IpcTerminal terminal = (org.kardo.language.ipc.resource.ipc.grammar.IpcTerminal) syntaxElement;
			org.eclipse.emf.ecore.EStructuralFeature feature = terminal.getFeature();
			if (feature == org.kardo.language.ipc.resource.ipc.grammar.IpcGrammarInformationProvider.ANONYMOUS_FEATURE) {
				return false;
			}
			int countLeft = printCountingMap.getCountLeft(terminal);
			if (countLeft > terminal.getMandatoryOccurencesAfter()) {
				// found a feature to print
				return true;
			}
		}
		for (org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
			if (doesPrintFeature(childDecorator, eObject, printCountingMap)) {
				return true;
			}
		}
		return false;
	}
	
	public boolean printTree(org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator decorator, org.eclipse.emf.ecore.EObject eObject, java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> foundFormattingElements, java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations) {
		org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement printElement = decorator.getDecoratedElement();
		org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality cardinality = printElement.getCardinality();
		java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> cloned = new java.util.ArrayList<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement>();
		cloned.addAll(foundFormattingElements);
		boolean foundSomethingAtAll = false;
		boolean foundSomethingToPrint;
		while (true) {
			foundSomethingToPrint = false;
			Integer indexToPrint = decorator.getNextIndexToPrint();
			if (indexToPrint != null) {
				if (printElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword) {
					printKeyword(eObject, (org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword) printElement, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder) {
					org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder placeholder = (org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder) printElement;
					printFeature(eObject, placeholder, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcContainment) {
					org.kardo.language.ipc.resource.ipc.grammar.IpcContainment containment = (org.kardo.language.ipc.resource.ipc.grammar.IpcContainment) printElement;
					printContainedObject(eObject, containment, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcBooleanTerminal) {
					org.kardo.language.ipc.resource.ipc.grammar.IpcBooleanTerminal booleanTerminal = (org.kardo.language.ipc.resource.ipc.grammar.IpcBooleanTerminal) printElement;
					printBooleanTerminal(eObject, booleanTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				} else if (printElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcEnumerationTerminal) {
					org.kardo.language.ipc.resource.ipc.grammar.IpcEnumerationTerminal enumTerminal = (org.kardo.language.ipc.resource.ipc.grammar.IpcEnumerationTerminal) printElement;
					printEnumerationTerminal(eObject, enumTerminal, indexToPrint, foundFormattingElements, layoutInformations);
					foundSomethingToPrint = true;
				}
			}
			if (foundSomethingToPrint) {
				foundSomethingAtAll = true;
			}
			if (printElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace) {
				foundFormattingElements.add((org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace) printElement);
			}
			if (printElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak) {
				foundFormattingElements.add((org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak) printElement);
			}
			for (org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxElementDecorator childDecorator : decorator.getChildDecorators()) {
				foundSomethingToPrint |= printTree(childDecorator, eObject, foundFormattingElements, layoutInformations);
				org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement decoratedElement = decorator.getDecoratedElement();
				if (foundSomethingToPrint && decoratedElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcChoice) {
					break;
				}
			}
			if (cardinality == org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.ONE || cardinality == org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK) {
				break;
			} else if (!foundSomethingToPrint) {
				break;
			}
		}
		// only print formatting elements if a feature was printed or the syntax element
		// is mandatory
		if (!foundSomethingAtAll && (cardinality == org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.STAR || cardinality == org.kardo.language.ipc.resource.ipc.grammar.IpcCardinality.QUESTIONMARK)) {
			foundFormattingElements.clear();
			foundFormattingElements.addAll(cloned);
		}
		return foundSomethingToPrint;
	}
	
	public void printKeyword(org.eclipse.emf.ecore.EObject eObject, org.kardo.language.ipc.resource.ipc.grammar.IpcKeyword keyword, java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> foundFormattingElements, java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations) {
		org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation keywordLayout = getLayoutInformation(layoutInformations, keyword, null, eObject);
		printFormattingElements(eObject, foundFormattingElements, layoutInformations, keywordLayout);
		String value = keyword.getValue();
		tokenOutputStream.add(new PrintToken(value, "'" + org.kardo.language.ipc.resource.ipc.util.IpcStringUtil.escapeToANTLRKeyword(value) + "'", eObject));
	}
	
	public void printFeature(org.eclipse.emf.ecore.EObject eObject, org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder placeholder, int count, java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> foundFormattingElements, java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature feature = placeholder.getFeature();
		if (feature instanceof org.eclipse.emf.ecore.EAttribute) {
			printAttribute(eObject, (org.eclipse.emf.ecore.EAttribute) feature, placeholder, count, foundFormattingElements, layoutInformations);
		} else {
			printReference(eObject, (org.eclipse.emf.ecore.EReference) feature, placeholder, count, foundFormattingElements, layoutInformations);
		}
	}
	
	public void printAttribute(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EAttribute attribute, org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder placeholder, int index, java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> foundFormattingElements, java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations) {
		String result = null;
		Object attributeValue = org.kardo.language.ipc.resource.ipc.util.IpcEObjectUtil.getFeatureValue(eObject, attribute, index);
		org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, placeholder, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the attribute is deresolved to obtain its textual
			// representation
			org.kardo.language.ipc.resource.ipc.IIpcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(placeholder.getTokenName());
			tokenResolver.setOptions(getOptions());
			String deResolvedValue = tokenResolver.deResolve(attributeValue, attribute, eObject);
			result = deResolvedValue;
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, placeholder.getTokenName(), eObject));
		}
	}
	
	
	public void printBooleanTerminal(org.eclipse.emf.ecore.EObject eObject, org.kardo.language.ipc.resource.ipc.grammar.IpcBooleanTerminal booleanTerminal, int index, java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> foundFormattingElements, java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = booleanTerminal.getAttribute();
		String result = null;
		Object attributeValue = org.kardo.language.ipc.resource.ipc.util.IpcEObjectUtil.getFeatureValue(eObject, attribute, index);
		org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, booleanTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the boolean attribute is converted to its textual
			// representation using the literals of the boolean terminal
			if (Boolean.TRUE.equals(attributeValue)) {
				result = booleanTerminal.getTrueLiteral();
			} else {
				result = booleanTerminal.getFalseLiteral();
			}
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + org.kardo.language.ipc.resource.ipc.util.IpcStringUtil.escapeToANTLRKeyword(result) + "'", eObject));
		}
	}
	
	
	public void printEnumerationTerminal(org.eclipse.emf.ecore.EObject eObject, org.kardo.language.ipc.resource.ipc.grammar.IpcEnumerationTerminal enumTerminal, int index, java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> foundFormattingElements, java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EAttribute attribute = enumTerminal.getAttribute();
		String result = null;
		Object attributeValue = org.kardo.language.ipc.resource.ipc.util.IpcEObjectUtil.getFeatureValue(eObject, attribute, index);
		org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation attributeLayout = getLayoutInformation(layoutInformations, enumTerminal, attributeValue, eObject);
		String visibleTokenText = getVisibleTokenText(attributeLayout);
		// if there is text for the attribute we use it
		if (visibleTokenText != null) {
			result = visibleTokenText;
		}
		
		if (result == null) {
			// if no text is available, the enumeration attribute is converted to its textual
			// representation using the literals of the enumeration terminal
			assert attributeValue instanceof org.eclipse.emf.common.util.Enumerator;
			result = enumTerminal.getText(((org.eclipse.emf.common.util.Enumerator) attributeValue).getName());
		}
		
		if (result != null && !"".equals(result)) {
			printFormattingElements(eObject, foundFormattingElements, layoutInformations, attributeLayout);
			// write result to the output stream
			tokenOutputStream.add(new PrintToken(result, "'" + org.kardo.language.ipc.resource.ipc.util.IpcStringUtil.escapeToANTLRKeyword(result) + "'", eObject));
		}
	}
	
	
	public void printContainedObject(org.eclipse.emf.ecore.EObject eObject, org.kardo.language.ipc.resource.ipc.grammar.IpcContainment containment, int index, java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> foundFormattingElements, java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations) {
		org.eclipse.emf.ecore.EStructuralFeature reference = containment.getFeature();
		Object o = org.kardo.language.ipc.resource.ipc.util.IpcEObjectUtil.getFeatureValue(eObject, reference, index);
		// save current number of tabs to restore them after printing the contained object
		int oldTabsBeforeCurrentObject = tabsBeforeCurrentObject;
		int oldCurrentTabs = currentTabs;
		// use current number of tabs to indent contained object. we do not directly set
		// 'tabsBeforeCurrentObject' because the first element of the new object must be
		// printed with the old number of tabs.
		startedPrintingContainedObject = false;
		currentTabs = 0;
		doPrint((org.eclipse.emf.ecore.EObject) o, foundFormattingElements);
		// restore number of tabs after printing the contained object
		tabsBeforeCurrentObject = oldTabsBeforeCurrentObject;
		currentTabs = oldCurrentTabs;
	}
	
	public void printFormattingElements(org.eclipse.emf.ecore.EObject eObject, java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> foundFormattingElements, java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations, org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation layoutInformation) {
		String hiddenTokenText = getHiddenTokenText(layoutInformation);
		if (hiddenTokenText != null) {
			// removed used information
			if (layoutInformations != null) {
				layoutInformations.remove(layoutInformation);
			}
			tokenOutputStream.add(new PrintToken(hiddenTokenText, null, eObject));
			foundFormattingElements.clear();
			startedPrintingObject = false;
			setTabsBeforeCurrentObject(0);
			return;
		}
		int printedTabs = 0;
		if (foundFormattingElements.size() > 0) {
			for (org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement foundFormattingElement : foundFormattingElements) {
				if (foundFormattingElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace) {
					int amount = ((org.kardo.language.ipc.resource.ipc.grammar.IpcWhiteSpace) foundFormattingElement).getAmount();
					for (int i = 0; i < amount; i++) {
						tokenOutputStream.add(createSpaceToken(eObject));
					}
				}
				if (foundFormattingElement instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak) {
					currentTabs = ((org.kardo.language.ipc.resource.ipc.grammar.IpcLineBreak) foundFormattingElement).getTabs();
					printedTabs += currentTabs;
					tokenOutputStream.add(createNewLineToken(eObject));
					for (int i = 0; i < tabsBeforeCurrentObject + currentTabs; i++) {
						tokenOutputStream.add(createTabToken(eObject));
					}
				}
			}
			foundFormattingElements.clear();
			startedPrintingObject = false;
		} else {
			if (startedPrintingObject) {
				// if no elements have been printed yet, we do not add the default token space,
				// because spaces before the first element are not desired.
				startedPrintingObject = false;
			} else {
				if (!handleTokenSpaceAutomatically) {
					tokenOutputStream.add(new PrintToken(getWhiteSpaceString(tokenSpace), null, eObject));
				}
			}
		}
		// after printing the first element, we can use the new number of tabs.
		setTabsBeforeCurrentObject(printedTabs);
	}
	
	private void setTabsBeforeCurrentObject(int tabs) {
		if (startedPrintingContainedObject) {
			return;
		}
		tabsBeforeCurrentObject = tabsBeforeCurrentObject + tabs;
		startedPrintingContainedObject = true;
	}
	
	@SuppressWarnings("unchecked")	
	public void printReference(org.eclipse.emf.ecore.EObject eObject, org.eclipse.emf.ecore.EReference reference, org.kardo.language.ipc.resource.ipc.grammar.IpcPlaceholder placeholder, int index, java.util.List<org.kardo.language.ipc.resource.ipc.grammar.IpcFormattingElement> foundFormattingElements, java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations) {
		String tokenName = placeholder.getTokenName();
		Object referencedObject = org.kardo.language.ipc.resource.ipc.util.IpcEObjectUtil.getFeatureValue(eObject, reference, index, false);
		// first add layout before the reference
		org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation referenceLayout = getLayoutInformation(layoutInformations, placeholder, referencedObject, eObject);
		printFormattingElements(eObject, foundFormattingElements, layoutInformations, referenceLayout);
		// proxy objects must be printed differently
		String deresolvedReference = null;
		if (referencedObject instanceof org.eclipse.emf.ecore.EObject) {
			org.eclipse.emf.ecore.EObject eObjectToDeResolve = (org.eclipse.emf.ecore.EObject) referencedObject;
			if (eObjectToDeResolve.eIsProxy()) {
				deresolvedReference = ((org.eclipse.emf.ecore.InternalEObject) eObjectToDeResolve).eProxyURI().fragment();
				// If the proxy was created by EMFText, we can try to recover the identifier from
				// the proxy URI
				if (deresolvedReference != null && deresolvedReference.startsWith(org.kardo.language.ipc.resource.ipc.IIpcContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX)) {
					deresolvedReference = deresolvedReference.substring(org.kardo.language.ipc.resource.ipc.IIpcContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX.length());
					deresolvedReference = deresolvedReference.substring(deresolvedReference.indexOf("_") + 1);
				}
			}
		}
		if (deresolvedReference == null) {
			// NC-References must always be printed by deresolving the reference. We cannot
			// use the visible token information, because deresolving usually depends on
			// attribute values of the referenced object instead of the object itself.
			@SuppressWarnings("rawtypes")			
			org.kardo.language.ipc.resource.ipc.IIpcReferenceResolver referenceResolver = getReferenceResolverSwitch().getResolver(reference);
			referenceResolver.setOptions(getOptions());
			deresolvedReference = referenceResolver.deResolve((org.eclipse.emf.ecore.EObject) referencedObject, eObject, reference);
		}
		org.kardo.language.ipc.resource.ipc.IIpcTokenResolver tokenResolver = tokenResolverFactory.createTokenResolver(tokenName);
		tokenResolver.setOptions(getOptions());
		String deresolvedToken = tokenResolver.deResolve(deresolvedReference, reference, eObject);
		// write result to output stream
		tokenOutputStream.add(new PrintToken(deresolvedToken, tokenName, eObject));
	}
	
	@SuppressWarnings("unchecked")	
	public PrintCountingMap initializePrintCountingMap(org.eclipse.emf.ecore.EObject eObject) {
		// The PrintCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		PrintCountingMap printCountingMap = new PrintCountingMap();
		java.util.List<org.eclipse.emf.ecore.EStructuralFeature> features = eObject.eClass().getEAllStructuralFeatures();
		for (org.eclipse.emf.ecore.EStructuralFeature feature : features) {
			// We get the feature value without resolving it, because resolving is not
			// required to count the number of elements that are referenced by the feature.
			// Moreover, triggering reference resolving is not desired here, because we'd also
			// like to print models that contain unresolved references.
			Object featureValue = eObject.eGet(feature, false);
			if (featureValue != null) {
				if (featureValue instanceof java.util.List<?>) {
					printCountingMap.setFeatureValues(feature.getName(), (java.util.List<Object>) featureValue);
				} else {
					printCountingMap.setFeatureValues(feature.getName(), java.util.Collections.singletonList(featureValue));
				}
			} else {
				printCountingMap.setFeatureValues(feature.getName(), null);
			}
		}
		return printCountingMap;
	}
	
	public java.util.Map<?,?> getOptions() {
		return options;
	}
	
	public void setOptions(java.util.Map<?,?> options) {
		this.options = options;
	}
	
	public String getEncoding() {
		return encoding;
	}
	
	public void setEncoding(String encoding) {
		if (encoding != null) {
			this.encoding = encoding;
		}
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcTextResource getResource() {
		return resource;
	}
	
	protected org.kardo.language.ipc.resource.ipc.mopp.IpcReferenceResolverSwitch getReferenceResolverSwitch() {
		return (org.kardo.language.ipc.resource.ipc.mopp.IpcReferenceResolverSwitch) new org.kardo.language.ipc.resource.ipc.mopp.IpcMetaInformation().getReferenceResolverSwitch();
	}
	
	protected void addWarningToResource(final String errorMessage, org.eclipse.emf.ecore.EObject cause) {
		org.kardo.language.ipc.resource.ipc.IIpcTextResource resource = getResource();
		if (resource == null) {
			// the resource can be null if the printer is used stand alone
			return;
		}
		resource.addProblem(new org.kardo.language.ipc.resource.ipc.mopp.IpcProblem(errorMessage, org.kardo.language.ipc.resource.ipc.IpcEProblemType.PRINT_PROBLEM, org.kardo.language.ipc.resource.ipc.IpcEProblemSeverity.WARNING), cause);
	}
	
	protected org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformationAdapter getLayoutInformationAdapter(org.eclipse.emf.ecore.EObject element) {
		for (org.eclipse.emf.common.notify.Adapter adapter : element.eAdapters()) {
			if (adapter instanceof org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformationAdapter) {
				return (org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformationAdapter) adapter;
			}
		}
		org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformationAdapter newAdapter = new org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformationAdapter();
		element.eAdapters().add(newAdapter);
		return newAdapter;
	}
	
	private org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation getLayoutInformation(java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations, org.kardo.language.ipc.resource.ipc.grammar.IpcSyntaxElement syntaxElement, Object object, org.eclipse.emf.ecore.EObject container) {
		for (org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation layoutInformation : layoutInformations) {
			if (syntaxElement == layoutInformation.getSyntaxElement()) {
				if (object == null) {
					return layoutInformation;
				}
				// The layout information adapter must only try to resolve the object it refers
				// to, if we compare with a non-proxy object. If we're printing a resource that
				// contains proxy objects, resolving must not be triggered.
				boolean isNoProxy = true;
				if (object instanceof org.eclipse.emf.ecore.EObject) {
					org.eclipse.emf.ecore.EObject eObject = (org.eclipse.emf.ecore.EObject) object;
					isNoProxy = !eObject.eIsProxy();
				}
				if (isSame(object, layoutInformation.getObject(container, isNoProxy))) {
					return layoutInformation;
				}
			}
		}
		return null;
	}
	
	public java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> getCopyOfLayoutInformation(org.eclipse.emf.ecore.EObject eObject) {
		org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformationAdapter layoutInformationAdapter = getLayoutInformationAdapter(eObject);
		java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> originalLayoutInformations = layoutInformationAdapter.getLayoutInformations();
		// create a copy of the original list of layout information object in order to be
		// able to remove used informations during printing
		java.util.List<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation> layoutInformations = new java.util.ArrayList<org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation>(originalLayoutInformations.size());
		layoutInformations.addAll(originalLayoutInformations);
		return layoutInformations;
	}
	
	private String getHiddenTokenText(org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getHiddenTokenText();
		} else {
			return null;
		}
	}
	
	private String getVisibleTokenText(org.kardo.language.ipc.resource.ipc.mopp.IpcLayoutInformation layoutInformation) {
		if (layoutInformation != null) {
			return layoutInformation.getVisibleTokenText();
		} else {
			return null;
		}
	}
	
	protected String getWhiteSpaceString(int count) {
		return getRepeatingString(count, ' ');
	}
	
	private String getRepeatingString(int count, char character) {
		StringBuffer result = new StringBuffer();
		for (int i = 0; i < count; i++) {
			result.append(character);
		}
		return result.toString();
	}
	
	public void setHandleTokenSpaceAutomatically(boolean handleTokenSpaceAutomatically) {
		this.handleTokenSpaceAutomatically = handleTokenSpaceAutomatically;
	}
	
	public void setTokenSpace(int tokenSpace) {
		this.tokenSpace = tokenSpace;
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer (as it is).
	 */
	public void printBasic(java.io.PrintWriter writer) throws java.io.IOException {
		for (PrintToken nextToken : tokenOutputStream) {
			writer.write(nextToken.getText());
		}
	}
	
	/**
	 * Prints the current tokenOutputStream to the given writer.
	 * 
	 * This methods implements smart whitespace printing. It does so by writing output
	 * to a token stream instead of printing the raw token text to a PrintWriter.
	 * Tokens in this stream hold both the text and the type of the token (i.e., its
	 * name).
	 * 
	 * To decide where whitespace is needed, sequences of successive tokens are
	 * searched that can be printed without separating whitespace. To determine such
	 * groups we start with two successive non-whitespace tokens, concatenate their
	 * text and use the generated ANTLR lexer to split the text. If the resulting
	 * token sequence of the concatenated text is exactly the same as the one that is
	 * to be printed, no whitespace is needed. The tokens in the sequence are checked
	 * both regarding their type and their text. If two tokens successfully form a
	 * group a third one is added and so on.
	 */
	public void printSmart(java.io.PrintWriter writer) throws java.io.IOException {
		// stores the text of the current group of tokens. this text is given to the lexer
		// to check whether it can be correctly scanned.
		StringBuilder currentBlock = new StringBuilder();
		// stores the index of the first token of the current group.
		int currentBlockStart = 0;
		// stores the text that was already successfully checked (i.e., is can be scanned
		// correctly and can thus be printed).
		String validBlock = "";
		char lastCharWritten = ' ';
		for (int i = 0; i < tokenOutputStream.size(); i++) {
			PrintToken tokenI = tokenOutputStream.get(i);
			currentBlock.append(tokenI.getText());
			// if declared or preserved whitespace is found - print block
			if (tokenI.getTokenName() == null) {
				char[] charArray = currentBlock.toString().toCharArray();
				writer.write(charArray);
				if (charArray.length > 0) {
					lastCharWritten = charArray[charArray.length - 1];
				}
				// reset all values
				currentBlock = new StringBuilder();
				currentBlockStart = i + 1;
				validBlock = "";
				continue;
			}
			// now check whether the current block can be scanned
			org.kardo.language.ipc.resource.ipc.IIpcTextScanner scanner = new org.kardo.language.ipc.resource.ipc.mopp.IpcMetaInformation().createLexer();
			scanner.setText(currentBlock.toString());
			// retrieve all tokens from scanner and add them to list 'tempTokens'
			java.util.List<org.kardo.language.ipc.resource.ipc.IIpcTextToken> tempTokens = new java.util.ArrayList<org.kardo.language.ipc.resource.ipc.IIpcTextToken>();
			org.kardo.language.ipc.resource.ipc.IIpcTextToken nextToken = scanner.getNextToken();
			while (nextToken != null && nextToken.getText() != null) {
				tempTokens.add(nextToken);
				nextToken = scanner.getNextToken();
			}
			boolean sequenceIsValid = true;
			// check whether the current block was scanned to the same token sequence
			for (int t = 0; t < tempTokens.size(); t++) {
				PrintToken printTokenT = tokenOutputStream.get(currentBlockStart + t);
				org.kardo.language.ipc.resource.ipc.IIpcTextToken tempToken = tempTokens.get(t);
				if (!tempToken.getText().equals(printTokenT.getText())) {
					sequenceIsValid = false;
					break;
				}
				String commonTokenName = tempToken.getName();
				String printTokenName = printTokenT.getTokenName();
				if (printTokenName.length() > 2 && printTokenName.startsWith("'") && printTokenName.endsWith("'")) {
					printTokenName = printTokenName.substring(1, printTokenName.length() - 1);
				}
				if (!commonTokenName.equals(printTokenName)) {
					sequenceIsValid = false;
					break;
				}
			}
			if (sequenceIsValid) {
				// sequence is still valid, try adding one more token in the next iteration of the
				// loop
				validBlock += tokenI.getText();
			} else {
				// sequence is not valid, must print whitespace to separate tokens
				// print text that is valid so far
				char[] charArray = validBlock.toString().toCharArray();
				writer.write(charArray);
				if (charArray.length > 0) {
					lastCharWritten = charArray[charArray.length - 1];
				}
				// print separating whitespace
				// if no whitespace (or tab or linebreak) is already there
				if (lastCharWritten != ' ' && lastCharWritten != '\t' && lastCharWritten != '\n' && lastCharWritten != '\r') {
					lastCharWritten = ' ';
					writer.write(lastCharWritten);
				}
				// add current token as initial value for next iteration
				currentBlock = new StringBuilder(tokenI.getText());
				currentBlockStart = i;
				validBlock = tokenI.getText();
			}
		}
		// flush remaining valid text to writer
		writer.write(validBlock);
	}
	
	private boolean isSame(Object o1, Object o2) {
		if (o1 instanceof String || o1 instanceof Integer || o1 instanceof Long || o1 instanceof Byte || o1 instanceof Short || o1 instanceof Float || o2 instanceof Double) {
			return o1.equals(o2);
		}
		return o1 == o2;
	}
	
	protected java.util.List<Class<?>> getAllowedTypes(org.kardo.language.ipc.resource.ipc.grammar.IpcTerminal terminal) {
		java.util.List<Class<?>> allowedTypes = new java.util.ArrayList<Class<?>>();
		allowedTypes.add(terminal.getFeature().getEType().getInstanceClass());
		if (terminal instanceof org.kardo.language.ipc.resource.ipc.grammar.IpcContainment) {
			org.kardo.language.ipc.resource.ipc.grammar.IpcContainment printingContainment = (org.kardo.language.ipc.resource.ipc.grammar.IpcContainment) terminal;
			org.eclipse.emf.ecore.EClass[] typeRestrictions = printingContainment.getAllowedTypes();
			if (typeRestrictions != null && typeRestrictions.length > 0) {
				allowedTypes.clear();
				for (org.eclipse.emf.ecore.EClass eClass : typeRestrictions) {
					allowedTypes.add(eClass.getInstanceClass());
				}
			}
		}
		return allowedTypes;
	}
	
	protected PrintToken createSpaceToken(org.eclipse.emf.ecore.EObject container) {
		return new PrintToken(" ", null, container);
	}
	
	protected PrintToken createTabToken(org.eclipse.emf.ecore.EObject container) {
		return new PrintToken("\t", null, container);
	}
	
	protected PrintToken createNewLineToken(org.eclipse.emf.ecore.EObject container) {
		return new PrintToken(NEW_LINE, null, container);
	}
	
}
