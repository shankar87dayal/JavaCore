package com.corejava.class_I_O;

import java.io.File;
import java.io.FileFilter;

public class Lab1416 {
	public static void main(String[] args) {
		File file = new File("D:\\D1");
		File javaFile[] = file.listFiles(new ExtFilter("-java"));
		System.out.println("**JAVA FILES**");
		if (javaFile != null)
			for (File f : javaFile)
				System.out.println(f);
		else
			System.out.println("NO java file found");
	}
}

class ExtFilter implements FileFilter {
	String ext;

	public ExtFilter(String ext) {
		this.ext = ext;
	}

	public boolean accept(File f) {
		return f.getName().endsWith(ext);
	}
}