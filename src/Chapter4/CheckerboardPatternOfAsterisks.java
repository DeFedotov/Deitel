package Chapter4;

// 4.32 (Checkerboard Pattern of Asterisks)
// Write an application that uses only the output statements
//		System.out.print("* ");
//		System.out.print(" ");
//		System.out.println();
// to display the checkerboard pattern that follows.
// A System.out.println method call with no arguments causes the program to output a single newline character.
// [Hint: Repetition statements are required.]

public class CheckerboardPatternOfAsterisks {
	public static void main(String[] args) {

		for (int j = 1; j <= 8; j++) {

			if (j % 2 != 0){
				for (int i = 1; i <= 8; i++) {
					System.out.print("* ");
				}
				System.out.println();
			}else{
				System.out.print(" ");
				for (int i = 1; i <= 8; i++) {
					System.out.print("* ");
				}
				System.out.println();
			}



		}

	}
}
