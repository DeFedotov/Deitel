package Chapter4;

/*  4.30 (Palindromes)
	A palindrome is a sequence of characters that reads the same backward as forward.
	For example, each of the following five-digit integers is a palindrome: 12321, 55555, 45554
	and 11611. Write an application that reads in a five-digit integer and determines whether it’s a palindrome.
	If the number is not five digits long, display an error message and allow the user to enter
	a new value.
 */

import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter five digits: ");
		int number = input.nextInt();

		while(number < 10000 || number > 99999){
			System.out.println("Number should contain five digits!");
			System.out.print("Enter five digits: ");
			number = input.nextInt();
		}

		int one = number / 10000;

		int two = number / 1000 % 10;

		int four = number / 10 % 10;

		int five = number % 10;

		if (one == five && two == four){
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}



	}
}
