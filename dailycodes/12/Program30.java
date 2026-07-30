class StringDemo {

	public static void main(String[] args) {

		String str1 = "Rahul";
		String str2 = new String("Rahul");
		String str3 = str1 + "Piche";
		
		str2 = str2 + "Aundh";
		str1 = str1 + "Modern";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
	}
}
