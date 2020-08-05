package Chapter5;

/*
5.28 Describe in general how you’d remove any continue statement from a loop in a program
and replace it with some structured equivalent. Use the technique you develop here to remove the
continue statement from the program in Fig. 5.14.
 */

public class ContinueTestEx528 {
	public static void main(String[] args) {

		for (int count = 1; count <= 10; count++){

			if (count == 5){
				System.out.print("");
			} else{
				System.out.printf("%d ", count);
			}

		}

		System.out.printf("%nUsed continue to skip printing 5%n");

	}
}
