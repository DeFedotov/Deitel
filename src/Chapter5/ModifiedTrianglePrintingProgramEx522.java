package Chapter5;

/*
(Modified Triangle Printing Program)
Modify Exercise 5.15 to combine your code from
the four separate triangles of asterisks such that all four patterns print side by side.
[Hint: Make clever use of nested for loops.]
 */

public class ModifiedTrianglePrintingProgramEx522 {
	public static void main(String[] args) {

		for (int i = 1; i <=10; i++){

			for (int j = 1; j <= i; j++){
				System.out.print('*');
			}

			for (int k = 9; k >= i; k--){
				System.out.print(' ');
			}

			System.out.print("\t");

			for (int j = 10; j >= i; j--){
				System.out.print('*');
			}

			for (int k = 1; k <= i; k++){
				System.out.print(' ');
			}

			System.out.print("\t");

			for (int j = 2; j <= i; j++){
				System.out.print(' ');
			}

			for (int k = 10; k >= i; k--){
				System.out.print('*');
			}

			System.out.print("\t");

			for (int j = 9; j >= i; j--){
				System.out.print(' ');
			}

			for (int k = 1; k <= i; k++){
				System.out.print('*');
			}

			System.out.println();
		}
	}
}
