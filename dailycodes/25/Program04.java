
class Demo {

        int x = 10;

        Demo() {

                // this.x = 10;
                System.out.println("Demo Constructor");
        }
}

class DemoChild1 extends Demo {

        int x = 20;

        DemoChild1() {

                // super()
                // this.x = 20;
                System.out.println("DemoChild1 Constructor");
        }

        void fun() {

                System.out.println("Demo x : " + super.x);
                System.out.println("DemoChild1 x : " + x);
        }
}

class DemoChild2 extends DemoChild1 {

        int x = 30;

        DemoChild2() {

                // super()
                // this.x = 30;
                System.out.println("DemoChild2 Constructor");
        }

        void fun() {

                super.fun();
                System.out.println("Demo x : " + ((Demo) this).x);
                System.out.println("DemoChild1 x : " + ((DemoChild1) this).x);
                System.out.println("DemoChild1 x : " + super.x);
                System.out.println("DemoChild2 x : " + x);
        }
}

class Client {

        public static void main(String[] args) {

                DemoChild2 obj = new DemoChild2(); // DemoChild2(obj)
                obj.fun();
        }
}
