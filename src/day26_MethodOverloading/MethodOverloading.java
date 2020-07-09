package day26_MethodOverloading;

public class MethodOverloading {
    public static void main(String[] args) {

        method(10);// original method
        method(10,8);// overloaded method

    }

    public static void method(int a){
        System.out.println("Original method");
    }

    public static void method(int a, int b){// number of parameters different
        System.out.println("Overloaded method");
    }




}
