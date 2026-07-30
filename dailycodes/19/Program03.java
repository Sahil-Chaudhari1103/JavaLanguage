
class Demo {

        int x;

        Demo() {

                System.out.println("In Constructor");
        }

        public static void main(String[] args) {

                Demo obj1 = new Demo(); // x = 0
                Demo obj2 = new Demo(); // x = 0

                /*
                 * System.out.println(obj1.x);
                 * System.out.println(obj2.x);
                 * 
                 * obj1.x = 30;
                 * 
                 * System.out.println(obj1.x);
                 * System.out.println(obj2.x);
                 */
        }
}
