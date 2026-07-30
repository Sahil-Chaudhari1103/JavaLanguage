import java.io.*;

class Demo {

	public static void main(String[] args) { // Error of IOException

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String name = br.readLine();
		System.out.println(name);
	}
}
