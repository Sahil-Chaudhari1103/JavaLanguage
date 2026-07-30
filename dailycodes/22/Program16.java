
class Demo {

        Demo() {

                System.out.println("Constructor");
        }

        void fun(int x, int y) {

                System.out.println("In fun");
                return;
        }

        public static void main(String[] args) {

                Demo obj = new Demo();

                System.out.println(obj.fun(20, 50)); // error: 'void' type not allowed here
        }
}
