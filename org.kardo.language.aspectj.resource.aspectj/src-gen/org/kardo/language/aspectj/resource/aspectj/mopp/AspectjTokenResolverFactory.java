/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

/**
 * The AspectjTokenResolverFactory class provides access to all generated token
 * resolvers. By giving the name of a defined token, the corresponding resolve can
 * be obtained. Despite the fact that this class is called TokenResolverFactory is
 * does NOT create new token resolvers whenever a client calls methods to obtain a
 * resolver. Rather, this class maintains a map of all resolvers and creates each
 * resolver at most once.
 */
public class AspectjTokenResolverFactory implements org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolverFactory {
	
	private java.util.Map<String, org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver> tokenName2TokenResolver;
	private java.util.Map<String, org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver> featureName2CollectInTokenResolver;
	private static org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver defaultResolver = new org.kardo.language.aspectj.resource.aspectj.analysis.AspectjDefaultTokenResolver();
	
	public AspectjTokenResolverFactory() {
		tokenName2TokenResolver = new java.util.LinkedHashMap<String, org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver>();
		featureName2CollectInTokenResolver = new java.util.LinkedHashMap<String, org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver>();
		registerTokenResolver("BOOLEAN_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaBOOLEAN_LITERALTokenResolver());
		registerTokenResolver("CHARACTER_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaCHARACTER_LITERALTokenResolver());
		registerTokenResolver("STRING_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaSTRING_LITERALTokenResolver());
		registerTokenResolver("DECIMAL_LONG_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaDECIMAL_LONG_LITERALTokenResolver());
		registerTokenResolver("HEX_FLOAT_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaHEX_FLOAT_LITERALTokenResolver());
		registerTokenResolver("HEX_DOUBLE_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaHEX_DOUBLE_LITERALTokenResolver());
		registerTokenResolver("HEX_LONG_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaHEX_LONG_LITERALTokenResolver());
		registerTokenResolver("HEX_INTEGER_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaHEX_INTEGER_LITERALTokenResolver());
		registerTokenResolver("DECIMAL_FLOAT_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaDECIMAL_FLOAT_LITERALTokenResolver());
		registerTokenResolver("DECIMAL_DOUBLE_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaDECIMAL_DOUBLE_LITERALTokenResolver());
		registerTokenResolver("DECIMAL_INTEGER_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaDECIMAL_INTEGER_LITERALTokenResolver());
		registerTokenResolver("OCTAL_LONG_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaOCTAL_LONG_LITERALTokenResolver());
		registerTokenResolver("OCTAL_INTEGER_LITERAL", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaOCTAL_INTEGER_LITERALTokenResolver());
		registerTokenResolver("IDENTIFIER", new org.kardo.language.aspectj.resource.aspectj.analysis.JavaIDENTIFIERTokenResolver());
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver createTokenResolver(String tokenName) {
		return internalCreateResolver(tokenName2TokenResolver, tokenName);
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver createCollectInTokenResolver(String featureName) {
		return internalCreateResolver(featureName2CollectInTokenResolver, featureName);
	}
	
	protected boolean registerTokenResolver(String tokenName, org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver resolver){
		return internalRegisterTokenResolver(tokenName2TokenResolver, tokenName, resolver);
	}
	
	protected boolean registerCollectInTokenResolver(String featureName, org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver resolver){
		return internalRegisterTokenResolver(featureName2CollectInTokenResolver, featureName, resolver);
	}
	
	protected org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver deRegisterTokenResolver(String tokenName){
		return tokenName2TokenResolver.remove(tokenName);
	}
	
	private org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver internalCreateResolver(java.util.Map<String, org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver> resolverMap, String key) {
		if (resolverMap.containsKey(key)){
			return resolverMap.get(key);
		} else {
			return defaultResolver;
		}
	}
	
	private boolean internalRegisterTokenResolver(java.util.Map<String, org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver> resolverMap, String key, org.kardo.language.aspectj.resource.aspectj.IAspectjTokenResolver resolver) {
		if (!resolverMap.containsKey(key)) {
			resolverMap.put(key,resolver);
			return true;
		}
		return false;
	}
	
}
