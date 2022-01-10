package edu.javacore.This;

public class Lab616 {
	public static void main(String[] args) {
		Hello2 h = new Hello2();
		h.show();
	}
}

class Hello2 {
	int a = 10;

	void show() {
		String a = "Raushan";
		System.out.println(a);
		System.out.println(this.a);
	}
}
