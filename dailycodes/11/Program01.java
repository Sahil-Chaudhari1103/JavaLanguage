class CacheDemo {

	public static void main(String[] args) {

		int x = 10; // Stack frame
		Integer y = 20; // Heap - IntegerCache

		int arr1[] = { 10, 20, 30, 40, 50 }; // Heap
		// After Compile : int arr1[] = new int[]{10,20,30,40,50};

		Integer arr2[] = { 10, 20, 30, 40, 50 }; // Heap - IntegerCache

	}
}
