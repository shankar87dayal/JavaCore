package edu.javacore.interface_1;

class Hello7 implements Interr1, Interr2 {
	public void m1() {
		System.out.println("Hello ->m1()");
	}

	public void m2() {
		System.out.println("Hello->m2()");
	}

	public void m3() {
		System.out.println("Hello-> m3()");
		System.out.println(b);
		System.out.println(c);
	}

}

public class Lab967 {
	public static void main(String[] args) {
		Hello7 h = new Hello7();
		h.m1();
		h.m2();
		h.m3();
	}
}
