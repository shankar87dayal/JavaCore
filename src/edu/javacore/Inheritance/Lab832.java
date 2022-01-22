package edu.javacore.Inheritance;

public class Lab832 {
	public static void main(String[] args) {
		Hello25.show();
	}
}

class Hai25 {
	static int a = 10;
}

class Hello25 extends Hai25 {
	static int a = 20;

	static void show() {
		int a = 30;
		System.out.println(a);
		System.out.println(Hello25.a);
		System.out.println(Hai25.a);
	}
}
