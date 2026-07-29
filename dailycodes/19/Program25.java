class Demo {

        int x;
        int y;

        Demo(){
                System.out.println("In Constructor1");

        }

        void Demo(){
                System.out.println("In Constructor2");
        }


        public static void main(String[] args){

                Demo obj = new Demo();
		obj.Demo();

        }
}
