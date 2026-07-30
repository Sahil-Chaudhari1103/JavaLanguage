import java.util.*;

class NaturalNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number.");
		int n = sc.nextInt();
		
		int count = 0;

		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				if (i % 2 != 0) {
					count++;
				}
			}
			System.out.println(count);
		} else {
			System.out.println("Invalid Number");
		}

	}
}
