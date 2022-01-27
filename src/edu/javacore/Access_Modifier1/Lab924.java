package edu.javacore.Access_Modifier1;

public class Lab924 {
	public static void main(String[] args) {
		Bb7 bobj = new Bb7();
		bobj.m1();
	}
}

class Aa7 {
	void m1() {
		System.out.println("A-> m1()");
	}
}

class Bb7 extends Aa7 {
	void m1() {
		System.out.println("B->m1()");
		super.m1();
	}
}
