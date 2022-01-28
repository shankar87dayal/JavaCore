package edu.javacore.interface_1;

interface Inter_4 {
	void show();
}

class A4 {
	public static void show() {
		System.out.println("show method");
	}
}

class B4 extends A4 implements Inter_4 {
	public void show() {
	}
}

public class Lab974 {

}
