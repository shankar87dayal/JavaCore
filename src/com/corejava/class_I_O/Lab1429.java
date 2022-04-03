package com.corejava.class_I_O;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;
 
public class Lab1429 {
	public static void main(String[] args) throws Exception {
		try (FileOutputStream fos = new FileOutputStream("D:\\info.ser");
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			Address1 ad = new Address1("33/1", "Mathikere");
			Student4 st = new Student4(99, "sri", 65799999, ad);
			Student4.count = 9;
			System.out.println(st);
			oos.writeObject(st);
			System.out.println("Object Serialized+");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
class Address1 {
	String aid;
	String street;

	Address1(){}
	Address1(String aid, String street) {
		this.aid = aid;
		this.street = street;
	}

	public String toString() {
		return aid + "\t" + street;
	}
}
class Student4 implements Externalizable {
	int sid;
	transient String name = "XXXX";
	long phone = 33333;
	static int count = 3;
	Address1 add;
    public Student4() {}
	Student4(int sid, String name, long phone, Address1 add) {
		this.sid = sid;
		this.name = name;
		this.phone = phone;
		this.add = add;
	}

	public String toString() {
		return sid + "\t" + name + "\t" + phone + "\t" + count + "\n" + add;
	}
	public void writeExternal(ObjectOutput out) throws IOException{
		out.writeInt(count);
		out.writeObject(name);
		out.writeObject(add.aid);
		out.writeObject(add.street);
	}
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
		count = in.readInt();
		name = in.readObject().toString();
		add = new Address1();
		add.aid = in.readObject().toString();
		add.street = in.readObject().toString();
	}
}
