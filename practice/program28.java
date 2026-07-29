class Demo{
	int x=10;
	static int y=20;
}
class Memo extends Demo{
	static int y=30;
	static{
		System.out.println(Demo.y);
	}
}
class Client{
	public static void main(String[] args){
		Memo obj = new Memo();
	}
}
