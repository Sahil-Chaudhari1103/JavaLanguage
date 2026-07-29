class StringDemo{
	public static void main(String[] args){
		String s1 = "hello";                    //SCP

		String s2 = new String("hello");        //Heap

		s2 = "hello";                           //SCP

		String s3 = "hello";                    //SCP

		System.out.println( s2==s3 );
		System.out.println( s2==s1 );
	}
}
