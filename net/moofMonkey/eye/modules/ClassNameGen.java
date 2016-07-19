package net.moofMonkey.eye.modules;

import java.util.Random;

public class ClassNameGen extends Thread {
	public static String alphabet = "Ii";

	public static String get(int c) {
		String name = "";

		try {
			int i = c;
			Random rand = new Random();
			while (true) {
				if (i == 0)
					break;
				name += alphabet.charAt(rand.nextInt(alphabet.length()));
				i--;
			}
		} catch (Throwable t) {
			t.printStackTrace();
		}
		
		System.gc();

		return name;
	}
}
