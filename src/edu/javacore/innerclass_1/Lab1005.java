package edu.javacore.innerclass_1;

class Outer_4 {
	int a = 10;
	static int b = 20;

	void m1() {
		System.out.println("Outer_4->m1()");
	}

	static void m2() {
		System.out.println("Outer_4-> m2()");
	}

	static class InnerD {
		int x = 11;
		static int y = 22;

		void show() {
			System.out.println("InnerC-> show()");
			System.out.println(b);
			System.out.println(x);
			System.out.println(y);
			m2();
		}

		static void m3() {
			System.out.println("InnerD->m3");
		}
	}
}

public class Lab1005 {
	public static void main(String[] args) {
		Outer_4 outob = new Outer_4();
		outob.m1();
		outob.m2();
		Outer_4.InnerD inob = new Outer_4.InnerD();
		inob.show();
		inob.m3();
	}
}
