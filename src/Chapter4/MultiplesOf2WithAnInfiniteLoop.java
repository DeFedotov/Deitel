package Chapter4;

// 4.33 (Multiples of 2 with an Infinite Loop)
// Write an application that keeps displaying in the
// command window the multiples of the integer 2—namely, 2, 4, 8, 16, 32, 64, and so on. Your loop
// should not terminate (i.e., it should create an infinite loop). What happens when you run this program?

public class MultiplesOf2WithAnInfiniteLoop {
	public static void main(String[] args) {

		int x = 2;

		while(x>0){
			x = x * 2;
			System.out.println(x);
		}
	}
}
