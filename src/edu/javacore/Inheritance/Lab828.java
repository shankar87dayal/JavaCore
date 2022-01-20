package edu.javacore.Inheritance;

public class Lab828 {
	public static void main(String[] args) {
		Hello21 hello = new Hello21();
		hello.show();
	}
}

class Hai21 {
	int a = 10;

}

class Hello21 extends Hai21 {
	int a = 20;

	void show() {
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
