package edu.javacore.Inheritance;

public class Lab807 {
	public static void main(String[] args) {
		Helloo2 hello = new Helloo2();
		hello.m1();
		hello.m2();
		System.out.println(hello.toString());
	}
}

class Haii2 {
	void m1() {
		System.out.println("Hai->m1");
	}
}

class Helloo2 extends Haii2 {
	void m2() {
		System.out.println("Hello->m2");
	}
}