package edu.javacore.innerclass_1;

abstract class Person4 {
	public abstract void sleeping();
}

class Hello {
	Person4 p1 = new Person4() {
		public void sleeping() {
			System.out.println("Person4->sleeping");
		}
	};

	void m1() {
		p1.sleeping();
	}
}

public class Lab1022 {
	public static void main(String[] args) {
		Hello h = new Hello();
		h.m1();
		h.p1.sleeping();
	}
}
