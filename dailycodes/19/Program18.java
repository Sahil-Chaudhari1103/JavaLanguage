
class Demo {

        int x;
        int y;

        Demo() {

                this(50, 100);
                this("Kanha"); // error: call to this must be first statement in constructor
                System.out.println("No-arg Constructor");
                System.out.println(x); // this.x
                System.out.println(y); // this.y

        }

        Demo(int x, int y) {

                this.x = x;
                this.y = y;
                System.out.println("Para Constructor");
        }

        Demo(String str) {
                
                System.out.println("Para Constructor - String");
        }

        public static void main(String[] args) {

                Demo obj1 = new Demo();

        }
}
