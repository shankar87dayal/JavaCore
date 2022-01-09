package edu.javacore.Object;

public class Lab591 {
	public static void main(String[] args) {
		System.out.println("\n  Main: " + Hello51.a);

	}
}

class Hello51 {
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