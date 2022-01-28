package edu.javacore.interface_1;

class Hello10 implements Interr1, Interr2 {
	public void m1() {
		System.out.println("Hello ->m1()");
	}

	public void m2() {
		System.out.println("Hello->m2()");
	}

	public void m3() {
		System.out.println("Hello-> m3()");
		System.out.println(Interr1.a);
		System.out.println(Interr2.a);
		System.out.println(b);
		System.out.println(c);
	}
}

public class Lab970 {
	public static void main(String[] args) {
		Hello10 h = new Hello10();
		Interr1 ref1 = h;
		ref1.m1();
		ref1.m2();

		Interr2 ref2 = h;
		ref2.m2();
		ref2.m3();

	}
}
