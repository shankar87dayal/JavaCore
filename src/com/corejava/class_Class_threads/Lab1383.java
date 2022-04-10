package com.corejava.class_Class_threads;

public class Lab1383 {
	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("jlc");
		MyThread_4 t1 = new MyThread_4(tg, "Hello");
		t1.setPriority(9);
		System.out.println(t1);
	}
}

class MyThread_4 extends Thread {
	MyThread_4(ThreadGroup tg, String name) {
		super(tg, name);
	}
}