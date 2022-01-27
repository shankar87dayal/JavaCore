package edu.javacore.polymorphism;

public class Lab931 {
	public static void main(String[] args) {
		Person pob = null;
		pob = new Student();
		pob.walking();
		pob = new Employee();
		pob.walking();
	}
}
