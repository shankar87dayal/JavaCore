package com.javacore.package_1;

public class Lab1041 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Hai1 hai = new Hai1(10);
		Hello1 h1 = new Hello1(20, hai);
		Hello1 h2 = (Hello1) h1.clone();
		System.out.println(h1 == h2);
		System.out.println(h1.hai == h2.hai);
		h1.show();
		h2.show();
		h2.y = 11;
		h2.hai.x = 22;
		h1.show();
		h2.show();

	}

}

class Hai1 {
	int x;

	Hai1(int x) {
		this.x = x;
	}
}

class Hello1 implements Cloneable {
	int y;
	Hai1 hai;

	Hello1(int y, Hai1 hai) {
		this.y = y;
		this.hai = hai;
	}

	void show() {
		System.out.println("Hello1-> y: " + y);
		System.err.println("Hai1-> x: " + hai.x);
	}

	public Object clone() throws CloneNotSupportedException {
		if (this instanceof Cloneable) {
			Hai1 hai = new Hai1(this.hai.x);
			Hello1 h = new Hello1(this.y, hai);
			return h;
		} else
			throw new CloneNotSupportedException(getClass().getName());

	}
}