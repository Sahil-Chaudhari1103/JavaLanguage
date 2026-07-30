class Demo {

	int x = 10;
	static int y = 20;
}

class Memo extends Demo {

	int x = 20;
	static int y = 40;

	static {

		System.out.println(super.x);
	}
}

class Client {

	public static void main(String[] args) {

		Memo obj = new Memo();
	}
}
