import java.util.*;

class TableDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number :");
		int n = sc.nextInt();

		int n2 = 10;
		
		if (n >= 1) {
			for (int i = 1; i <= 10; i++) {
				System.out.println(i * n);
			}
		} else if (n == 0) {
			System.out.println(n);
		} else {
			System.out.println("Invalid Number.");
		}

	}
}
