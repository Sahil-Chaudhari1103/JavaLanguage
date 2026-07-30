import java.util.*;

class Pattern {

        void pattern1(int rows) {

                int num = 1;

                for (int i = 1; i <= rows; i++) {                    // 1
                        for (int j = 1; j <= i; j++) {               // 2 3
                                System.out.print(num + " ");         // 4 5 6
                                num++;                               // 7 8 9 10
                        }
                        System.out.println();
                }
        }

        void pattern2(int rows) {

                int num = 4;

                for (int i = 1; i <= rows; i++) {                     // 4
                        for (int j = 1; j <= i; j++) {                // 3 3
                                System.out.print(num + " ");          // 2 2 2
                        }                                             // 1 1 1 1
                        num--;
                        System.out.println();
                }
        }

        void pattern3(int rows) {

                for (int i = 1; i <= rows; i++) {                        // 1 2 3 4
                        for (int j = 1; j <= (rows - i + 1); j++) {      // 1 2 3
                                System.out.print(j + " ");               // 1 2
                        }                                                // 1
                        System.out.println();
                }
        }

        void pattern4(int rows) {

                for (int i = 1; i <= rows; i++) {                        // 1
                        for (int j = 1; j <= (rows - i); j++) {          // 1 2
                                System.out.print("  ");                  // 1 2 3
                        }                                                // 1 2 3 4
                        for (int k = 1; k <= i; k++) {
                                System.out.print(k + " ");
                        }
                        System.out.println();
                }
        }

        void pattern5(int rows) {

                for (int i = 1; i <= rows; i++) {                          // 4
                        for (int j = 1; j <= (rows - i); j++) {            // 3 3
                                System.out.print("  ");                    // 2 2 2
                        }                                                  // 1 1 1 1
                        for (int k = 1; k <= i; k++) {
                                System.out.print(rows - i + 1 + " ");
                        }
                        System.out.println();
                }
        }

        void pattern6(int rows) {

                int num = rows;

                for (int i = 1; i <= rows; i++) {                          // 1 2 3 4
                        for (int j = 1; j <= (rows - num); j++) {          // 1 2 3
                                System.out.print("  ");                    // 1 2
                        }                                                  // 1
                        for (int k = 1; k <= num; k++) {
                                System.out.print(k + " ");
                        }
                        num--;
                        System.out.println();
                }
        }

        void pattern7(int rows) {

                int num = rows;

                for (int i = 1; i <= rows; i++) {                         // 4 3 2 1
                        for (int j = 1; j <= (rows - num); j++) {         // 3 2 1
                                System.out.print("  ");                   // 2 1
                        }                                                 // 1
                        for (int k = 1; k <= num; k++) {
                                System.out.print(num - k + 1 + " ");
                        }
                        num--;
                        System.out.println();
                }
        }

        void pattern8(int rows) {

                int num = rows;

                for (int i = 1; i <= rows; i++) {
                        int n1 = rows;                                   // 4 8 12 16
                        for (int j = 1; j <= (rows - num); j++) {        // 4 7 10
                                System.out.print("        ");            // 4 6
                        }                                                // 4
                        for (int k = 1; k <= num; k++) {
                                System.out.printf("%8d", n1);
                                n1 = n1 + num;
                        }
                        num--;
                        System.out.println();
                }
        }

        void pattern9(int rows) {

                int num = (rows * (rows + 1)) / 2;

                for (int i = 1; i <= rows; i++) {                        // 10
                        for (int j = 1; j <= (rows - i); j++) {          // 10 9
                                System.out.print("        ");            // 9 8 7
                        }                                                // 7 6 5 4
                        for (int k = 1; k <= i; k++) {
                                System.out.printf("%8d", num);
                                num--;
                        }
                        num++;
                        System.out.println();
                }
        }

        void pattern10(int rows) {

                for (int i = 1; i <= rows; i++) {
                        int num = i * i * i;                             // 1
                        for (int j = 1; j <= (rows - i); j++) {          // 8 8
                                System.out.print("        ");            // 27 27 27
                        }                                                // 64 64 64 64
                        for (int k = 1; k <= i; k++) {
                                System.out.printf("%8d", num);
                        }
                        System.out.println();
                }
        }

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                while (true) {
                        System.out.println("Available Patterns:\n" +
                                        "1 : Pattern01 \n" +
                                        "2 : Pattern02 \n" +
                                        "3 : Pattern03 \n" +
                                        "4 : Pattern04 \n" +
                                        "5 : Pattern05 \n" +
                                        "6 : Pattern06 \n" +
                                        "7 : Pattern07 \n" +
                                        "8 : Pattern08 \n" +
                                        "9 : Pattern09 \n" +
                                        "10 : Pattern10 \n" +
                                        "0 : Exit.\n");
                        System.out.println("Select pattern from above options");
                        int option = sc.nextInt();

                        if (option == 0) {
                                break;
                        } else {
                                System.out.println(
                                                "--------------------- Pattern : " + option + " ---------------------");
                                System.out.println("Enter number of rows :");
                                int rows = sc.nextInt();
                                Pattern obj = new Pattern();
                                System.out.println("-------------------------------------------------------");
                                switch (option) {
                                        case 1:
                                                obj.pattern1(rows);
                                                break;
                                        case 2:
                                                obj.pattern2(rows);
                                                break;
                                        case 3:
                                                obj.pattern3(rows);
                                                break;
                                        case 4:
                                                obj.pattern4(rows);
                                                break;
                                        case 5:
                                                obj.pattern5(rows);
                                                break;
                                        case 6:
                                                obj.pattern6(rows);
                                                break;
                                        case 7:
                                                obj.pattern7(rows);
                                                break;
                                        case 8:
                                                obj.pattern8(rows);
                                                break;
                                        case 9:
                                                obj.pattern9(rows);
                                                break;
                                        case 10:
                                                obj.pattern10(rows);
                                                break;
                                        default:
                                                System.out.println("Invalid option . Please try again.");
                                }

                                System.out.println("---------------*************************---------------");
                        }
                }
        }
}
