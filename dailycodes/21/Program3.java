
class Demo{

	Demo(){
		System.out.println("Demo Constructor");
	}
}

class Memo{

	Memo(){
                System.out.println("Memo Constructor");
        }

	public static void main(String[] args){
		System.out.println("Start Main");

		Demo obj1 = new Demo();
		Memo obj2 = new Memo();

		System.out.println("End Main");
	}
}
