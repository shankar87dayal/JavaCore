package edu.javacore.Method.pro1;

public class Lab790 {
	static int count = 0;

	public static void main(String[] args) {
		count++;
		System.out.println("main starts: " + count);
		if (count < 5)
			main(null);
		System.out.println("main ends:" + count);
	}
}
