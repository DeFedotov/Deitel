package Chapter7;

// Using the enhanced for statement to total integers in an array.

public class Fig7_12EnhancedForTest {

	public static void main(String[] args) {

		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};
		int total = 0;

		for (int number : array){
			total += number;
		}

		System.out.printf("Total of array elements: %d%n", total);
	}
}
