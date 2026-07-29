
class Demo{
        public int x = 10;

        Demo(){
                System.out.println("In Constructor");
        }

        public void fun(){
                System.out.println("In fun");
        }
}

class Memo{
        public static void main(String[] args){
                Demo obj = new Demo();
                System.out.println(obj.x);              
                obj.fun();                                
        }
}
