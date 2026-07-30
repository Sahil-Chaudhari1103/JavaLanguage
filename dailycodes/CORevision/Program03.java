import java.util.*;

class Book {

        String title;
        String author;
        double price;

        void setDetails(String t, String a, double p) {

                this.title = t;
                this.author = a;
                this.price = p;
        }

        void displayDetails() {

                System.out.println("Book Title :" + title);
                System.out.println("Book Author :" + author);
                System.out.println("Book Price :" + price);
        }

        static void applyDiscount(double price) {

                double discount = price * 0.15;
                System.out.println("Discount on price :" + discount);
        }

        public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);

                System.out.println("Enter book title :");
                String bookTitle = sc.nextLine();

                System.out.println("Enter book author :");
                String bookAuthor = sc.nextLine();

                System.out.println("Enter book price :");
                double bookPrice = sc.nextDouble();

                Book obj = new Book();
                obj.setDetails(bookTitle, bookAuthor, bookPrice);
                obj.displayDetails();
                applyDiscount(bookPrice);
        }
}
