import java.util.*;

class String3Demo{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string :");
		String s1 = sc.nextLine();                       //Heap

		System.out.println("Enter second string :");
		String s2 = new String( sc.nextLine() );         //Heap

		String s3 = s1.concat(s2);                       //Heap

                System.out.println( s1 );
                System.out.println( s2 );
                System.out.println( s3 );
        }
}
