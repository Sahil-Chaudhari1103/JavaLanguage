import java.util.*;

class NaturalNum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your number.");
		int n = sc.nextInt();
		
		if (n > 0) {
			int i = n;
			while (i >= 1) {

				System.out.print(i * i + " ");
				i--;
			}

		} else {
			System.out.println("Invalid Number");
		}
	}
}
