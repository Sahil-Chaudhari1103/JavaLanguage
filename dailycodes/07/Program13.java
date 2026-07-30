import java.util.*;

class ScannerDemo {

        public static void main(String[] arge) {

                Scanner sc = new Scanner(System.in);

                System.out.println("ENTER SOCIETY NAME :");
                String socName = sc.nextLine();

                System.out.println("ENTER WING :");
                char wing = sc.next().charAt(0);

                System.out.println("ENTER FLATNO. :");
                int flatNo = sc.nextInt();

                System.out.println("Soc Name :" + socName);
                System.out.println("Wing :" + wing);
                System.out.println("FlatNo. :" + flatNum);
        }
}
