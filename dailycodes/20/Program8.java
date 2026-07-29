
class Demo{

        static int x = 10;

        static {
                System.out.println("Static Block 1");
        }

        {
                System.out.println("Instance Block 1");
        }

        Demo(){
                System.out.println("Constructor");
        }

        void fun(){
                System.out.println("In fun");
        }

        static void gun(){
                System.out.println("In gun");
        }

        public static void main(String[] args){
                System.out.println("In main");

		gun();

		Demo obj = new Demo();
		obj.fun();
        }
}
