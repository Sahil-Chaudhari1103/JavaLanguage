
class Demo{

        Demo(){
                System.out.println("Demo Constructor");
        }
}

class Memo{
	Memo(){
		System.out.println("Memo Constructor");
	}
}

class Temo{

        public static void main(String[] args){

                Demo obj1 = new Demo();

		Memo obj2 = new Memo();
        }
}
