class Demo {

        int x = 10;

        Demo() {

                System.out.println(obj); // error: cannot find symbol
                System.out.println("In Constructor");
        }

        public static void main(String[] args) {

                Demo obj = new Demo();

                System.out.println(obj);
        }
}
