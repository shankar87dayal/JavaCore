package edu.javacore.innerclass_1;

class OuterC5 {
	static void show() {
		System.out.println("OuterC5->show()Begin");
		class InnerC5 {
			int a = 10;
			final static int c = 30;

			void m1() {
				System.out.println("InnerC5->m1()");
			}
		}
	}
}

public class Lab1013 {
	public static void main(String[] args) {
		System.out.println("Hello Guys!");
	}
}
