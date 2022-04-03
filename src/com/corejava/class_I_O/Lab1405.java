package com.corejava.class_I_O;

import java.io.IOException;

public class Lab1405 {
	public static void main(String[] args) throws Exception {
		jlcReader rd = new jlcReader();
		System.out.println("Enter sid");
		String sid = rd.readLine();
		System.out.println("Enter Name");
		String nm = rd.readLine();
		System.out.println("Enter phone");
		String phn = rd.readLine();
		System.out.println("Enter fee");
		String fee = rd.readLine();
		System.out.println(sid + "\t" + nm + "\t" + phn + "\t" + fee);
	}
}

class jlcReader {
	public String readLine() throws IOException {
		StringBuffer val = new StringBuffer();
		while (true) {
			int asc = System.in.read();
			if (asc == 13)
				;
			else if (asc == 10)
				break;
			else {
				char ch = (char) asc;
				val.append(ch);
			}
		}
		return val.toString();
	}
}