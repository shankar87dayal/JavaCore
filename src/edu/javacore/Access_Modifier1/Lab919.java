package edu.javacore.Access_Modifier1;

public class Lab919 {
	public static void main(String[] args) {
		new Bb2().m2();
	}
}

class Aa2 {
	protected void m1() {
	}

	protected void m2() {
	}
}

class Bb2 extends Aa2 {
	protected void m1() {
	}

	public void m2() {
	}
}