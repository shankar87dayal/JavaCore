package edu.javacore.polymorphism;

public class Lab934 {
	public static void main(String[] args) {
		Person pob = null;
		pob = new Student();
		Student stu = (Student) pob;
		stu.reading();
		pob = new Employee();
		Employee emp = (Employee) pob;
		emp.working();
	}
}
