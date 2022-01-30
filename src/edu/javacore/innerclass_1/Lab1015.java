package edu.javacore.innerclass_1;

class OuterC7 {
	void m1() {
		// InnerC8 ob1 = new InnerC8();
		class InnerC8 {
		}
		InnerC8 ob2 = new InnerC8();
	}

	void m2() {
		class InnerC9 {
		}
		InnerC9 ob3 = new InnerC9();
	}
}

public class Lab1015 {
	public static void main(String[] args) {
		System.out.println("Hello Guys!");
	}
}
