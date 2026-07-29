import java.io.*;

class Demo{
        public static void main(String[] args) throws IOException{
                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter string :");
                String str = br.readLine();
		str = str.toLowerCase();

		if(str.contains("a")){
			for(int i=0 ; i<str.length() ; i++){
				if(str.charAt(i) == 'a'){
					System.out.println(i);
					break;
				}
        		}
		}else{
			System.out.println("-1");
		}
	}
}
