package edu.javacore.Method.pro;

public class Lab697 {
	public static void main(String[] args) {
		Hello9 h = new Hello9();
		int a = h.show(10);
		System.out.println(a);
	}
}

class Hello9 {
	int show(int x) {
		return x + 1;
	}

}