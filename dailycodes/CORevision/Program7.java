import java.io.*;

class Voting{
        void checkEligibility(int age) {
		if(age>=18){
			System.out.println("Eligible to vote.");
		}else{
			System.out.println("Not eligible to vote.");
		}
        }

        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter age :");
                int age = Integer.parseInt( br.readLine() );

                Voting obj = new Voting();
                obj.checkEligibility(age);
        }
}
