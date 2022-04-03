package com.corejava.class_I_O;

import java.io.File;

public class Lab1415 {
	public static void main(String[] args) {
		File file = new File("D:\\");
		File files[] = file.listFiles();
		for (File f : files) {
			System.out.println(f + "-> isFull:" + f.isFile() + ", isDir:" + f.isDirectory());
		}

	}
}
