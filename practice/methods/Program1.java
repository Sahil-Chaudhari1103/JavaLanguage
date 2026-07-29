class StringMethods{
	public static void main(String[] args){
		String str = "ILoveCoding";
	        String str2 = "ILoveCoding";
		String str3 = "ILove";
		StringBuffer str4 = new StringBuffer("JavaCourse");

		//equals()
		System.out.println(str.equals(str2));                 //true
		//equalsIgnoreCase()
		System.out.println(str.equalsIgnoreCase(str2));       //true
		//compareTo()
		System.out.println(str.compareTo(str3));              //Difference = 6
	        //startsWith()				
		System.out.println(str.startsWith("I" , 0));          //true
		//endsWith()
		System.out.println(str.endsWith("Coding"));           //true
		//indexOf()
		System.out.println(str.indexOf("Coding"));            //5
		//subString()
		System.out.println(str2.substring(2));                //oveCoding
		System.out.println(str2.substring(2,5));              //ove
		//replace()
		System.out.println(str.replace("C", "c"));            //ILovecoding
		//toLowerCase()
		System.out.println(str.toLowerCase());                //ilovecoding
		//toUpperCase()
		System.out.println(str.toUpperCase());                //ILOVECODING
		//isEmpty()
		System.out.println(str.isEmpty());                    //false
		//intern()
		System.out.println(str.intern());                     //Creates object in SCP
		//reverse()
		System.out.println(str4.reverse());                   //esruoCavaJ
	}
}
