package edu.javacore.innerclass_1;

class Outer_5 {
	void showOuter_5() {
		System.out.println("Outer_5-> showOuter_5()");
		System.out.println(x);
		System.out.println(y);
		m1();
	}

	static class InnerE {
		int x = 11;
		static int y = 22;

		static void m1() {
			System.out.println("InnerE-> m1()");
		}
	}
}

public class Lab1006 {
	public static void main(String[] args) {
		Outer_5 outob = new Outer_5();
		outob.showOuter_5();
	}
}
