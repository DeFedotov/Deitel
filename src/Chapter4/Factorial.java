package Chapter4;

/*
	4.37 (Factorial)
	The factorial of a nonnegative integer n is written as n! (pronounced “n factorial”) and
	is defined as follows:
		1. n!
		2. e =
		3. e ^ x = ...

 */

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {

		double factorial = 1;
		double constE = 1.0;
		double constX = 1.0;


		Scanner input = new Scanner(System.in);

		System.out.print("Enter number > 0: ");
		int number = input.nextInt();



		if (number == 0){
			System.out.printf("Factorial of %d is 1", number);
		}

		while(number < 0){
			System.out.println("Number should be > 0!");
			System.out.print("enter number > 0: ");
			number = input.nextInt();
		}

//		while(number > 0){
//			factorial = number * factorial;
//			number--;
//		}
		int x = number;
		int y = x;

		for (int i = 1; i <= number; i++){
			factorial = i * factorial;
			constE = constE + 1 / factorial;
			constX = constX + y / factorial;
			y = y * x;
		}

		System.out.printf("Factorial is: %.2f%n", factorial);
		System.out.printf("%.5f%n", constE);
		System.out.printf("%.5f%n", constX);

	}
}
