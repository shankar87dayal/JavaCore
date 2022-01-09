package edu.javacore.Object;

public class Lab592 {
	public static void main(String[] args) {
		new Hello52();
		System.out.println("\n**Hello Guys");

	}
}

class Hello52 {
	static int a;
	{
		System.out.println("\n i am Ilb");
		{
			System.out.println("i am Local Block in ilb");
		}
	}
	static {
		System.out.println("\n i am SlB");
		{
			System.out.println("i am Static Block In SLB");
		}
	}
}
