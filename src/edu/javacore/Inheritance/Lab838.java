package edu.javacore.Inheritance;

public class Lab838 {
	public static void main(String[] args) {
		new Hello28().show();

	}
}

class Hai28 {
}

class Hello28 extends Hai28 {
	void show() {
		Hello28 h1=this;
		Hai28 h2 =  super;
		System.out.println(h1);
	}
}