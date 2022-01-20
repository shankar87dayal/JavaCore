package edu.javacore.Inheritance;

public class Lab812 {
	public static void main(String[] args) {
		Helloo5 hello = new Helloo5();
		hello.show();
	}
}
class Haii5{
	int b = 99;
	protected int c=77;
	public int d=66;
}
class Helloo5 extends Haii5{
	void show() {
		System.out.println(b);
        System.out.println(c); 
		System.out.println(d);
	}
}