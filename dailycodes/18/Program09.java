class Demo {

        int x = 10;

        Demo() {

                System.out.println(this); // Demo@d716361
                System.out.println("In Constructor");
        }

        void fun() {

                System.out.println(this); // Demo@d716361
                System.out.println("In fun");
        }

        public static void main(String[] args) {

                Demo obj = new Demo();

                obj.fun();

                System.out.println(obj); // Demo@d716361
        }
}
