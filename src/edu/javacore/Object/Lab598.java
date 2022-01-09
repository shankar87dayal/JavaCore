package edu.javacore.Object;

public class Lab598 {
	public static void main(String[] args) {
		System.out.println("i am Main()");
			{
				int a=90;
				System.out.println("i am Local Block1 in main() " +a);
			}
			int a =10;
			System.out.println("i am main() "+a);
	}
}
