package day45_Exceptions;

class A{
    public A(){ // A
        System.out.println("A");
    }
}

class B extends A{ // AB
   public B(){
       super();
       System.out.println("B");
   }
}


public class Test extends B{
public Test(){
    //super(); AB
    System.out.println("C"); // C
}

    public static void main(String[] args) {
        new Test();
    }

}
