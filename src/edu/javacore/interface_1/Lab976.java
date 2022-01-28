package edu.javacore.interface_1;

public class Lab976 {
	public static void main(String[] args) {
		D5 dobj = new D5();
		A5 aobj = dobj;
		B5 bobj = (B5) aobj;
		D5 dobj1 = (D5) aobj;
		System.out.println("Hello Guys!");
	}
}
