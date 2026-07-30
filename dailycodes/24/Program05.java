
class Demo extends Object {

        int x = 10;

        Demo() { // Demo(Demo this)                                      // hidden this reference
                 // super();
                 // this.x = 10;
                System.out.println("In Constructor - Demo");
        }
}

class DemoChild extends Demo {

        DemoChild() { // DemoChild(DemoChild this)                        // hidden this reference

                System.out.println("In Constructor - DemoChild");
        }

        void fun() {

                System.out.println(x); // No error
        }
}

class Client {

        public static void main(String[] args) {

        }
}
