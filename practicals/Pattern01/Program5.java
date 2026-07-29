import java.util.*;

class Pattern{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number of rows : ");
                int row = sc.nextInt();
		int num = row;


                char ch = (char)(64 + row) ;
                for(int i=1 ; i<=row ; i++){
			if(i%2==0){
                        	for(int j=1 ; j<=row ; j++){
                                	System.out.print(num + "\t");
                        	}
			}else {
				for(int j=1 ; j<=row ; j++){
					System.out.print(ch + "\t");
				}
			}
			ch--;
			num--;
                        System.out.println();
                }

        }
}
