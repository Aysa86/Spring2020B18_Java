package day38_Constructors;

public class ConstructorCallsPractice {

    public ConstructorCallsPractice(){
        this(10.0);
        System.out.println("A");
        // this(10.0); rule # 3
    }

    public ConstructorCallsPractice(int a){
        this();
        System.out.println("B");
    }

    public ConstructorCallsPractice(double a){
        // this(); // rule # 5
        // this(5.5); // rule # 5
        //this(10); we called int constructor, it gives error, bc int constructor has default constructor
        // default constructor has double constructor rule # 5
        System.out.println("C");
    }

    public static void main(String[] args) {

        new ConstructorCallsPractice(10);

    }

}
