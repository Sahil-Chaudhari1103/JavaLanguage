class StringDemo{
        public static void main(String[] args){
                String str1 = "Kanha";
                System.out.println(str1);
                System.out.println(System.identityHashCode(str1));

                str1 = str1 + "Kale";

                System.out.println(str1);
                System.out.println(System.identityHashCode(str1));
        }
}
