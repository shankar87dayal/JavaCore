package edu.javacore.Inheritance;

public class Lab845 {
	public static void main(String[] args) {
		new Ba3();
	}
}

class Ab3 {
	Ab3(int a) {
		System.out.println("A(int) Cons.");
	}
}

class Ba3 extends Ab3 {
	Ba3() {
		System.out.println("B-> Dc.");
		super(10);
	}
}
