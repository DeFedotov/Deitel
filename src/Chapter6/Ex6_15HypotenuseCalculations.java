package Chapter6;

/*
6.15 (Hypotenuse Calculations)
Define a method hypotenuse that calculates the hypotenuse of a right triangle
when the lengths of the other two sides are given. The method should take two arguments of type double
and return the hypotenuse as a double. Incorporate this method into an
application that reads values for side1 and side2 and performs the calculation with the hypotenuse method.
Use Math methods pow and sqrt to determine the length of the hypotenuse for each of
the triangles in Fig. 6.15. [Note: Class Math also provides method hypot to perform this calculation.]

 */

public class Ex6_15HypotenuseCalculations {
	public static void main(String[] args) {

		System.out.printf("Tri\t\ts1\t\ts2\t\thypot%n");
		System.out.printf("1\t\t3.0\t\t4.0\t\t");
		System.out.println(hypotenuse(3.0, 4.0));

		System.out.printf("2\t\t5.0\t\t12.0\t");
		System.out.println(hypotenuse(5.0, 12.0));

		System.out.printf("3\t\t8.0\t\t15.0\t");
		System.out.println(hypotenuse(8.0, 15.0));
	}

	public static double hypotenuse(double side1, double side2){
		return Math.hypot(side1, side2);
	}
}
