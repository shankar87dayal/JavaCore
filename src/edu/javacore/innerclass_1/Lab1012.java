package edu.javacore.innerclass_1;

class OuterC4 {
	static void show() {
		System.out.println("OuterC4->show()Begin");
		class InnerC4 {
			int a = 10;
			static int b = 20;
			final static int c = 30;

			void m1() {
				System.out.println("InnerC4->m1()");
			}

			static void m2() {
				System.out.println("InnerC4->m2()");

			}
		}
	}
}

public class Lab1012 {
	public static void main(String[] args) {
		System.out.println("Hello Guys!");
	}
}
