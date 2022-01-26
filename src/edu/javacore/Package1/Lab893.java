package edu.javacore.Package1;

import javaX.swing.JOptionPane;

public class Lab893 {
	public static void main(String[] args) {
		String val1 = JOptionpane.showInputDialog("Enter the first value: ");
		String val2 = JOptionpane.showInputDialog("Enter the second value: ");
		int a = Integer.parseInt(val1);
		int b = Integer.parseInt(val2);
		int c = a + b;
		String msg = "sum of: " + a + "and " + b + "is" + c;
		JOptionPane.showMessageDialog(null, Msg);

	}
}
