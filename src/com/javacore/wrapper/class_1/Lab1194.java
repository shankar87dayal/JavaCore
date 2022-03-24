package com.javacore.wrapper.class_1;

public class Lab1194 {
	public static void main(String[] args) {
		Jlc_Service3 serv = new Jlc_Service3();
		byte b1 = 12;
		byte b2 = 23;
		serv.show(b1, b2);
	}
}

class Jlc_Service3 {
	void show(byte... ab) {
		System.out.println("\n-- show(byte...)");
	}
}

