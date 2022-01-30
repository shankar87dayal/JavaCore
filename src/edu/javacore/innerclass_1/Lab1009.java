package edu.javacore.innerclass_1;

class OuterC1 {
	int a = 10;
	static int b = 20;

	void show() {
		System.out.println("OuterC1->show()Begin");
		class InnerC1 {
			void m1() {
				System.out.println("InnerC1->m1()");
				System.out.println(a);
				System.out.println(b);
			}
		}
		new InnerC1().m1();
		System.out.println("OuterC1->show()End");
	}
}

public class Lab1009 {
	public static void main(String[] args) {
		OuterC1 out = new OuterC1();
		out.show();
	}
}
