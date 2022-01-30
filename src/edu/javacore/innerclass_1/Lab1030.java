package edu.javacore.innerclass_1;

class Aa {
	int x = 10;
}

class Ba {
	char x = 'R';
}

class Outerr extends Aa {
	String x = "Ravi";

	class Innerr extends Ba {
		boolean x = true;

		void show() {
			float x = 10.0f;
			System.out.println(x);
			System.out.println(this.x);
			System.out.println(Innerr.this.x);
			System.out.println(Innerr.super.x);
			System.out.println(Outerr.this.x);
			System.out.println(Innerr.super.x);

		}
	}
}

public class Lab1030 {
	public static void main(String[] args) {
		new Outerr().new Innerr().show();
	}
}
