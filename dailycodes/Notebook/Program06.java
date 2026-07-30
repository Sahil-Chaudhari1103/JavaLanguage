class Demo {

        int a = 10;
        String str = "Kanha";

        public static void main(String[] args) {

                Demo obj = new Demo();

                int x = 20;

                String name = "Kanha";
                
                System.out.println(x);
                System.out.println(name);
                System.out.println(obj.a);
                System.out.println(obj.str);
                System.out.println(System.identityHashCode(name));
                System.out.println(System.identityHashCode(obj.str));
        }
}
