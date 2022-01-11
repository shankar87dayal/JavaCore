package edu.javacore.This;

public class Lab672 {
	public static void main(String[] args) {
		Happy1 h=new Happy1();
		System.out.println(h.a);
	}
	}
	class Happy1{
		final int a;
		{
			a=10;
		}
}
