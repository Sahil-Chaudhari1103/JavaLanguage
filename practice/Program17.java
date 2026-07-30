import java.util.*;

class Employee {

	String empName;
	static String companyName;

	static {

		companyName = "Microsoft";
	}

	{

		System.out.println("New Employee :");
	}

	Employee(String name) {

		this.empName = name;
	}

	void showEmployee() {

		System.out.println("Employee Name : " + this.empName);
	}

	static void showCompany() {

		System.out.println("Company Name :" + companyName);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee name :");
		String name = sc.nextLine();

		showCompany();

		Employee obj = new Employee(name);

		obj.showEmployee();
	}
}
