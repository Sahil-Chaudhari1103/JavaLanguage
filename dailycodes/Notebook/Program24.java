import java.util.*;

class Demo {

	void evenOdd(int n) {

		if (n % 2 == 0) {
			System.out.println(n + " is an even number.");
		} else {
			System.out.println(n + " is an odd number.");
		}
	}

	void factors(int n) {

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(i + " ");
			}
		}

		System.out.println("these all are the factors of number " + n + ".");
		System.out.println();
	}

	void isGCD(int n1, int n2) {

		int gcd = 0;
		int num;

		if (n1 < n2) {
			num = n1;
		} else {
			num = n2;
		}

		for (int i = num; i >= 1; i--) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
				break;
			}
		}

		System.out.println(gcd + " is the GCD of numbers " + n1 + " & " + n2 + ".");
	}

	void isLCM(int n1, int n2) {

		int lcm = 0;
		int num = 0;

		if (n1 > n2) {
			num = n1;
		} else {
			num = n2;
		}

		while (num > 0) {
			if (num % n1 == 0 && num % n2 == 0) {
				lcm = num;
				break;
			}
			num = num + num;
		}

		System.out.println(lcm + " is the LCM of numbers " + n1 + " & " + n2 + ".");
	}

	void isPrime(int n) {

		boolean prime = true;

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				prime = false;
				break;
			}
		}

		if (prime == true) {
			System.out.println(n + " is a prime number.");
		} else {
			System.out.println(n + " is not a prime number.");
		}
	}

	void factorial(int n) {

		int fact = 1;
		for (int i = 2; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact + " is a factorial of number " + n + ".");
	}

	void isStrong(int n) {

		int sum = 0;
		int temp = n;
		while (n > 0) {
			int rem = n % 10;
			int fact = 1;
			for (int i = 1; i <= rem; i++) {
				fact = fact * i;
			}
			sum = sum + fact;
			n = n / 10;
		}

		if (sum == temp) {
			System.out.println(temp + " is a strong number.");
		} else {
			System.out.println(temp + " is not a strong number.");
		}

	}

	void evenSum(int n) {

		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of even numbers from range 1 to " + n + " is " + sum + ".");
	}

	void reverse(int n) {

		int temp = n;
		int reverse = 0;
		while (n > 0) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}

		System.out.println(reverse + " is a reverse number of " + temp + ".");
	}

	void isPalindrome(int n) {

		int temp = n;
		int reverse = 0;
		while (n > 0) {
			int rem = n % 10;
			reverse = reverse * 10 + rem;
			n = n / 10;
		}

		if (reverse == temp) {
			System.out.println(temp + " is a palindrome number.");
		} else {
			System.out.println(temp + " is not a palindrome number.");
		}
	}

	void isDuck(int n) {

		int temp = n;
		int count = 0;

		while (n > 9) {
			int rem = n % 10;
			if (rem == 0) {
				System.out.println(temp + " is a duck number.");
				count++;
				break;
			}
			n = n / 10;
		}

		if (count == 0) {
			System.out.println(temp + " is not a duck number.");
		}
	}

	void isHarshad(int n) {

		int temp = n;
		int sum = 0;

		while (n > 0) {
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}

		if (temp % sum == 0) {
			System.out.println(temp + " is a harshad number.");
		} else {
			System.out.println(temp + " is not a harshad number.");
		}
	}

	void isNeon(int n) {

		int sq = n * n;
		int sum = 0;

		while (sq > 0) {
			int rem = sq % 10;
			sum = sum + rem;
			sq = sq / 10;
		}

		if (sum == n) {
			System.out.println(n + " is a neon number.");
		} else {
			System.out.println(n + " is not a neon number.");
		}
	}

	void isPerfect(int n) {
		int sum = 0;

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}

		if (sum == n) {
			System.out.println(n + " is a perfect number.");
		} else if (sum > n) {
			System.out.println(n + " is a abundant number.");
		}

		if (sum < n) {
			System.out.println(n + " is a defficient number.");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("----------------************------------------");
			System.out.println("Select one operation from below options :\n" +
					"1 : Even and Odd.\n" +
					"2 : Factors.\n" +
					"3 : Find GCD or HCF .\n" +
					"4 : Find LCM .\n" +
					"5 : Is Prime.\n" +
					"6 : Factorial.\n" +
					"7 : Is Strong.\n" +
					"8 : Sum of even numbers.\n" +
					"9 : Reverse.\n" +
					"10 : Is Palindrome.\n" +
					"11 : Is Duck.\n" +
					"12 : Is Harshad or Is Niven.\n" +
					"13 : Is Neon.\n" +
					"14 : Is Perfect/Abundant/Defficient.\n" +
					"0 : Exit.\n");
			int option = sc.nextInt();

			if (option == 0) {
				break;
			} else if (option >= 1 && option <= 14) {
				System.out.println("Enter your number :");
				int num = sc.nextInt();
				Demo obj = new Demo();
				switch (option) {
					case 1:
						obj.evenOdd(num);
						break;
					case 2:
						obj.factors(num);
						break;
					case 3:
						System.out.println("Enter your second number :");
						int num2 = sc.nextInt();
						obj.isGCD(num, num2);
						break;
					case 4:
						System.out.println("Enter your second number :");
						int num3 = sc.nextInt();
						obj.isLCM(num, num3);
						break;
					case 5:
						obj.isPrime(num);
						break;
					case 6:
						obj.factorial(num);
						break;
					case 7:
						obj.isStrong(num);
						break;
					case 8:
						obj.evenSum(num);
						break;
					case 9:
						obj.reverse(num);
						break;
					case 10:
						obj.isPalindrome(num);
						break;
					case 11:
						obj.isDuck(num);
						break;
					case 12:
						obj.isHarshad(num);
						break;
					case 13:
						obj.isNeon(num);
						break;
					case 14:
						obj.isPerfect(num);
						break;
				}

			} else {
				System.out.println("Invalid option! Please try again.");
				continue;
			}
		} while (true);
	}
}
