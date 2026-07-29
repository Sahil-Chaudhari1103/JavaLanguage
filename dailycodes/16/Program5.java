class Demo{
        static int y = 20;

        public static void main(String[] args){
                Demo obj1 = new Demo();
                System.out.println(obj1.y);

                Demo obj2 = new Demo();
                System.out.println(obj2.y);

                obj2.y = 60;

                System.out.println(obj1.y);
                System.out.println(obj2.y);
        }
}
