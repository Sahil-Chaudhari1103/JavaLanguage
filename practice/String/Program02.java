class String2Demo {

        public static void main(String[] args) {

                String s1 = new String("a"); // Heap
                String s2 = new String("b"); // Heap

                String s3 = s1 + s2; // Heap
                String s4 = s3 + "c"; // Heap

                String s5 = s4.intern(); // s5 and s4 in SCP
                String s6 = "abc"; // SCP

                System.out.println(s4 == s6);
                System.out.println(s5 == s6);
        }
}
