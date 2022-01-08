package edu.javacore.Object;

public class Lab544 {
	public static void main(String[] args) {

		Customer c1 = new Customer();
		c1.show();
		Customer c2 = new Customer();
		c2.cid = 99;
		c2.cname = "Raushan";
		c2.phone = 9060088064l;
		c2.show();

	}
}

class Customer {
	int cid;
	String cname;
	long phone;

	void show() {
		System.out.println(cid);
		System.out.println(cname);
		System.out.println(phone);
	}
}
