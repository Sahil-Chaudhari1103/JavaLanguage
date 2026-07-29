
class Demo{
        Demo(){
                System.out.println("Demo Constructor");
        }
}

class DemoChild extends Demo{
	DemoChild(){
		System.out.println("DemoChild Constructor");
	}
}

class Client{
        public static void main(String[] args){
                Demo obj1 = new Demo();
        }
}
