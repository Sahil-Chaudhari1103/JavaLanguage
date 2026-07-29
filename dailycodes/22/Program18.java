
class Demo{
        int x = 10;
        static int y = 20;

        Demo(){
                System.out.println("Constructor");
        }

        void fun(){
                System.out.println("In fun-Demo");
        }

        static void gun(){
                System.out.println("In gun-Demo");
        }

        public static void main(String[] args){
		System.out.println(Demo.y);
                Demo.gun();

		Demo obj = new Demo();

		System.out.println(obj.x);

		obj.fun();
        }
}
