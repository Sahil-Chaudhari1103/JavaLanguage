import java.util.*;

class Employee {

	String empName;
	static String companyName;

	static {

		companyName = "Google";
	}

	static void showCompany() {

		System.out.println("Company Name :" + companyName);
	}

	{

		System.out.println("Employee object is created");
	}

	EmployeeDeclare( String empName){

		this.empName=empName;
	}

	void showEmployee() {

		System.out.println("Employee Name :" + this.empName);
		System.out.println("Company :" + companyName);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Employee name");
		String name = sc.nextLine();

		Employee obj = new Employee(name);
		showCompany();
		obj.showEmployee();
	}
}
