package net.moofMonkey.eye.modules;

import java.security.SecureRandom;

public class ClassNameGen extends Thread {
	public static char[] alphabet = new char[] { 'I', 'i' };
	private static SecureRandom rand = new SecureRandom();

	public static String get(int len) {
		char[] name = new char[len];

		for(int i = 0; i < len; i++)
			name[i] = alphabet[rand.nextInt(alphabet.length)];

		return new String(name);
	}
}
