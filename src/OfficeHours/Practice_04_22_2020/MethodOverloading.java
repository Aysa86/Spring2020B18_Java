package OfficeHours.Practice_04_22_2020;

public class MethodOverloading {
    public static void main(String[] args) {
        method1(); // Hello World
        method1(10);
        method1("Dzhalaeva", "Aysa");

    }

    public static void method1(){
        System.out.println("Hello World");
    }

    public static void method1(String str1, String str2){
        System.out.println("Hello Cybertek");
    }

    public static void method1(int a){
        System.out.println("Hello");
    }
}
