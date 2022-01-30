package edu.javacore.innerclass_1;

abstract class Person3 {
	public abstract void sleeping();
}

public class Lab1021 {
	public static void main(String[] args) {
		Person3 p1 = new Person3() {
			public void sleeping() {
				System.out.println("Person3->sleeping");
			}
		};
		p1.sleeping();
	}

}
