package Chapter3;

import javax.swing.*;

public class Addition {

	public static void main(String[] args) {

		int number1;
		int number2;
		int sum;

		number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first number:"));
		number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number:"));

		sum = number1 + number2;

		String message = String.format("Sum is %d%n", sum);

		JOptionPane.showMessageDialog(null, message);

	}
}
