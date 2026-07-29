
class Demo {

        int x = 10;

        Demo(){

                System.out.println("No-args Constructor");
        }

        Demo(){                                                         //error: constructor Demo() is already defined in class Demo

                System.out.println("Args Constructor");
        }

        public static void main(String[] args){

                Demo obj = new Demo();
              //  Demo obj1 = new Demo(10);
        }
}
