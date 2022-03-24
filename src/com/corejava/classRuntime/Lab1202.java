package com.corejava.classRuntime;

public class Lab1202 {
	public static void main(String[] args) throws Exception {
		Runtime rt = Runtime.getRuntime();
//		Process p = rt.exec("notepad");
		String cmds[] = { "notepad", "D:\\welcome.txt" };
		// OPEN Welcome.txt FILE in NOTEPAD
		Process p2 = rt.exec(cmds);
		String cmds1[] = { "c:\\ Program Files\\ Mozilla FireFox\\firefox.exe", "http://WWW.jlcindia.com" };
		/*Process p3 = rt.exec(cmds1);
		System.out.println("Press ENTER to close all process");
		System.in.read();
//		p.destroy();
		p2.destroy();
		p3.destroy();
		System.out.println("Main Completed");*/
	}
}
