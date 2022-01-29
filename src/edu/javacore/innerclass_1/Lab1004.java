package edu.javacore.innerclass_1;

class Outer_3 {
	int a = 10;
	static int b = 20;

	void m1() {
		System.out.println("Outer_3->m1()");
	}

	static void m2() {
		System.out.println("Outer_3-> m2()");
	}

	static class InnerC {
		int x = 11;
		static int y = 22;

		void show() {
			System.out.println("InnerC-> show()");
			System.out.println(a);
			System.out.println(b);
			System.out.println(x);
			System.out.println(y);
			m1();
			m2();
		}

		static void m3() {
			System.out.println("InnerC->m3");
		}
	}
}

public class Lab1004 {
	public static void main(String[] args) {
		Outer_3 outob = new Outer_3();
		outob.m1();
		outob.m2();
		Outer_3.InnerC inob = new Outer_3.InnerC();
		inob.show();
		inob.m3();
	}
}
