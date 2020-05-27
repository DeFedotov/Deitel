package Chapter4;

/*	4.18 (Credit Limit Calculator)
Develop a Java application that determines whether any of several
department-store customers has exceeded the credit limit on a charge account. For each customer,
the following facts are available:
a) account number
b) balance at the beginning of the month
c) total of all items charged by the customer this month
d) total of all credits applied to the customer’s account this month
e) allowed credit limit.
The program should input all these facts as integers, calculate the new balance (= beginning balance
+ charges – credits), display the new balance and determine whether the new balance exceeds the
customer’s credit limit. For those customers whose credit limit is exceeded,
the program should display the message "Credit limit exceeded".
 */

import java.util.Scanner;

public class CreditLimit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter number of customers: ");
		int accountNumber = input.nextInt();

		for (int i = 1; i <= accountNumber; i++){

			System.out.printf("Number of customer is: %d%n%n", i);
			System.out.print("Enter balance: $");
			int balance = input.nextInt();
			System.out.print("Enter total of items: ");
			int charges = input.nextInt();
			System.out.print("Enter total of credits: ");
			int credits = input.nextInt();
			System.out.print("Enter allowed credit limit: $");
			int limit = input.nextInt();

			int newBalance = balance + charges - credits;
			System.out.printf("New balance is: %d%n%n", newBalance);

			if (newBalance <= limit){
				System.out.println("Credit limit exceeded");
			}
		}

	}
}
