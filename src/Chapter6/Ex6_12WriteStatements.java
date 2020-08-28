package Chapter6;

/*
6.12 Write statements that assign random integers to the variable n in the following ranges:
a) 1 ≤n ≤ 2.
b) 1 ≤n ≤ 100.
c) 0 ≤n ≤ 9.
d) 1000 ≤n ≤ 1112.
e) –1 ≤n ≤ 1.
f) –3 ≤n ≤ 11.

 */

import java.security.SecureRandom;

public class Ex6_12WriteStatements {
	public static void main(String[] args) {

		SecureRandom randomNumbers = new SecureRandom();

		int a = 1 + randomNumbers.nextInt(2);
		System.out.println(a);

		int b = 1 + randomNumbers.nextInt(100);
		System.out.println(b);

		int c = randomNumbers.nextInt(10);
		System.out.println(c);

		int d = 1000 + randomNumbers.nextInt(112);
		System.out.println(d);

		int e = -1 + randomNumbers.nextInt(3);
		System.out.println(e);

		int f = -1 + randomNumbers.nextInt(15);
		System.out.println(f);
	}

}
