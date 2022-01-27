package edu.javacore.polymorphism;

public class Lab933 {
	public static void main(String[] args) {
		Person pob = null;
		pob = new Student();
		pob.reading();
		pob = new Employee();
		pob.walking();
	}
}
