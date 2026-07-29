class StringDemo{
        public static void main(String[] args){
                String str1 = "Ashish";
                String str2 = "Khare";
                System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));

                String str3 = new String("Ashish");
                System.out.println(System.identityHashCode(str3));
		
		str3.intern();
                System.out.println(System.identityHashCode(str3));
        }
}
