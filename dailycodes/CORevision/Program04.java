import java.io.*;

class Shopping {

	static void calculateDiscount(double amount) {

		System.out.println("Total amount :" + amount);
		double discount;

		if (amount > 5000) {
			discount = amount * 0.2;
		} else if (amount > 2000) {
			discount = amount * 0.1;
		} else {
			discount = amount * 0.05;
		}

		System.out.println("Discount amount : " + discount);
		
		double finalAmount = amount - discount;
		System.out.println("Final payable amount : " + finalAmount);
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter your amount :");
		double amount = Double.parseDouble(br.readLine());

		calculateDiscount(amount);
	}
}
