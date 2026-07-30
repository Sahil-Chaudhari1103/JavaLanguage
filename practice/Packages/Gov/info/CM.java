
package Gov.info;

import Gov.info.*;

public class CM extends PM {

	public String name;
	public String position;

	public CM(String name, String position) {

		super("Narendra Modi", "Prime Minister");
		this.name = name;
		this.position = position;
	}

	public void display() {

		System.out.println("Name : " + name);
		System.out.println("Position : " + position);
	}
}
