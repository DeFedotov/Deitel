package Chapter4;

/*  4.29 (Square of Asterisks)
	Write an application that prompts the user to enter the size of the side
	of a square, then displays a hollow square of that size made of asterisks. Your program should work
	for squares of all side lengths between 1 and 20.
 */

import java.util.Scanner;

public class SquareOfAsterisks {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter side: ");
		int side = input.nextInt();

		while (side < 1 || side > 20) {
			System.out.print("Enter the length of the side from 1 to 20: ");
			side = input.nextInt();
		}

		for (int i = 1; i <= side; i++) {
			System.out.print("* ");
		}

		System.out.println();

		for (int k = 1; k < side; k++){

			System.out.print("* ");

			for (int j = 1; j < side - 1; j++){
				System.out.print("  ");
			}

			System.out.print("*");
			System.out.println();
		}

		for (int l = 1; l <= side; l++){
			System.out.print("* ");
		}

	}
}
