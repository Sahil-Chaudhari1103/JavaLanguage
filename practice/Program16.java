import java.util.*;

class FoodOrder {

	String itemName;
	int quantity;
	double price;

	FoodOrder(String itemName) {

		this.itemName = itemName;
		this.quantity = 1;

		if (itemName.equals("Samosa")) {
			price = 15;
		} else if (itemName.equals("Tea")) {
			this.price = 10;
		} else if (itemName.equals("Coffee")) {
			this.price = 20;
		}
	}

	FoodOrder(String itemName, int quantity) {

		this.itemName = itemName;
		this.quantity = quantity;

		if (itemName.equals("Samosa")) {
			price = 15;
		} else if (itemName.equals("Tea")) {
			this.price = 10;
		} else if (itemName.equals("Coffee")) {
			this.price = 20;
		}
	}

	void displayOrder() {

		double bill = price * quantity;

		System.out.println("Item name : " + this.itemName);
		System.out.println("Item price : " + this.price);
		System.out.println("Item quantity : " + this.quantity);
		System.out.println("Total bill : " + bill);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter item name :");
		String name = sc.nextLine();

		System.out.println("Enter item quantity :");
		int itemQuantity = sc.nextInt();

		FoodOrder obj1 = new FoodOrder(name);
		FoodOrder obj2 = new FoodOrder(name, itemQuantity);

		System.out.println("Order1 details : ");
		obj1.displayOrder();
		System.out.println("Order2 details : ");
		obj2.displayOrder();
	}
}
