package edu.javacore.Method.pro;

class Hello51 {
	long factorial(int n) {
		if (n == 0 || n == 1)
			return 1;
		else
			return n * factorial(n - 1);
	}
}

public class Lab743 {
	public static void main(String[] args) {
		Hello51 h = new Hello51();
		int n = 4;
		long fac = h.factorial(n);
		System.out.println("Factorial is: " + fac);
	}
}
