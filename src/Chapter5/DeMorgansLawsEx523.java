package Chapter5;

/*
5.23 (De Morgan’s Laws)
In this chapter, we discussed the logical operators &&, &, ||, |, ^ and !.
De Morgan’s laws can sometimes make it more convenient for us to express a logical expression.
These laws state that the expression !(condition1 && condition2) is logically equivalent to the expression
(!condition1 || !condition2). Also, the expression !(condition1 || condition2) is logically
equivalent to the expression (!condition1 && !condition2). Use De Morgan’s laws to write equivalent
expressions for each of the following, then write an application to show that both the original expression
and the new expression in each case produce the same value:
a) !(x < 5) && !(y >= 7)
b) !(a == b) || !(g != 5)
c) !((x <= 8) && (y > 4))
d) !((i > 4) || (j <= 6))
 */

public class DeMorgansLawsEx523 {
	public static void main(String[] args) {

		int x = 4;
		int y = 8;
		int a = 3;
		int b = 3;
		int g = 6;
		int i = 7;
		int j = 5;

		System.out.println("a:");
		System.out.println(!(x < 5) && !(y >= 7));
		System.out.println(!((x < 5) || (y > 7)));
		System.out.println("b:");
		System.out.println(!(a == b) || !(g != 5));
		System.out.println(!((a == b) && (g != 5)));
		System.out.println("c:");
		System.out.println(!((x <= 8) && (y > 4)));
		System.out.println(!(x <= 8) || !(y > 4));
		System.out.println("d:");
		System.out.println(!((i > 4) || (j <= 6)));
		System.out.println(!(i > 4) && !(j <= 6));

	}
}
