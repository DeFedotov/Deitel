package Chapter4;

// 4.36 (Sides of a Right Triangle)
// Write an application that reads three nonzero integers and determines and
// prints whether they could represent the sides of a right triangle.

import java.util.Scanner;

public class SidesOfARightTriangle {
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
//			System.out.println("Triangle exist");
			if (first == second && first == third && second == third){
				System.out.println("Triangle is right");
			} else{
				System.out.println("Triangle is not right");
			}
		} else{
			System.out.println("Not a triangle");
		}

	}
}
