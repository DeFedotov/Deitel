package Chapter6;

/*

6.9 (Rounding Numbers)
Math.floor can be used to round values to the nearest integer—e.g.,
y = Math.floor(x + 0.5);
will round the number x to the nearest integer and assign the result to y.
Write an application that reads double values and uses the preceding statement
to round each of the numbers to the nearest integer. For each number processed,
display both the original number and the rounded number.

 */

import java.util.Scanner;

public class Ex6_9RoundingNumbers {
	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);
		double x = input.nextDouble();

		double y = Math.floor( x + 0.5);

		System.out.println("Original: " + x);
		System.out.println("Rouded: " + y);

	}
}
