
class Demo {

        int x = 10;

        static int y = 20;

        static {

                System.out.println("Static Block : Demo");
        }

        Demo() {

                // super()
                // this.x = 10;
                System.out.println("Demo Constructor");
        }
}

class DemoChild extends Demo {

        int x = 30;

        static int y = 40;

        static {

                System.out.println("Static Block - DemoChild");
        }

        DemoChild() {

                // super()
                // this.x = 30;
                System.out.println("DemoChild Constructor");
        }
}

class Client {

        public static void main(String[] args) {

                System.out.println("Start Main");

                DemoChild obj = new DemoChild();

                System.out.println("End Main");
        }
}
