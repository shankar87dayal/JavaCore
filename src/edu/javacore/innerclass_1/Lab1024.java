package edu.javacore.innerclass_1;

abstract class Person6 {
	public abstract void sleeping();
}

public class Lab1024 {
	public static void main(String[] args) {
		Person5 per = new Person5() {
			void reading() {
				System.out.println("Person5->reading()");
			}

			public void sleeping() {
				System.out.println("Person5->sleeping");
				reading();
			}
		};
		per.sleeping();
	}
}
