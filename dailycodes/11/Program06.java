class CacheDemo {

	public static void main(String[] args) {

		int x = 128; // Stack frame

		Integer y = 128; // Heap - IntegerCache

		System.out.println(x == y);

	}
}
