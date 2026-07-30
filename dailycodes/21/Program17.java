
class Demo {

        /*Demo(){
        
                System.out.println("Demo Constructor");
        }*/

        Demo(int x) {

                System.out.println("Para Constructor");
                System.out.println(x);
        }

        public static void main(String[] args) {

                Demo obj1 = new Demo();
                Demo obj2 = new Demo(45);

        }
}



/* error: constructor Demo in class Demo cannot be applied to given types;
                Demo obj1 = new Demo();
                            ^
  required: int
  found: no arguments
  reason: actual and formal argument lists differ in length   */
