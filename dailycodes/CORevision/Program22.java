import java.util.*;

class Bank {

        void performOperation(Scanner sc, double userBalance, int num) {

                do {
                        if (num == 1) {
                                System.out.println("User balance is :" + userBalance);
                        } else if (num == 2) {
                                System.out.println("Enter your withdrawal amount :");
                                double withAmount = sc.nextDouble();
                                if (userBalance > withAmount) {
                                        userBalance -= withAmount;
                                        System.out.println("Remaining balance :" + userBalance);
                                } else {
                                        System.out.println("Not enough bank balace. Enter different amount.");
                                }
                        } else if (num == 3) {
                                System.out.println("Enter deposit amount:");
                                double depAmount = sc.nextDouble();
                                userBalance += depAmount;
                                System.out.println("Balance after deposit :" + userBalance);
                        } else if (num == 4) {
                                System.out.println("Thanks for your time.");
                                break;
                        } else {
                                System.out.println("Invalid Choice : Please try again");
                        }

                        System.out.print("Enter another option : \n" +
                                        "1 : Show Balance.\n" +
                                        "2 : Withdrawal.\n" +
                                        "3 : Deposit.\n" +
                                        "4 : Exit.\n");
                        num = sc.nextInt();
                } while (num > 0);
        }

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                double userBalance = 10000;

                System.out.print("Available options : \n" +
                                "1 : Show Balance.\n" +
                                "2 : Withdrawal.\n" +
                                "3 : Deposit.\n" +
                                "4 : Exit.\n");
                System.out.println("Enter your option :");
                int num = sc.nextInt();

                Bank obj = new Bank();
                obj.performOperation(sc, userBalance, num);

        }
}
