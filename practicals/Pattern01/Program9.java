import java.util.*;

class Pattern{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number of rows : ");
                int row = sc.nextInt();


                char ch = (char)(64 + row) ;
		int num = row;
                for(int i=0 ; i<row ; i++){
			if(i%2 == 0){
                        	for(int j=0 ; j<row ; j++){
					if(j%2==0){
                                		System.out.print(ch  + "\t");
					}else{
						System.out.print(num + "\t" );
					}
					ch--;     
					num--;     
                        	}
			}else{
                        	for(int j=0 ; j<row ; j++){
					ch++;   
					num++;   
					if(j%2==0){
                                		System.out.print(ch  + "\t");
					}else{
						System.out.print(num + "\t");
					}
                        	}
			}
                        System.out.println();
                }

        }
}
