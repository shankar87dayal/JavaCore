package edu.javacore.Access_Modifier1;

public class Lab900 {
	public static void main(String[] args) {
		A6 obj = new A6();
		obj.setx(99);
		System.out.println(obj.getx());
	}
}

class A6 {
	private int x;

	void setx(int x) {
		this.x = x;
	}

	int getx() {
		return this.x;
	}
}