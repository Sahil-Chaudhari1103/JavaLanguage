import java.io.*;

class IODemo{
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter your society name : ");
                String name = br.readLine();

                System.out.println("Enter your wing : ");
                char wing = (char) br.read();

                System.out.println("Enter your flatNo : ");
                int flatNo = Integer.parseInt(br.readLine());

                System.out.println("Details");

                System.out.println("Name : " + name);
                System.out.println("Wing : " + wing);
                System.out.println("FlatNo : " + flatNo);
        }
}
