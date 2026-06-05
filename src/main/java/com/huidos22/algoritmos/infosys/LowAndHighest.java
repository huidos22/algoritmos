package com.huidos22.algoritmos.infosys;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Stream;

public class LowAndHighest {

	/**
	 * write a java program to find the lowest and the highest number of a stream
	 * (1,2,3,77,6,5)
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String... args) throws Exception {
	
		getLowestAndHighest(Stream.of(1,2,3,77,6,5).toList());

	}

	private static int[] getLowestAndHighest(List<Integer> numbers) throws Exception {

		int[] arrayLoHi = new int[] {0,0} ;
		if (numbers.isEmpty()) {
			throw new Exception("Empty list");
		} else {
			arrayLoHi[0] = numbers.stream().sorted().findFirst().get();
			arrayLoHi[1] = numbers.stream().sorted().mapToInt(Integer::intValue).max().getAsInt();
		}
		System.out.println(arrayLoHi[0]);
		System.out.println(arrayLoHi[1]);
		
		/**senior response**/
		IntSummaryStatistics stats =
		        numbers.stream()
		               .mapToInt(Integer::intValue)
		               .summaryStatistics();

		int min = stats.getMin();
		int max = stats.getMax();
		
		return arrayLoHi;
	}

}
