package edu.javacore.Access_Modifier1;

public class Lab917 {
	public static void main(String[] args) {
		new Bb().m1();
	}
}

class Aa {
	void m1() {
	}

	void m2() {
	}

	void m3() {
	}
}

class Bb extends Aa {
	void m1() {
	}

	protected void m2() {
	}

	public void m3() {
	}
}