package edu.javacore.Inheritance;

public class Lab799 {
	public static void main(String[] args) {
		Hai2 hai = new Hai2();
		System.out.println(hai.a);

		Hello2 hello = new Hello2();
		System.out.println(hello.a);
		System.out.println(hello.b);

	}
}

class Hai2 {
	int a = 99;

}

class Hello2 extends Hai2 {
	int b = 98;
}
