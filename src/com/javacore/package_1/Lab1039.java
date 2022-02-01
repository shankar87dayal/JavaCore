package com.javacore.package_1;

public class Lab1039 {
	public static void main(String[] args) {
		Student_5 st1 = new Student_5(98, "sri");
		Student_5 st2 = new Student_5(12, "sri");
		Student_5 st3 = new Student_5(12, "Nivas");
		Student_5 st4 = st1;
		System.out.println("using == op");
		System.out.println(st1 == st2);
		System.out.println(st1 == st3);
		System.out.println(st1 == st4);
		System.out.println(st2 == st3);

		System.out.println("using equals()");
		System.out.println(st1.equals(st2));
		System.out.println(st2.equals(st3));
		System.out.println(st1.equals(st4));
		System.out.println(st2.equals(st3));

	}
}

class Student_5 {
	int sid;
	String name;

	Student_5(int sid, String name) {
		this.sid = sid;
		this.name = name;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Student_5) {
			Student_5 st = (Student_5) obj;
			return this.sid == st.sid && this.name.equals(st.name);
		}
		return false;
	}

}
