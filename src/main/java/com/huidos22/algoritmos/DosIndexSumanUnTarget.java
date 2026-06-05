package com.huidos22.algoritmos;

import java.util.HashMap;
import java.util.Map;

public class DosIndexSumanUnTarget {
	/**
	 * 
	 * dado un array y un target debe imprimir los indices que en total suman el
	 * target ejemplo dado un array {9,5,3,2,1,4} target = 10 print 0,4 porque 9 y 1
	 * dan 10 de lo contrario devolver -1,-1
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		int[] array = { 9, 5, 3, 2, 1, 4 };
		int target = 10;
		int result[] = return2Index(target, array);
		System.out.println(" index first: " + result[0] + " index second: " + result[1]);
		
		
		
		array = new int[] { 9, 2, 3, 2, 22, 4 };
		target = 3;
		result = return2Index(target, array);
		System.out.println(" index first: " + result[0] + " index second: " + result[1]);

		
		result = twoSumIndexReturn(target, array);
		System.out.println("Using hashmap approach index first: " + result[0] + " index second: " + result[1]);

	}

	private static int[] return2Index(int target, int[] array) {

		int[] retarray = new int[] { -1, -1 };
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				int sum = array[i] + array[j];
				if (sum == target) {
					retarray[0] = i;
					retarray[1] = j;
					return retarray;
				}
			}
		}
		return retarray;
	}

	private static int[] twoSumIndexReturn(int target, int[] array) {

		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < array.length; i++) {
			int complement = target - array[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(array[i], i);
		}
		return new int[] { -1, -1 };
	}
}
