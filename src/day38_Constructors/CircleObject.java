package day38_Constructors;

import java.util.Scanner;

public class CircleObject {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius of the circle ");
        double r = scan.nextDouble();

        Circle circle1 = new Circle(r);
        System.out.println("Area of circle is: "+circle1.area());
        System.out.println("Diameter is: "+circle1.diameter);
        System.out.println("Perimeter is: "+circle1.perimeter());

    }
}
