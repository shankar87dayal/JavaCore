package edu.javacore.innerclass_1;

class Hello1 {
	{
		System.out.println("I.B - Hello1");
		class Inner_A {
		}
	}
	static {
		System.out.println("S.B-Hello1");
		class Inner_A {
		}
	}

	Hello1() {
		System.out.println("D.C -Hello1");
		class Inner_A {
		}
	}

	void m1() {
		System.out.println("m1()-Hello1");
		class Inner_A {
		}
	}
}

public class Lab1008 {
	public static void main(String[] args) {
		System.out.println("Hello Guys!");
	}
}
