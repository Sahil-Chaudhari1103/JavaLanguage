package Gov.info;

public class PM {

	public String name;
	public String position;

	protected PM(String name, String position) {

		this.name = name;
		this.position = position;
	}

	public void info() {

		System.out.println("Name : " + name);
		System.out.println("Position : " + position);
	}
}
