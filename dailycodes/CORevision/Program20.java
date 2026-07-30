import java.io.*;

class Demo {

	void checkValue(String str1, String str2) {
		
		if (str1 == str2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first string :");
		String str1 = br.readLine();
		str1 = str1.intern();

		System.out.println("Enter second string :");
		String str2 = br.readLine();
		str2 = str2.intern();

		Demo obj = new Demo();
		obj.checkValue(str1, str2);

	}
}
