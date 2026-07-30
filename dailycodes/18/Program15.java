
class Demo {

        int x = 10;

        Demo() {

                System.out.println("No-args Constructor");
        }

        Demo(int y) {

                System.out.println("Para Constructor");
        }

        public static void main(String[] args) {

                // Demo obj = new Demo();

                Demo obj1 = new Demo(10);
        }
}
