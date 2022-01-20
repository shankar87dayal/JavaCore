package edu.javacore.Inheritance;

public class Lab820 {
	public static void main(String[] args) {
		Hello17 hello =new Hello17();
	}
}

class Hai17 {
	{
		System.out.println("Hai->I.B: ");
	}
	static {
		System.out.println("Hai-> S.B");
	}
}

class Hello17 extends Hai17 {
	{
		System.out.println("Hello-> I.B: ");
		
	}
	static {
		System.out.println("Hello->S.B");
	}
}
