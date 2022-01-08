package edu.javacore.Object;

public class Lab547 {
	public static void main(String[] args) {
		new Hello2().a = 99;
		System.out.println(new Hello2().a);
	}
}

class Hello2 {
	int a;
}