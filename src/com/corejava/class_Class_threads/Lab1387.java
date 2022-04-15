package com.corejava.class_Class_threads;

public class Lab1387 {
	public static void main(String[] args) {
		Hello_1 h1 = new Hello_1();
		Hello_1 h2 = new Hello_1();
		MyThreadT_1 th1 = new MyThreadT_1(h1);
		MyThreadT_1 th2 = new MyThreadT_1(h1);
//	MyThreadT_1 th2 = new MyThreadT_1(h2);
		th1.start();
		th2.start();

	}
}

class MyThreadT_1 extends Thread {

	Hello_1 h = null;

	MyThreadT_1(Hello_1 h) {
		this.h = h;
	}
	public void run() {
		h.show();
	}
}

class Hello_1 {
	void show() {
		Thread th = Thread.currentThread();
		synchronized (this) {
		for (int i = 0; i < 5; i++) {
			System.out.println(th.getName() + "- SHOW: " + i + "\t" + this);
			try {
				Thread.sleep(500);
			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}
}
}
