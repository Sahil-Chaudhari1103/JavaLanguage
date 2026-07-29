// static block

class Demo{
        int x = 10;

        static int y = 20;

	static {
		System.out.println("Static Block");
	}

        Demo(){
                // this.x = 10;
                System.out.println("Demo Constructor");
        }
}

class Client{
        public static void main(String[] args){
		System.out.println("Start Main");

                Demo obj = new Demo();
		
		System.out.println("End Main");
        }
}
