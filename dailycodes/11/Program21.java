import java.util.*;

class TwoDArray {

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter row size :");
                int rowSize = sc.nextInt();

                System.out.println("Enter column size :");
                int colSize = sc.nextInt();

                int arr[][] = new int[rowSize][colSize];

                System.out.println("Enter array data :");
                for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                                arr[i][j] = sc.nextInt();
                        }
                }

                System.out.println("Printing Elements :");
                for (int i = 0; i < arr.length; i++) {
                        for (int j = 0; j < arr[i].length; j++) {
                                System.out.print(arr[i][j] + " ");
                        }
                        System.out.println();
                }
        }
}
