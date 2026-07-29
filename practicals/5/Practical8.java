import java.util.*;

class StudentDemo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your number.");
                int marks = sc.nextInt();

                if(marks >= 85){
                        System.out.println("Medical.");
                }else if(marks >= 75 && marks <= 85){
                        System.out.println("Engineering.");
                }else if(marks >= 65 && marks <= 75){
                        System.out.println("Pharmacy or Bachelor in Science.");
                }
        }
}
