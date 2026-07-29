class StringBufferMethods{
	public static void main(String[] args){
		StringBuffer str = new StringBuffer("FullStackJavaDevelopment");
		StringBuffer str1 = new StringBuffer("Core2Web");
		StringBuffer str2 = new StringBuffer("Core2Web");

		System.out.println(str.compareTo(str1));              //F(70) - C(67) = 3 i.e FirstMismatch

		System.out.println(str.length());                     //24

		System.out.println(str.capacity());                   //40
		
		str.trimToSize();                                     //24
		System.out.println(str);                              //FullStackJavaDevelopment
		
		str.setLength(7);                                   
		System.out.println(str);                              //FullSta
	
		System.out.println(str1.codePointAt(5));              //87

		System.out.println(str1.codePointCount(2,6));         //4
		
		str1.setCharAt(2,'R');
		System.out.println(str1);                             //CoRe2Web

		System.out.println(str1.append("Java"));              //Core2WebJava
		
		System.out.println(str1.replace(8 ,12 ,"Python"));   //CoRe2WebPython
	
		System.out.println(str1.substring(2,8));              //Re2Web

		System.out.println(str1.insert(8,"Batch"));           //CoRe2WebBatchPython

		System.out.println(str2.reverse());                   //beW2eroC
	}
}
