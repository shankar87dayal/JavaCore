package edu.javacore.This;

public class Lab635 {
	public class Lab636 {
		public static void main(String[] args) {
			Hello17 h = new Hello17();
			h.show();

		}
	}

	class Hello17 {
		int a;

		void show() {
			String a = "Raushan";
			System.out.println(a);
			System.out.println(this.a);
			System.out.println(Hello17.this.a);
		}
}
