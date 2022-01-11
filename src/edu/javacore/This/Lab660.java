package edu.javacore.This;

public class Lab660 {
		public static void main(String[] args) {
			System.out.println("main: " + Hello39.a);
			new Hello39();
		}
	}

	class Hello39 {
		 static int a = 10;
		 {
			System.out.println("IB: " + this);
			Hello39 h1 = new Hello39();

		}
}
