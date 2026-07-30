
class Demo {

        Demo() {
                
                System.out.println("Demo Constructor");
        }
}

class DemoChild extends Demo {

        DemoChild() {

                System.out.println("DemoChild Constructor");
        }
}

class Client {

        public static void main(String[] args) {
                
                DemoChild obj1 = new DemoChild();
        }
}
