class Demo {

	public static void main(String[] args) {

		int choice = 3;

		do {
			System.out.println("Select your favourite opening pair in Cricket.");
			System.out.println("Option 1 : David Warner & Aaron Finch");
			System.out.println("Option 2 : Sachin Tendulkar & Virendra Sehwag ");
			System.out.println("Option 3 : Rohit Sharma & Shikhar Dhawan");
			System.out.println("Option 4 : Quinton de Kock & Hashim Amla");

			switch (choice) {
				case 1:
					System.out.println("Great! So your favourite duo is David Warner & Aaron Finch");
					break;
				case 2:
					System.out.println("Great! So your favourite duo is Sachin Tendulkar & Virendra Sehwag");
					break;
				case 3:
					System.out.println("Great! So your favourite duo is Rohit Sharma & Shikhar Dhawan");
					break;
				case 4:
					System.out.println("Great! So your favourite duo is Quinton de Kock & Hashim Amla");
					break;
				default:
					System.out.println("Wrong choice! Please try again. ");
					choice = choice - choice;

			}
		} while (choice > 4);
	}

}
