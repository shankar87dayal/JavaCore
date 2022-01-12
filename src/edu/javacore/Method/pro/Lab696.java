package edu.javacore.Method.pro;

public class Lab696 {
	public static void main(String[] args) {
		Student3 st = new Student3();
		st.setAge(-12);
		System.out.println(st.age);
	}
}

class Student3 {
	int age = 18;

	void setAge(int age) {
		if (age < 18)
			return 0;
		this.age = age;
	}
}
