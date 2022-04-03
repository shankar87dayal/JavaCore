package com.corejava.class_I_O;

import java.io.PrintWriter;

public class Lab1413 {
	public static void main(String[] args) throws Exception {
		PrintWriter pw = new PrintWriter("Welcome.txt");
		pw.print(97);
		pw.print(97);
		pw.print(10.0);
		pw.print(true);
		pw.print("jlc");
		pw.close();
	}
}
