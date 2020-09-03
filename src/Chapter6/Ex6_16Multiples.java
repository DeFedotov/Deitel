package Chapter6;

/*
6.16 (Multiples)
Write a method isMultiple that determines, for a pair of integers,
whether the second integer is a multiple of the first.
The method should take two integer arguments and return true if the second is a multiple
of the first and false otherwise. [Hint: Use the remainder operator.]
Incorporate this method into an application that inputs a series of pairs of integers
(one pair at a time) and determines whether the second value in each pair is a multiple of the first.

 */

import java.util.Scanner;

public class Ex6_16Multiples {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while (true){

			System.out.println("Enter -1 to exit");
			System.out.print("Enter first number: ");
			int arg1 = input.nextInt();

			if (arg1 != -1){
				System.out.print("Enter second number: ");
				int arg2 = input.nextInt();

				if (isMultiple(arg1, arg2)){
					System.out.printf("%d is multiple of %d%n", arg2, arg1);
				} else {
					System.out.printf("%d is not multiple of %d%n", arg2, arg1);
				}
			} else {
				break;
			}

		}

	}

	public static boolean isMultiple(int arg1, int arg2){

		if (arg2 % arg1 == 0){
			return true;
		} else {
			return false;
		}
		//return (arg2 % arg1 == 0) ? true : false;
	}
}
