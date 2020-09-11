package Chapter6;

/*
6.19 (Displaying a Square of Any Character)
Modify the method created in Exercise 6.18 to receive a second parameter of type char
called fillCharacter. Form the square using the char provided as an argument.
Thus, if side is 5 and fillCharacter is #, the method should display
#####
#####
#####
#####
#####
Use the following statement (in which input is a Scanner object)
to read a character from the user at the keyboard:
char fill = input.next().charAt(0);

 */

import java.util.Scanner;

public class Ex6_19DisplayingASquareOfAnyCharacter {



	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while(true){
			System.out.print("Enter the side of the square (-1 to exit): ");
			int side = input.nextInt();
			System.out.print("Enter character (-1 to exit): ");
			char fill = input.next().charAt(0);

			if (side != -1 && fill != -1){
				squareOfAnyCharacter(side, fill);
			} else {
				break;
			}

		}
	}

	public static void squareOfAnyCharacter(int side, char fillCharacter){

		for (int i = 1; i <= side; i++){
			for (int j = 1; j <= side; j++){
				System.out.print(fillCharacter);
			}
			System.out.println();
		}
	}
}
