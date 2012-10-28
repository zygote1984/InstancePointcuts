package org.kardo.language.ipc.generator;

import java.io.IOException;
import java.io.OutputStream;

import org.kardo.language.aspectj.resource.aspectj.IAspectjTextResource;
import org.kardo.language.aspectj.resource.aspectj.mopp.AspectjPrinter;
import org.kardo.language.ipc.resource.ipc.IIpcTextResource;
import org.kardo.language.ipc.resource.ipc.mopp.IpcPrinter;

public class AspectJPrinterSub extends IpcPrinter {

	public AspectJPrinterSub(OutputStream outputStream,
			IIpcTextResource resource) {
		super(outputStream, resource);
		// TODO Auto-generated constructor stub
	}
	
	public void setOutput(OutputStream outputStream)
	{
		super.outputStream  = outputStream;
	}
	
	public void flushStream()
	{
		try {
			super.outputStream.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void print_org_kardo_language_aspectj_patterns_MethodPattern(org.kardo.language.aspectj.patterns.MethodPattern element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(6);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__LAYOUT_INFORMATIONS));
		printCountingMap.put("layoutInformations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__MODIFIERS));
		printCountingMap.put("modifiers", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__RETURN_TYPE));
		printCountingMap.put("returnType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__DECLARING_TYPE));
		printCountingMap.put("declaringType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__METHODNAME));
		printCountingMap.put("methodname", temp == null ? 0 : 1);
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("modifiers");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__MODIFIERS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("modifiers", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("returnType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__RETURN_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("returnType", count - 1);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("declaringType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__DECLARING_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("declaringType", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("methodname");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__METHODNAME));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("methodname", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.METHOD_PATTERN__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kardo_language_aspectj_patterns_MethodPattern_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}
	
	@Override
	public void print_org_kardo_language_aspectj_patterns_ConstructorPattern(org.kardo.language.aspectj.patterns.ConstructorPattern element, String outertab, java.io.PrintWriter out) {
		String localtab = outertab;
		// The printCountingMap contains a mapping from feature names to the number of
		// remaining elements that still need to be printed. The map is initialized with
		// the number of elements stored in each structural feature. For lists this is the
		// list size. For non-multiple features it is either 1 (if the feature is set) or
		// 0 (if the feature is null).
		java.util.Map<String, Integer> printCountingMap = new java.util.LinkedHashMap<String, Integer>(4);
		Object temp;
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__LAYOUT_INFORMATIONS));
		printCountingMap.put("layoutInformations", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__MODIFIERS));
		printCountingMap.put("modifiers", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__DECLARING_TYPE));
		printCountingMap.put("declaringType", temp == null ? 0 : 1);
		temp = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__PARAMETERS));
		printCountingMap.put("parameters", temp == null ? 0 : ((java.util.Collection<?>) temp).size());
		// print collected hidden tokens
		int count;
		boolean iterate = true;
		java.io.StringWriter sWriter = null;
		java.io.PrintWriter out1 = null;
		java.util.Map<String, Integer> printCountingMap1 = null;
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("modifiers");
		if (count > 0) {
			java.util.List<?> list = (java.util.List<?>)element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__MODIFIERS));
			int index  = list.size() - count;
			if (index < 0) {
				index = 0;
			}
			java.util.ListIterator<?> it  = list.listIterator(index);
			while (it.hasNext()) {
				Object o = it.next();
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("modifiers", 0);
		}
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("declaringType");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__DECLARING_TYPE));
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("declaringType", count - 1);
		}
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print(".");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("new");
		// DEFINITION PART BEGINS (WhiteSpaces)
		// DEFINITION PART BEGINS (CsString)
		out.print("(");
		out.print(" ");
		// DEFINITION PART BEGINS (Containment)
		count = printCountingMap.get("parameters");
		if (count > 0) {
			Object o = element.eGet(element.eClass().getEStructuralFeature(org.kardo.language.aspectj.patterns.PatternsPackage.CONSTRUCTOR_PATTERN__PARAMETERS));
			java.util.List<?> list = (java.util.List<?>) o;
			int index = list.size() - count;
			if (index >= 0) {
				o = list.get(index);
			} else {
				o = null;
			}
			if (o != null) {
				doPrint((org.eclipse.emf.ecore.EObject) o, out, localtab);
			}
			printCountingMap.put("parameters", count - 1);
		}
		// DEFINITION PART BEGINS (CompoundDefinition)
		iterate = true;
		while (iterate) {
			sWriter = new java.io.StringWriter();
			out1 = new java.io.PrintWriter(sWriter);
			printCountingMap1 = new java.util.LinkedHashMap<String, Integer>(printCountingMap);
			print_org_kardo_language_aspectj_patterns_ConstructorPattern_0(element, localtab, out1, printCountingMap1);
			if (printCountingMap.equals(printCountingMap1)) {
				iterate = false;
				out1.close();
			} else {
				out1.flush();
				out1.close();
				out.print(sWriter.toString());
				printCountingMap.putAll(printCountingMap1);
			}
		}
		// DEFINITION PART BEGINS (CsString)
		out.print(")");
		out.print(" ");
	}

}
