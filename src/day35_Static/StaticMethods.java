package day35_Static;

public class StaticMethods {

    int a = 100;
    static int b = 200;

    public static void main(String[] args) {

       // System.out.println(a); static only accepts static

       StaticMethods obj = new StaticMethods();
        System.out.println(obj.a); // this is the only way ==> 100
        // we have to create the object, and call variable through the object

        System.out.println(b);// we can call static directly ==> 200
        System.out.println(StaticMethods.b);// or  we can call through the class name==> 200


    }

    public void method(){
        System.out.println(a);
        System.out.println(b);// static can be accept in instance method
    }




}
