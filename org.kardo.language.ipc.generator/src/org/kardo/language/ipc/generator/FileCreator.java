package org.kardo.language.ipc.generator;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import org.eclipse.emf.common.util.URI;

import com.google.common.io.Files;
import com.google.common.io.OutputSupplier;

public class FileCreator {
	
	public static FileCreator instance = new FileCreator(); 

	String outputPath;

	public FileCreator() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOutputPath() {
		return outputPath;
	}

	public void setOutputPath(String outputPath) {
		this.outputPath = outputPath;
	}

	public void generateFile(String filename, CharSequence data)
	{		
		URI path = URI.createURI(outputPath  + filename);
		FileWriter fstream;
		try {
			System.out.println(path.toString());
			File file = new File(path.toString());
			if(!file.exists())
				System.out.println("[FILE CREATOR]: Create new file: " + file.createNewFile());
			fstream = new FileWriter(file);
			BufferedWriter out = new BufferedWriter(fstream);
			out.append(data);
			out.close();
			fstream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
	}

}
