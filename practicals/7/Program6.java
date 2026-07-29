import java.util.*;

class RangeDemo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your number :");
                int n = sc.nextInt();

                if(n >=0 && n<=899){
			int i=100;
			while(i<=100+n){
				System.out.println(i);
				i++;
			}
                }else{
                        System.out.println("Invalid Number.");
                }

        }
}
