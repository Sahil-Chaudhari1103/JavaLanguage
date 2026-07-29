
class Demo{
        Demo(){
                System.out.println("Constructor");
        }

        void fun(int x, int y){
                System.out.println("In fun");
                return x+y;                   // error: incompatible types: unexpected return value
        }

        public static void main(String[] args){
                Demo obj = new Demo();
                char retVal = obj.fun(20,50);   // error: incompatible types: void cannot be converted to char
                System.out.println(retVal);
        }
}
