package com.huidos22.algoritmos.infosys;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class FindFirstLastIndexGtEqTarget {

	/**
	 * Given a sorted array of integers nums (non decreasing order) and an Integer
	 * target, find the first and last index of elements that are greater than or
	 * equal to target if no such element exists returns {-1,-1}
	 */
	public static void main(String... arg) {
		int target = 18;
		int[] inputArray = new int[] { 2, 3, 6, 7, 18, 19, 29, 111, 161, 181 };
		inputArray = getFirstLastIndex(target, inputArray);
		System.out.println("first index: " + inputArray[0] + "  last index:" + inputArray[1]);

		

	}

	public static int[] getFirstLastIndex(Integer target, int[] numsArray) {
		int[] returnArray = new int[] { -1, -1 };
		boolean first = false;
		for (int i = 0; i < numsArray.length; i++) {

			if (numsArray[i] >= target) {
				if (!first) {
					returnArray[0] = i;
					first = true;
				}
				returnArray[1] = i;

				System.out.println(i + "  " + numsArray[i]);
			}

		}

		return returnArray;

	}

}
