package edu.javacore.polymorphism;
class Shape{
	void area() {} 

}
class Square extends Shape{}
public class Lab947 {
public static void main(String[] args) {
	Shape sp = new Shape();
	sp.area();
}
}
