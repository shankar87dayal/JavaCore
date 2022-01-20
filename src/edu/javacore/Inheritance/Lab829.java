package edu.javacore.Inheritance;

public class Lab829 {
	public static void main(String[] args) {
		Hello22 hello = new Hello22();
		hello.show();
	}
}

class Hai22 {
}

class Hello22 extends Hai22 {
	int a = 20;

	void show() {
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
