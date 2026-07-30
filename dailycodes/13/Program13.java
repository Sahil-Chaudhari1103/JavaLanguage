class StringBufferDemo {

        public static void main(String[] args) {

                StringBuffer sb = new StringBuffer("Shashi");

                System.out.println(sb);
                System.out.println(sb.capacity());
                System.out.println(System.identityHashCode(sb));

                sb.append("Bagal");

                System.out.println(sb.capacity());
                System.out.println(System.identityHashCode(sb));

                sb.append("incubators");

                System.out.println(sb.capacity());
                System.out.println(System.identityHashCode(sb));

        }
}
