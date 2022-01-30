package edu.javacore.innerclass_1;

abstract class Person7 {
	public abstract void sleeping();
}

public class Lab1025 {
	public static void main(String[] args) {
		new Person7() {
			void reading() {
				System.out.println("Person7->reading()");
			}

			public void sleeping() {
				System.out.println("Person7->sleeping");

			}
		}.reading();
	}
}
