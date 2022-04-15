package com.corejava.class_Class_threads;

import java.util.ArrayList;

public class Lab1391 {
	public static void main(String[] args) {
		Hello_C2 h1 = new Hello_C2();
		MyThreadT_C2 th1 = new MyThreadT_C2(h1);
		MyThreadT_C2 th2 = new MyThreadT_C2(h1);
		th1.start();
		th2.start();
	}
}

class MyThreadT_C2 extends Thread {
	Hello_C2 h;

	MyThreadT_C2(Hello_C2 h) {
		this.h = h;
	}

	public void run() {
		h.show();
	}

}

class Hello_C2 {
	synchronized void show() {
		ArrayList al = new ArrayList();
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