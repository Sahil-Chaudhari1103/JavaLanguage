class StringBufferDemo{
        public static void main(String[] args){
                StringBuffer sb = new StringBuffer();

                System.out.println(sb);

		System.out.println(sb.capacity());

		sb.append("ShashiBagal");

		System.out.println(sb.capacity());

		sb.append("incubators");

		System.out.println(sb.capacity());

        }
}
