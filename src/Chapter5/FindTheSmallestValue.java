package Chapter5;

/*

5.11 (Find the Smallest Value)
Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to input from the user.

 */

import java.util.Scanner;

public class FindTheSmallestValue {
	public static void main(String[] args) {


		Scanner input = new Scanner(System.in);

		int min = 1000;

		int counter = 0;

		System.out.print("Enter number of values: ");
		int number = input.nextInt();

		while (counter < number){

			int value = input.nextInt();

			if (value < min){
				min = value;
			}

			counter++;
		}

		System.out.println(min);
	}
}

