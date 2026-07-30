
class Demo {

	public static void main(String[] args) {

		boolean cardValid = true;

		int enteredPin = 1234;

		int actualPin = 1234;

		if (cardValid) {
			if (enteredPin == actualPin) {
				System.out.println("Withdrawal Allowed");
			} else {
				System.out.println("In correct PIN");
			}
		} else {
			System.out.println("Invalid Card");
		}
	}
}
