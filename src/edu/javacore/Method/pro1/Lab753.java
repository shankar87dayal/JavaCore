package edu.javacore.Method.pro1;
public class Lab753 {
	public static void main(String[] args) {
		Hello8 h = new Hello8();
		h.sum();
		h.sum(new int[] {12,34,54});
		h.sum(new int[] {10,20,50,30});
	}
}

class Hello8 {
	void sum(int... arr) {
		System.out.println("-sum(int...)");
		System.out.println("Length: "+arr.length);
		int s=0;
		for (int a: arr) {
			s=s+a;
			
		}
		System.out.println("sum is: "+s);
	}

}
