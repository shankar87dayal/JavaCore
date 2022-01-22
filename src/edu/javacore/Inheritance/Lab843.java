package edu.javacore.Inheritance;

public class Lab843 {
	public static void main(String[] args) {
		new Ba1();
	}
}

class Ab1 {
	Ab1(int a) {
		System.out.println("A(int) Cons.");
	}
}

class Ba1 extends Ab1 {
	Ba1() {
		super();
		System.out.println("B-> Dc.");
	}
}
