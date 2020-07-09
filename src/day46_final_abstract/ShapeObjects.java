package day46_final_abstract;

public class ShapeObjects {
    public static void main(String[] args) {

        Circle obj = new Circle(2.5);
        obj.Area(); //Area is: 19.625

        Square obj1 = new Square(3);
        obj1.Area();

        Rectangle obj2 = new Rectangle(3.5, 2.5);
        obj2.Area();

        Triangle obj3 = new Triangle(4.5, 7);
        obj3.Area();
    }
}
