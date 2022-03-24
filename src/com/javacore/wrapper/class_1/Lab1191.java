package com.javacore.wrapper.class_1;

public class Lab1191 {
	public static void main(String[] args) {
		Jlc_Service serv = new Jlc_Service();
		byte b1 = 12;
		byte b2 = 23;
		serv.show(b1, b2);
	}
}

class Jlc_Service {
	void show(int ab, int bc) {
		System.out.println("\n-- show(int,int)");
	}

	void show(byte ab, byte bc) {
		System.out.println("\n-- show(byte, byte)");
	}

	void show(Byte ab, Byte bc) {
		System.out.println("\n-- show(Byte, Byte)");
	}

	void show(byte... ab) {
		System.out.println("\n-- show(byte...)");
	}
}
