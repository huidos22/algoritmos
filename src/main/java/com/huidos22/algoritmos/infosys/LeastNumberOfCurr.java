package com.huidos22.algoritmos.infosys;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class LeastNumberOfCurr {

	/**
	 * write a program which gives you the least number of currency bills for $80
	 * (currency bills 100, 59, 20,10,5,1)
	 * 
	 * @param arg
	 */
	public static void main(String... arg) {

		System.out.println("Least bills is: " + getLeastNumberOfBills(80, Stream.of(100, 59, 20, 10, 5, 1).toList()));
		//Greedy works for canonical coin systems, but arbitrary denominations may require dynamic programming to guarantee the optimal minimum.
		System.out.println("Least bills is: " + getLeastNumberOfBills(234, Stream.of(100, 59, 20, 10, 5, 1).toList()));
	}

	private static Integer getLeastNumberOfBills(Integer amount, List<Integer> bills) {
		int countBills = 0;
		
		// para algoritmo greddy la lista debe estar ordenada
		
		bills = bills.stream().sorted(Comparator.reverseOrder()).toList();
		
		for (Integer bill : bills) {

			if (bill <= amount) {
				int count = amount / bill; // tantos billetes como quepan 80 / 59 = 1
				amount = amount - bill;
				countBills = countBills + count; // cuentas la division y acumulas en el contador de billetes
				System.out.println(countBills+" of Bill type : " + bill + " left amount: " + amount);
			}

		}
		return countBills;
	}
}
