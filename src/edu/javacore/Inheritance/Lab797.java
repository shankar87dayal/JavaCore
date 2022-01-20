package edu.javacore.Inheritance;

public class Lab797 {
	public static void main(String[] args) {
		Hai hai = new Hai();
		System.out.println(hai.a);
		System.out.println(hai.b);

		Hello Hello = new Hello();
		System.out.println(Hello.a);
		System.out.println(Hello.b);

	}
}

class Hai {
	int a = 99;

}

class Hello {
	int b = 98;

}