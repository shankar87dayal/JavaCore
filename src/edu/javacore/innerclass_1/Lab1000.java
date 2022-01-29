package edu.javacore.innerclass_1;

class Outer8 {
	interface Inter1 {
	}

	interface Inter2 extends Inter1 {
	}

	class Innerr_1 implements Inter1 {
	}

	class Innerr_2 extends Innerr_1 {
	}

	private abstract class Innerr_3 {
	}

	class Hello extends Innerr_3 {
	}
}

public class Lab1000 {
	public static void main(String[] args) {
		System.out.println("Hello Guys!");
	}
}
