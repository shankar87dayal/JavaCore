package edu.javacore.This;

public class Lab676 {
	public static void main(String[] args) {
		Happy5 h = new Happy5();
		System.out.println(h.a);
	}
}

class Happy5 {
	final int a;

	Happy5() {
		a = 10;
	}

	{
		a = 90;
	}
}
