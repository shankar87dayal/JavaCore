package edu.javacore.This;

public class Lab633 {
	public static void main(String[] args) {
		Hello16 h = new Hello16();
		h.show();
	}
}

class Hello16 {
	void show() {
		this = new Hello15();
	}
}
