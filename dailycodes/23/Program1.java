//Private access specifier

class Demo{
	private int x = 10;

	Demo(){
		System.out.println("In Constructor");
	}

	private void fun(){
		System.out.println("In fun");
	}
}

class Memo{
	public static void main(String[] args){
		Demo obj = new Demo();
		System.out.println(obj.x);                // error: x has private access in Demo
		obj.fun();                                // error: fun() has private access in Demo
	}
}
