package edu.javacore.This;

public class Lab634 {
public static void main(String[] args) {
	new Hello16().show()
	new Hai().show();
}
}

class Hello16 {
	void show() {
		Hello16.h1 = this;
		Hai h2 = this;
	}
}

class Hai {
	void show() {
		Hello16.h1 = this;
		Hai h2 = this;
	}
}