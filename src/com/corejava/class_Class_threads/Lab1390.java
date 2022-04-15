package com.corejava.class_Class_threads;

public class Lab1390 {
	public static void main(String[] args) {
		Hello_C1 h1 = new Hello_C1();
		MyThreadT_C1 th1 = new MyThreadT_C1(h1);
		MyThreadT_C1 th2 = new MyThreadT_C1(h1);
		th1.start();
		th2.start();
	}
}

class MyThreadT_C1 extends Thread {
	Hello_C1 h;

	MyThreadT_C1(Hello_C1 h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}

}

class Hello_C1 {
	synchronized void show() {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 5; i++) {
			try {
				wait(1000);
//		Thread.sleep(1000);
				System.out.println(th.getName() + "-show: " + "\t" + this);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}