package Chapter5;

/*
5.20 (Calculating the Value of π)
Calculate the value of π from the infinite series.
Print a table that shows the value of π approximated by computing the first 200,000 terms of this
series. How many terms do you have to use before you first get a value that begins with 3.14159?

68058 3.14159
 */

public class CalculatingTheValueOfPEx520 {
	public static void main(String[] args) {

		int counter = 0;
		double i = 3.0;
		double j = 5.0;
		double p = 4.0;

		double minus = 4 / i;

		double plus = 4 / j;
		p = p - minus + plus;

		while (counter <= 200000) {

			i = i + 4.0;
			j = j + 4.0;

			minus = 4 / i;
			plus = 4 / j;

			p = p - minus + plus;
			System.out.print(counter + " ");
			System.out.println(p);

			counter++;
		}
	}
}
