package edu.javacore.innerclass_1;

class Hello_3 {
}

public class Lab1028 {
	public static void main(String[] args) {
		Hello_3 h1 = new Hello_3() {
		};
		Hello_3 h2 = new Hello_3() {
		};
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(h1 == h2);

	}
}
