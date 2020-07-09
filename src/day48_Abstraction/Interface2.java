package day48_Abstraction;

public interface Interface2 {

   // public Interface2(){} can't have constructor

   // public void method1(){} no instance methods

    //{} no instance blocks
   // static {} no static block



   public static final int a = 100; // static and final by default
// grey color bc they are public static final by default, no need to write them

    public static void main(String[] args) {

        System.out.println(a);
        // a = 200;  can't reassign 'a' bc it's final by default

        System.out.println(Interface2.a);
        Interface2.method4();

    }
    public static void method4(){

    }

    public void method5();

    public default void method6(){
        System.out.println("Default method");
    }

}
