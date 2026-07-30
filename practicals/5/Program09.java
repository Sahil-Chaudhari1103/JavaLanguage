import java.util.*;

class AgeDemo {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your age.");
                int age = sc.nextInt();

                if (age >= 18) {
                        System.out.println("Valid age for voting.");
                } else if (age >= 1 && age <= 17) {
                        System.out.println("Not allowed for voting.");
                } else {
                        System.out.println("Invalid Number");
                }
        }
}
