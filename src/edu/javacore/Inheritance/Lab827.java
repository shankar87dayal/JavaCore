package edu.javacore.Inheritance;

public class Lab827 {
	public static void main(String[] args) {
		Hello20 hello = new Hello20();
		hello.show();
	}
}

class Hai20 {
	int a = 10;

}

class Hello20 extends Hai20 {
	int a = 20;

	void show() {
		int a = 30;
		System.out.println(a);
		System.out.println(this.a);
	}
}