import java.io.*;

class Demo{
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter first string :");
                String str1 = br.readLine();

                System.out.println("Enter second string :");
                String str2 = br.readLine();

		str1 = str1.concat(str2);

                System.out.println(str1.length());
        }
}
