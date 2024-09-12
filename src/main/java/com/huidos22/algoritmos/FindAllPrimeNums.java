package com.huidos22.algoritmos;

import java.util.Scanner;

/**
 * Find all prime numbers up to a given number when n = 10, the output should be
 * 4 since there are 4 prime numbers less than 10, namely 2, 3, 5, 7. número
 * entero: por convención mayor que uno, que solo es divisible por sí mismo y
 * por la unidad; por ejemplo, 5, 7,
 */
public class FindAllPrimeNums {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String numero = scan.next();
		scan.close();
		System.out.println("antes hay "+ getPrimeNumbersOf(Integer.valueOf(numero))+ " numeros primos");

	}

	private static Integer getPrimeNumbersOf(Integer n) {
		Integer primesTotal = 0;

		for (int j = 2; j <= n; j++) {
			if (isPrime(j)) {
				System.out.println(j);
				primesTotal++;
			}

		}
		return primesTotal;
	}

	private static boolean isPrime(int n) {

		// revisa si n es multiplo de 2
		if (n != 2 && n % 2 == 0)
			return false;
		// si no, solo revisa los impares
		for (int i = 3; i * i <= n; i = i+ 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
