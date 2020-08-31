package Chapter6;

/*
6.13 Write statements that will display a random number from each of the following sets:
a) 2, 4, 6, 8, 10.
b) 3, 5, 7, 9, 11.
c) 6, 10, 14, 18, 22.

 */

import java.security.SecureRandom;

public class Ex6_13WriteStatements {
	public static void main(String[] args) {

		SecureRandom randomNumbers = new SecureRandom();

		int a = 2 + 2 * randomNumbers.nextInt(5);
		System.out.println(a);

		int b = 3 + 2 * randomNumbers.nextInt(5);
		System.out.println(b);

		int c = 6 + 4 * randomNumbers.nextInt(5);
		System.out.println(c);
	}
}
