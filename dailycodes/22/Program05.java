
class Demo {

        Demo() {

                System.out.println("Constructor");
        }

        int fun(int x, int y) {

                System.out.println("In fun");
                return 25.5; // error: incompatible types: possible lossy conversion from double to int
        }

        public static void main(String[] args) {

                Demo obj = new Demo();

                int retVal = obj.fun(20, 50);
                System.out.println(retVal);
        }
}
