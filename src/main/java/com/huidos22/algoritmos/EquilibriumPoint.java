package com.huidos22.algoritmos;

/**
 * The equilibrium point in an array is an index (or position) such that the sum
 * of all elements before that index is the same as the sum of elements after
 * it. Note: Return equilibrium point in 1-based indexing. Return -1 if no such
 * point exists.
 */
public class EquilibriumPoint {

	public static void main(String... args) {

		int[] valScales = { 1,2,3,4,3,2,1 };
		int[] valScales2 = { 1, 3, 5, 2, 2 };// 3
		int[] valScales3 = { -7, 1, 5, 2, -4, 3, 0 };// 4 because: arr[1] + arr[2] + arr[3] = arr[5] + arr[6] + arr[7]
		System.out.println("Equilibrium point 1: " + getEquilibriumPoint(valScales));
		System.out.println("Equilibrium point 1: " + getEquilibriumPoint(valScales2));
		System.out.println("Equilibrium point 1: " + getEquilibriumPoint(valScales3));
	}

	private static int getEquilibriumPoint(int[] valScales) {
		int sumaIzquierda = 0;
		int sumaTotal = 0;
		int length = valScales.length;

		for (int num : valScales)
			sumaTotal += num;

		for (int k = 0; k < length; k++) {
			sumaTotal -= valScales[k];
			if (sumaTotal == sumaIzquierda) {
				return k;
			}
			sumaIzquierda += valScales[k];
		}
		return -1;
	}
}
