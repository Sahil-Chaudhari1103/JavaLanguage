
class Demo {

        static int x = 10;

        static {

                System.out.println("Static Block 1");
        }

        Demo() {

                System.out.println("Constructor");
        }

        static {

                System.out.println("Static Block 2");
        }

        public static void main(String[] args) {

                System.out.println("In main");
                Demo obj = new Demo();
        }
}
