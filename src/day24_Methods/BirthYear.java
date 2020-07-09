package day24_Methods;

public class BirthYear {

    public static void Age(short birthYear){
        int currentYear = 2020;
        int age = currentYear - birthYear;
        if(age > 0 && birthYear > 1900) {
            System.out.println(age);
        }else{
            System.out.println("Invalid");
        }
    }

    public static void main(String[] args) {
        short a = 2002;
        Age(a);// Age((short)2002);
        printHelloCybertek();// Hello Cybertek
    }




    public static void printHello(){
        System.out.println("Hello");
    }

    public static void printCybertek(){
        System.out.println("Cybertek");
    }

    public static void printHelloCybertek(){
        printHello();// Hello
        printCybertek();// Cybertek
    }

}
