import java.util.*;

class TripletDemo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your first number.");
                int n1 = sc.nextInt();
		
		System.out.println("Enter your second number.");
                int n2 = sc.nextInt();

		System.out.println("Enter your third number.");
                int n3 = sc.nextInt();

		if( n1*n1 + n2*n2 == n3*n3 || n2*n2 + n3*n3 == n1*n1 || n3*n3 + n1*n1 == n2*n2){
			System.out.println(n1 +"," + n2 + "and" + n3 + " is a pythagorean triplet.");
		}else{
			System.out.println(n1 +"," + n2 + "and" + n3 + " is not a pythagorean triplet.");
		}
	}
}
