package edu.javacore.Access_Modifier1;

import edu.javacore.Access_Modifier.Hello21;

class Hai23 extends Hello21 {
	int dispaly() {
		System.out.println("Hai-> void Display()");
		return 0;
	}
}

public class Lab929 {
	public static void main(String[] args) {
		Hai23 hai = new Hai23();
		hai.dispaly();
	}
}
