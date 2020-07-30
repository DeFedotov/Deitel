package Chapter5;

/*
5.24 (Diamond Printing Program)
Write an application that prints the following diamond
shape. You may use output statements that print a single asterisk (*), a single space or a single newline
character. Maximize your use of repetition (with nested for statements), and minimize the
number of output statements.
 */

public class DiamondPrintingProgramEx524 {
	public static void main(String[] args) {

		for (int i = 1; i < 5; i++) {
			System.out.print(" ");
		}
		System.out.print("*");

		System.out.println();

		for (int i = 1; i < 4; i++) {
			System.out.print(" ");
		}
		for (int i = 4; i < 7; i++){
			System.out.print("*");
		}

		System.out.println();

		for (int i = 1; i < 3; i++) {
			System.out.print(" ");
		}
		for (int i = 3; i < 8; i++){
			System.out.print("*");
		}

		System.out.println();

		for (int i = 1; i < 2; i++) {
			System.out.print(" ");
		}
		for (int i = 2; i < 9; i++){
			System.out.print("*");
		}

		System.out.println();

		for (int i = 1; i < 10; i++){
			System.out.print("*");
		}

		System.out.println();

		for (int i = 1; i < 2; i++) {
			System.out.print(" ");
		}
		for (int i = 2; i < 9; i++){
			System.out.print("*");
		}

		System.out.println();

		for (int i = 1; i < 3; i++) {
			System.out.print(" ");
		}
		for (int i = 3; i < 8; i++){
			System.out.print("*");
		}

		System.out.println();

		for (int i = 1; i < 4; i++) {
			System.out.print(" ");
		}
		for (int i = 4; i < 7; i++){
			System.out.print("*");
		}

		System.out.println();

		for (int i = 1; i < 5; i++) {
			System.out.print(" ");
		}
		System.out.print("*");
	}
}
