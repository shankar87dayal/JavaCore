package com.corejava.class_Class_threads;

public class Lab1397 {
	public static void main(String[] args) {
		Thread th1 = Thread.currentThread();
		MyThreadT_C7 th2 = new MyThreadT_C7(th1);
		th2.start();
		for (char ch = 'A'; ch < 'L'; ch++) {
			System.out.println(th1.getName() + "\t\t" + ch);

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThreadT_C7 extends Thread {
	Thread main;

	MyThreadT_C7(Thread main) {
		this.main = main;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "\t" + i);

			try {
				if (i == 5)
					main.join();

				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}