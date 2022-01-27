package edu.javacore.Access_Modifier1;

public class Lab920 {
	public static void main(String[] args) {
		new Bb3().m1();
	}
}

class Aa3 {
	public void m1() {
	}
}

class Bb3 extends Aa3 {
	protected void m1() {
	}
}