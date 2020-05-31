package Chapter4;

/*	4.23 (Find the Two Largest Numbers)
Using an approach similar to that for Exercise 4.21, find
the two largest values of the 10 values entered. [Note: You may input each number only once.]
 */

import java.util.Scanner;

public class FindTheTwoLargestNumber {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int number;
		int largest = 0;
		int counter = 5;
		int preLargest = 0;



		for (int j = 1; j <= counter; j++){

		  	System.out.print("Enter your number: ");
		  	number = input.nextInt();


		  	if (number > preLargest && number > largest){
				preLargest = largest;
		  		largest = number;
			} else if (number > preLargest && number < largest){
		  		preLargest = number;
			}

		}
		System.out.println("Largest is: " + largest);
		System.out.println("preLargest is: " + preLargest);

		}

	}
