package com.corejava.class_Class_threads;

public class Lab1399 {
	public static void main(String[] args) {
		Thread th1 = Thread.currentThread();
		MyThreadT_C9 th2 = new MyThreadT_C9();
		th2.setDaemon(true);
		th2.start();
		for (char ch = 'A'; ch < 'L'; ch++) {
			System.out.println(th1.getName() + "\t\t" + ch + "\t" + th1.isDaemon());

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThreadT_C9 extends Thread {
	public void run() {
		for (int i = 0; i < 20; i++) {
			System.out.println(getName() + "\t" + i + "\t" + isDaemon());

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}