package edu.javacore.innerclass_1;

abstract class Person5 {
	public abstract void sleeping();
}

public class Lab1023 {
	public static void main(String[] args) {
		Person5 per = new Person5() {
			void reading() {
				System.out.println("Person5->reading()");
			}

			public void sleeping() {
				System.out.println("Person5->sleeping");
			}
		};
		per.sleeping();
		per.reading();
	}
}
