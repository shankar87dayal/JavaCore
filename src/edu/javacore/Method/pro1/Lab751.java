package edu.javacore.Method.pro1;

public class Lab751 {
	public static void main(String[] args) {
		Hello6 h = new Hello6();
		h.sum(new int[0]);
		h.sum(new int[] {12,34,54});
		h.sum(new int[] {10,20,50,30});
	}
}

class Hello6 {
	void sum(int arr[]) {
		System.out.println("-sum(int[])");
		System.out.println("Length: "+arr.length);
		int s=0;
		for (int a: arr) {
			s=s+a;
			
		}
		System.out.println("sum is: "+s);
	}

}
