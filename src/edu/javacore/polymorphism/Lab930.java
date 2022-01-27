package edu.javacore.polymorphism;

public class Lab930 {
	public static void main(String[] args) {
		Person pob = null;
		pob = new Student();
		pob.eating();
		pob = new Employee();
		pob.eating();
	}
}
