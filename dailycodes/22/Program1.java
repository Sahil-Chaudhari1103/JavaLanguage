
class Demo{
	void Demo(){
		System.out.println("Constructor");
	}

	void fun(){
		System.out.println("In fun");
	}

	public static void main(String[] args){
		Demo obj = new Demo();
		obj.fun();
	}
}
