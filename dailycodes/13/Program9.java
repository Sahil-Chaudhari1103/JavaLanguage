class StringBufferDemo{
        public static void main(String[] args){
                StringBuffer sb = new StringBuffer("Ashish");
                
                System.out.println(sb);
                System.out.println(System.identityHashCode(sb));

                sb.append("Khare");
                System.out.println(sb);
                System.out.println(System.identityHashCode(sb));

        }
}
