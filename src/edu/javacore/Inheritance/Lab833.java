package edu.javacore.Inheritance;

public class Lab833 {
	public static void main(String[] args) {
		Hello26 hello = new Hello26();
		System.out.println(hello.a);
	}
}

class Hai26 {
	int a;
}

class Hello26 extends Hai26 {
	String a;
}