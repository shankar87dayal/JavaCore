package edu.javacore.Access_Modifier1;

class Hello {
	void m1() {
		System.out.println("Hello -> m1()");
	}

	void m2() {
		System.out.println("Hello-> m2()");
	}
}

class Haii extends Hello {
	void m2() {
		System.out.println("Hai->m2()");
	}

	void m3() {
		System.out.println("Hai-> m3()");
	}
}

public class Lab902 {
	public static void main(String[] args) {
		Haii hai = new Haii();
		hai.m1();
		hai.m2();
		hai.m3();
	}
}
