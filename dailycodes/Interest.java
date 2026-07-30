import java.util.*;

class Interest {

	void calculateSI(double p, double r, double t) {

		double simpleInterest = (p * r * t) / 100;
		System.out.println("Simple Interest is : " + simpleInterest);
	}

	static void displayDetails(double p, double r, double t) {

		System.out.println("Principal : " + p);
		System.out.println("Rate : " + r);
		System.out.println("Time : " + t);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter principal value :");
		double principal = sc.nextDouble();
		System.out.println("Enter rate value :");
		double rate = sc.nextDouble();
		System.out.println("Enter time value :");
		double time = sc.nextDouble();

		displayDetails(principal, rate, time);

		Interest obj = new Interest();

		obj.calculateSI(principal, rate, time);

	}
}
