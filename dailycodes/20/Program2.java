
class Demo{

        int x = 10;
	static int y = 20;

        Demo(){
                System.out.println("No-args Constructor");
        }

        public static void main(String[] args){
                Demo obj1 = new Demo();
                System.out.println(obj1.x);
		System.out.println(y);
		System.out.println(obj1.y);
        }
}
