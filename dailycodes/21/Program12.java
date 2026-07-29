
class Demo{

        int x = 10;

        Demo(){
                System.out.println("Demo Constructor");
        }

        void fun(){
                System.out.println("In fun-Demo");
		System.out.println(x);
        }

        public static void main(String[] args){

                Demo obj = new Demo();
		// 1.memory allocation
		// 2.Demo(obj)

                obj.fun();
		// obj.fun(obj)

        }
}
