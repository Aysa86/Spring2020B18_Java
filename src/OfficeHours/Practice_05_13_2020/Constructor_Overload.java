package OfficeHours.Practice_05_13_2020;

public class Constructor_Overload {
    public Constructor_Overload(){
        System.out.println("default constructor");
    }

    public Constructor_Overload(int a){
        System.out.println("constructor with int");
    }

    public Constructor_Overload(String b){
        System.out.println("constructor with string");
    }

    public static void main(String[] args) {

        Constructor_Overload obj = new Constructor_Overload();// default

        Constructor_Overload obj1 = new Constructor_Overload("Aysa");// with string

        Constructor_Overload obj2 = new Constructor_Overload(1986);// with int

    }
}
