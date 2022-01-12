package edu.javacore.Method.pro;

class c {
	void m3(int x) {
		System.out.println("M3 Begins: " + x);
		System.out.println("m3 Ends: " + x);
	}
}

class B {
	void m2(int x) {
		System.out.println("m2 Begins: " + x);
		new c().m3(x + 10);
		System.out.println("m2 Ends: " + x);
	}
}

class A {
	void m1(int x) {
		System.out.println("m1 Begins: " + x);
		new B().m2(x + 10);
		System.out.println("m1 Ends: " + x);
	}
}

public class Lab741 {
	public static void main(String[] args) {
		int x = 10;
		System.out.println("main Begins: " + x);
		new A().m1(x + 10);
		System.out.println("main Ends: " + x);

	}
}
