package OfficeHours.Practice_05_20_2020;
class test{

    public test(){
        System.out.println("default");
    }

    public test(int a){
        System.out.println("int");
    }

    public test(double a){
        System.out.println("double");
    }


}
public class Constructor2 extends test{
public Constructor2(){
    super(); // default
    System.out.println("default");// default
}
    public static void main(String[] args) {

        Constructor2 obj = new Constructor2();// default





    }





}
