package edu.javacore.innerclass_1;

class Outer_2 {
	private int a = 20;

	class InnerB {
		private int a = 20;

		void showInnerB() {
			System.out.println("inner-> showInnerB()");
			System.out.println(a);
			System.out.println(this.a);
		}
	}

	void showOuter_2() {
		System.out.println("inner-> showOuter_2()");
		System.out.println(a);
		System.out.println(this.a);
	}
}

public class Lab1003 {
	public static void main(String[] args) {
		new Outer_2().new InnerB().showInnerB();
		new Outer_2().showOuter_2();
	}
}
