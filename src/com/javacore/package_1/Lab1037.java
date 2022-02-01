package com.javacore.package_1;

public class Lab1037 {
	public static void main(String[] args) {
		String st1 = new String("Ravi");
		String st2 = new String("RaviRanjan");
		String st3 = new String("RaviRanjan");
		System.out.println("using == op");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println("using equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st2.equals(st3));

	}
}
