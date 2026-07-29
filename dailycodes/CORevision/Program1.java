import java.util.*;

class Product{
	void showProduct(String name,int id,double price){
		System.out.println("Product Name :" + name);
		System.out.println("Product Id :" + id);
		System.out.println("Product Price :" + price);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product name :");
		String productName = sc.nextLine();

		System.out.println("Enter product id :");
		int productId = sc.nextInt();

		System.out.println("Enter product price :");
		double productPrice = sc.nextDouble();

		Product obj = new Product();
		obj.showProduct(productName,productId,productPrice);
	}
}
