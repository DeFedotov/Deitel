package Chapter3;

// Fig. 3.9: AccountTest.java
// Inputting and outputting floating-point numbers with Account objects.

import java.util.Scanner;

public class AccountTest {

	public static void main(String[] args) {

		Account account1 = new Account("Jane Green", 50.00);
		Account account2 = new Account("John Blue", -7.53);

//		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
//		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

		displayAccount(account1);
		displayAccount(account2);

		Scanner input = new Scanner(System.in);

		System.out.print("Enter deposit amount for account1: ");
		double depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
		account1.deposit(depositAmount);

//		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
//		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

		displayAccount(account1);
		displayAccount(account2);

		System.out.print("Enter deposit amount for account2: ");
		depositAmount = input.nextDouble();
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount);

//		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
//		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

		displayAccount(account1);
		displayAccount(account2);

//		Ex.3.11

//		System.out.print("Enter withdrwal amount for account1: ");
//		double withdrawalAmount = input.nextDouble();
//		System.out.printf("%nwithdawing %.2f from account1 balance%n%n", withdrawalAmount);
//		account1.withdraw(withdrawalAmount);
//
//		System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
//		System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

	}

	public static void displayAccount(Account accountToDisplay){
		System.out.printf("%s balance: $%.2f%n", accountToDisplay.getName(), accountToDisplay.getBalance());
	}

}
