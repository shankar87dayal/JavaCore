package edu.javacore.interface_1;

class A {
	static int x = 90;
}

class B extends A {
	void show() {
		System.out.println("B->show()");
		System.out.println(x);
		x = 99;
	}
}

class C extends A {
	void display() {
		System.out.println("C->display()");
		System.out.println(x);
	}
}

public class Lab971 {
	public static void main(String[] args) {
		B bobj = new B();
		bobj.show();
		C cobj = new C();
		cobj.display();
	}
}
