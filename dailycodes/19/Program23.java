class Demo {

        int x;
        int y;

        Demo() {

                System.out.println("In Constructor1");

        }

        Demo() {
                // error: constructor Demo() is already defined in class Demo
                System.out.println("In Constuctor2");
        }

        public static void main(String[] args) {

                Demo obj1 = new Demo();

        }
}
