class StringDemo{
        public static void main(String[] args){
                String str1 = "Kanha";
                String str2 = "Kale";
                String str3 = new String("KanhaKale");
		System.out.println(str3);
                String str4 = str1 + str2;

                System.out.println(str4);

                System.out.println(System.identityHashCode(str3));
                System.out.println(System.identityHashCode(str4));
        }
}
