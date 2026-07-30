class Android {

	String founder = "Andy Robin";
	String owner = "Google";
	String operatingSystem = "AndroidOS";

	Android() {

		System.out.println("Open-source mobile operating system developed by Google.");
	}
}

class Samsung extends Android {

	String chairman = "Jay Y. Lee";
	String origin = "South Korea";

	Samsung() {

		System.out.println("Samsung doesn't just make phones - it floods the world with choices.");
	}

	void models() {

		System.out.println(
				"Consist various models like - Galaxy S Series, Galaxy Z Series, Galaxy A Series, Galaxy F Series");
	}
}

class GalaxyS24 extends Samsung {

	String display = "Dynamic Amoled Display";
	String brightness = "2600 nits";
	String battery = "4000 mAh";
	String processor = "Snapdragon 8 Gen 3";

	GalaxyS24() {

		System.out.println("Samsung Galaxy S24 - compact,powerfull,intelligent.");
	}

	void displayDetails() {

		System.out.println("Samsung Galaxy S24 details -");
		System.out.println("Display : " + display);
		System.out.println("Bightness : " + brightness);
		System.out.println("Battery : " + battery);
		System.out.println("Processor : " + processor);
	}
}

class OnePlus extends Android {

	String founder = "Pete Lau";
	String origin = "China";

	OnePlus() {

		System.out.println("Oneplus focuses on speed and performance.");
	}

	void models() {

		System.out.println("Consist various models like - Oneplus 12, Oneplus 11, Oneplus Nord 3, Oneplus Nord 2.");
	}

}

class OnePlus12 extends OnePlus {

	String display = "Amoled 120hz";
	String brightness = "4500 nits";
	String battery = "5400 mAh";
	String processor = "Snapdragon 8 gen 3";

	OnePlus12() {

		System.out.println("OnePlus12 - fast , smooth and best gaming experience.");
	}

	void displayDetails() {

		System.out.println("OnePlus12 details -");
		System.out.println("Display : " + display);
		System.out.println("Bightness : " + brightness);
		System.out.println("Battery : " + battery);
		System.out.println("Processor : " + processor);
	}
}

class User {

	public static void main(String[] args) {

		GalaxyS24 obj = new GalaxyS24();

		obj.models();
		obj.displayDetails();
	}
}
