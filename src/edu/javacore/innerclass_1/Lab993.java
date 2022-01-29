package edu.javacore.innerclass_1;

class Outer1 {
	void show() {
		System.out.println("Outer -> show()");
		System.out.println(x);
		m1();
	}

	class Inner1 {
		int x = 11;

		void m1() {
			System.out.println("Inner -> m1()");
		}
	}
}

public class Lab993 {
	public static void main(String[] args) {
		Outer1 outob = new Outer1();
		outob.show();
	}
}
