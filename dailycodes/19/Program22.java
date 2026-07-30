class Demo {

        int x;
        int y;

        Demo() {

                this(50, 100);
                System.out.println(this);

                System.out.println("No-arg Constructor");
                System.out.println(x); // this.x
                System.out.println(y); // this.y

        }

        Demo(int x, int y) {

                this("Kanha");
                System.out.println(this);

                System.out.println(x);
                System.out.println(y);
                System.out.println(this.x);
                System.out.println(this.y);

                this.x = x;
                this.y = y;
                System.out.println("Para Constuctor");
        }

        Demo(String str) {

                System.out.println(this);
                System.out.println("Para Constructor - String");
        }

        public static void main(String[] args) {

                Demo obj1 = new Demo();

        }
}
