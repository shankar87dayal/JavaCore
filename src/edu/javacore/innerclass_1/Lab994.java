package edu.javacore.innerclass_1;

class Outer2 {
	void show() {
		System.out.println("Outer -> show()");
		Inner2 inob = new Inner2();
		System.out.println(inob.x);
		inob.m1();
	}

	class Inner2 {
		int x = 11;

		void m1() {
			System.out.println("Inner -> m1()");
		}
	}
}

public class Lab994 {
	public static void main(String[] args) {
		Outer2 outob = new Outer2();
		outob.show();
	}
}
