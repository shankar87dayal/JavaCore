package com.javacore.wrapper.class_1;

public class Lab1190 {
	public static void main(String[] args) {
		Void v = null;
		JlcService.show(null);
		JlcService.show(v);
	}
}

class JlcService {
	static void show(Void v) {
		System.out.println("show (Void)");
	}
}