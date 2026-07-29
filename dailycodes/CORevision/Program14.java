import java.io.*;

class Demo{
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter string :");
                String str = br.readLine();
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(str.length() - 1));
        }
}
