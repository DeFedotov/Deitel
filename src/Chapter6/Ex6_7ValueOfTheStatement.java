package Chapter6;

public class Ex6_7ValueOfTheStatement {
	public static void main(String[] args) {

		System.out.println(Math.abs(7.5));	//7.5
		System.out.println(Math.floor(7.5));	//7.0
		System.out.println(Math.abs(0.0));	//0.0
		System.out.println(Math.ceil(0.0));	//0.0
		System.out.println(Math.abs(-6.4));	//6.4
		System.out.println(Math.ceil(-6.4));	//-6.0
		System.out.println(Math.ceil(-Math.abs(-8 + Math.floor(-5.5))));	//-14.0
	}
}
