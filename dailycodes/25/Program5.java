
class Demo{
        int x = 10;

	static int y = 20;

        Demo(){
                // this.x = 10;
                System.out.println("Demo Constructor");
        }
}

class DemoChild1 extends Demo{
        int x = 30;

	static int y = 40;

        DemoChild1(){
                // super()
                // this.x = 20;
                System.out.println("DemoChild1 Constructor");
        }

        void fun(){
                System.out.println("Demo x : " + super.x);
                System.out.println("Demo y : " + super.y);
                System.out.println("DemoChild1 x : " + x);
                System.out.println("DemoChild1 y : " + y);
        }
}

class Client{
        public static void main(String[] args){
                DemoChild1 obj = new DemoChild1(); 
                obj.fun();
        }
}
