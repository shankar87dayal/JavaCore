package com.corejava.stringclass_1;

import java.util.Scanner;

public class Lab1054 {
	public static void main(String[] args) {
		String st1 = "jlc";
		String st2 = "jlc";
		System.out.println(st1 == st2);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter JLC string: ");
		String st3 = sc.nextLine();
		System.out.println("Re Enter JLC string: ");
		String st4 = sc.nextLine();
		System.out.println(st3 == st4);
	}
}
