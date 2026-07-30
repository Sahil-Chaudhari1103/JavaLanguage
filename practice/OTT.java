class OTT {

	String contentType = "Movies,webSeries";

	OTT() {

		System.out.println("Entertainment Content");
	}
}

class Netflix extends OTT {

	String sName = "Stranger Things";
	int rating = 5;

	Netflix() {

		System.out.println("Netflix offers movies,series");
	}

	void displayInfo() {

		System.out.println("Series name :" + sName);
		System.out.println("Rating :" + rating);
	}
}

class JioHotstar extends OTT {

	String sName = "Game of throwns";
	int rating = 4;

	JioHotstar() {

		System.out.println("JioHotstar offers movies,series and Sports");
	}

	void displayInfo() {

		System.out.println("Series name :" + sName);
		System.out.println("Rating :" + rating);
	}
}

class User {

	public static void main(String[] args) {

		Netflix obj = new Netflix();
		obj.displayInfo();

		JioHotstar obj1 = new JioHotstar();
		obj1.displayInfo();
	}
}
