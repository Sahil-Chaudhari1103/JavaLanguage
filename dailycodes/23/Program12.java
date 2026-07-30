
class Demo {

        Demo() {

                System.out.println("Demo Constructor");
        }
}

class DemoChild extends Demo {

        DemoChild() {

                System.out.println("DemoChild Constructor");
        }

        DemoChild(int x) {

                System.out.println("DemoChild Constructor - Para");
        }
}

class Client {

        public static void main(String[] args) {

                DemoChild obj1 = new DemoChild();
        }
}
