package edu.javacore.Object;

public class Lab596 {
	public static void main(String[] args) {
		System.out.println("i am Main()");
		{
			int a=10;
			System.out.println("i am Local Block1 in main()" +a);
		}
		{
			int a=20;
			System.out.println("i am Local Block2 in Main() "+a);
		}
		{
			String a="Raushan";
			System.out.println("i am Local Block3 in Main() "+a);
		}
	}
}
