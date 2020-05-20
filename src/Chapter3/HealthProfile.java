package Chapter3;

/*	Exercise 3.17
	(Computerization of Health Records) A health-care issue that has been in the news lately is
	the computerization of health records. This possibility is being approached cautiously because of
	sensitive privacy and security concerns, among others. [We address such concerns in later exercises.]
	Computerizing health records could make it easier for patients to share their health profiles
	and histories among their various health-care professionals. This could improve the quality of health care,
	help avoid drug conflicts and erroneous drug prescriptions, reduce costs and, in emergencies, could
	save lives. In this exercise, you’ll design a “starter” HealthProfile class for a person.
	The class attributes should include the person’s first name, last name, gender, date of birth (consisting of separate
	attributes for the month, day and year of birth), height (in inches) and weight (in pounds). Your class
	should have a constructor that receives this data. For each attribute, provide set and get methods.
	The class also should include methods that calculate and return the user’s age in years, maximum
	heart rate and target-heart-rate range (see Exercise 3.16), and body mass index (BMI; see
	Exercise 2.33). Write a Java app that prompts for the person’s information, instantiates an object of
	class HealthProfile for that person and prints the information from that object—including the person’s first name,
	last name, gender, date of birth, height and weight—then calculates and prints the
	person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display
	the BMI values chart from Exercise 2.33.
*/

import java.util.Scanner;

public class HealthProfile {

	private String firstName;
	private String lastName;
	private String gender;
	private int dayOfBirth;
	private int monthOfBirth;
	private int yearOfBirth;
	private double height;	//inches
	private double weight;	//pounds
	private int currentYear = 2020;

	public HealthProfile(String firstName, String lastName, String gender, int dayOfBirth, int monthOfBirth, int yearOfBirth, double height, double weight){
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.dayOfBirth = dayOfBirth;
		this.monthOfBirth = monthOfBirth;
		this.yearOfBirth = yearOfBirth;
		this.height = height;
		this.weight = weight;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	public String getFirstName(){
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(int dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public int getMonthOfBirth() {
		return monthOfBirth;
	}

	public void setMonthOfBirth(int monthOfBirth) {
		this.monthOfBirth = monthOfBirth;
	}

	public int getYearOfBirth() {
		return yearOfBirth;
	}

	public void setYearOfBirth(int yearOfBirth) {
		this.yearOfBirth = yearOfBirth;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
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

	public double getBMI(){

		System.out.println("BMI VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
		System.out.println();

		double bmi = (weight * 703) / (height * height);
		return bmi;
	}
}

class HealthProfileTest{
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String firstName = input.nextLine();

		System.out.print("Enter last name: ");
		String lastName = input.nextLine();

		System.out.print("Enter gender: ");
		String gender = input.nextLine();

		System.out.print("Enter month of birth: ");
		int monthOfBirth = input.nextInt();

		System.out.print("Enter day of birth: ");
		int dayOfBirth = input.nextInt();

		System.out.print("Enter year of birth: ");
		int yearOfBirth = input.nextInt();

		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();

		System.out.print("Enter weight in pounds: ");
		double weight = input.nextDouble();

		System.out.println();

		HealthProfile person1 = new HealthProfile(firstName, lastName, gender, dayOfBirth, monthOfBirth, yearOfBirth, height, weight);

		System.out.printf("Age is: %d%n%n", person1.getPersonAge());
		System.out.printf("BMI is: %.2f%n%n", person1.getBMI());
		System.out.printf("Max Heart Rate is %d%n%n", person1.getPersonMaxHeartRate());
		System.out.printf("Target Heart Rate is from %.2f to %.2f", person1.getPersonMinTargetHeartRate(), person1.getPersonMaxTargetHeartRate());

	}
}
