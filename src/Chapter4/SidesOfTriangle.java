package Chapter4;

// 4.35 (Sides of a Triangle)
// Write an application that reads three nonzero values entered by the
// user and determines and prints whether they could represent the sides of a triangle.

import java.util.Scanner;

public class SidesOfTriangle {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter 1st side: ");
		int first = input.nextInt();

		while(first <= 0){
			System.out.println("Value of the side should be greater than zero!");
			System.out.print("Enter first side: ");
			first = input.nextInt();
		}

		System.out.print("Enter 2nd side: ");
		int second = input.nextInt();

		while(second <= 0){
			System.out.println("Value of the side should be greater than zero!");
			System.out.print("Enter 2nd side: ");
			second = input.nextInt();
		}

		System.out.print("Enter 3rd side: ");
		int third = input.nextInt();

		while(third <= 0){
			System.out.println("Value of the side should be greater than zero!");
			System.out.print("Enter 3rd side: ");
			third = input.nextInt();
		}

		if (first + second > third && first + third > second && second + third > first){
			System.out.println("Triangle exist");
		} else{
			System.out.println("Not a triangle");
		}

	}
}
