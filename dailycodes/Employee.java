import java.util.*;
class Employee{
	String name;
	double salary;

	void setDetails(String n,double s){
		this.name = n;
		this.salary = s;
	}

	void displayDetails(){
		System.out.println("Employee name : " + this.name);	
		System.out.println("Employee salary : " + this.salary);	
	}

	static void calculateBonus(double salary){
		double bonus = salary * 0.1;
		System.out.println("Bonus on salary : " + bonus);	
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter employee name :");
		String empName = sc.nextLine();	
		System.out.println("Enter employee salary :");
		double empSalary = sc.nextDouble();

		Employee obj = new Employee();
		obj.setDetails(empName,empSalary);
		obj.displayDetails();
		calculateBonus(empSalary);
	}
}
