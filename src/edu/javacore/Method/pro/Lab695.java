package edu.javacore.Method.pro;

public class Lab695 {
	public static void main(String[] args) {
		Student2 st = new Student2();
		st.setAge(-12);
		System.out.println(st.age);
	}
}

class Student2 {
	int age = 18;

	void setAge(int age) {
		if (age < 18)
			return;
		this.age = age;
	}
}
