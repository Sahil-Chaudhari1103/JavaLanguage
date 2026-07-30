import java.util.*;

class TaxCalculator {

	static void calculateTax(double sal) {

		System.out.println("Salary is : " + sal);

		double tax = (10 * sal) / 100;
		System.out.println("10% tax on given salary is : " + tax);

		double remainingSal = sal - tax;
		System.out.println("Remaining salary after tax deduction is : " + remainingSal);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your salary :");
		double salary = sc.nextDouble();

		calculateTax(salary);
	}
}
