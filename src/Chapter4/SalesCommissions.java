package Chapter4;

/*	4.19 (Sales Commission Calculator)
A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week. For example, a
salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a
total of $650. You’ve been supplied with a list of the items sold by each salesperson. The values of
these items are as follows:
Item Value
1 239.99
2 129.75
3 99.95
4 350.89
Develop a Java application that inputs one salesperson’s items sold for last week and calculates and
displays that salesperson’s earnings. There’s no limit to the number of items that can be sold.
 */

import java.util.Scanner;

public class SalesCommissions {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		double salary = 200.0;

		System.out.print("Enter next item: ");
		int number = input.nextInt();

		while (number != -1){
			System.out.print("Enter value: $");

			int value = input.nextInt();
			double percent = value * 0.09;

			salary = salary + percent;
			System.out.printf("Your salary is: $%.2f%n%n", salary);

			System.out.print("Enter next item or -1 to quit: ");
			number = input.nextInt();
		}




	}
}
