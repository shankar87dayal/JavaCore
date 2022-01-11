package edu.javacore.This;

   public class Lab636 {
  public static void main(String[] args) {
	Hello19 h =new Hello19();
	h.show();
}
}
   class Hello19{
	   int a;
	   void show() {
		   String a="Ravi";
		   System.out.println(a);
		   System.out.println(this.a);
		   System.out.println(Hai1.this.a);
	   }
   }
   class Hai1{
	   int a;
   }