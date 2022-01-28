package edu.javacore.interface_1;

interface InterF_2 {
	void show();
}

interface InterF_3 {
	int show();
}

class A3 implements InterF_2 {
	public void show() {

	}
}

class B3 implements InterF_2 {
	public int show() {
		return 0;
	}
}

class C3 implements InterF_2, InterF_3 {
	public void show() {
	}

	public void show() {
	}
}