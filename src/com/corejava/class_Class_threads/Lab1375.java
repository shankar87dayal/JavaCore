package com.corejava.class_Class_threads;

public class Lab1375 {
	public static void main(String[] args) {
		MyThread5 t1 = new MyThread5("Hello");
		MyThread5 t2 = new MyThread5("Hai");
	}
}

class MyThread5 extends Thread {
	MyThread5(String tname) {
		Thread t = new Thread(this, tname);
		t.start();
	}

	public void run() {
		Thread th = Thread.currentThread();
		ThreadGroup tg = th.getThreadGroup();
		System.out.println("Thread Name: " + th.getName());
		System.out.println("Thread Group Name: " + tg.getName());

	}
}
