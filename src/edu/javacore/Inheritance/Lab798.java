package edu.javacore.Inheritance;

public class Lab798 {
	public static void main(String[] args) {
		Hai1 hai = new Hai1();
		System.out.println(hai.a);
		System.out.println(hai.b);

		Hello1 hello = new Hello1();
		System.out.println(hello.a);
		System.out.println(hello.b);

	}
}

class Hai1 {
	int a = 99;

}

class Hello1 extends Hai1 {
	int b = 98;
}
