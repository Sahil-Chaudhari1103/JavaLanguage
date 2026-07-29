import java.util.*;
class Demo{
        int x;
	int y;

        Demo(){
		this(50,100);
                System.out.println("No-arg Constructor.");
		System.out.println(x);
		System.out.println(y);
        }

        Demo(int x,int y){
                System.out.println("Para Constructor.");
		this.x = x;
		this.y = y;
        }

        public static void main(String[] args){
                Demo obj = new Demo();
        }
}
