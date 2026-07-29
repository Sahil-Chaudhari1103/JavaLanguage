
class Demo{
        Demo(){
                System.out.println("Constructor");
        }

        int fun(int x, int y){
                System.out.println("In fun");
                return "Kanha";                   // error: incompatible types: String cannot be converted to int     
        }

        public static void main(String[] args){
                Demo obj = new Demo();
                System.out.println(obj.fun(20,50));
        }
}
