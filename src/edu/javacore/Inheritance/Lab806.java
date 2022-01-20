package edu.javacore.Inheritance;

public class Lab806 {
	public static void main(String[] args) {
		Haii1 hai = new Haii1();
		Helloo1 hello = new Helloo1();
		System.out.println(hai.toString());
		System.out.println(hello.toString());
	}
}

class Haii1 {
}

class Helloo1 extends Object {
}