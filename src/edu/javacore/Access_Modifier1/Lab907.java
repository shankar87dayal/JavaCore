package edu.javacore.Access_Modifier1;

public class Lab907 {
	public static void main(String[] args) {
		Hai5 hai = new Hai5();
		hai.m1();
	}
}

class Hello5 {
	A12 m1() {
		return new A12();
	}
}

class Hai5 extends Hello5 {
	A12 m1() {
		return new A12();
	}
}

class A12 {
}

class B12 extends A12 {

}