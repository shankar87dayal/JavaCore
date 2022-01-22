package edu.javacore.Inheritance;

public class Lab842 {
	public static void main(String[] args) {
		new Ba();
	}
}

class Ab {
	Ab(int a) {
		System.out.println("A(int) Cons.");
	}
}

class Ba extends Ab {
	Ba() {
		System.out.println("B-> Dc.");
	}
}
