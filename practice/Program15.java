import java.util.*;

class FoodOrder {

	String itemName;
	int quantity;
	double price;

	FoodOrder(String itemName) {

		this.itemName = itemName;
		this.quantity = 1;
		this.price = 20;
	}

	FoodOrder(String itemName, int quantity) {

		this.itemName = itemName;
		this.quantity = quantity;
		this.price = 20;
	}

	void displayOrder() {

		double bill = price * quantity;

		System.out.println("You ordered :" + this.itemName);
		System.out.println("Quantity : " + this.quantity);
		System.out.println("total bill :" + bill);
	}

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		
		String iName = "Samosa";

		System.out.println("Enter quantity");
		int quantity = sc.nextInt();

		FoodOrder obj = new FoodOrder(iName);
		FoodOrder obj1 = new FoodOrder(iName, quantity);

		obj.displayOrder();
		obj1.displayOrder();

	}
}
