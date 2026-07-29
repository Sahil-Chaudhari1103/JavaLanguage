import java.util.*;

class MaxDemo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter your first number:");
		int n1 = sc.nextInt();

		System.out.println("Enter your first number:");
                int n2 = sc.nextInt();

		System.out.println("Enter your first number:");
                int n3 = sc.nextInt();

		if(n1>n2 && n1>n3){
			System.out.println(n1 +" is greater number.");
		}else if(n2>n1 && n2>n3){
			System.out.println(n2 +" is greater number.");
		}else if(n3>n2){
			System.out.println(n3 +" is grearter number.");
		}else if(n1==n2 && n2==n3){
			System.out.println(n1 + "," + n2 +" & " + n3 +" are equal numbers.");
		}
	}

}
