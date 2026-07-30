import java.io.*;

class IODemo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter your society name : ");
                String name = br.readLine();

                System.out.println("Enter your wing : ");
                char wing = br.readLine();

                System.out.println("Name : " + name);
                System.out.println("WIng : " + wing);

        }
}
