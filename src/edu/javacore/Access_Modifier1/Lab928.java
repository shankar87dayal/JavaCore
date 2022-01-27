package edu.javacore.Access_Modifier1;

import edu.javacore.Access_Modifier.Hello21;

class Hai22 extends Hello21 {
	void dispaly() {
		System.out.println("Hai-> void Display()");
	}
}

public class Lab928 {
	public static void main(String[] args) {
		Hai22 hai = new Hai22();
		hai.dispaly();
	}
}
