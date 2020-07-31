package Chapter5;

/*
5.25 (Modified Diamond Printing Program)
Modify the application you wrote in Exercise 5.24
to read an odd number in the range 1 to 19 to specify the number of rows in the diamond. Your
program should then display a diamond of the appropriate size.
 */

import java.util.Scanner;

public class ModifiedDiamondPrintingProgramEx525 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.print("Enter odd number from 1 to 19: ");
		int n = input.nextInt();

		for (int i = 1; i < n; i++) {
			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}
			for (int j = 1; j <= i * 2 - 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int i = 1; i <= n * 2 - 1; i++){
			System.out.print("*");
		}
		System.out.println();

		for (int i = n - 1; i > 0; i--){
			for(int j = 1; j <= n-i; j++){
				System.out.print(" ");
		}
			for (int j = 1;j <= i*2-1; j++){
			System.out.print("*");
		}
			System.out.println();
		}

//		for (int i = 1; i < n-4; i++) {
//			System.out.print(" ");
//		}
//		System.out.print("*");
//
//		System.out.println();
//
//		for (int i = 1; i < 4; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 4; i < n-2; i++){
//			System.out.print("*");
//		}
//
//		System.out.println();
//
//		for (int i = 1; i < 3; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 3; i < n-1; i++){
//			System.out.print("*");
//		}
//
//		System.out.println();
//
//		for (int i = 1; i < 2; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 2; i < n; i++){
//			System.out.print("*");
//		}
//
//		System.out.println();
//
//		for (int i = 1; i < n+1; i++){
//			System.out.print("*");
//		}
//
//		System.out.println();
//
//		for (int i = 1; i < 2; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 2; i < n; i++){
//			System.out.print("*");
//		}
//
//		System.out.println();
//
//		for (int i = 1; i < 3; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 3; i < n-1; i++){
//			System.out.print("*");
//		}
//
//		System.out.println();
//
//		for (int i = 1; i < 4; i++) {
//			System.out.print(" ");
//		}
//		for (int i = 4; i < n-2; i++){
//			System.out.print("*");
//		}
//
//		System.out.println();
//
//		for (int i = 1; i < n-4; i++) {
//			System.out.print(" ");
//		}
//		System.out.print("*");
	}
}
