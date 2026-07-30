
class Demo {

        int x;
        int y;

        Demo(int x, int y) {

                x = x;
                y = y;

                System.out.println("In Constructor");
        }

        public static void main(String[] args) {

                Demo obj1 = new Demo(10, 20);

                System.out.println(obj1.x);

                System.out.println(obj1.y);
        }
}
