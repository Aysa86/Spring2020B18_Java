package day46_final_abstract;

public class Triangle extends Shape{
    public double b;
    public double height;

    public Triangle(double b, double height){
        this.b = b;
        this.height = height;
    }
    @Override
    public void Area(){
        double area = b * height * 0.5;
        System.out.println("Area of triangle: "+area);
    }

}
