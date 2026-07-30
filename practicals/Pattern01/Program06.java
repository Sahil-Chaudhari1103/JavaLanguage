import java.util.*;

class Pattern {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();

		char ch = (char) (65 + row);

		for (int i = 0; i < row; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < row; j++) {
					ch--;
					System.out.print((ch + "") + "\t");
				}
			} else {
				for (int j = 0; j < row; j++) {
					System.out.print((ch + "") + "\t");
					ch++;
				}
			}
			
			System.out.println();
		}

	}
}
