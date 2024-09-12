package com.huidos22.algoritmos;

import java.util.Scanner;

public class TresNumeros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int three = sc.nextInt();
		sc.close();
		if (one == two && one == three && two == three) {
			System.out.println(one + "" + two + "" + three);
		}else

		if (one == two) {
			System.out.println(one + "" + two);
		} else if (two == three) {
			System.out.println(two + "" + three);
		} else if (one == three) {
			System.out.println(one + "" + three);
		}

	}

}
