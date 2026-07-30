import java.io.*;

class IODemo {

        public static void main(String[] args) {

                InputStreamReader isr = new InputStreamReader(System.in);
                BufferedReader br = new BufferedReader(isr);

                System.out.println("Enter your name : ");
                String data = br.readLine();

                System.out.println(data);
        }
}
