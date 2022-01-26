package edu.javacore.Method.pro1;

public class Lab794 {
	public static void main(String[] args) {
		System.out.println("Hello-main");
	}
}

class Hai {
	public static void main(String[] args) {
		System.out.println("Hai-main");
		Hello.main(args);
	}
}