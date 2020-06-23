package Chapter4;

/*	4.24 (Validating User Input)
Modify the program in Fig. 4.12 to validate its inputs.
For any input, if the value entered is other than 1 or 2,
keep looping until the user enters a correct value.
 */

import java.util.Scanner;

public class ValidatingUserInput {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int passes = 0;
		int failures = 0;
		int studentCounter = 1;


		while (studentCounter <= 3){

			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result = input.nextInt();

			while (result != 1 && result != 2){
				System.out.println("Only 1 or 2 can be entered!");
				System.out.print("Enter result (1 = pass, 2 = fail): ");
				result = input.nextInt();
			}

			if (result == 1){
				passes++;
			} else if (result == 2) {
				failures++;
			}

			studentCounter++;
		}

		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

		if (passes > 8){
			System.out.print("Bonus to instructor!");
		}
	}
}
