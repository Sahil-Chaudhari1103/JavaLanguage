import java.util.*;
class Showroom{
	static String srName;
	static{
		srName = "Dev Tata Motors";
	}
}

class Car{
	String carName;
	double price;

	Car(String cName){
		this.carName = cName;
		this.price = 2500000;
	}
}

class Rating{

	int rating;
	Rating(int rating){
		this.rating=rating;
	}

	void displayDetails(Showroom obj1,Car obj2){
		System.out.println("Showroom name :"+obj1.srName);
		System.out.println("Car Name :"+obj2.carName);
		System.out.println("Car Price :"+obj2.price);
		System.out.println("Ratnig :"+this.rating);
	}
}

class Demo{

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter car Name");
		String car = sc.nextLine();

		System.out.println("Enter rating of Car");
		int rating = sc.nextInt();

		Showroom obj1 = new Showroom();
		Car obj2 = new Car(car);

		Rating obj3 = new Rating(rating);
		obj3.displayDetails(obj1,obj2);
	}
}




		
