package edu.javacore.Method.pro1;

public class Lab762 {
	public static void main(String[] args) {
		Hello17 h = new Hello17();
		h.show("Ravi", 10);
	}
}

class Hello17 {
	void show(String... str, int... arr1) {
		System.out.println("\nshow(String,int...)");
	}

}
