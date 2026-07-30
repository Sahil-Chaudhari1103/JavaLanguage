import java.util.*;

class StudentDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your marks.");
		int marks = sc.nextInt();

		if (marks >= 70) {
			System.out.println("Passed : First class with distinction.");
		} else if (marks >= 60) {
			System.out.println("Passed : First class.");
		} else if (marks >= 50) {
			System.out.println("Passed : Second class.");
		} else if (marks >= 35) {
			System.out.println("Passed.");
		} else {
			System.out.println("Fail");
		}
	}
}
