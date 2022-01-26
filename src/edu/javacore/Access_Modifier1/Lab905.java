package edu.javacore.Access_Modifier1;

public class Lab905 {
	public static void main(String[] args) {
		B3 bobj = new B3();
		bobj.show();
	}
}

class A10 {
	long show() {
		return 0;
	}
}

class B3 extends A10 {
	int show() {
		return 0;
	}
}
