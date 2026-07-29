import java.util.*;

class CubeDemo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter your enter:");
                int n = sc.nextInt();

		int i=1;
		while(i<=n){	
			System.out.print(i*i*i + " ");
			i++;
		}
	}
}
