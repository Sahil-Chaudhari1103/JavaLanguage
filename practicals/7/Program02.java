import java.util.*;

class RangeDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number :");
		int n = sc.nextInt();
		
		if (n >= 0 && n <= 900) {
			for (int i = 100; i <= 100 + n - 1; i++) {
				System.out.println(i);
			}
		} else {
			System.out.println("Number is too high or low because it exceeds three digits");
		}

	}
}
