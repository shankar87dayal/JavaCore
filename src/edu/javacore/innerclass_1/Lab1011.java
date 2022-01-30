package edu.javacore.innerclass_1;

class OuterC3 {
	int a = 10;
	static int b = 20;

	static void show() {
		System.out.println("OuterC3->show()Begin");
		class InnerC3 {
			void m1() {
				System.out.println("InnerC3->m1()");
				System.out.println(b);
			}
		}
		new InnerC3().m1();
		System.out.println("OuterC3->show()End");
	}
}

public class Lab1011 {
	public static void main(String[] args) {
		OuterC2.show();
	}
}
