import java.util.*;

class Demo {

	int x;
	int y;

	Demo(int x, int y) {

		this.x = x;
		this.y = y;
		System.out.println("In Constructor.");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x1 = sc.nextInt();
		int y1 = sc.nextInt();

		Demo obj1 = new Demo(x1, y1);

		System.out.println(obj1.x);
		System.out.println(obj1.y);

	}
}
