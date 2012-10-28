/**
 * <copyright>
 * </copyright>
 *
 * 
 */
package org.kardo.language.aspectj.resource.aspectj.mopp;

/**
 * The AspectjTaskItemBuilder is used to find task items in text documents. The
 * current implementation uses the generated lexer and the TaskItemDetector to
 * detect task items. This class is called by the BuilderAdapter, which runs both
 * this builder and the default builder that is intended to be customized.
 */
public class AspectjTaskItemBuilder {
	
	public void build(org.eclipse.core.resources.IFile resource, org.eclipse.emf.ecore.resource.ResourceSet resourceSet, org.eclipse.core.runtime.IProgressMonitor monitor) {
		monitor.setTaskName("Searching for task items");
		new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMarkerHelper().removeAllMarkers(resource, org.eclipse.core.resources.IMarker.TASK);
		if (isInBinFolder(resource)) {
			return;
		}
		java.util.List<org.kardo.language.aspectj.resource.aspectj.mopp.AspectjTaskItem> taskItems = new java.util.ArrayList<org.kardo.language.aspectj.resource.aspectj.mopp.AspectjTaskItem>();
		org.kardo.language.aspectj.resource.aspectj.mopp.AspectjTaskItemDetector taskItemDetector = new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjTaskItemDetector();
		try {
			java.io.InputStream inputStream = resource.getContents();
			String content = org.kardo.language.aspectj.resource.aspectj.util.AspectjStreamUtil.getContent(inputStream);
			org.kardo.language.aspectj.resource.aspectj.IAspectjTextScanner lexer = new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMetaInformation().createLexer();
			lexer.setText(content);
			
			org.kardo.language.aspectj.resource.aspectj.IAspectjTextToken nextToken = lexer.getNextToken();
			while (nextToken != null) {
				String text = nextToken.getText();
				taskItems.addAll(taskItemDetector.findTaskItems(text, nextToken.getLine(), nextToken.getOffset()));
				nextToken = lexer.getNextToken();
			}
		} catch (java.io.IOException e) {
			org.kardo.language.aspectj.resource.aspectj.mopp.AspectjPlugin.logError("Exception while searching for task items", e);
		} catch (org.eclipse.core.runtime.CoreException e) {
			org.kardo.language.aspectj.resource.aspectj.mopp.AspectjPlugin.logError("Exception while searching for task items", e);
		}
		
		for (org.kardo.language.aspectj.resource.aspectj.mopp.AspectjTaskItem taskItem : taskItems) {
			java.util.Map<String, Object> markerAttributes = new java.util.LinkedHashMap<String, Object>();
			markerAttributes.put(org.eclipse.core.resources.IMarker.USER_EDITABLE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.DONE, false);
			markerAttributes.put(org.eclipse.core.resources.IMarker.LINE_NUMBER, taskItem.getLine());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_START, taskItem.getCharStart());
			markerAttributes.put(org.eclipse.core.resources.IMarker.CHAR_END, taskItem.getCharEnd());
			markerAttributes.put(org.eclipse.core.resources.IMarker.MESSAGE, taskItem.getMessage());
			new org.kardo.language.aspectj.resource.aspectj.mopp.AspectjMarkerHelper().createMarker(resource, org.eclipse.core.resources.IMarker.TASK, markerAttributes);
		}
	}
	
	public String getBuilderMarkerId() {
		return org.eclipse.core.resources.IMarker.TASK;
	}
	
	public boolean isInBinFolder(org.eclipse.core.resources.IFile resource) {
		org.eclipse.core.resources.IContainer parent = resource.getParent();
		while (parent != null) {
			if ("bin".equals(parent.getName())) {
				return true;
			}
			parent = parent.getParent();
		}
		return false;
	}
	
}
