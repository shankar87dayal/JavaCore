package edu.javacore.interface_1;

interface Inter7 {
	void m1();

	int a = 10;
}

interface Inter8 {
	void m2();

	int b = 11;
}

class Hello6 implements Inter7, Inter8 {
	public void m1()

	{
		System.out.println("Hello->m1(): ");
	}

	public void m2() {
		System.out.println("Hello->m2(): ");
	}

}

public class Lab966 {
	public static void main(String[] args) {
		Hello6 h = new Hello6();
		System.out.println(h.a);
		System.out.println(h.b);
		h.m1();
		h.m2();
	}
}
