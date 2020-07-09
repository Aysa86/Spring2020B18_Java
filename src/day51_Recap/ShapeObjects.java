package day51_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class ShapeObjects {
    public static void main(String[] args) {
        /*
        6. create a class named ShapeObjects
                1. create two circle and two Cylinder' objects
                2. create an ArrayList that can contain  all those objects
         */

        Circle circle1 = new Circle(2.5);
        Circle circle2 = new Circle(3.5);

        Cylinder cylinder1 = new Cylinder(1, 2);
        Cylinder cylinder2 = new Cylinder(3,3);

        ArrayList<Shape> shapeObjects = new ArrayList<>(Arrays.asList(circle1, circle2, cylinder1, cylinder2));

       // Shape shape1 = circle1; upcasting, from super to sub
        Shape shape2 = new Cylinder(1,1);
       // shape2.calculateVolume();
       // ((Cylinder)shape2).calculateArea(); downcasting, from sub to super

        for(Shape each : shapeObjects){
            System.out.println(each.name+ " : "+each.calculateArea());
        }

        System.out.println("=============================================");
                              // cylinder1
       double d = ((Cylinder)shapeObjects.get(2)).calculateVolume(); // reference type is Shape, it doesn't have it. downcastingso
        System.out.println(d);

       // ((Cylinder)shapeObjects.get(1)).calculateVolume(); there is no relationts between circle and
        //cylinder, so we can't cast it

        Shape s1 = new Circle(6);
        //System.out.println(s1.radius);

        System.out.println( ((Circle) s1).radius);


    }
}
