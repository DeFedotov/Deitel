package Chapter5;

/*

5.16 (Bar Chart Printing Program)
One interesting application of computers is to display
graphs and bar charts. Write an application that reads five numbers between 1 and 30. For each
number that’s read, your program should display the same number of adjacent asterisks. For example,
if your program reads the number 7, it should display *******. Display the bars of asterisks after
you read all five numbers.

 */

import java.util.Scanner;

public class BarChartPrintingProgram {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int one;
		int two;
		int three;
		int four;
		int five;

		System.out.println("Enter 5 numbers from 1 to 30: ");
		
		one = input.nextInt();

		while (one < 1 || one > 30){
			System.out.print("Enter 5 numbers from 1 to 30: ");
			one = input.nextInt();
		}

		two = input.nextInt();

		while (two < 1 || two > 30){
			System.out.print("Enter 5 numbers from 1 to 30: ");
			two = input.nextInt();
		}

		three = input.nextInt();

		while (three < 1 || three > 30){
			System.out.print("Enter 5 numbers from 1 to 30: ");
			three = input.nextInt();
		}

		four = input.nextInt();

		while (four < 1 || four > 30){
			System.out.print("Enter 5 numbers from 1 to 30: ");
			four = input.nextInt();
		}

		five = input.nextInt();

		while (five < 1 || five > 30){
			System.out.print("Enter 5 numbers from 1 to 30: ");
			five = input.nextInt();
		}

		for ( int i = 1; i <= one; i++){
			System.out.print('*');
		}

		System.out.println();

		for ( int i = 1; i <= two; i++){
			System.out.print('*');
		}

		System.out.println();

		for ( int i = 1; i <= three; i++){
			System.out.print('*');
		}

		System.out.println();

		for ( int i = 1; i <= four; i++){
			System.out.print('*');
		}

		System.out.println();

		for ( int i = 1; i <= five; i++){
			System.out.print('*');
		}

		System.out.println();

	}
}
