package edu.javacore.Access_Modifier1;

public class Lab923 {
	public static void main(String[] args) {
		Bb6 bobj = new Bb6();
		bobj.m1();
	}
}

class Aa6 {
	void m1() {
		System.out.println("A-> m1()");
	}
}

class Bb6 extends Aa6 {
	void m1() {
		System.out.println("B->m1()");
		m1();
	}
}
