package edu.javacore.Access_Modifier1;

public class Lab918 {
	public static void main(String[] args) {
		new Bb1().m1();
	}
}

class Aa1 {
	protected void m1() {
	}

	protected void m2() {
	}
}

class Bb1 extends Aa1 {
	private void m1() {
	}

	void m2() {
	}
}