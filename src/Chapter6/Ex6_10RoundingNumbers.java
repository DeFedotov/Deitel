package Chapter6;

/*
6.10 (Rounding Numbers)
To round numbers to specific decimal places, use a statement like
y = Math.floor(x * 10 + 0.5) / 10;
which rounds x to the tenths position
(i.e., the first position to the right of the decimal point), or
y = Math.floor(x * 100 + 0.5) / 100;
which rounds x to the hundredths position
(i.e., the second position to the right of the decimal point).
Write an application that defines four methods for rounding a number x in various ways:
a) roundToInteger(number)
b) roundToTenths(number)
c) roundToHundredths(number)
d) roundToThousandths(number)
For each value read, your program should display the original value,
the number rounded to the nearest integer, the number rounded to the nearest tenth,
the number rounded to the nearest hundredth and the number rounded to the nearest thousandth.
 */

import java.util.Scanner;

public class Ex6_10RoundingNumbers {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		double x = 0.0;

		System.out.print("Enter double value: ");
		x = input.nextDouble();

		System.out.println(x);
		System.out.println(roundToInteger(x));
		System.out.println(roundToTenths(x));
		System.out.println(roundToHundredths(x));
		System.out.println(roundToThousandths(x));

	}

	public static double roundToInteger(double x){
		return Math.floor(x + 0.5);
	}
	public static double roundToTenths(double x){
		return Math.floor(x * 10 + 0.5) / 10;
	}

	public static double roundToHundredths(double x){
		return Math.floor(x * 100 + 0.5) / 100;
	}

	public static double roundToThousandths(double x) {
		return Math.floor(x * 1000 + 0.5f) / 1000;
	}

}
