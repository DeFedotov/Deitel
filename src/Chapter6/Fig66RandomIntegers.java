package Chapter6;

// Fig. 6.6: RandomIntegers.java
// Shifted and scaled random integers.

import java.security.SecureRandom;

public class Fig66RandomIntegers {
	public static void main(String[] args) {

		SecureRandom randomNumbers = new SecureRandom();

		for (int counter = 1; counter <= 20; counter++){

			int face = 1 + randomNumbers.nextInt(6);

			System.out.printf("%d ", face);

			if (counter % 5 == 0){
				System.out.println();
			}
		}
	}
}
