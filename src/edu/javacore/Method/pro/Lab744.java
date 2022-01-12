package edu.javacore.Method.pro;

class Hello52 {
	long power(int n, int p) {
		if (p == 0)
			return 1;
		else
			return n * power(n, p - 1);
	}
}

public class Lab744 {
	public static void main(String[] args) {
		Hello52 h = new Hello52();
		int n = 3;
		int p = 2;
		System.out.println("power is: " + h.power(n, p));
	}
}
