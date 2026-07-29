import java.io.*;

class Demo{
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Username :");
                String username = br.readLine();
		System.out.println("Username length : " + username.length());
        }
}
