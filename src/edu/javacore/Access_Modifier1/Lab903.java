package edu.javacore.Access_Modifier1;

public class Lab903 {
	public static void main(String[] args) {
		B1 bobj = new B1();
		bobj.show();
		bobj.SHOW();
	}
}

class A1 {
	void show() {
		System.out.println("A->show()");
	}
}

class B1 extends A1 {
	void SHOW() {
		System.out.println("B->SHOW()");
	}
}