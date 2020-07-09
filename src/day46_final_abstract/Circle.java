package day46_final_abstract;

public final class Circle extends Shape{ // applying "final" want to make sure that Circle class is not gonna be a super class

    public double radius;
    public final static double PI = 3.14;



    public Circle(double radius){
        this.radius = radius;
    }

@Override
    public void Area(){

    double area = radius * radius * PI;
        System.out.println("Area of circle: "+area);
    }







}
