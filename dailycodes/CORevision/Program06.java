import java.io.*;

class Laptop {

        String brand;
        int ram;
        double price;

        void setDetails(String b, int r, double p) {

                this.brand = b;
                this.ram = r;
                this.price = p;
        }

        void displayDetails() {

                System.out.println("Laptop Brand : " + brand);
                System.out.println("Laptop Ram : " + ram);
                System.out.println("Laptop Price : " + price);
        }

        static void calculateGst(double price) {

                double gst = price * 0.18;
                System.out.println("Total price after GST : " + (price + gst));
        }

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Laptop brand :");
                String brand = br.readLine();
                System.out.println("Enter Laptop ram :");
                int ram = Integer.parseInt(br.readLine());
                System.out.println("Enter Laptop price :");
                double price = Double.parseDouble(br.readLine());

                Laptop obj = new Laptop();
                obj.setDetails(brand, ram, price);
                obj.displayDetails();
                calculateGst(price);
        }
}
