import java.io.*;

class IODemo{
        public static void main(String[] args) throws IOException{
                InputStreamReader isr = new InputStreamReader(System.in);

                System.out.println("Enter your name : ");
                isr.read();
        }
}
