package day38_Constructors;

public class Test {

    public Test(){
        System.out.println("Constructor");
    }


    static {
        System.out.println("Static Block");// printed first, only once
    }
    {
        System.out.println("Instance Block");// runs before the constructor
    }

    public static void main(String[] args) {

        System.out.println("Main Method");// executes from top to bottom

        new Test();// prints instance, then constructor
        new Test();//prints instance, then constructor

// if we have 2 objects instance block and constructor executes 2 times. first instance block, then constructor
    }
}
