package com.corejava.classSystem;

import java.sql.Date;

public class Lab1195 {
	public static void main(String[] args) {
		long time = System.currentTimeMillis();
		Date dt = new Date(time);
		System.out.println(dt);
		String pnm = System.getProperty("os.name");
		System.out.println("OS.NAME:" + pnm);
		String pnm1 = System.getProperty("os.name");
		System.out.println("OS.NAME:" + pnm1);
		System.out.println("jlc.website" + "www.jlcindia.com");
		System.out.println(System.getProperty("www.jlcindia.com"));
	}
}
