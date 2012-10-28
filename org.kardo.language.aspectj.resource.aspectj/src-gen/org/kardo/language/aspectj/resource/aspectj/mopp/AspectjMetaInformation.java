/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

public class AspectjMetaInformation implements org.kardo.language.aspectj.resource.aspectj.IAspectjMetaInformation {
	
	public String getSyntaxName() {
		return "aspectj";
	}
	
	public String getURI() {
		return "http://www.emftext.org/language/aspectj";
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjTextScanner createLexer() {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjAntlrScanner(new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjLexer());
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjTextParser createParser(java.io.InputStream inputStream, String encoding) {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjParser().createInstance(inputStream, encoding);
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjTextPrinter createPrinter(java.io.OutputStream outputStream, org.kardo.language.aspectj.resource.aspectj.IAspectjTextResource resource) {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjPrinter2(outputStream, resource);
	}
	
	public org.eclipse.emf.ecore.EClass[] getClassesWithSyntax() {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjSyntaxCoverageInformationProvider().getClassesWithSyntax();
	}
	
	public org.eclipse.emf.ecore.EClass[] getStartSymbols() {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjSyntaxCoverageInformationProvider().getStartSymbols();
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolverSwitch getReferenceResolverSwitch() {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjReferenceResolverSwitch();
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolverFactory getTokenResolverFactory() {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjTokenResolverFactory();
	}
	
	public String getPathToCSDefinition() {
		return "org.kardo.language.aspectj/metamodel/aspectj.cs";
	}
	
	public String[] getTokenNames() {
		return org.kardo.language.aspectj.resource.aspectj.mopp.AspectjParser.tokenNames;
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjTokenStyle getDefaultTokenStyle(String tokenName) {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjTokenStyleInformationProvider().getDefaultTokenStyle(tokenName);
	}
	
	public java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjBracketPair> getBracketPairs() {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjBracketInformationProvider().getBracketPairs();
	}
	
	public org.eclipse.emf.ecore.EClass[] getFoldableClasses() {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjFoldingInformationProvider().getFoldableClasses();
	}
	
	public org.eclipse.emf.ecore.resource.Resource.Factory createResourceFactory() {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjResourceFactory();
	}
	
	public org.kardo.language.aspectj.resource.aspectj.mopp.AspectjNewFileContentProvider getNewFileContentProvider() {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjNewFileContentProvider();
	}
	
	public void registerResourceFactory() {
		// if no resource factory registered, register delegator
		if (org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().get(getSyntaxName()) == null) {
			org.eclipse.emf.ecore.resource.Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put(getSyntaxName(), new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjResourceFactoryDelegator());
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
		return "org.kardo.language.aspectj.resource.aspectj.ui.launchConfigurationType";
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjNameProvider createNameProvider() {
		return new org.kardo.language.aspectj.resource.aspectj.analysis.AspectjDefaultNameProvider();
	}
	
	public String[] getSyntaxHighlightableTokenNames() {
		org.kardo.language.aspectj.resource.aspectj.mopp.AspectjAntlrTokenHelper tokenHelper = new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjAntlrTokenHelper();
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
		highlightableTokens.add(org.kardo.language.aspectj.resource.aspectj.mopp.AspectjTokenStyleInformationProvider.TASK_ITEM_TOKEN_NAME);
		return highlightableTokens.toArray(new String[highlightableTokens.size()]);
	}
	
}
