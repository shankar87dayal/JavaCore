package edu.javacore.Method.pro1;

public class Lab749 {
	public static void main(String[] args) {
		Hello4 h = new Hello4();
		h.sum(12, 23);
	}
}

class Hello4 {
	void sum(int a, int b) {
		System.out.println("-sum(int, int )");
		System.out.println(a + b);
	}

}