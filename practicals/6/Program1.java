import java.util.*;

class NaturalNum{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your number.");
                int n = sc.nextInt();
		if(n>=1){
                	for(int i=1 ; i<=n ; i++){
                        	System.out.print(i + " ");
                	}
		}else{
			System.out.println("Invalid Number");
		}

        }
}
