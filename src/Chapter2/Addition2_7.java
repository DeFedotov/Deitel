package Chapter2;
// Fig. 2.7: Addition.java
// Addition program that inputs two numbers then displays their sum.

import java.util.Scanner;

public class Addition2_7
{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		int number1;
		int number2;
		int sum;

		System.out.print("Enter first integer: ");
		number1 = input.nextInt();

		System.out.print("Enter second integer: ");
		number2 = input.nextInt();

		sum = number1 + number2;

		System.out.printf("Sum is %d%n", sum);
	}
}
