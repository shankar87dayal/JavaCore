package edu.javacore.Access_Modifier1;

public class Lab899 {
	public static void main(String[] args) {
		A5 obj = new A5(99);
		obj.show();
	}
}

class A5 {
	private int x;

A5(int x){
	this.x=x;
}

	void show() {
		System.out.println(x);
	}
}
