
class Demo{
        Demo(){
                System.out.println("Constructor");
        }

        void fun(int x, int y){
                System.out.println("In fun");
                System.out.println(x+y);
        }

        public static void main(String[] args){
                Demo obj = new Demo();
                obj.fun(20,50);
        }
}
