import java.util.*;

class NaturalNum{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter range from :");
                int n1 = sc.nextInt();

                System.out.println("Enter range to :");
                int n2 = sc.nextInt();
		
		if(n1>=0 && n2>=5){
			int i=n1;
			while(i<=n2){
				if(i%5==0){
					System.out.println(i);
				}
				i++;

                	}
		}else{
			System.out.println("Invalid Range number");
		}

        }
}

