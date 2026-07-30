import java.util.*;

class RangeDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter range from:");
		int n1 = sc.nextInt();

		System.out.println("Enter range to:");
		int n2 = sc.nextInt();

		if (n1 < n2 || n1 > n2) {
			if (n1 < n2) {
				int i = n1;
				while (i <= n2) {
					if (i % 4 == 0 && i % 5 == 0) {
						System.out.println(i);
					}
					i++;
				}
			} else {
				int i = n1;
				while (i >= n2) {
					if (i % 4 == 0 && i % 5 == 0) {
						System.out.println(i);
					}
					i--;
				}
			}
		} else {
			System.out.println("Both the the numbers are equal.Try some other range.");
		}

	}
}
