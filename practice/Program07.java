class IfEl {

	public static void main(String[] args) {

		int x = 10;

		int y = 20;

		if (x > 10 || ++x > 10) {
			System.out.println(x); // 11
		} else
			System.out.println("else");
	}
}
