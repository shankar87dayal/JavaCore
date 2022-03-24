package com.javacore.wrapper.class_1;

public class Lab1193 {
	public static void main(String[] args) {
		Jlc_Service2 serv = new Jlc_Service2();
		byte b1 = 12;
		byte b2 = 23;
		serv.show(b1, b2);
	}
}

class Jlc_Service2 {
	void show(Byte ab, Byte bc) {
		System.out.println("\n-- show(Byte, Byte)");
	}

	void show(byte... ab) {
		System.out.println("\n-- show(byte...)");
	}
}
