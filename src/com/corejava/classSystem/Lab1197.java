package com.corejava.classSystem;

import java.io.FileOutputStream;
import java.io.PrintStream;

public class Lab1197 {
	public static void main(String[] args) throws Exception {
		System.out.println("MESSAGE using OUT");
		System.out.println("MESSAGE using ERR");
		FileOutputStream fos = new FileOutputStream("our.txt");
		PrintStream ps = new PrintStream(fos);
		System.setOut(ps);
		for (int i = 0; i < args.length; i++) {
			System.out.println("value: " + i);

		}
		System.out.println("MESSAGE 2 Using ERR");
	}
}

