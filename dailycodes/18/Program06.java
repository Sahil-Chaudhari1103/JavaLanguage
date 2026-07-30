class Demo {

	int x = 10;

	Demo() {

		System.out.println(this);
		System.out.println("In Constructor");
	}

	public static void main(String[] args) {

		Demo obj = new Demo();

		System.out.println(this); // error: non-static variable this cannot be referenced from a static context
	}
}
