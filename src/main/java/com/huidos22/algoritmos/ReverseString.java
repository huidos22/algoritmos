package com.huidos22.algoritmos;

import java.util.Scanner;

public class ReverseString {

	public static void main(String... arg) {

		Scanner sc = new Scanner(System.in);
		String revStr = sc.next();
		sc.close();

		System.out.println("String: " + revStr + " Reversed:" + reverseStr(revStr));

	}

	private static String reverseStr(String cade) {

		String reversedStr = "";

		for (int i = cade.length()-1; i >=0; i--) {
			reversedStr += cade.charAt(i);
		}

		return reversedStr;
	}
}
