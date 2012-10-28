/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.ipc.resource.ipc.mopp;

public class IpcMetaInformation implements org.kardo.language.ipc.resource.ipc.IIpcMetaInformation {
	
	public String getSyntaxName() {
		return "ipc";
	}
	
	public String getURI() {
		return "http://www.emftext.org/language/ipc";
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcTextScanner createLexer() {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcAntlrScanner(new org.kardo.language.ipc.resource.ipc.mopp.IpcLexer());
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcParser().createInstance(inputStream, encoding);
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcTextPrinter createPrinter(java.io.OutputStream outputStream, org.kardo.language.ipc.resource.ipc.IIpcTextResource resource) {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcReferenceResolverSwitch();
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcTokenResolverFactory getTokenResolverFactory() {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.kardo.language.ipc/metamodel/ipc.cs";
	}
	
	public String[] getTokenNames() {
		return org.kardo.language.ipc.resource.ipc.mopp.IpcParser.tokenNames;
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.kardo.language.ipc.resource.ipc.IIpcBracketPair> getBracketPairs() {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcResourceFactory();
	}
	
	public org.kardo.language.ipc.resource.ipc.mopp.IpcNewFileContentProvider getNewFileContentProvider() {
		return new org.kardo.language.ipc.resource.ipc.mopp.IpcNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.kardo.language.ipc.resource.ipc.mopp.IpcResourceFactoryDelegator());
		}
	}
	
	/**
	 * Returns the key of the option that can be used to register a preprocessor that
	 * is used as a pipe when loading resources. This key is language-specific. To
	 * register one preprocessor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getInputStreamPreprocessorProviderOptionKey() {
		return getSyntaxName() + "_" + "INPUT_STREAM_PREPROCESSOR_PROVIDER";
	}
	
	/**
	 * Returns the key of the option that can be used to register a post-processors
	 * that are invoked after loading resources. This key is language-specific. To
	 * register one post-processor for multiple resource types, it must be registered
	 * individually using all keys.
	 */
	public String getResourcePostProcessorProviderOptionKey() {
		return getSyntaxName() + "_" + "RESOURCE_POSTPROCESSOR_PROVIDER";
	}
	
	public String getLaunchConfigurationType() {
		return "org.kardo.language.ipc.resource.ipc.ui.launchConfigurationType";
	}
	
	public org.kardo.language.ipc.resource.ipc.IIpcNameProvider createNameProvider() {
		return new org.kardo.language.ipc.resource.ipc.analysis.IpcDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.kardo.language.ipc.resource.ipc.mopp.IpcAntlrTokenHelper tokenHelper = new org.kardo.language.ipc.resource.ipc.mopp.IpcAntlrTokenHelper();
		java.util.List<String> highlightableTokens = new java.util.ArrayList<String>();
		String[] parserTokenNames = getTokenNames();
		for (int i = 0; i < parserTokenNames.length; i++) {
			// If ANTLR is used we need to normalize the token names
			if (!tokenHelper.canBeUsedForSyntaxHighlighting(i)) {
				continue;
			}
			String tokenName = tokenHelper.getTokenName(parserTokenNames, i);
			if (tokenName == null) {
				continue;
			}
			highlightableTokens.add(tokenName);
		}
		highlightableTokens.add(org.kardo.language.ipc.resource.ipc.mopp.IpcTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
