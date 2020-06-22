package Chapter4;

// 4.22 (Tabular Output)
// Write a Java application that uses looping to print the following table of values:

public class TabularOutput {
	public static void main(String[] args) {

		System.out.println("N\t\t10*N\t100*N\t1000*N\n");

		for(int i = 1; i <= 5; i++){
			System.out.printf("%d\t\t%d\t\t%d\t\t%d%n", i, i*10, i*100, i*1000);
		}
	}
}
