package edu.javacore.This;

public class Lab656 {
	public static void main(String[] args) {
		Hello35 h = new Hello35();
		System.out.println("main: " + h.a);
	}
}

class Hello35 {
	{
		System.out.println("IB: "+this.a);
	}
	public Hello35() {
		System.out.println("con: " + a);
	}

	int a = 10;

}
