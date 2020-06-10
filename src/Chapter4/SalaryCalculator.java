package Chapter4;

/*	4.20 (Salary Calculator)
Develop a Java application that determines the gross pay for each of
three employees. The company pays straight time for the first 40 hours worked by each employee
and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
number of hours worked last week and their hourly rates. Your program should input this information for each employee,
then determine and display the employee’s gross pay. Use class Scanner to input the data.
 */

import java.util.Scanner;

public class SalaryCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter straigh salary per hour: $");
		double straightSalary = input.nextDouble();

		System.out.print("Enter number of employees: ");
		int numberOfEmployees = input.nextInt();

		for (int i = 1; i <= numberOfEmployees; i++){
			System.out.printf("Enter number of hours of %d employee: ", i);
			int numberOfHours = input.nextInt();

			double salary;
			if (numberOfHours <= 40){
				salary = straightSalary * numberOfHours;
			} else {
				salary = (straightSalary * numberOfHours) + ((numberOfHours - 40) * straightSalary * 0.5);
			}
			System.out.printf("Gros salary of %d employee is: $%.2f%n", i, salary);
		}
	}
}
