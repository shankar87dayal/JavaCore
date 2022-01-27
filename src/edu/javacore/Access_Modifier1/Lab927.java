package edu.javacore.Access_Modifier1;

import edu.javacore.Access_Modifier.Hello20;

class Xyz2 extends Hello20 {
	protected void display() {
	}
}

class Hai21 extends Hello20 {
	void show() {
		Xyz2 ref = new Xyz2();
		ref.display();
	}
}

public class Lab927 {
	public static void main(String[] args) {
		Hai21 hai = new Hai21();
		hai.show();
	}
}
