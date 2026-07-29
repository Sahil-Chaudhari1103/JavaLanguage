class StringDemo{
	public static void main(String[] args){
		String str1 = "Kanha";
		String str2 = "Kale";
		String str3 = "KanhaKale";

		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);


		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));

		String str4 = "Kanha" + "Kale";

		System.out.println(str4);

		System.out.println(System.identityHashCode(str4));
	}
}
