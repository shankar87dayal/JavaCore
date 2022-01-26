package edu.javacore.Package2;

import edu.javacore.Package.*;
import edu.javacore.Package1.*;

public class Lab892 {
	public static void main(String[] args) {
		Student st = new Student();
		st.sid = 99;
		st.sname = "Ravi";
		st.show();
		Employee emp = new Employee();
		emp.eid = 98;
		emp.ename = "Raushan";
		emp.show();
	}
}
