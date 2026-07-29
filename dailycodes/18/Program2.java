class Demo {

        int x = 10;
        int y = 20;

        Demo(){

                System.out.println("In Constructor");
		System.out.println(this);                 // hidden this reference
        }

        void fun(){

                System.out.println("In fun");
        }

        public static void main(String[] args){

                Demo obj = new Demo();                      // Demo obj = new Demo(obj)
		System.out.println(obj);

                System.out.println(obj.x);

                System.out.println(obj.y);

                obj.fun();
        }
}
