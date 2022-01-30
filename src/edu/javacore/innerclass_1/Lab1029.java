package edu.javacore.innerclass_1;

class Hello_4 {
}

public class Lab1029 {
	public static void main(String[] args) {
		Hello_4 h1 = new Hello_4() {
		};
		Hello_4 h2 = new Hello_4() {
		};
		System.out.println(h1);
		System.out.println(h2);
		System.out.println(new Hello_4() {
		} == new Hello_4() {
		});

	}
}
