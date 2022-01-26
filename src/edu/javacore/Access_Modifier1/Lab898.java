package edu.javacore.Access_Modifier1;

public class Lab898 {
	public static void main(String[] args) {
		A4 obj = new A4();
		obj.show();
	}
}

class A4 {
	private int x;

	void show() {
		System.out.println(x);
	}
}