import java.util.*;

class Demo {

        int x;
        int y;

        Demo() {

                System.out.println("No-arg Constructor.");
        }

        Demo(int x, int y) {

                this.x = x;
                this.y = y;
                System.out.println("Para Constructor.");
        }

        public static void main(String[] args) {

                Demo obj = new Demo();

                System.out.println(obj.x);
                System.out.println(obj.y);

                Demo obj1 = new Demo(50, 60);

                System.out.println(obj1.x);
                System.out.println(obj1.y);

        }
}
