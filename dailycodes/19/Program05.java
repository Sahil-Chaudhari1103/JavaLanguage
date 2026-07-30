
class Demo {

        int x;
        int y;

        Demo() {
                // this.x = 0;
                // this.y = 0;
                System.out.println("In Constructor");
        }

        public static void main(String[] args) {

                Demo obj1 = new Demo();

                System.out.println(obj1.x);

                System.out.println(obj1.y);
        }
}
