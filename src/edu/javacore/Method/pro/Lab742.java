package edu.javacore.Method.pro;

class Hello50 {
	void m1(int x) {
		System.out.println("m1 Begins: " + x);
		if (x != 0)
			m1(x / 10);
		System.out.println("m1 Ends: " + x);
	}

}

public class Lab742 {
	public static void main(String[] args) {
		int x = 98;
		System.out.println("main Begins: " + x);
		new Hello50().m1(x);
		System.out.println("main Ends: " + x);

	}
}
