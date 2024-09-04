package com.huidos22.algoritmos;

import java.util.Arrays;
import java.util.List;
/**
 * Given a string,

, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. We define a token to be one or more consecutive English alphabetic letters. Then, print the number of tokens, followed by each token on a new line.

Note: You may find the String.split method helpful in completing this challenge.

Input Format

A single string,

.

Constraints

    is composed of any of the following: English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).

Output Format

On the first line, print an integer,
, denoting the number of tokens in string (they do not need to be unique). Next, print each of the tokens on a new line in the same order as they appear in input string .
 */
import java.util.Scanner;
import java.util.stream.Collectors;

public class StrTokens {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String tokenstr = "";
		tokenstr += scan.nextLine();
		scan.close();

		printTokens(tokenstr);

	}

	private static void printTokens(String tokenstr) {

		if (tokenstr.matches("[A-Za-z !,?._'@]+") && tokenstr.length() >= 1 && tokenstr.length() <= Math.pow(4, 5)) {
			  // Split the string based on any character that is not a letter
			List<String> tkArr = Arrays.asList(tokenstr.split("[^A-Za-z]+"));
			System.out.println(tkArr.size());
			tkArr.forEach(s->System.out.println(s));

		}
	}

}
