package Chapter6;

/*
6.21 (Separating Digits)
Write methods that accomplish each of the following tasks:

a) Calculate the integer part of the quotient when integer a is divided by integer b.
b) Calculate the integer remainder when integer a is divided by integer b.
c) Use the methods developed in parts (a) and (b) to write a method displayDigits
that receives an integer between 1 and 99999 and displays it as a sequence of digits,
separating each pair of digits by two spaces. For example,
the integer 4562 should appear as 4 5 6 2 Incorporate the methods into an application
that inputs an integer and calls displayDigits by passing the method the integer entered.
Display the results.

 */

import java.util.Scanner;

public class Ex6_21SeparatingDigits {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter a: ");
		int a = input.nextInt();
		System.out.println("Enter b: ");
		int b = input.nextInt();


		System.out.println(quotient(a, b));
		System.out.println(remainder(a, b));

		System.out.println("Enter c: ");
		int c = input.nextInt();

		if (c > 0 && c < 100000){
			sequence(c);
		}else {
			System.out.println("Enter c btw 1 and 99999");
		}

	}

	public static int quotient(int a, int b){
		return a / b;
	}

	public static int remainder(int a, int b){
		return a % b;
	}

	public static void sequence(int c){

		if (c > 0 && c < 10){
			System.out.println(c);
		} else if (c > 9 && c < 100){
			System.out.println(c / 10 + " " + c % 10);
		} else if (c > 99 && c < 1000){
			System.out.println(c / 100 + " " + c / 10 % 10 + " " + c % 10);
		} else if (c > 999 && c < 10000){
			System.out.println(c / 1000 + " " + c / 100 % 10 + " " + c / 10 % 10 + " " + c % 10);
		} else {
			System.out.println(c / 10000 + " " + c / 1000 % 10 + " " + c / 100 % 10 + " " + c / 10 % 10 + " " + c % 10);
		}
	}
}
