package Chapter6;

/*
6.23 (Find the Minimum)
Write a method minimum3 that returns the smallest of three floating point numbers.
Use the Math.min method to implement minimum3.
Incorporate the method into an application that reads three values from the user,
determines the smallest value and displays the result.
 */

import java.util.Scanner;

public class Ex6_23FindTheMinimum {
	public static void main(String[] args) {

		System.out.println("Enter three float numbers: ");
		Scanner input = new Scanner(System.in);
		float number1 = input.nextFloat();
		float number2 = input.nextFloat();
		float number3 = input.nextFloat();
		System.out.printf("Minimum is: %.2f%n", minimum(number1, number2, number3));
	}

	public static double minimum(float number1, float number2, float number3){
		if (number1 < number2 && number1 < number3){
			return number1;
		} else if (number1 < number2 && number1 > number3){
			return number3;
		} else {
			return number2;
		}
	}
}
