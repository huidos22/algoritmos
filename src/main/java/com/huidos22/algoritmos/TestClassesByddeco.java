package com.huidos22.algoritmos;

import java.util.Scanner;

public class TestClassesByddeco {

	
	public static void main(String ...arg) {
		
		Scanner sc1 = new Scanner(System.in);
		Integer a = sc1.nextInt();
		Integer b = sc1.nextInt();
		sc1.close();
		someMethod(a,b);
		
	}
	
	static void someMethod(Integer a,Integer b) {
		System.out.println(Math.pow(a, b));
	}
	
}
