package com.corejava.class_I_O;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Lab1411 {
	public static void main(String[] args) {
		try (FileReader fr = new FileReader("D:\\D1\\abc.txt");
				BufferedReader br = new BufferedReader(fr);
				FileWriter fw = new FileWriter("D:\\D1\\xyz.txt");
				BufferedWriter bwr = new BufferedWriter(fw);) {
			while (true) {
				String st = br.readLine();
				if (st == null)
					break;
				bwr.write(st);
				bwr.newLine();

			}
			bwr.close();
			System.out.println("Writing completed");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
