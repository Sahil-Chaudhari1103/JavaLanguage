import java.util.*;

class Pattern {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter number of rows : ");
                int row = sc.nextInt();

                int r1 = row;

                for (int i = 0; i < r1; i++) {
                        int num = row;
                        for (int j = 0; j < r1; j++) {
                                System.out.print(num + "\t");
                                num = num + row;
                        }

                        row--;
                        System.out.println();
                }

        }
}
