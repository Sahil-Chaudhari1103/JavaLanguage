import java.io.*;

class IODemo{
        public static void main(String[] args){
                InputStreamReader isr = new InputStreamReader(System.in);
		
		System.out.println("Enter your name : ");
		char data = isr.read();
        }
}
