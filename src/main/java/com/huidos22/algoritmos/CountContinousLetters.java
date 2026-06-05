package com.huidos22.algoritmos;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class CountContinousLetters {

	public static void main(String[] args) {
		/**
		 * Given a string in such a way that every character occurs in a repeated
		 * manner: need to print the string by inserting the frequency of each unique
		 * characters. Compress only when the number of consecutive characters is
		 * greates than 5, Otherwise keep that part of the string as-is. Examples:
		 * 
		 * "aaaaaa" -> a6 (count>5) "aaaaa" -> "aaaaa" (count==5) "aa bbbbbbb cc" -> "aa
		 * b7 cc"
		 */

		String test = "aaaaaa";

		System.out.println(countOccoursOf(test));
		test = "aaaaa";
		System.out.println(countOccoursOf(test));
		test = "aabbbbbbbcc";
		System.out.println(countOccoursOf(test));

	}

	private static String countOccoursOf(String str) {
		Map<String, Integer> mapOcu = new HashMap<String, Integer>();

		char[] charArr = str.toCharArray();
		int countOcurs = 0;
		for (int i = 0, j = 1; i <= charArr.length; i++, j++) {

			if (j < charArr.length) {

				char ichar = charArr[i];
				char jchar = charArr[j];
				if (ichar == jchar) {
					countOcurs++;
					mapOcu.put(String.valueOf(jchar), countOcurs + 1);
				} else {
					countOcurs = 0;
				}

			}

		}

		String out = "";
		for (Entry<String, Integer> entry : mapOcu.entrySet()) {
			String key = entry.getKey();
			Integer val = entry.getValue();
			if (val < 6) {
				for (int p = 0; p <= val; p++) {
					out = out + key;
				}
				out = out + " ";
			} else

				out = out + key + val + " ";
		}
		return out;
	}
}
