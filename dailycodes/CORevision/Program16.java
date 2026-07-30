import java.io.*;

class Demo {

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter string :");
                String str1 = br.readLine();
                String str2 = str1.substring(0, 5);

                if (str2.equals("Hello")) {
                        System.out.println("true");
                } else {
                        System.out.println("false");
                }
        }
}
