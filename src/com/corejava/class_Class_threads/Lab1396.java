package com.corejava.class_Class_threads;

public class Lab1396 {
	public static void main(String[] args) {
		Thread th1 = Thread.currentThread();
		MyThreadT_C6 th2 = new MyThreadT_C6(th1);
		th2.start();
		for (char ch = 'A'; ch < 'L'; ch++) {
			System.out.println(th1.getName() + "\t\t" + ch);

			try {
				if (ch == 'F')
					th2.join();

				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThreadT_C6 extends Thread {
	Thread main;

	MyThreadT_C6(Thread main) {
		this.main = main;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "\t" + i);

			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}