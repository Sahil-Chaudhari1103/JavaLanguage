import java.util.*;

class CharacterDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your character.");
		char ch = sc.next().charAt(0);

		if (ch >= 'a' && ch <= 'z') {
			System.out.println(ch + " is a Lowercase character.");
		} else if (ch >= 'A' && ch <= 'Z') {
			System.out.println(ch + " is a Uppercase character.");
		} else {
			System.out.println("Invalid Character");
		}
	}
}
