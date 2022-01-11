package edu.javacore.This;

import java.util.Scanner;

public class Lab683 {
	public static void main(String[] args) {
		System.out.println(Happii.a);
		System.out.println("Delete class file and press Enter");
		Scanner sc = new Scanner(System.in);
		sc.nextLine();
		Happii h1 = new Happii();
		h1.show();
		Happii h2 = new Happii();
		
		
		h2.show();
	}
}

class Happii {
	static int a = 10;

	Happii() {
		System.out.println("** Hello Def Con");
	}

	Happii(int a) {
		System.out.println("** Hello (int) Con");
	}

	void show() {
		System.out.println("** show()**");
	}

}