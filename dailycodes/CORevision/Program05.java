import java.io.*;

class Car {

        void showDetails(String brand, String model, double price) {

                System.out.println("Car brand : " + brand);
                System.out.println("Car model : " + model);
                System.out.println("Car price : " + price);
        }

        public static void main(String[] args) throws IOException {

                BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

                System.out.println("Enter Car brand :");
                String brand = br.readLine();
                System.out.println("Enter Car model :");
                String model = br.readLine();
                System.out.println("Enter your amount :");
                double price = Double.parseDouble(br.readLine());

                Car obj = new Car();
                obj.showDetails(brand, model, price);
        }
}
