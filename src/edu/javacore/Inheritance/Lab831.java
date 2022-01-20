package edu.javacore.Inheritance;

public class Lab831 {
	public static void main(String[] args) {
		Hello24 hello = new Hello24();
		hello.show();
	}
}

class Hai24 {
	static int a =10;
}

class Hello24 extends Hai24 {
 static	int a = 20;

  static void show() {
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
