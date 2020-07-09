package OfficeHours.Practice_05_20_2020;
class Data{
    int a = 100;


    public void method(){
        System.out.println("Hello World");
    }

}
public class SuperKeyword extends Data{
    int a = 200;


    public void method(){
        System.out.println("Hello Cybertek");
    }

    public SuperKeyword(){
        //this.method(); ==> Hello Cybertek
        super.method(); // ==> Hello World
        System.out.println(super.a); // 100
        System.out.println(a); // 200
    }

    public static void main(String[] args) {
        SuperKeyword obj = new SuperKeyword();
    }
}
