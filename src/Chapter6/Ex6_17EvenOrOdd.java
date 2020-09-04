package Chapter6;

/*
6.17 (Even or Odd)
Write a method isEven that uses the remainder operator (%) to determine whether an integer is even.
The method should take an integer argument and return true if the integer is even and false otherwise.
Incorporate this method into an application that inputs a sequence of integers (one at a time)
and determines whether each is even or odd.

 */

import java.util.Scanner;

public class Ex6_17EvenOrOdd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		while(true){

			System.out.print("Enter your number: ");
			int number = input.nextInt();

			if (number != -1) {

				if (isEven(number)) {
					System.out.println("Even");
				} else {
					System.out.println("Odd");
				}
			}else {
				break;
			}
		}
	}

	public static boolean isEven(int arg){

		if (arg % 2 == 0){
			return true;
		} else {
			return false;
		}
	}
}
