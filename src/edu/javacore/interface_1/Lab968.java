package edu.javacore.interface_1;

class Hello8 implements Interr1, Interr2 {
	public void m1() {
		System.out.println("Hello ->m1()");
	}

	public void m2() {
		System.out.println("Hello->m2()");
	}

	public void m3() {
		System.out.println("Hello-> m3()");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class Lab968 {
	public static void main(String[] args) {
		Hello8 h = new Hello8();
		h.m1();
		h.m2();
		h.m3();
	}
}
