package Chapter3;

/*	Exercise 3.16
	(Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that
	your heart rate stays within a safe range suggested by your trainers and doctors.
	According to the American Heart Association (AHA) (www.americanheart.org/presenter.jhtml?identifier=4736), the
	formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
	Your target heart rate is a range that’s 50–85% of your maximum heart rate. [Note: These formulas are
	estimates provided by the AHA. Maximum and target heart rates may vary based on the health, fitness
	and gender of the individual. Always consult a physician or qualified health-care professional before
	beginning or modifying an exercise program.] Create a class called HeartRates. The class attributes
	should include the person’s first name, last name and date of birth (consisting of separate attributes for
	the month, day and year of birth). Your class should have a constructor that receives this data as parameters.
	For each attribute provide set and get methods. The class also should include a method that
	calculates and returns the person’s age (in years), a method that calculates and returns the person’s
	maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
	Java app that prompts for the person’s information, instantiates an object of class HeartRates and
	prints the information from that object—including the person’s first name, last name and date of
	birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
	range
*/

import java.util.Scanner;

public class HeartRates {

	private String firstName;
	private String lastName;
	private int monthOfBirth;
	private int dayOfBirth;
	private int yearOfBirth;

	int currentYear = 2020;

	public HeartRates(String firstName, String lastName, int monthOfBirth, int dayOfBirth, int yearOfBirth){
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthOfBirth = monthOfBirth;
		this.dayOfBirth = dayOfBirth;
		this.yearOfBirth = yearOfBirth;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	public String getLastName(){
		return lastName;
	}

	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public int getPersonAge(){
		int personAge = currentYear - yearOfBirth;
		return personAge;
	}

	public int getPersonMaxHeartRate(){
		int maxHeartRate = 220 - getPersonAge();
		return maxHeartRate;
	}


	public double getPersonMinTargetHeartRate(){
		double minTargetHeartRate = 0.5 * getPersonMaxHeartRate();
		return  minTargetHeartRate;
	}

	public double getPersonMaxTargetHeartRate(){
		double maxTargetHeartRate = 0.85 * getPersonMaxHeartRate();
		return maxTargetHeartRate;
	}

}

class HeartRatesTest{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter month of birth: ");
		int monthOfBirth = input.nextInt();

		System.out.print("Enter day of birth: ");
		int dayOfBirth = input.nextInt();

		System.out.print("Enter year of birth: ");
		int yearOfBirth = input.nextInt();

		System.out.println();


		HeartRates person1 = new HeartRates(firstName, lastName, monthOfBirth, dayOfBirth, yearOfBirth);
		System.out.printf("%s %s %d/%d/%d%n", person1.getFirstName(), person1.getLastName(), person1.getDayOfBirth(), person1.getMonthOfBirth(), person1.getYearOfBirth());

		System.out.printf("Age is: %d%n", person1.getPersonAge());
		System.out.printf("Max Heart Rate is %d%n", person1.getPersonMaxHeartRate());
		System.out.printf("Target Heart Rate is from %.2f to %.2f", person1.getPersonMinTargetHeartRate(), person1.getPersonMaxTargetHeartRate());


	}
}