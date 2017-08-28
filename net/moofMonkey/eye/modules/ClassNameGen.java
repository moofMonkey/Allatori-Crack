package net.moofMonkey.eye.modules;

import java.security.SecureRandom;

public class ClassNameGen extends Thread {
	public static String alphabet = "Ii";
	private static SecureRandom rand = new SecureRandom();

	public static String get(int len) {
		char[] name = new char[len];

		for(int i = 0; i < len; i++)
			name[i] = alphabet.charAt(rand.nextInt(alphabet.length()));

		return new String(name);
	}
}
