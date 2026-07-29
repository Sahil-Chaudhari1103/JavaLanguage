import java.util.*;
class Demo{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int row=sc.nextInt();

		int count = 1;
		int rowcol=1;

		if(rowcol %2==1){
			for(int i=1;i<=row;i++){
				System.out.println(count);
				count++;
			}

}

