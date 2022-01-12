package edu.javacore.Method.pro;

public class Lab712 {
	public static void main(String[] args) {
		Hello24 h = new Hello24();
		System.out.println(h.show(10,20));
	}
}

class Hello24 {
	int show(int x) {
		System.out.println("show()");
		return x + 1;
	}
}
