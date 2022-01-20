package edu.javacore.Inheritance;

public class Lab811 {
	public static void main(String[] args) {
		Helloo4 hello = new Helloo4();
		hello.show();
	}
}

class Haii4 {
	private int a = 99;
}

class Helloo4 extends Haii4 {
	void show() {
		System.out.println(a);
	}
}