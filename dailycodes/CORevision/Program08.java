import java.io.*;

class Movie {

	String title;
	String director;
	double rating;

	void setDetails(String t, String d, double r) {

		this.title = t;
		this.director = d;
		this.rating = r;
	}

	void displayDetails() {

		System.out.println("Movie Title : " + title);
		System.out.println("Movie Director : " + director);
		System.out.println("Movie Rating : " + rating);
	}

	static void checkHit(double rating) {

		if (rating >= 7) {
			System.out.println("Hit Movie.");
		} else {
			System.out.println("Average Movie.");
		}
	}

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter movie title :");
		String title = br.readLine();
		System.out.println("Enter movie director :");
		String director = br.readLine();
		System.out.println("Enter movie rating :");
		double rating = Double.parseDouble(br.readLine());

		Movie obj = new Movie();
		
		obj.setDetails(title, director, rating);
		obj.displayDetails();
		checkHit(rating);
	}
}
