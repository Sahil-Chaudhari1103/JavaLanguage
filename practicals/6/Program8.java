import java.util.*;

class NaturalNum{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

		int i = 'a';
		while(i<='z'){
                        char ch =(char) i ;
                        if( i!= 'a' && i!='e' && i!='i' && i!='o' && i!='u'){
                                System.out.println(ch);
                        }
			i++;
                }

        }
}
