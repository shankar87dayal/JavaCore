package com.corejava.class_Class_threads;

public class Lab1389 {
	public static void main(String[] args) {
		Hello_3 h1 = new Hello_3();
		Hello_3 h2 = new Hello_3();
		MyThreadT_3 th1 = new MyThreadT_3(h1);
		MyThreadT_3 th2 = new MyThreadT_3(h1);
//	MyThreadT_3 th2 = new MyThreadT_3(h2);
		th1.start();
		th2.start();

	}
}

class MyThreadT_3 extends Thread {

	Hello_3 h = null;

	MyThreadT_3(Hello_3 h) {
		this.h = h;
	}
}

class Hello_3 {
	static void show() {
		Thread th = Thread.currentThread();
		synchronized (Hello_3.class) {

			for (int i = 0; i < 5; i++) {
				System.out.println(th.getName() + "- SHOW: " + i);
				try {
					Thread.sleep(500);
				} catch (Exception e) {

					e.printStackTrace();
				}
			}
		}
	}
}
