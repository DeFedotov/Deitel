package Chapter7;

// GradeBookTest creates a GradeBook object using an array of grades,
// then invokes method processGrades to analyze them.

public class Fig7_15GradeBookTest {

	public static void main(String[] args) {

		int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87};

		Fig7_14GradeBook myGradeBook = new Fig7_14GradeBook("CS101 Introduction to Java Programming", gradesArray);

		System.out.printf("Welcome to the grade book for%n%s%n%n", myGradeBook.getCourseName());

		myGradeBook.processGrades();
	}
}
