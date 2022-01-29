package edu.javacore.innerclass_1;

class Outer_1 {
	int a = 11;

	class InnerA {
		int a = 22;

		void show() {
			System.out.println("InnerA-> show()");
			int a = 33;
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(InnerA.this.a);
			// System.out.println(super.a);
			System.out.println(Outer_1.this.a);
		}
	}
}

public class Lab1002 {
	public static void main(String[] args) {
		new Outer_1().new InnerA().show();
	}
}
