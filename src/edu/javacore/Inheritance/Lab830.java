package edu.javacore.Inheritance;

public class Lab830 {
	public static void main(String[] args) {
		Hello23 hello = new Hello23();
		hello.show();
	}
}

class Hai23 {
	static int a =10;
}

class Hello23 extends Hai23 {
	int a = 20;

	void show() {
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
