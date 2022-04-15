package com.corejava.class_Class_threads;

public class Lab1400 {
	public static void main(String[] args) {
		CThread th1 = new CThread("nivash", "jlcindia");
		CThread th2 = new CThread("dande", "javasree");
		th1.start();
		th2.start();
	}
}

class Service {
	void verifyUser(String unm, String pwd) {
		Thread th = Thread.currentThread();
		for (int i = 0; i < 10; i++) {
			System.out.println(th.getName() + "\t verifying: " + unm + "\t" + pwd);
			try {
				Thread.sleep(300);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}

class CThread extends Thread {
	static Service serv = new Service();
	String unm;
	String pwd;

	CThread(String unm, String pwd) {
		this.unm = unm;
		this.pwd = pwd;
	}

	public void run() {
		serv.verifyUser(unm, pwd);
	}
}