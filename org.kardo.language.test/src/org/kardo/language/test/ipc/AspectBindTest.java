package org.kardo.language.test.ipc;


import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.Test;
import org.kardo.language.aspectj.commons.AspectJCompilationUnit;
import org.kardo.language.ipc.generator.GeneratorInitializer;
import org.kardo.language.ipc.resource.ipc.mopp.IpcResource;


public class AspectBindTest {
	
	
	
	@Test
	public void testInterpreter() {
		GeneratorInitializer generator = new GeneratorInitializer(false);
		String templateFile = "input" + File.separator + "example.ipc";
		System.out.println(templateFile);
		Resource resource = null;
		try {
			resource = load(templateFile);
		} catch (IOException e) {
			// if the file can not be found, the working directory of
			// the test is probably wrong
			e.printStackTrace();
		}
		
		assertEquals("The resource should have one content element.", 1,
				resource.getContents().size());
		EList<EObject> clist = resource.getContents();

		AspectJCompilationUnit content = (AspectJCompilationUnit) resource.getContents().get(0);
		generator.setOutputPath(URI.createURI("/home/kardelen/workspace/instancepointcuts/instancepc/org.kardo.language.test"), true);
		System.out.println("[TEST]" + content.toString());
		EcoreUtil.resolveAll(resource);
		System.out.println("[TEST]" + resource.toString());
		generator.generate(resource);
	
		
	}

	private Resource load(String templateFile) throws IOException {
		Map<?, ?> options = Collections.EMPTY_MAP;
		InputStream inputStream = new FileInputStream(templateFile);
		System.out.println(inputStream);
		Resource resource = new IpcResource();
		resource.setURI(URI.createURI(""));
		resource.load(inputStream, options);
		System.out.println(resource.isLoaded());
		inputStream.close();
		return resource;
	}
}