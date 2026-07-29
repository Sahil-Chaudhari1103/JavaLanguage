import java.util.*;

class SumNum{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your number.");
                int n = sc.nextInt();
                int sum = 0;
		if(n>1){
                	for(int i=1 ; i<=n ; i++){
                       		sum = sum + i;
                	}

                	System.out.println(sum);
		}else{
			System.out.println("Invalid Number");
		}
        }
}
