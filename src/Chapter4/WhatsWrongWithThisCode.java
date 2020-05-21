package Chapter4;

// 4.34 (What’s Wrong with This Code?)
// What is wrong with the following statement? Provide the
// correct statement to add one to the sum of x and y.
// System.out.println(++(x + y));

public class WhatsWrongWithThisCode {
	public static void main(String[] args) {

		int x = 1;
		int y = 2;

//		System.out.println(++(x + y));

		int z = x + y;

		System.out.println(++z);
	}
}
