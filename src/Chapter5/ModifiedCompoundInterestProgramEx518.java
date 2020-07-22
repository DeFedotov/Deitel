package Chapter5;

/*
5.18 (Modified Compound-Interest Program)
Modify the application in Fig. 5.6 to use only integers
to calculate the compound interest. [Hint: Treat all monetary amounts as integral numbers
of pennies. Then break the result into its dollars and cents portions by using the division and remainder
operations, respectively. Insert a period between the dollars and the cents portions.]
 */

public class ModifiedCompoundInterestProgramEx518 {
	public static void main(String[] args) {

		int amount;
		int principal = 100000;
		int rate;

		System.out.printf("%s%20s%n", "Year", "Amount on deposit");

		for (int year = 1; year <= 10; year++){

			rate = principal / 20;
			amount =  principal + rate;
			principal = amount;

			int dollars = amount / 100;
			int cents = amount % 100;

			System.out.printf("%4d%18d", year, dollars);
			System.out.print(".");
			System.out.printf("%d%n", cents);

		}
	}
}
