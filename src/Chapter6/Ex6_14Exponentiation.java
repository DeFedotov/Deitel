package Chapter6;

/*
6.14 (Exponentiation)
Write a method integerPower(base, exponent) that returns the value of base exponent
For example, integerPower(3, 4) calculates 34 (or 3 * 3 * 3 * 3).
Assume that exponent is a positive, nonzero integer and that base is an integer.
Use a for or while statement to control the calculation.
Do not use any Math class methods.
Incorporate this method into an application that reads integer values for base and exponent and
performs the calculation with the integerPower method.

 */

public class Ex6_14Exponentiation {
	
	public static void main(String[] args) {

		System.out.println(integerPower(5, 4));
	}

	public static int integerPower(int base, int exponent){

		int result = 1;

		for (int i = 1; i <= exponent; i++){
			result *= base;
		}
		return result;
	}
}
