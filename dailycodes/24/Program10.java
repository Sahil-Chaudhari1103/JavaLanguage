
class Demo extends Object {

        int x = 10;

        Demo() { // Demo(Demo this)                                               // hidden this reference
                 // super();
                 // this.x = 10;
                System.out.println("In Constructor - Demo");
        }
}

class DemoChild extends Demo {

        int x = 20;

        DemoChild() { // DemoChild(DemoChild this)                                // hidden this reference

                System.out.println("In Constructor - DemoChild");
        }

        void fun(){

                System.out.println(super.this.x);             // error
                System.out.println(x);
        }
}

class Client {

        public static void main(String[] args) {

                DemoChild obj = new DemoChild();
                obj.fun();
        }
}


/* error: as of release 8, 'this' is allowed as the parameter name for the receiver type only
  which has to be the first parameter, and cannot be a lambda parameter */
