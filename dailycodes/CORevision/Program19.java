import java.io.*;

class Demo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter first string :");
		String str1 = br.readLine();

		System.out.println("Enter second string :");
		String str2 = br.readLine();

		int difference = 0;

		if (str1.length() != str2.length()) {
			System.out.println("Length of both strings is different.");
		} else if (str1.equals(str2)) {
			System.out.println(0);
		} else {
			for (int i = 0; i < str1.length(); i++) {
				if (str1.charAt(i) != str2.charAt(i)) {
					int char1 = str1.charAt(i);
					int char2 = str2.charAt(i);
					if (char1 > char2) {
						difference = difference + (char1 - char2);
					} else {
						difference = difference + (char2 - char1);
					}
				}

			}
			
			System.out.println("Ascii difference is :" + difference);
		}

	}
}
