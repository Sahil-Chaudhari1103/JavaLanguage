import java.util.*;

class Pattern {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number of rows : ");
                int row = sc.nextInt();

                for (int i = 0; i < row; i++) {
                        char ch = (char) (97 + i);
                        for (int j = 0; j < row; j++) {
                                System.out.print(ch + "" + "\t");
                                ch++;
                        }
                        System.out.println();
                }

        }
}
