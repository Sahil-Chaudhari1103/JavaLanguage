import java.util.*;

class Circle{
        void calculateArea(double radius){
		double area = 3.14 * radius * radius;
                System.out.println("Circle Area :" + area);
        }

        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                System.out.println("Enter circle radius :");
                double radius = sc.nextDouble();

                Circle obj = new Circle();
                obj.calculateArea(radius);
        }
}
