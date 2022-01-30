package edu.javacore.innerclass_1;

class OuterC2 {
	int a = 10;
	static int b = 20;

	static void show() {
		System.out.println("OuterC2->show()Begin");
		class InnerC2 {
			void m1() {
				System.out.println("InnerC2->m1()");
				System.out.println(b);
			}
		}
		new InnerC2().m1();
		System.out.println("OuterC2->show()End");
	}
}

public class Lab1010 {
	public static void main(String[] args) {
		OuterC2.show();
	}
}
