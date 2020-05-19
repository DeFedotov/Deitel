package Chapter3;

/*	Exercise 3.13
	(Employee Class) Create a class called Employee that includes three instance variables—a
	first name (type String), a last name (type String) and a monthly salary (double).
	Provide a constructor that initializes the three instance variables. Provide a set and a get method for each instance
	variable. If the monthly salary is not positive, do not set its value.
	Write a test app named EmployeeTest that demonstrates class Employee’s capabilities. Create two Employee objects and display each
	object’s yearly salary. Then give each Employee a 10% raise and display each Employee’s yearly salary again.
*/

public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee(String firstName, String lastName, double monthlySalary){
		this.firstName = firstName;
		this.lastName = lastName;
		this.monthlySalary = monthlySalary;
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

	public void setMonthlySalary(double monthlySalary){
		if (monthlySalary >= 0)
			this.monthlySalary = monthlySalary;
	}

	public double getMonthlySalary(){
		return monthlySalary;
	}

}

class EmployeeTest{

	public static void main(String[] args) {

		Employee employee1 = new Employee("John", "Smith", 1000.0);
		Employee employee2 = new Employee("Jane", "Smith", 3000.0);

		System.out.printf("Employee1's year salary is: $%.2f%n", employee1.getMonthlySalary()*12);
		System.out.printf("Employee2's year salary is: $%.2f%n%n", employee2.getMonthlySalary()*12);

		System.out.println("Salary after 10% raising");

		employee1.setMonthlySalary(1100.0);
		employee2.setMonthlySalary(3300.0);

		System.out.printf("Employee1's year salary is: $%.2f%n", employee1.getMonthlySalary()*12);
		System.out.printf("Employee2's year salary is: $%.2f%n", employee2.getMonthlySalary()*12);
	}
}
