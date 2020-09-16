package Chapter6;

/*
6.22 (Temperature Conversions)
Implement the following integer methods:
a) Method celsius returns the Celsius equivalent of a Fahrenheit temperature, using the calculation
celsius = 5.0 / 9.0 * (fahrenheit - 32);
b) Method fahrenheit returns the Fahrenheit equivalent of a Celsius temperature, using the calculation
fahrenheit = 9.0 / 5.0 * celsius + 32;
c) Use the methods from parts (a) and (b) to write an application that enables the user
either to enter a Fahrenheit temperature and display the Celsius equivalent or to
enter a Celsius temperature and display the Fahrenheit equivalent.

 */

import java.util.Scanner;

public class Ex6_22TemperatureConversions {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Fahrenheit temperature: ");
		int fahrenheit = input.nextInt();
		System.out.println("Celsius is: " + celsius(fahrenheit));

		System.out.print("Enter Celsius temperature: ");
		int celsius = input.nextInt();
		System.out.println("Fahrenheit is: " + fahrenheit(celsius));
	}

	public static int celsius (int fahrenheit){
		return (int)(5.0 / 9.0 * (fahrenheit - 32));
	}

	public static int fahrenheit(int celsius){
		return (int)(9.0 / 5.0 * celsius + 32);
	}
}

// 1. add if statement to allow user to choose what temperature he wants to convert.
// 2. add while(true)
// 3. add statement to exit from while(true)