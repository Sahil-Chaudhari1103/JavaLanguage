
class Demo {

	int x;

	Demo() {

		this(20);
		System.out.println(x);
		System.out.println("In no arg constructor");
	}

	Demo(int x) {

		this.x = x;
		System.out.println("in para constructor");
	}

	public static void main(String[] args) {
		
		Demo obj = new Demo();

	}
}
