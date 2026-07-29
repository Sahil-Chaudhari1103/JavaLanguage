import java.util.*;

class Pattern{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter number of rows : ");
		int row = sc.nextInt();

		for(int i=0 ; i<row ; i++){
			for(int j=0 ; j<row ; j++){
				if(j%2==0){
					System.out.print("#" + "\t" );
				}else{
					System.out.print( "@" + "\t");
				}
			}
			System.out.println();
		}

	}
}	

