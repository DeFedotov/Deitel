package Chapter4;

/* Ex. 4.17

(Gas Mileage) Drivers are concerned with the mileage their automobiles get. One driver has
kept track of several trips by recording the miles driven and gallons used for each tankful. Develop
a Java application that will input the miles driven and gallons used (both as integers) for each trip.
The program should calculate and display the miles per gallon obtained for each trip and print the
combined miles per gallon obtained for all trips up to this point. All averaging calculations should
produce floating-point results. Use class Scanner and sentinel-controlled repetition to obtain the
data from the user.

 */

import java.util.Scanner;

public class GasMileage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);


		int trips = 0;
		int totalMiles = 0;
		int totalGallons = 0;


		System.out.print("Enter miles or -1 to quit: ");
		int miles = input.nextInt();
		System.out.print("Enter gallons or -1 to quit: ");
		int gallons = input.nextInt();


		while (miles != -1 || gallons != -1){

			totalMiles = totalMiles + miles;
			totalGallons = totalGallons + gallons;

			double average = miles / gallons;

			System.out.printf("Average of the trip is: %.2f m/g%n%n", average);

			System.out.print("Enter miles or -1 to quit: ");
			miles = input.nextInt();
			System.out.print("Enter gallons or -1 to quit: ");
			gallons = input.nextInt();

		}

		System.out.println();

		if (totalGallons != 0){

			double totalAverage = totalMiles / totalGallons;
			System.out.printf("Total average of all trips is: %.2f m/g", totalAverage);
		}
	}
}
