import java.util.*;

class Pattern{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number of rows : ");
                int row = sc.nextInt();
		

		for(int i=1 ; i<=row ; i++){
                        for(int j=1 ; j<=row ; j++){
				if(i%3==1){
					System.out.print("#" + "\t");
				}else if(i%3==2){
					System.out.print("@" + "\t");
				}else if(i%3==0){
					System.out.print("$" + "\t");
				}
				
                        }
                        System.out.println();
                }

        }
}
