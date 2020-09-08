package Chapter6;

/*
6.18 (Displaying a Square of Asterisks)
Write a method squareOfAsterisks that displays a solid square (the same number of rows and columns)
 of asterisks whose side is specified in integer parameter side.
 For example, if side is 4, the method should display
 ****
 ****
 ****
 ****
 Incorporate this method into an application that reads an integer value for side
 from the user and outputs the asterisks with the squareOfAsterisks method.

 */

import java.util.Scanner;

public class Ex6_18DisplayingASquareOfAsterisks {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while(true){

			System.out.print("Enter the side of the square (-1 to exit): ");
			int side = input.nextInt();

			if (side != -1){
				squareOfAsterisks(side);
			} else {
				break;
			}
		}
	}

	public static void squareOfAsterisks(int side){
		for (int i = 1; i <= side; i++){
			for (int j = 1; j <= side; j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
