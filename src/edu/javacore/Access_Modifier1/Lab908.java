package edu.javacore.Access_Modifier1;

public class Lab908 {
	public static void main(String[] args) {
		Hai6 hai = new Hai6();
		hai.m1();
	}
}

class Hello6 {
	A13 m1(){
		return new A13();
	}
}

class Hai6 extends Hello6 {
	B13 m1() {
		return new B13();
	}
}

class A13 {

}

class B13 extends A13 {

}