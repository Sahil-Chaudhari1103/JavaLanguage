
class Demo{
        Demo(){
                System.out.println("Constructor");
        }

        int fun(int x, int y){
                System.out.println("In fun");
                return x+y;
        }

        public static void main(String[] args){
                Demo obj = new Demo();
                char retVal = obj.fun(20,50);   // error: incompatible types: possible lossy conversion from int to char
                System.out.println(retVal);
        }
}
