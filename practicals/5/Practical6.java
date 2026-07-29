import java.util.*;

class Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your first number.");
                int num1 = sc.nextInt();

		System.out.println("Enter your second number.");
                int num2 = sc.nextInt();

                if(num1 > num2){
                        System.out.println(num1 + " is maximum between "+ num1 + " & "+ num2);
                }else if(num2 > num1){
                        System.out.println(num2 + " is maximum between "+ num1 + " & "+ num2);
                }else{
			System.out.println(num1 + " & " + num2 + " are equal numbers.");
		}
        }
}
