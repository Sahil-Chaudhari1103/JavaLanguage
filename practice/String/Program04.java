import java.util.*;

class String4Demo {

	public static void main(String[] args) {

		String str = "core2web"; // SCP

		String str1 = new String("core2web"); // Heap

		String str2 = "Core2web"; // SCP

		String str3 = new String("Ram" + "Jadhav"); // Heap

		System.out.println(str3);
	}
}
