package Chapter5;

/*
5.19 Assume that i = 1, j = 2, k = 3 and m = 2. What does each of the following statements print?
 */

public class WhatStatementPrintsEx519 {
	public static void main(String[] args) {

		int i = 1;
		int j = 2;
		int k = 3;
		int m = 2;

		System.out.println(i == 1); // true
		System.out.println(j == 3); //false
		System.out.println((i >= 1) && (j < 4)); //true
		System.out.println((m <= 99) & (k < m)); // false
		System.out.println((j >= i) || (k == m)); //true
		System.out.println((k + m < j) | (3 - j >= k)); // false
		System.out.println(!(k > m)); //false
	}
}
