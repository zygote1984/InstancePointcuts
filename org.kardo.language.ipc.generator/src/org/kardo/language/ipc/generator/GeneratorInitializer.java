package org.kardo.language.ipc.generator;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.generator.JavaIoFileSystemAccess;

public class GeneratorInitializer {

	GeneratorMain main;
	static URI outputPath;
	String genFolder = "output";
	boolean oFlag = false;

	public GeneratorInitializer(boolean print) {
		super();
		main = new GeneratorMain(print);

	}

	public GeneratorInitializer() {
		super();
		main = new GeneratorMain(false);

	}

	public void setOutputPath(URI outputPath, boolean segment) {

		if (!oFlag) {
			oFlag = true;
			if (segment)
				this.outputPath = outputPath.appendSegment(genFolder);
			else
				this.outputPath = outputPath;

			System.out.println("[Setting generator path]: " + this.outputPath);
			
			System.out.println("[INITIALIZER]" + outputPath.hasPath());

			// File file = new File(outputPath);
			//
			// if (!file.isDirectory())
			// try {
			// throw new FileNotFoundException(outputPath);
			// } catch (FileNotFoundException e) {
			// // TODO Auto-generated catch block
			// e.printStackTrace();
			// }

		}
	}

	public static URI getOutputPath() {
		return GeneratorInitializer.outputPath;
	}

	public void generate(Resource resource) {
		main.doGenerate(resource, new FileCreator());
	}

}
