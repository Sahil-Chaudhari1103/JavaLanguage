import java.util.*;
class Demo{
        Demo(){
                System.out.println(this);            //1000
                System.out.println("In Constructor.");
        }

	void fun(){
                System.out.println(this);            //1000
                System.out.println("In Fun.");
	}

        public static void main(String[] args){
                Demo obj = new Demo();
		//Memory Allocation
		//Demo(obj) - Constructor call
                obj.fun();  //obj.fun(obj)
		System.out.println(obj);              //1000

        }
}
