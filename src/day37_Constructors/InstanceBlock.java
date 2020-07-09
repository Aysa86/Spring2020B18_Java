package day37_Constructors;

public class InstanceBlock {

    static {
        System.out.println("Static block");
    }

    {
        System.out.println("Instance block");
    }

    public static void main(String[] args) {
        InstanceBlock object1 = new InstanceBlock();

        InstanceBlock object2 = new InstanceBlock();

    }

}
