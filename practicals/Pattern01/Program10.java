import java.util.*;

class Pattern {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number of rows : ");
                int row = sc.nextInt();

                int num = row * row;

                for (int i = 0; i < row; i++) {
                        for (int j = 0; j < row; j++) {
                                System.out.print(num + "\t");
                                num--;
                        }
                        
                        System.out.println();
                }

        }
}
