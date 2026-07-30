class StringDemo {

        public static void main(String[] args) {

                String str1 = "Ashish";
                String str2 = "Khare";

                System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));

                str1.concat(str2);

                System.out.println(System.identityHashCode(str1));
                System.out.println(System.identityHashCode(str2));
        }
}
