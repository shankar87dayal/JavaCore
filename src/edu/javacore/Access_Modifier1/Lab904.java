package edu.javacore.Access_Modifier1;

public class Lab904 {
	public static void main(String[] args) {
		B2 bobj = new B2();
		bobj.show(99);
		bobj.show("RAvi");
	}
}

class A2 {
	void show(int ab) {
		System.out.println("A->show(int)");
	}
}

class B2 extends A2 {
	void show(String ab) {
		System.out.println("B->show(String)");
	}
}