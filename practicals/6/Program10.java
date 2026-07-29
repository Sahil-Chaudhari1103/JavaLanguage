import java.util.*;

class SumDemo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter range from :");
                int n1 = sc.nextInt();

                System.out.println("Enter range to :");
                int n2 = sc.nextInt();

                int sum = 0;
		if(n1>0 && n2>1){
			int i = n1;
			while(i<=n2){
                        	if(i%2==1){
                                	sum = sum +i;
                        	}
				i++;
                	}

                	System.out.println(sum);
		}else{
			System.out.println("Invalid range number");
		}

        }
}
