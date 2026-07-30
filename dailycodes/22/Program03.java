
class Demo {

        Demo() {

                System.out.println("Constructor");
        }

        int fun(int x, int y) {

                System.out.println("In fun");
                // return x+y // error: missing return statement
        }

        public static void main(String[] args) {

                Demo obj = new Demo();
                obj.fun(20, 50);
        }
}
