package Chapter5;

public class BreakTestWithLoopEx526 {
	public static void main(String[] args) {

		int count = 0;

		for (int i = 1; i <= 10; i++){

			if (i < 5){
				System.out.print(i + " ");
				count++;
			}


		}

		System.out.printf("%nBroke out of loop at count = %d%n", count + 1);
		
	}
}
