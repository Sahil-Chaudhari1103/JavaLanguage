import java.io.*;

class JagArrDemo {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter number of rows in an array : ");

		int rows = Integer.parseInt(br.readLine());
		int arr[][] = new int[rows][];

		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter number of columns of row " + i);
			int columns = Integer.parseInt(br.readLine());
			arr[i] = new int[columns];

		}

		System.out.println("Enter values of an array : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = Integer.parseInt(br.readLine());
			}
		}

		System.out.println("Elements of an array are : ");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
