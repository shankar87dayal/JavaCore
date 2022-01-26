package edu.javacore.Access_Modifier1;

import edu.javacore.Access_Modifier.Hello;

class Xyz extends Hello {
}

class Hai extends Hello {
	void show() {
		System.out.println("Hai->show()");
		Hello h = new Hello();
		System.out.println(h.ab);
		Xyz ref = new Xyz();
		System.out.println(ref.ab));
	}
}

public class Lab896 {
	public static void main(String[] args) {
		Hai hai = new Hai();
		hai.show();
	}
}
