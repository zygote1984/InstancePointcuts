/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

public class AspectjResource extends org.eclipse.emf.ecore.resource.impl.ResourceImpl implements org.kardo.language.aspectj.resource.aspectj.IAspectjTextResource {
	
	public class ElementBasedTextDiagnostic implements org.kardo.language.aspectj.resource.aspectj.IAspectjTextDiagnostic {
		
		private final org.kardo.language.aspectj.resource.aspectj.IAspectjLocationMap locationMap;
		private final org.eclipse.emf.common.util.URI uri;
		private final org.eclipse.emf.ecore.EObject element;
		private final org.kardo.language.aspectj.resource.aspectj.IAspectjProblem problem;
		
		public ElementBasedTextDiagnostic(org.kardo.language.aspectj.resource.aspectj.IAspectjLocationMap locationMap, org.eclipse.emf.common.util.URI uri, org.kardo.language.aspectj.resource.aspectj.IAspectjProblem problem, org.eclipse.emf.ecore.EObject element) {
			super();
			this.uri = uri;
			this.locationMap = locationMap;
			this.element = element;
			this.problem = problem;
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public org.kardo.language.aspectj.resource.aspectj.IAspectjProblem getProblem() {
			return problem;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public int getCharStart() {
			return Math.max(0, locationMap.getCharStart(element));
		}
		
		public int getCharEnd() {
			return Math.max(0, locationMap.getCharEnd(element));
		}
		
		public int getColumn() {
			return Math.max(0, locationMap.getColumn(element));
		}
		
		public int getLine() {
			return Math.max(0, locationMap.getLine(element));
		}
		
		public org.eclipse.emf.ecore.EObject getElement() {
			return element;
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			if (this.element == null) {
				return false;
			}
			return this.element.equals(element);
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	public class PositionBasedTextDiagnostic implements org.kardo.language.aspectj.resource.aspectj.IAspectjTextDiagnostic {
		
		private final org.eclipse.emf.common.util.URI uri;
		
		private int column;
		private int line;
		private int charStart;
		private int charEnd;
		private org.kardo.language.aspectj.resource.aspectj.IAspectjProblem problem;
		
		public PositionBasedTextDiagnostic(org.eclipse.emf.common.util.URI uri, org.kardo.language.aspectj.resource.aspectj.IAspectjProblem problem, int column, int line, int charStart, int charEnd) {
			
			super();
			this.uri = uri;
			this.column = column;
			this.line = line;
			this.charStart = charStart;
			this.charEnd = charEnd;
			this.problem = problem;
		}
		
		public org.kardo.language.aspectj.resource.aspectj.IAspectjProblem getProblem() {
			return problem;
		}
		
		public int getCharStart() {
			return charStart;
		}
		
		public int getCharEnd() {
			return charEnd;
		}
		
		public int getColumn() {
			return column;
		}
		
		public int getLine() {
			return line;
		}
		
		public String getLocation() {
			return uri.toString();
		}
		
		public String getMessage() {
			return problem.getMessage();
		}
		
		public boolean wasCausedBy(org.eclipse.emf.ecore.EObject element) {
			return false;
		}
		
		public String toString() {
			return getMessage() + " at " + getLocation() + " line " + getLine() + ", column " + getColumn();
		}
	}
	
	private org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolverSwitch resolverSwitch;
	private org.kardo.language.aspectj.resource.aspectj.IAspectjLocationMap locationMap;
	private int proxyCounter = 0;
	private org.kardo.language.aspectj.resource.aspectj.IAspectjTextParser parser;
	private org.kardo.language.aspectj.resource.aspectj.util.AspectjLayoutUtil layoutUtil = new org.kardo.language.aspectj.resource.aspectj.util.AspectjLayoutUtil();
	private org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMarkerHelper markerHelper;
	private java.util.Map<String, org.kardo.language.aspectj.resource.aspectj.IAspectjContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>> internalURIFragmentMap = new java.util.LinkedHashMap<String, org.kardo.language.aspectj.resource.aspectj.IAspectjContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject>>();
	private java.util.Map<String, org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix> quickFixMap = new java.util.LinkedHashMap<String, org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix>();
	private java.util.Map<?, ?> loadOptions;
	
	/**
	 * If a post-processor is currently running, this field holds a reference to it.
	 * This reference is used to terminate post-processing if needed.
	 */
	private org.kardo.language.aspectj.resource.aspectj.IAspectjResourcePostProcessor runningPostProcessor;
	
	/**
	 * A flag (and lock) to indicate whether reloading of the resource shall be
	 * cancelled.
	 */
	private Boolean terminateReload = false;
	private Object terminateReloadLock = new Object();
	private Object loadingLock = new Object();
	private boolean delayNotifications = false;
	private java.util.List<org.eclipse.emf.common.notify.Notification> delayedNotifications = new java.util.ArrayList<org.eclipse.emf.common.notify.Notification>();
	private java.io.InputStream latestReloadInputStream = null;
	private java.util.Map<?, ?> latestReloadOptions = null;
	
	/**
	 * This flag indicates whether this resource is currently reloaded. The flag is
	 * set and unset in the reload() method and used to decide what kinds of
	 * constraints (live or batch) need to be evaluated. This decision is made in
	 * runValidators().
	 */
	private boolean isReloading = false;
	private org.kardo.language.aspectj.resource.aspectj.util.AspectjInterruptibleEcoreResolver interruptibleResolver;
	
	protected org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMetaInformation metaInformation = new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMetaInformation();
	
	public AspectjResource() {
		super();
		resetLocationMap();
	}
	
	public AspectjResource(org.eclipse.emf.common.util.URI uri) {
		super(uri);
		resetLocationMap();
	}
	
	protected void doLoad(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		synchronized (loadingLock) {
			if (processTerminationRequested()) {
				return;
			}
			this.loadOptions = options;
			delayNotifications = true;
			resetLocationMap();
			String encoding = getEncoding(options);
			java.io.InputStream actualInputStream = inputStream;
			Object inputStreamPreProcessorProvider = null;
			if (options != null) {
				inputStreamPreProcessorProvider = options.get(org.kardo.language.aspectj.resource.aspectj.IAspectjOptions.INPUT_STREAM_PREPROCESSOR_PROVIDER);
			}
			if (inputStreamPreProcessorProvider != null) {
				if (inputStreamPreProcessorProvider instanceof org.kardo.language.aspectj.resource.aspectj.IAspectjInputStreamProcessorProvider) {
					org.kardo.language.aspectj.resource.aspectj.IAspectjInputStreamProcessorProvider provider = (org.kardo.language.aspectj.resource.aspectj.IAspectjInputStreamProcessorProvider) inputStreamPreProcessorProvider;
					org.kardo.language.aspectj.resource.aspectj.mopp.AspectjInputStreamProcessor processor = provider.getInputStreamProcessor(inputStream);
					actualInputStream = processor;
				}
			}
			
			parser = getMetaInformation().createParser(actualInputStream, encoding);
			parser.setOptions(options);
			org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
			referenceResolverSwitch.setOptions(options);
			org.kardo.language.aspectj.resource.aspectj.IAspectjParseResult result = parser.parse();
			// dispose parser, we don't need it anymore
			parser = null;
			
			if (processTerminationRequested()) {
				// do nothing if reload was already restarted
				return;
			}
			
			clearState();
			unloadAndClearContents();
			org.eclipse.emf.ecore.EObject root = null;
			if (result != null) {
				root = result.getRoot();
				if (root != null) {
					if (isLayoutInformationRecordingEnabled()) {
						layoutUtil.transferAllLayoutInformationToModel(root);
					}
					if (processTerminationRequested()) {
						// the next reload will add new content
						return;
					}
					getContentsInternal().add(root);
				}
				java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjCommand<org.kardo.language.aspectj.resource.aspectj.IAspectjTextResource>> commands = result.getPostParseCommands();
				if (commands != null) {
					for (org.kardo.language.aspectj.resource.aspectj.IAspectjCommand<org.kardo.language.aspectj.resource.aspectj.IAspectjTextResource>  command : commands) {
						command.execute(this);
					}
				}
			}
			getReferenceResolverSwitch().setOptions(options);
			if (getErrors().isEmpty()) {
				if (!runPostProcessors(options)) {
					return;
				}
				if (root != null) {
					runValidators(root);
				}
			}
			notifyDelayed();
		}
	}
	
	protected void unloadAndClearContents() {
		java.util.List<org.eclipse.emf.ecore.EObject> contentsInternal = getContentsInternal();
		for (org.eclipse.emf.ecore.EObject eObject : contentsInternal) {
			// unload the root object
			unloaded((org.eclipse.emf.ecore.InternalEObject) eObject);
			// unload all children
			java.util.Iterator<org.eclipse.emf.ecore.EObject> allContents = eObject.eAllContents();
			while (allContents.hasNext()) {
				unloaded((org.eclipse.emf.ecore.InternalEObject) allContents.next());
			}
		}
		// now we can clear the contents
		contentsInternal.clear();
	}
	
	protected boolean processTerminationRequested() {
		if (terminateReload) {
			delayNotifications = false;
			delayedNotifications.clear();
			return true;
		}
		return false;
	}
	
	protected void notifyDelayed() {
		delayNotifications = false;
		for (org.eclipse.emf.common.notify.Notification delayedNotification : delayedNotifications) {
			super.eNotify(delayedNotification);
		}
		delayedNotifications.clear();
	}
	
	public void eNotify(org.eclipse.emf.common.notify.Notification notification) {
		if (delayNotifications) {
			delayedNotifications.add(notification);
		} else {
			super.eNotify(notification);
		}
	}
	
	/**
	 * Reloads the contents of this resource from the given stream.
	 */
	public void reload(java.io.InputStream inputStream, java.util.Map<?,?> options) throws java.io.IOException {
		synchronized (terminateReloadLock) {
			latestReloadInputStream = inputStream;
			latestReloadOptions = options;
			if (terminateReload == true) {
				// reload already requested
			}
			terminateReload = true;
		}
		cancelReload();
		synchronized (loadingLock) {
			synchronized (terminateReloadLock) {
				terminateReload = false;
			}
			isLoaded = false;
			java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(latestReloadOptions);
			try {
				// Set isReloading flag to allow other method to differentiate between loading and
				// reloading.
				this.isReloading = true;
				doLoad(latestReloadInputStream, loadOptions);
			} catch (org.kardo.language.aspectj.resource.aspectj.mopp.AspectjTerminateParsingException tpe) {
				// do nothing - the resource is left unchanged if this exception is thrown
			}
			this.isReloading = false;
			resolveAfterParsing();
			isLoaded = true;
		}
	}
	
	/**
	 * Cancels reloading this resource. The running parser and post processors are
	 * terminated.
	 */
	protected void cancelReload() {
		// Cancel parser
		org.kardo.language.aspectj.resource.aspectj.IAspectjTextParser parserCopy = parser;
		if (parserCopy != null) {
			parserCopy.terminate();
		}
		// Cancel post processor(s)
		org.kardo.language.aspectj.resource.aspectj.IAspectjResourcePostProcessor runningPostProcessorCopy = runningPostProcessor;
		if (runningPostProcessorCopy != null) {
			runningPostProcessorCopy.terminate();
		}
		// Cancel reference resolving
		org.kardo.language.aspectj.resource.aspectj.util.AspectjInterruptibleEcoreResolver interruptibleResolverCopy = interruptibleResolver;
		if (interruptibleResolverCopy != null) {
			interruptibleResolverCopy.terminate();
		}
	}
	
	protected void doSave(java.io.OutputStream outputStream, java.util.Map<?,?> options) throws java.io.IOException {
		org.kardo.language.aspectj.resource.aspectj.IAspectjTextPrinter printer = getMetaInformation().createPrinter(outputStream, this);
		org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolverSwitch referenceResolverSwitch = getReferenceResolverSwitch();
		printer.setEncoding(getEncoding(options));
		referenceResolverSwitch.setOptions(options);
		for (org.eclipse.emf.ecore.EObject root : getContentsInternal()) {
			if (isLayoutInformationRecordingEnabled()) {
				layoutUtil.transferAllLayoutInformationFromModel(root);
			}
			printer.print(root);
			if (isLayoutInformationRecordingEnabled()) {
				layoutUtil.transferAllLayoutInformationToModel(root);
			}
		}
	}
	
	protected String getSyntaxName() {
		return "aspectj";
	}
	
	public String getEncoding(java.util.Map<?, ?> options) {
		String encoding = null;
		if (new org.kardo.language.aspectj.resource.aspectj.util.AspectjRuntimeUtil().isEclipsePlatformAvailable()) {
			encoding = new org.kardo.language.aspectj.resource.aspectj.util.AspectjEclipseProxy().getPlatformResourceEncoding(uri);
		}
		if (options != null) {
			Object encodingOption = options.get(org.kardo.language.aspectj.resource.aspectj.IAspectjOptions.OPTION_ENCODING);
			if (encodingOption != null) {
				encoding = encodingOption.toString();
			}
		}
		return encoding;
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolverSwitch getReferenceResolverSwitch() {
		if (resolverSwitch == null) {
			resolverSwitch = new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjReferenceResolverSwitch();
		}
		return resolverSwitch;
	}
	
	public org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMetaInformation getMetaInformation() {
		return new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMetaInformation();
	}
	
	/**
	 * Clears the location map by replacing it with a new instance.
	 */
	protected void resetLocationMap() {
		if (isLocationMapEnabled()) {
			locationMap = new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjLocationMap();
		} else {
			locationMap = new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjDevNullLocationMap();
		}
	}
	
	public void addURIFragment(String internalURIFragment, org.kardo.language.aspectj.resource.aspectj.IAspectjContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment) {
		internalURIFragmentMap.put(internalURIFragment, uriFragment);
	}
	
	public <ContainerType extends org.eclipse.emf.ecore.EObject, ReferenceType extends org.eclipse.emf.ecore.EObject> void registerContextDependentProxy(org.kardo.language.aspectj.resource.aspectj.IAspectjContextDependentURIFragmentFactory<ContainerType, ReferenceType> factory, ContainerType container, org.eclipse.emf.ecore.EReference reference, String id, org.eclipse.emf.ecore.EObject proxyElement, int position) {
		org.eclipse.emf.ecore.InternalEObject proxy = (org.eclipse.emf.ecore.InternalEObject) proxyElement;
		String internalURIFragment = org.kardo.language.aspectj.resource.aspectj.IAspectjContextDependentURIFragment.INTERNAL_URI_FRAGMENT_PREFIX + (proxyCounter++) + "_" + id;
		org.kardo.language.aspectj.resource.aspectj.IAspectjContextDependentURIFragment<?> uriFragment = factory.create(id, container, reference, position, proxy);
		proxy.eSetProxyURI(getURI().appendFragment(internalURIFragment));
		addURIFragment(internalURIFragment, uriFragment);
	}
	
	public org.eclipse.emf.ecore.EObject getEObject(String id) {
		if (internalURIFragmentMap.containsKey(id)) {
			org.kardo.language.aspectj.resource.aspectj.IAspectjContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment = internalURIFragmentMap.get(id);
			boolean wasResolvedBefore = uriFragment.isResolved();
			org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result = null;
			// catch and report all Exceptions that occur during proxy resolving
			try {
				result = uriFragment.resolve();
			} catch (Exception e) {
				String message = "An expection occured while resolving the proxy for: "+ id + ". (" + e.toString() + ")";
				addProblem(new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjProblem(message, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.UNRESOLVED_REFERENCE, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity.ERROR), uriFragment.getProxy());
				new org.kardo.language.aspectj.resource.aspectj.util.AspectjRuntimeUtil().logError(message, e);
			}
			if (result == null) {
				// the resolving did call itself
				return null;
			}
			if (!wasResolvedBefore && !result.wasResolved()) {
				attachResolveError(result, uriFragment.getProxy());
				return null;
			} else if (!result.wasResolved()) {
				return null;
			} else {
				org.eclipse.emf.ecore.EObject proxy = uriFragment.getProxy();
				// remove an error that might have been added by an earlier attempt
				removeDiagnostics(proxy, getErrors());
				// remove old warnings and attach new
				removeDiagnostics(proxy, getWarnings());
				attachResolveWarnings(result, proxy);
				org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping = result.getMappings().iterator().next();
				org.eclipse.emf.ecore.EObject resultElement = getResultElement(uriFragment, mapping, proxy, result.getErrorMessage());
				org.eclipse.emf.ecore.EObject container = uriFragment.getContainer();
				replaceProxyInLayoutAdapters(container, proxy, resultElement);
				return resultElement;
			}
		} else {
			return super.getEObject(id);
		}
	}
	
	protected void replaceProxyInLayoutAdapters(org.eclipse.emf.ecore.EObject container, org.eclipse.emf.ecore.EObject proxy, org.eclipse.emf.ecore.EObject target) {
		for (org.eclipse.emf.common.notify.Adapter adapter : container.eAdapters()) {
			if (adapter instanceof org.kardo.language.aspectj.resource.aspectj.mopp.AspectjLayoutInformationAdapter) {
				org.kardo.language.aspectj.resource.aspectj.mopp.AspectjLayoutInformationAdapter layoutInformationAdapter = (org.kardo.language.aspectj.resource.aspectj.mopp.AspectjLayoutInformationAdapter) adapter;
				layoutInformationAdapter.replaceProxy(proxy, target);
			}
		}
	}
	
	protected org.eclipse.emf.ecore.EObject getResultElement(org.kardo.language.aspectj.resource.aspectj.IAspectjContextDependentURIFragment<? extends org.eclipse.emf.ecore.EObject> uriFragment, org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping, org.eclipse.emf.ecore.EObject proxy, final String errorMessage) {
		if (mapping instanceof org.kardo.language.aspectj.resource.aspectj.IAspectjURIMapping<?>) {
			org.eclipse.emf.common.util.URI uri = ((org.kardo.language.aspectj.resource.aspectj.IAspectjURIMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetIdentifier();
			if (uri != null) {
				org.eclipse.emf.ecore.EObject result = null;
				try {
					result = this.getResourceSet().getEObject(uri, true);
				} catch (Exception e) {
					// we can catch exceptions here, because EMF will try to resolve again and handle
					// the exception
				}
				if (result == null || result.eIsProxy()) {
					// unable to resolve: attach error
					if (errorMessage == null) {
						assert(false);
					} else {
						addProblem(new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjProblem(errorMessage, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.UNRESOLVED_REFERENCE, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity.ERROR), proxy);
					}
				}
				return result;
			}
			return null;
		} else if (mapping instanceof org.kardo.language.aspectj.resource.aspectj.IAspectjElementMapping<?>) {
			org.eclipse.emf.ecore.EObject element = ((org.kardo.language.aspectj.resource.aspectj.IAspectjElementMapping<? extends org.eclipse.emf.ecore.EObject>)mapping).getTargetElement();
			org.eclipse.emf.ecore.EReference reference = uriFragment.getReference();
			org.eclipse.emf.ecore.EReference oppositeReference = uriFragment.getReference().getEOpposite();
			if (!uriFragment.getReference().isContainment() && oppositeReference != null) {
				if (reference.isMany()) {
					org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList.ManyInverse<org.eclipse.emf.ecore.EObject> list = org.kardo.language.aspectj.resource.aspectj.util.AspectjCastUtil.cast(element.eGet(oppositeReference, false));										// avoids duplicate entries in the reference caused by adding to the
					// oppositeReference
					list.basicAdd(uriFragment.getContainer(),null);
				} else {
					uriFragment.getContainer().eSet(uriFragment.getReference(), element);
				}
			}
			return element;
		} else {
			assert(false);
			return null;
		}
	}
	
	protected void removeDiagnostics(org.eclipse.emf.ecore.EObject cause, java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> diagnostics) {
		// remove all errors/warnings from this resource
		for (org.eclipse.emf.ecore.resource.Resource.Diagnostic errorCand : new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(diagnostics)) {
			if (errorCand instanceof org.kardo.language.aspectj.resource.aspectj.IAspectjTextDiagnostic) {
				if (((org.kardo.language.aspectj.resource.aspectj.IAspectjTextDiagnostic) errorCand).wasCausedBy(cause)) {
					diagnostics.remove(errorCand);
					unmark(cause);
				}
			}
		}
	}
	
	protected void attachResolveError(org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolveResult<?> result, org.eclipse.emf.ecore.EObject proxy) {
		// attach errors to this resource
		assert result != null;
		final String errorMessage = result.getErrorMessage();
		if (errorMessage == null) {
			assert(false);
		} else {
			addProblem(new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjProblem(errorMessage, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.UNRESOLVED_REFERENCE, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity.ERROR, result.getQuickFixes()), proxy);
		}
	}
	
	protected void attachResolveWarnings(org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceResolveResult<? extends org.eclipse.emf.ecore.EObject> result, org.eclipse.emf.ecore.EObject proxy) {
		assert result != null;
		assert result.wasResolved();
		if (result.wasResolved()) {
			for (org.kardo.language.aspectj.resource.aspectj.IAspectjReferenceMapping<? extends org.eclipse.emf.ecore.EObject> mapping : result.getMappings()) {
				final String warningMessage = mapping.getWarning();
				if (warningMessage == null) {
					continue;
				}
				addProblem(new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjProblem(warningMessage, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.UNRESOLVED_REFERENCE, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity.WARNING), proxy);
			}
		}
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void doUnload() {
		super.doUnload();
		clearState();
		loadOptions = null;
	}
	
	/**
	 * Runs all post processors to process this resource.
	 */
	protected boolean runPostProcessors(java.util.Map<?, ?> loadOptions) {
		unmark(org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.ANALYSIS_PROBLEM);
		if (processTerminationRequested()) {
			return false;
		}
		// first, run the generated post processor
		runPostProcessor(new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjResourcePostProcessor());
		if (loadOptions == null) {
			return true;
		}
		// then, run post processors that are registered via the load options extension
		// point
		Object resourcePostProcessorProvider = loadOptions.get(org.kardo.language.aspectj.resource.aspectj.IAspectjOptions.RESOURCE_POSTPROCESSOR_PROVIDER);
		if (resourcePostProcessorProvider != null) {
			if (resourcePostProcessorProvider instanceof org.kardo.language.aspectj.resource.aspectj.IAspectjResourcePostProcessorProvider) {
				runPostProcessor(((org.kardo.language.aspectj.resource.aspectj.IAspectjResourcePostProcessorProvider) resourcePostProcessorProvider).getResourcePostProcessor());
			} else if (resourcePostProcessorProvider instanceof java.util.Collection<?>) {
				java.util.Collection<?> resourcePostProcessorProviderCollection = (java.util.Collection<?>) resourcePostProcessorProvider;
				for (Object processorProvider : resourcePostProcessorProviderCollection) {
					if (processTerminationRequested()) {
						return false;
					}
					if (processorProvider instanceof org.kardo.language.aspectj.resource.aspectj.IAspectjResourcePostProcessorProvider) {
						org.kardo.language.aspectj.resource.aspectj.IAspectjResourcePostProcessorProvider csProcessorProvider = (org.kardo.language.aspectj.resource.aspectj.IAspectjResourcePostProcessorProvider) processorProvider;
						org.kardo.language.aspectj.resource.aspectj.IAspectjResourcePostProcessor postProcessor = csProcessorProvider.getResourcePostProcessor();
						runPostProcessor(postProcessor);
					}
				}
			}
		}
		return true;
	}
	
	/**
	 * Runs the given post processor to process this resource.
	 */
	protected void runPostProcessor(org.kardo.language.aspectj.resource.aspectj.IAspectjResourcePostProcessor postProcessor) {
		try {
			this.runningPostProcessor = postProcessor;
			postProcessor.process(this);
		} catch (Exception e) {
			new org.kardo.language.aspectj.resource.aspectj.util.AspectjRuntimeUtil().logError("Exception while running a post-processor.", e);
		}
		this.runningPostProcessor = null;
	}
	
	public void load(java.util.Map<?, ?> options) throws java.io.IOException {
		java.util.Map<Object, Object> loadOptions = addDefaultLoadOptions(options);
		super.load(loadOptions);
		resolveAfterParsing();
	}
	
	protected void resolveAfterParsing() {
		interruptibleResolver = new org.kardo.language.aspectj.resource.aspectj.util.AspectjInterruptibleEcoreResolver();
		interruptibleResolver.resolveAll(this);
		interruptibleResolver = null;
	}
	
	public void setURI(org.eclipse.emf.common.util.URI uri) {
		// because of the context dependent proxy resolving it is essential to resolve all
		// proxies before the URI is changed which can cause loss of object identities
		org.eclipse.emf.ecore.util.EcoreUtil.resolveAll(this);
		super.setURI(uri);
	}
	
	/**
	 * Returns the location map that contains information about the position of the
	 * contents of this resource in the original textual representation.
	 */
	public org.kardo.language.aspectj.resource.aspectj.IAspectjLocationMap getLocationMap() {
		return locationMap;
	}
	
	public void addProblem(org.kardo.language.aspectj.resource.aspectj.IAspectjProblem problem, org.eclipse.emf.ecore.EObject element) {
		ElementBasedTextDiagnostic diagnostic = new ElementBasedTextDiagnostic(locationMap, getURI(), problem, element);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		mark(diagnostic);
		addQuickFixesToQuickFixMap(problem);
	}
	
	public void addProblem(org.kardo.language.aspectj.resource.aspectj.IAspectjProblem problem, int column, int line, int charStart, int charEnd) {
		PositionBasedTextDiagnostic diagnostic = new PositionBasedTextDiagnostic(getURI(), problem, column, line, charStart, charEnd);
		getDiagnostics(problem.getSeverity()).add(diagnostic);
		mark(diagnostic);
		addQuickFixesToQuickFixMap(problem);
	}
	
	protected void addQuickFixesToQuickFixMap(org.kardo.language.aspectj.resource.aspectj.IAspectjProblem problem) {
		java.util.Collection<org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix> quickFixes = problem.getQuickFixes();
		if (quickFixes != null) {
			for (org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix quickFix : quickFixes) {
				if (quickFix != null) {
					quickFixMap.put(quickFix.getContextAsString(), quickFix);
				}
			}
		}
	}
	
	@Deprecated	
	public void addError(String message, org.eclipse.emf.ecore.EObject cause) {
		addError(message, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.UNKNOWN, cause);
	}
	
	public void addError(String message, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType type, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjProblem(message, type, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity.ERROR), cause);
	}
	
	@Deprecated	
	public void addWarning(String message, org.eclipse.emf.ecore.EObject cause) {
		addWarning(message, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.UNKNOWN, cause);
	}
	
	public void addWarning(String message, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType type, org.eclipse.emf.ecore.EObject cause) {
		addProblem(new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjProblem(message, type, org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity.WARNING), cause);
	}
	
	protected java.util.List<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getDiagnostics(org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity severity) {
		if (severity == org.kardo.language.aspectj.resource.aspectj.AspectjEProblemSeverity.ERROR) {
			return getErrors();
		} else {
			return getWarnings();
		}
	}
	
	protected java.util.Map<Object, Object> addDefaultLoadOptions(java.util.Map<?, ?> loadOptions) {
		java.util.Map<Object, Object> loadOptionsCopy = org.kardo.language.aspectj.resource.aspectj.util.AspectjMapUtil.copySafelyToObjectToObjectMap(loadOptions);
		// first add static option provider
		loadOptionsCopy.putAll(new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjOptionProvider().getOptions());
		
		// second, add dynamic option providers that are registered via extension
		if (new org.kardo.language.aspectj.resource.aspectj.util.AspectjRuntimeUtil().isEclipsePlatformAvailable()) {
			new org.kardo.language.aspectj.resource.aspectj.util.AspectjEclipseProxy().getDefaultLoadOptionProviderExtensions(loadOptionsCopy);
		}
		return loadOptionsCopy;
	}
	
	/**
	 * Extends the super implementation by clearing all information about element
	 * positions.
	 */
	protected void clearState() {
		// clear concrete syntax information
		resetLocationMap();
		internalURIFragmentMap.clear();
		getErrors().clear();
		getWarnings().clear();
		// Remove temporary markers
		unmark(org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.UNKNOWN);
		unmark(org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.SYNTAX_ERROR);
		unmark(org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.UNRESOLVED_REFERENCE);
		unmark(org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.LIVE_CONSTRAINT_PROBLEM);
		// If the resource is reloaded, we do not remove the problems that were detected
		// by batch constraints. This ensures that we can see the problems while typing.
		// The problems might get out dated because of the ongoing modifications, but they
		// will be updated (i.e., deleted and recreated) the next time the resource is
		// saved (and loaded again).
		if (!isReloading) {
			unmark(org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType.BATCH_CONSTRAINT_PROBLEM);
		}
		proxyCounter = 0;
		resolverSwitch = null;
	}
	
	/**
	 * Returns a copy of the contents of this resource wrapped in a list that
	 * propagates changes to the original resource list. Wrapping is required to make
	 * sure that clients which obtain a reference to the list of contents do not
	 * interfere when changing the list.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContents() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.EObject>();
		}
		return new org.kardo.language.aspectj.resource.aspectj.util.AspectjCopiedEObjectInternalEList((org.eclipse.emf.ecore.util.InternalEList<org.eclipse.emf.ecore.EObject>) super.getContents());
	}
	
	/**
	 * Returns the raw contents of this resource. In contrast to getContents(), this
	 * methods does not return a copy of the content list, but the original list.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.EObject> getContentsInternal() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.EObject>();
		}
		return super.getContents();
	}
	
	/**
	 * Returns all warnings that are associated with this resource.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getWarnings() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>();
		}
		return new org.kardo.language.aspectj.resource.aspectj.util.AspectjCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getWarnings());
	}
	
	/**
	 * Returns all errors that are associated with this resource.
	 */
	public org.eclipse.emf.common.util.EList<org.eclipse.emf.ecore.resource.Resource.Diagnostic> getErrors() {
		if (terminateReload) {
			// the contents' state is currently unclear
			return new org.eclipse.emf.common.util.BasicEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>();
		}
		return new org.kardo.language.aspectj.resource.aspectj.util.AspectjCopiedEList<org.eclipse.emf.ecore.resource.Resource.Diagnostic>(super.getErrors());
	}
	
	protected void runValidators(org.eclipse.emf.ecore.EObject root) {
		// checking constraints provided by EMF validator classes was disabled by option
		// 'disableEValidators'.
		
		if (new org.kardo.language.aspectj.resource.aspectj.util.AspectjRuntimeUtil().isEclipsePlatformAvailable()) {
			// We do only evaluate batch constraints when the resource is loaded for the first
			// time. If the resource is reloaded, only live constraints are evaluated.
			boolean includeBatchConstraints = !this.isReloading;
			new org.kardo.language.aspectj.resource.aspectj.util.AspectjEclipseProxy().checkEMFValidationConstraints(this, root, includeBatchConstraints);
		}
	}
	
	public org.kardo.language.aspectj.resource.aspectj.IAspectjQuickFix getQuickFix(String quickFixContext) {
		return quickFixMap.get(quickFixContext);
	}
	
	protected void mark(org.kardo.language.aspectj.resource.aspectj.IAspectjTextDiagnostic diagnostic) {
		org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMarkerHelper markerHelper = getMarkerHelper();
		if (markerHelper != null) {
			markerHelper.mark(this, diagnostic);
		}
	}
	
	protected void unmark(org.eclipse.emf.ecore.EObject cause) {
		org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMarkerHelper markerHelper = getMarkerHelper();
		if (markerHelper != null) {
			markerHelper.unmark(this, cause);
		}
	}
	
	protected void unmark(org.kardo.language.aspectj.resource.aspectj.AspectjEProblemType analysisProblem) {
		org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMarkerHelper markerHelper = getMarkerHelper();
		if (markerHelper != null) {
			markerHelper.unmark(this, analysisProblem);
		}
	}
	
	protected org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMarkerHelper getMarkerHelper() {
		if (isMarkerCreationEnabled() && new org.kardo.language.aspectj.resource.aspectj.util.AspectjRuntimeUtil().isEclipsePlatformAvailable()) {
			if (markerHelper == null) {
				markerHelper = new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMarkerHelper();
			}
			return markerHelper;
		}
		return null;
	}
	
	public boolean isMarkerCreationEnabled() {
		if (loadOptions == null) {
			return true;
		}
		return !loadOptions.containsKey(org.kardo.language.aspectj.resource.aspectj.IAspectjOptions.DISABLE_CREATING_MARKERS_FOR_PROBLEMS);
	}
	
	protected boolean isLocationMapEnabled() {
		if (loadOptions == null) {
			return true;
		}
		return !loadOptions.containsKey(org.kardo.language.aspectj.resource.aspectj.IAspectjOptions.DISABLE_LOCATION_MAP);
	}
	
	protected boolean isLayoutInformationRecordingEnabled() {
		if (loadOptions == null) {
			return true;
		}
		return !loadOptions.containsKey(org.kardo.language.aspectj.resource.aspectj.IAspectjOptions.DISABLE_LAYOUT_INFORMATION_RECORDING);
	}
	
}
