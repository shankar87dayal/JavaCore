package com.corejava.class_Class_threads;

public class Lab1394 {
	public static void main(String[] args) {
		Thread th1 = Thread.currentThread();
		MyThreadT_C4 th2 = new MyThreadT_C4(th1);
		th2.start();
		for (char ch = 'A'; ch < 'L'; ch++) {
			System.out.println(th1.getName() + "\t\t" + ch + "\t M" + th1.isAlive() + ", TH: " + th2.isAlive() + ", C: "
					+ Thread.activeCount());
			if (ch == 'F') {
				int x = 10 / 0;
			}
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class MyThreadT_C4 extends Thread {
	Thread main;

	MyThreadT_C4(Thread main) {
		this.main = main;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(getName() + "\t" + i + "\t M" + main.isAlive() + ", TH: " + isAlive() + ", C: "
					+ Thread.activeCount());
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}