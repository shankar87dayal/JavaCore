package edu.javacore.Access_Modifier1;

public class Lab897 {
	public static void main(String[] args) {
		A3 aobj = new A3();
		aobj.x = 99;
		System.out.println(aobj.x);
	}
}

class A3 {
	private int x;
}