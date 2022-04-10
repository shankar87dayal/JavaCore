package com.corejava.class_Class_threads;

public class Lab1379 {
	public static void main(String[] args) {
		MyThreadd3 t1 = new MyThreadd3();
		MyThreadd3 t2 = new MyThreadd3();
		t1.setName("Hello");
		t2.setName("Hai");
		t1.start();
		t2.start();
	}
}

class MyThreadd3 extends Thread {
	public void run() {
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		System.out.println("Thread Name: " + th.getName());
		System.out.println("Thread Group Name: " + tg.getName());

	}
}
