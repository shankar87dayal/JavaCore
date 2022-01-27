package edu.javacore.Access_Modifier1;

public class Lab922 {
	public static void main(String[] args) {
		Bb5 bobj = new Bb5();
		bobj.m1();
	}
}

class Aa5 {
	void m1() {
		System.out.println("A-> m1()");
	}
}

class Bb5 extends Aa5 {
	void m1() {
		System.out.println("B->m1()");
	}
}