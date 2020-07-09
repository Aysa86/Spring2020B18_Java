package day37_Constructors;

public class ConstructorIntro {

    public ConstructorIntro(int a){// constructor name MUST BE same the same with a class name

        System.out.println("Constructor with argument of int");

    }

    public static void main(String[] args) {

       // ConstructorIntro object = new ConstructorIntro(); object MUST be created with existing constructor

       ConstructorIntro object1 = new ConstructorIntro(10);//Constructor with argument of int

       ConstructorIntro object2 = new ConstructorIntro(20);//Constructor with argument of int






    }

}
