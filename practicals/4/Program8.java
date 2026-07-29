import java.util.*;

class MarketDemo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your selling price.");
                int sellPrice = sc.nextInt();
		System.out.println("Enter your cost price.");
		int costPrice = sc.nextInt();

		if( sellPrice - costPrice > 0){
			System.out.println("Profit of "+ (sellPrice - costPrice));
		}else if( costPrice - sellPrice > 0){
			System.out.println("Loss of "+ (costPrice - sellPrice));
		}else{
			System.out.println("Neither profit nor loss.");
		}
	}
}

