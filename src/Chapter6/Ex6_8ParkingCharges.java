package Chapter6;

/*

6.8 (Parking Charges)
A parking garage charges a $2.00 minimum fee to park for up to three hours.
The garage charges an additional $0.50 per hour for each hour or part thereof
in excess of three hours. The maximum charge for any given 24-hour period is $10.00.
Assume that no car parks for longer than 24 hours at a time.
Write an application that calculates and displays the parking charges for each customer
who parked in the garage yesterday. You should enter the hours parked for each customer.
The program should display the charge for the current customer and should calculate and
display the running total of yesterday’s receipts.
It should use the method calculateCharges to determine the charge for each customer.

 */

public class Ex6_8ParkingCharges {

	public static void main(String[] args) {

		double customer1 = calculateCharges(22);
		double customer2 = calculateCharges(12);
		double customer3 = calculateCharges(3);

		double totalCharge = customer1 + customer2 + customer3;

		System.out.printf("Charges:%nCustomer1: %f%nCustomer2: %f%nCustomer: %f%nTotal: %f%n",
				customer1, customer2, customer3, totalCharge);
	}

	public static double calculateCharges(int hours){

		double charge = 0;

		if (hours <= 3){
			charge = 2;
		} else if (hours > 3 && hours <= 18){
			charge = 2 + ((hours - 3) * 0.5);
		} else if (hours >= 19 && hours <= 24){
			charge = 10;
		}
		return charge;
	}
}
