import java.util.*;

class CountDownDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your day:");
		int day = sc.nextInt();
		int i = day;
		
		while (i >= 0) {
			if (i > 0) {
				System.out.println(i + " days remaining.");
			} else {
				System.out.println(i + " days Assignment is Overdue");
			}
			i--;
		}
	}
}
