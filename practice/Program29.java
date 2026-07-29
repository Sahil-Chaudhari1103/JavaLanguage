class Demo{
	void add(short a){
		System.out.println("In short method.");
	}
	void add(int a){
		System.out.println("In int method.");
	}
	public static void main(String[] args){
		Demo obj = new Demo();
		obj.add(10);
		obj.add(( short)10 );
	}
}
