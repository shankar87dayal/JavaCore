package edu.javacore.Access_Modifier1;

import edu.javacore.Access_Modifier.Hello20;

class Xyz extends Hello20 {
}

class Hai20 extends Hello20 {
	void show() {
		Xyz ref = new Xyz();
		ref.display();
	}
}

public class Lab926 {
	public static void main(String[] args) {
		Hai20 hai = new Hai20();
		hai.show();
	}

}
