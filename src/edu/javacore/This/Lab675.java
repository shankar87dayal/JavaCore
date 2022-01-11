package edu.javacore.This;

public class Lab675 {
	public static void main(String[] args) {
		Happy4 h = new Happy4();
		System.out.println(h.a);
	}
}

class Happy4 {
	final int a;
	 Happy4() {
		a = 10;
	}
	 Happy4(int a) {
		 this.a=a;
	 }
}