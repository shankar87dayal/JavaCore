package edu.javacore.Inheritance;

public class Lab836 {
	public static void main(String[] args) {
		new C23().show();
	}
}

class A23 {
	int a = 10;
	int getAData() {
		return this.a;
	}
	
}

class B23 extends A23 {
	String a = "Ravi";

}

class C23 extends B23 {
	boolean a = true;

	void show() {
		float a = 99.99f;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(super.a);
		System.out.println(getAData());
	}
}
