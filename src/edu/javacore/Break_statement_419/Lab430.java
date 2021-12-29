package edu.javacore.Break_statement_419;

public class Lab430 {

	public static void main(String[] args) {
		sd: for (int i = 1; i <= 5; i++, System.out.println("i++")) {
			System.out.println("\n" + 1);
			Raushan: 
				for (int j = 1; j <= 5; j++, System.out.println("j++")) {
				if (i == 3)
					break sd;
				System.out.println("Raushan" + j);
			}
			System.out.println("\nINSIDE I- LOOP,OUTSIDE J-LOOP");
		}
		System.out.println("\nOUTSIDE I-LOOP");
	}

}
