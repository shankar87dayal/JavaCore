package edu.javacore.Inheritance;

public class Lab850 {
	public static void main(String[] args) {
		Ba11 bobj = new Ba11(10, "Ravi");
		bobj.show();
	}
}

class Ab11 {
	int a;

	Ab11(int a) {
		System.out.println("A->D.Cons.");
		this.a = a;
	}
}

class Ba11 extends Ab11 {
	String a;

	Ba11(int a1, String a2) {
		super(a1);
		this.a = a2;
		System.out.println("B (int) cons");
	}

	void show() {
		System.out.println(this.a);
		System.out.println(super.a);
	}
}
