package day51_Recap;

public final class Cylinder extends Shape implements Volume, PI{
    /*
     5. create a final class named Cylinder that can inherit from Shape, Volume, and PI
                variables: radius, Height
                set a static block that initialize the name to "Cylinder"
                set a constructor that can initialize the radius and height
     */

    public double height;
    public double radius;


    public Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
        name = "Cylinder";

    }
    @Override
    public double calculateArea(){
        return  (PI * 2 * radius * radius) + (height * PI * 2 * radius);
    }
    @Override   // calculateDiameter
    public double calculatePerimeter(){
        return 2 * (PI * 2 * radius + height);
    }
    @Override
    public double calculateVolume(){
        return PI * radius * radius * height;
    }
}
