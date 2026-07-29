import java.util.*;

class ScannerDemo{
        public static void main(String[] arge){
                Scanner sc = new Scanner(System.in);

                System.out.println("ENTER YOUR NAME :");
                String name = sc.nextLine();
                System.out.println("ENTER YOUR AGE :");
                int age = sc.nextInt();
                System.out.println("ENTER YOUR SALARY :");
                float salary = sc.nextFloat();

		System.out.println("Emp name : "+ name);
		System.out.println("Emp age : "+ age);
		System.out.println("Emp salary : "+ salary);

        
        }
}
