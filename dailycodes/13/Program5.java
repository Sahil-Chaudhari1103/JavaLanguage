class StringDemo{
        public static void main(String[] args){
                String str1 = new String("Kanha");
                System.out.println(str1);
                System.out.println(System.identityHashCode(str1));

                str1 = str1.concat("Kale");

                System.out.println(str1);
                System.out.println(System.identityHashCode(str1));
                
		str1 = str1.concat("Kothrud");

                System.out.println(str1);
                System.out.println(System.identityHashCode(str1));
        }
}
