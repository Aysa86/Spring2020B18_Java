package day36_StaticBlock;

public class StaticBlock4 {

    static String name;



    static{
        // gets executed as soon as the class loaded
        // designed to initialize static variables

        name = "Cybertek School";




    }

    public static void main(String[] args) {
        System.out.println(name);// Cybertek School
    }
}
