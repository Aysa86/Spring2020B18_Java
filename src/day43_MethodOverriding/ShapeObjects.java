package day43_MethodOverriding;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle circle1 = new Circle(3);

        System.out.println(circle1.radius);

        circle1.calculateArea(); // bug ==> PI * Radius * Radius
        circle1.calculatePerimeter(); // bug ==> radius * 2 * PI

        System.out.println("=======================================");

        Rectangle rectangle1 = new Rectangle(3,2);
        System.out.println(rectangle1.length);
        System.out.println(rectangle1.width);

        rectangle1.calculateArea(); // bug ==> length * width
        rectangle1.calculatePerimeter(); // bug ==> (length + width)*2

        System.out.println("========================================");

        Square square1 = new Square(4);
        System.out.println(square1.side);

        square1.calculateArea(); // bug ==> side * side
        square1.calculatePerimeter(); // bug ==> side * 4;




    }

}
