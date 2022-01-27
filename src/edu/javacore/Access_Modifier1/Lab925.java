package edu.javacore.Access_Modifier1;

public class Lab925 {
	public static void main(String[] args) {
		Bb8 bobj = new Bb8();
		bobj.m1();
	}
}

class Aa8 {
	void m1() {
		System.out.println("A-> m1()");
	}
}

class Bb8 extends Aa8 {
	static void m1() {
		System.out.println("B->m1()");
	}
}
