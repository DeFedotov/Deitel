package Chapter6;

/*
6.20 (Circle Area) Write an application that prompts the user for the radius of a circle
and uses a method called circleArea to calculate the area of the circle.

 */

import java.util.Scanner;

public class Ex6_20CircleArea {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter radius of the circle (-1 to exit): ");
		double radius = input.nextDouble();
		
		System.out.printf("%.2f%n", circleArea(radius));
	}

	public static double circleArea(double radius){

		return Math.PI * Math.pow(radius, 2);
	}
}
