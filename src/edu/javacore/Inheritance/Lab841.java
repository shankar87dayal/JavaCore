package edu.javacore.Inheritance;

public class Lab841 {
	public static void main(String[] args) {
		new Bb();
	}
}

class Aa {
	Aa() {
		System.out.println("A->Dc.");
	}
}

class Bb extends Aa {
	Bb() {
		super();
		System.out.println("B-> Dc.");
	}
}