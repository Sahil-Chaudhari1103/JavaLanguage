
class Demo{

        Demo(){
                System.out.println("Demo Constructor");
        }

        Demo(int x){
                System.out.println("Para Constructor");
                System.out.println(x);
        }

        public static void main(String[] args){
                Demo obj1 = new Demo();
                Demo obj2 = new Demo(45);

        }
}
