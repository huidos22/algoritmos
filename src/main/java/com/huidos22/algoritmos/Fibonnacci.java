package com.huidos22.algoritmos;

import java.util.Scanner;

public class Fibonnacci {

	public static void main(String... arg) {

		Scanner sc = new Scanner(System.in);
		Integer num = sc.nextInt();
		sc.close();
		for (int i = 0; i < num; i++) {
			System.out.format("Fibo numbers are: %d%n", fibonacci(i));
		}

	}

	private static Integer fibonacci(Integer number) {

		// base case
		if (number <= 1) {
			return number;
		}

		// recursive call
		else {
			// calculate the last two fibonacci numbers recursively
			return fibonacci(number - 2) + fibonacci(number - 1);
		}
	}
}
