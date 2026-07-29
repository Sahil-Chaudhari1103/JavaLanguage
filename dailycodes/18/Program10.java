class Demo{

	int x = 10;
	int y = 20;

	Demo(){
	
		System.out.println(x);
		System.out.println(y);
		System.out.println("In Constructor");
	}

	public static void main(String[] args){
	
		Demo obj = new Demo();
	}
}
